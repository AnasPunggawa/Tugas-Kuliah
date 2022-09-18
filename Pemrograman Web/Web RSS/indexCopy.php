<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Andi</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
    <table >
        <tr>
            <td colspan="3"><h2>Situs Andi Muh Mappanganro</h2></td>
        </tr>
        <tr>
            <td colspan="3" style="text-align: center">
            |<a href="#">Home</a>|<a href="#">Profile</a>|<a href="#">Download</a>|
            </td>
        </tr>
        <tr>
            <td>
           Andi Muh Mappanganro <br> 1929041034 <br> PTIK B 2019
            </td>
            <td> 
                <strong>Menampilkan Judul Dari Situs <a href="http://feeds.feedburner.com/phpclasses?format=xml" target="_blank">feeds.feedburner.com</a></strong>
            </td>
            <td>
                <?php
                header( 'Content-Type: text/html; charset=utf-8' );
                error_reporting(E_ALL);
                ini_set('display_errors', true);
                include 'Rss.minified.php'; 
                $Rss = new Rss;
                try {
                    $feed = $Rss->getFeed('http://feeds.feedburner.com/phpclasses?format=xml/', Rss::XML);
                    // echo '<pre>';
                    foreach($feed as $item) {
                        echo "<a href=\"$item[link]\" target=\"_blank\">$item[title]</a>\n";
                        echo "<hr/>";
                    }
                    // echo '</pre>';
                }
                catch (Exception $e) {
                    echo $e->getMessage();
                }
                ?>
            </td>
        </tr>
    </table>
</body>
</html>