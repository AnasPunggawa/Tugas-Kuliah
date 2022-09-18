<h1><?=$isi;?></h1>
<div class="row mt-2">
	<div class="col-md-12">

		<!-- Slider -->
		<div id="carouselExampleSlidesOnly" class="carousel slide col-md-5 float-md-end mb-3 ms-md-3 " data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="<?= base_url("assets/img/robot4.jpg"); ?>" class="d-block w-100 col-md-5 float-md-end mb-3 ms-md-3 img-fluid img-thumbnail rounded-2 border border-warning border-3" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="<?= base_url("assets/img/robot1.jpg"); ?>" class="d-block w-100 col-md-5 float-md-end mb-3 ms-md-3 img-fluid img-thumbnail rounded-2 border border-warning border-3" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="<?= base_url("assets/img/robot3.jpg"); ?>" class="d-block w-100 col-md-5 float-md-end mb-3 ms-md-3 img-fluid img-thumbnail rounded-2 border border-warning border-3" alt="...">
                </div>
            </div>
        </div>

		<!-- Form Edit Pendaftaran -->
		<div class="card">
			<div class="card-header">
				Ubah Data
			</div>
			<div class="card-body">
			<?php echo form_open('robotik/proses', '', array('id' => $robotik->id)); ?>
				<form>
				<div class="mb-3">
					<label for="nama" class="form-label">Nama</label>
					<input type="text" class="form-control" id="nama" name="nama" required="required" value="<?=$robotik->nama;?>">
				</div>
				<div class="mb-3">
					<label for="sekolah" class="form-label">Sekolah</label>
					<input type="text" class="form-control" id="sekolah" name="sekolah" required="required" value="<?=$robotik->sekolah;?>">
				</div>
				<div class="mb-3">
					<label for="kelas" class="form-label">Kelas</label>
					<input type="txt" class="form-control" id="kelas" name="kelas" required="required" value="<?=$robotik->kelas;?>">
				</div>
				<div class="mb-3">
					<label for="usia" class="form-label">Usia</label>
					<input type="number" class="form-control" id="usia" name="usia" required="required" value="<?=$robotik->usia;?>">
				</div>
				<div class="mb-3">
					<label for="nohp" class="form-label">No HP</label>
					<input type="number" class="form-control" id="nohp" name="nohp" required="required" value="<?=$robotik->nohp;?>">
				</div>
				<button type="submit" name="edit" value="Edit" class="btn btn-primary">Simpan</button>
				<a href="<?=site_url('robotik/index');?>"><button type="button" class="btn btn-danger">Kembali</button></a>
				</form>
			<?php echo form_close(); ?>
			</div>
		</div>
	</div>
</div>