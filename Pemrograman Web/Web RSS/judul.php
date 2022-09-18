<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Anas - Title</title>
    <link rel="stylesheet" href="style/style.css" />
</head>
<body>
    <table >
        <tr>
            <td colspan="3"><h2>Situs Anas Punggawa</h2></td>
        </tr>
        <tr>
            <td colspan="3" style="text-align: center">
            |<a href="#">Home</a>|<a href="#">Profile</a>|<a href="#">Download</a>|
            </td>
        </tr>
        <tr>
            <td>
            Muhammad Anas Punggawa <br> 1929041008 <br> PTIK B 2019
            </td>
            <td> 
                <strong>Menampilkan Judul Dari Situs <a href="https://www.covid19.go.id" target="_blank">www.covid19.go.id</a></strong>
            </td>
            <td>
                <?php
                header( 'Content-Type: text/html; charset=utf-8' );
                error_reporting(E_ALL);
                ini_set('display_errors', true);
                include 'Rss.minified.php'; 
                $Rss = new Rss;
                try {
                    $feed = $Rss->getFeed('https://www.covid19.go.id/feed/', Rss::XML);
                    foreach($feed as $item) {
                        echo "<a href=\"$item[link]\" target=\"_blank\">$item[title]</a>\n";
                        echo "<hr/>";
                    }
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