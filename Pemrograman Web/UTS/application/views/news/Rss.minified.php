<?php
class Rss{
	private $parser;
	private $feed_url;
	private $item;
	private $tag;
	private $output;
	private $counter = 0;
	private $title = false;
	private $description = false;
	private $link = false;
	private $category = false;
	private $pubDate = false;
	const XML = 'XML'; 
	const SXML = 'SXML'; 
	const TXT = 'TXT'; 
	function __construct() {
	}
    public function getFeed($url, $method = self::SXML) {
		$this->counter = 0;
		switch($method)	{
			case 'TXT':
				try {
					return $this->txtParser($url);
				}
				catch (Exception $e) {
					throw $e;
				}
				break;
			case 'SXML':
				try {
					return $this->sXmlParser($url);
				}
				catch (Exception $e) {
					throw $e;
				}
				break;
			default:
			case 'XML': 
				try {
					return $this->xmlParser($url);
				}
				catch (Exception $e) {
					throw $e;
				}
				break;
		}
	}
	private function sXmlParser($url){
		$xml = simplexml_load_file($url);
		foreach($xml->channel->item as $item){
			$this->output[$this->counter]['title'] = $item->title;
			$this->output[$this->counter]['description'] = $item->description;
			$this->output[$this->counter]['link'] = $item->link;
			$this->output[$this->counter]['category'] = isset($item->category) ? $item->category : false;
			$this->output[$this->counter]['date'] = $item->pubDate;
			$this->counter++;
		}
		return $this->output;
	}
	private function xmlParser($url){
		$this->parser = xml_parser_create();
		xml_parser_set_option($this->parser, XML_OPTION_SKIP_WHITE, 1);
		$this->feed_url = $url;
		xml_set_object($this->parser, $this);
		xml_set_element_handler($this->parser, "xmlStartElement", "xmlEndElement");
		xml_set_character_data_handler($this->parser, "xmlCharacterData");
		try {
			$this->xmlOpenFeed();
		}
		catch (Exception $e) {
			throw $e;
		}
		return $this->output;
	}
	private function getFile($url){
		$feed = false;
		if (function_exists('curl_init')) {
			$curl = curl_init();
			curl_setopt($curl, CURLOPT_URL, $url);
			curl_setopt($curl, CURLOPT_HEADER, 0);
			curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);
			curl_setopt($curl, CURLOPT_USERAGENT, 'RSS Feed Reader v2.2 (http://www.phpclasses.org/package/3724-PHP-Parse-and-display-items-of-an-RSS-feed.html)');
			$feed = curl_exec($curl);
			curl_close($curl);
		} else if (function_exists('file_get_contents')) {
			$feed = file_get_contents($url);
		} else {
			$fh = fopen($url, 'r');
			while(!feof($fh))	{
				$feed .= fread($fh, 4096);
			}
		} if ($feed === false) throw new Exception("I'm sorry but there's simply no way how I can load the feed...");
		return $feed;
	}
	private function txtParser($url){
		try {
			$feed = $this->getFile($url);
		}
		catch (Exception $e) {
			throw $e;
		}
		$this->txtParseFeed($feed);
		return $this->output;
	}
	private function xmlOpenFeed() {
		try {
			$feed = $this->getFile($this->feed_url);
		}
		catch (Exception $e) {
			throw $e;
		}	
		xml_parse($this->parser, $feed, true);
		xml_parser_free($this->parser);
	}
	private function xmlStartElement($parser, $tag) {
		if ($this->item === true) {
			$this->tag = $tag;
		} else if ($tag === "ITEM")	{
			$this->item = true;
		}
	}
	private function xmlCharacterData($parser, $data){
		if ($this->item === TRUE)	{
			switch ($this->tag)	{
				case "TITLE":
					$this->title .= $data;
					break;
				case "CATEGORY":
					$this->category .= $data;
					break;
				case "DESCRIPTION":
					$this->description .= $data;
					break;
				case "LINK":
					$this->link .= $data;
					break;
				case "PUBDATE":
					$this->pubDate .= $data;
					break;
			}
		}
	}
	function xmlEndElement($parser, $tag) {
		if ($tag == 'ITEM')	{
			$this->output[$this->counter]['title'] = trim($this->title);
			$this->output[$this->counter]['description'] = trim($this->description);
			$this->output[$this->counter]['category'] = isset($this->category) ? trim($this->category) : false;
			$this->output[$this->counter]['link'] = trim($this->link);
			$this->output[$this->counter]['date'] = trim($this->pubDate);
			$this->counter++;
			$this->title = false;
			$this->description = false;
			$this->category = false;
			$this->link = false;
			$this->pubDate = false;
			$this->item = false;
		}
	}
	private function txtParseFeed($feed) {
		$feed = preg_replace('!/\*[^*]*\*+([^/][^*]*\*+)*/!', '', $feed);
		$feed = str_replace(array("\r\n", "\r", "\n", "\t", '  ', '    ', '    '), '', $feed);
		preg_match_all('|<item>(.*)</item>|U', $feed, $m);
		foreach($m[1] as $item)	{
			preg_match('|<title>(.*)</title>|U', $item, $title);
			preg_match('|<link>(.*)</link>|U', $item, $link);
			preg_match('|<category>(.*)</category>|U', $item, $category);
			preg_match('|<description>(.*)</description>|U', $item, $description);
			preg_match('|<pubDate>(.*)</pubDate>|U', $item, $pubdate);
			$this->output[$this->counter]['title'] = $title[1];
			$this->output[$this->counter]['description'] = $description[1];
			$this->output[$this->counter]['link'] = $link[1];
			$this->output[$this->counter]['category'] = isset($category[1]) ? $category[1] : false;
			$this->output[$this->counter]['date'] = $pubdate[1];
			$this->counter++;
		}
	}
	function __destruct()
	{
	}
}