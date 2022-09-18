<html>
<head>
    <title>Script Sederhana PHP</title>
</head>
<body>
    <h2>Menampilkan angka genap yang berada di antara angka 1 sampai 10</h2>
    <?php
    $jumlahBilangan = 10;
    for ($i=1; $i < $jumlahBilangan; $i++) { 
        if ($i % 2 == 0) {
            echo "$i<br>";
        }
    }
    ?>
    <p><strong>Nama : Muhammad Anas Punggawa<br>NIM : 1929041008</strong></p>
</body>
</html>
