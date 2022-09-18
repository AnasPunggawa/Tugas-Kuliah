<?php

header( 'Content-Type: text/html; charset=utf-8' );

error_reporting(E_ALL);
ini_set('display_errors', true);

include 'Rss.minified.php'; // include library

$Rss = new Rss; // create object

/*
    XML way
*/
try {
    $feedxml = $Rss->getFeed('https://www.covid19.go.id/feed/', Rss:: XML);
	$feedsxml = $Rss->getFeed('https://www.covid19.go.id/feed/', Rss:: XML);
	$feedtxt = $Rss->getFeed('https://www.covid19.go.id/feed/', Rss:: XML);
	if ($feedxml != null){
			echo '<pre>';
			foreach($feedxml as $item) {
				echo "<b>Title:</b> <a href=\"$item[link]\">$item[title]</a>\n";
				echo "<b>Published:</b> $item[date]\n";
			echo "<b>Category:</b> $item[category]\n";
			echo "\n$item[description]\n";
			echo "<hr/>";
		}
		echo '</pre>';
	} else if ($feedsxml != null){
			echo '<pre>';
			foreach($feedsxml as $item) {
				echo "<b>Title:</b> <a href=\"$item[link]\">$item[title]</a>\n";
				echo "<b>Published:</b> $item[date]\n";
			echo "<b>Category:</b> $item[category]\n";
			echo "\n$item[description]\n";
			echo "<hr/>";
		}
		echo '</pre>';
	} else if ($feedtxt != null){
			echo '<pre>';
			foreach($feedtxt as $item) {
				echo "<b>Title:</b> <a href=\"$item[link]\">$item[title]</a>\n";
				echo "<b>Published:</b> $item[date]\n";
			echo "<b>Category:</b> $item[category]\n";
			echo "\n$item[description]\n";
			echo "<hr/>";
		}
		echo '</pre>';
	} else {
		echo "RSS FEED ERROR";
	}
}
catch (Exception $e) {
    echo $e->getMessage();
}