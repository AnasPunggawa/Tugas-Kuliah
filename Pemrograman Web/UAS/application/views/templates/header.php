<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
    <!-- Local CSS -->
    <link rel="stylesheet" href="<?= base_url("assets/css/style.css"); ?>" />

    <title><?=$judul;?></title>

    <!-- Icon Web -->
    <link rel="icon" href="<?= base_url("assets/img/LogoUNM.ico"); ?>" type="image/icon type">

    <!-- Icon Font Awesome -->
    <script src="https://kit.fontawesome.com/e23e41c8be.js" crossorigin="anonymous"></script>

  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container-fluid">
        <a class="navbar-brand fs-1 fw-bold" href="https://robotron-unm.blogspot.com/" target="_blanks">
          <img src="<?= base_url("assets/img/LogoRobotik.png"); ?>" alt="" width="50" height="44" class="d-inline-block align-text-top">
          Robotron
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon">
            </span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
            <a class="nav-link <?=$this->uri->segment(1) == 'home' ? 'active' : null; ?> fs-3" aria-current="<?=$this->uri->segment(1) == 'home' ? 'page' : null; ?>" href="<?=site_url('home');?>">Home</a>
            <a class="nav-link <?=$this->uri->segment(1) == 'robotik' ? 'active' : null; ?> fs-3" aria-current="<?=$this->uri->segment(1) == 'home' ? 'page' : null; ?>" href="<?=site_url('robotik');?>">Pendaftaran</a>
        </div>
        </div>
    </div>
</nav>
      <div class="container bg-light p-3">
		<div class="wrapper">