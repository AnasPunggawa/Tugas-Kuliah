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
                <li><a href="<?= base_url(); ?>" class="active">Home</a></li>
                <li><a href="<?= base_url(); ?>news">News</a></li>
            </div>
        </ul>
    </nav>
    <div class="body">
        <div class="hero">
            <div class="kelompok">
                <h1>Kelompok <span>1</span></h1>
                <h3>Team 1</h3>
                <p class="pronounce">/tēm/</p>
                <p class="about">Website ini dibuat untuk memenuhi tugas <br> Ujian Tengah Semester Mata Kuliah Pemrograman Web.<br>Jumlah anggota kelompok kami ialah 5 orang.</p>
            </div>
            <div class="logo">
                <img src="<?= base_url("assets/img/hero.png"); ?>" alt="">
            </div>
        </div>
        <div class="content">
            <h1>Part of Team :</h1>
            <div class="people">
            <div class="person">
                <img src="<?= base_url("assets/img/Ikhsan.jpeg"); ?>" alt="">
                <h3 class="nama">Ikhsan Qadri</h3>
                <p class="deskripsi">Hobby : Design<br>Dreams : Product Designer<br>1929041002</p>
                <div class="sosMed">
                    <a href="https://www.facebook.com/ihsanlimatiga" target="_blank"><i class="fab fa-facebook"></i></a>
                    <a href="https://www.instagram.com/ikhsanqadri/" target="_blank"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
            <div class="person">
                <img src="<?= base_url("assets/img/Risdar.png"); ?>" alt="">
                <h3 class="nama">Muh. Risdar Norhidayatullah</h3>
                <p class="deskripsi">Hobby : Design<br>Dreams : Graphic Designer<br>1929041006</p>
                <div class="sosMed">
                    <a href="https://www.facebook.com/risdar.risdar.967" target="_blank"><i class="fab fa-facebook"></i></a>
                    <a href="https://www.instagram.com/dn_mrisdar/" target="_blank"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
            <div class="person">
                <img src="<?= base_url("assets/img/Anas.jpg"); ?>" alt="">
                <h3 class="nama">Muhammad Anas Punggawa</h3>
                <p class="deskripsi">Hobby : Coding<br>Dreams : Full-stack Developer<br>1929041008</p>
                <div class="sosMed">
                    <a href="https://www.facebook.com/anaspunggawa.anas" target="_blank"><i class="fab fa-facebook"></i></a>
                    <a href="https://www.instagram.com/anspunggawa/" target="_blank"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
            <div class="person">
                <img src="<?= base_url("assets/img/Agung.png"); ?>" alt="">
                <h3 class="nama">Agung Borolla</h3>
                <p class="deskripsi">Hobby : Coding<br>Dreams : IoT Developer<br>1929041023</p>
                <div class="sosMed">
                    <a href="https://www.facebook.com/agung.borolla" target="_blank"><i class="fab fa-facebook"></i></a>
                    <a href="https://www.instagram.com/agngbrlla/" target="_blank"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
            <div class="person">
                <img src="<?= base_url("assets/img/Angga.jpg"); ?>" alt="">
                <h3 class="nama">Andi Muh. Mappanganro</h3>
                <p class="deskripsi">Hobby : Design<br>Dreams : Front-End Developer<br>1929041034</p>
                <div class="sosMed">
                    <a href="https://web.facebook.com/syifa.pratama.311" target="_blank"><i class="fab fa-facebook"></i></a>
                    <a href="https://www.instagram.com/andimuhmappanganro99/" target="_blank"><i class="fab fa-instagram"></i></a>
                </div>
            </div>
            </div>
        </div>
    </div>
    <div class="footer">
        <p class="copyR">@CopyRight <a href="#">Kelompok 1</a></p>
    </div>
</body>
</html>