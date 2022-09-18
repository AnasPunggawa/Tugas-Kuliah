<h1><?=$isi;?></h1>
<div class="row">
	<div class="col-12">
		
	</div>
</div>
<table class="table position-relative">
	<thead>
		<tr>
			<th scope="col">No</th>
			<th scope="col">Nama</th>
			<th scope="col">Sekolah</th>
			<th scope="col">Kelas</th>
			<th scope="col">Usia</th>
			<th scope="col" class="d-none d-lg-block">Nomor HP</th>
			<th scope="col"></th>
		</tr>
	</thead>
	<tbody>
		<?php
	$no = 1;
	foreach ($robotik as $b => $row) { ?>
		<tr>
			<th scope="row"><?=$no++;?></th>
			<td><?=$row->nama;?></td>
			<td><?=$row->sekolah;?></td>
			<td><?=$row->kelas;?></td>
			<td><?=$row->usia;?></td>
			<td class="d-none d-lg-block pb-4"><?=$row->nohp;?></td>
			<td>
				<a href="<?=site_url('robotik/edit/'.$row->id);?>"><button type="button" class="btn btn-success">Edit</button></a>
				<a href="<?=site_url('robotik/del/'.$row->id);?>" onclick="return confirm('Yakin akan menghapus data ini?')"><button type="button" class="btn btn-danger">Hapus</button></a>
			</td>
		</tr>
		<?php	
	} ?>
  </tbody>
</table>
	<a href="<?=site_url('robotik/add');?>"><button type="button" class="btn btn-primary">Daftar</button></a>
