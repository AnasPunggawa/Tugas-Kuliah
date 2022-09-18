<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title><?php echo $title;?></title>
    <link rel="stylesheet" type="text/css" href="<?= base_url("assets/css/style.css"); ?>">
    <link rel="icon" href="<?= base_url("assets/img/icon.ico"); ?>" type="image/icon type">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/e23e41c8be.js" crossorigin="anonymous"></script>
</head>
<body>
    <nav class="nav cf">
        <ul>
            <div class="icon">
                <a href="https://covid19.go.id/" target="_blank"><img src="<?= base_url("assets/img/Garuda.png"); ?>" alt=""></a>
                <a href="https://unm.ac.id/" target="_blank"><img src="<?= base_url("assets/img/unm.png"); ?>" alt=""></a>
                <a href="https://kampusmerdeka.kemdikbud.go.id/" target="_blank"><img src="<?= base_url("assets/img/kampusMerdeka.png"); ?>" alt=""></a>
            </div>
            <div class="link cf">                
                <li><a href="<?= base_url(); ?>">Home</a></li>
                <li><a href="<?= base_url(); ?>news"  class="active">News</a></li>
            </div>
        </ul>
    </nav>
    <div class="container cf">
        <div class="hero"><img src="<?= base_url("assets/img/CovidNewsId.jpeg"); ?>" alt=""></div>
        <div class="content">
            <h1>News :</h1>
            <div class="news">
                <?php
                header( 'Content-Type: text/html; charset=utf-8' );
                error_reporting(E_ALL);
                ini_set('display_errors', true);
                include 'Rss.minified.php'; 
                $Rss = new Rss;
                try {
                    $feedxml = $Rss->getFeed('https://www.covid19.go.id/feed/', Rss::XML);
                    $feedsxml = $Rss->getFeed('https://www.covid19.go.id/feed/', Rss::SXML);
                    $feedtxt = $Rss->getFeed('https://www.covid19.go.id/feed/', Rss::TXT);
                    if ($feedxml != null) {
                        foreach($feedxml as $item) {
                            echo "<a href=\"$item[link]\" target=\"_blank\">$item[title]</a>\n";
                            // echo "\n$item[description]\n";
                            echo "<p>$item[description]</p>";
                            echo "<div></div>";
                        }
                    } else if ($feedsxml != null) {
                        foreach($feedsxml as $item) {
                            echo "<a href=\"$item[link]\" target=\"_blank\">$item[title]</a>\n";
                            // echo "\n$item[description]\n";
                            echo "<p>$item[description]</p>";
                            echo "<div></div>";
                        }
                    } else if ($feedtxt != null) {
                        foreach($feedtxt as $item) {
                            echo "<a href=\"$item[link]\" target=\"_blank\">$item[title]</a>\n";
                            // echo "\n$item[description]\n";
                            echo "<p>$item[description]</p>";
                            echo "<div></div>";
                        }
                    } else {
                        echo "<h1>RSS FEED IS ERROR FROM THE SOURCE</h1>";
                    }
                }
                catch (Exception $e) {
                    echo $e->getMessage();
                }
                ?>
            </div>
        </div>
    </div>
    <div class="footer">
        <p class="copyR">@CopyRight <a href="#">Kelompok 1</a></p>
    </div>
</body>
</html>