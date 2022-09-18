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
    $feed = $Rss->getFeed('https://www.covid19.go.id/feed/', Rss::XML);
    echo '<pre>';
    foreach($feed as $item) {
        echo "<b>Title:</b> <a href=\"$item[link]\">$item[title]</a>\n";
        echo "<b>Published:</b> $item[date]\n";
        echo "<b>Category:</b> $item[category]\n";
        echo "\n$item[description]\n";
        echo "<hr/>";
    }
    echo '</pre>';
}
catch (Exception $e) {
    echo $e->getMessage();
}

/*
    SimpleXML way
*/
try {
    $feed = $Rss->getFeed('https://www.covid19.go.id/feed/', Rss::SXML);
    echo '<pre>';
    foreach($feed as $item) {
        echo "<b>Title:</b> <a href=\"$item[link]\">$item[title]</a>\n";
        echo "<b>Published:</b> $item[date]\n";
        echo "<b>Category:</b> $item[category]\n";
        echo "\n$item[description]\n";
        echo "<hr/>";
    }
    echo '</pre>';
}
catch (Exception $e) {
    echo $e->getMessage();
}

/*
    Text way
*/
try {
    $feed = $Rss->getFeed('https://www.covid19.go.id/feed/', Rss::TXT);
    echo '<pre>';
    foreach($feed as $item) {
        echo "<b>Title:</b> <a href=\"$item[link]\">$item[title]</a>\n";
        echo "<b>Published:</b> $item[date]\n";
        echo "<b>Category:</b> $item[category]\n";
        echo "\n$item[description]\n";
        echo "<hr/>";
    }
    echo '</pre>';
}
catch (Exception $e) {
    echo $e->getMessage();
}