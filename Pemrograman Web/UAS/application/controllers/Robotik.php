<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Robotik extends CI_Controller {

	function __construct()
	{
		parent::__construct();
		$this->load->model('robotik_m', 'robotik');
	}

	public function index()
	{
		$query = $this->robotik->get();
		// $data['judul'] = 'Pendaftaran';
		// $data['robotik'] = $query->result();
		$data = array(
				'judul' => 'Pendaftaran',
				'isi' => "Pendaftaran Kelas Robotik",
				'robotik' => $query->result(),
			);
			$this->load->view('templates/header', $data);
			$this->load->view('robotik/index');
			$this->load->view('templates/footer', $data);
		}
		
		public function add()
		{
			$data = array(
				'judul' => 'Daftar',
				'isi' => "Daftar Kelas Robotik"
			);
			$this->load->view('templates/header', $data);
			$this->load->view('robotik/tambah_data');
			$this->load->view('templates/footer', $data);
		}
		
		public function edit($id = null)
		{
			$query = $this->robotik->get($id);
			$data = array(
				'judul' => 'Edit Pendaftaran',
				'isi' => "Edit Pendaftaran",
				'robotik' => $query->row()
		);
		$this->load->view('templates/header', $data);
		$this->load->view('robotik/edit_data');
		$this->load->view('templates/footer', $data);
	}

	public function proses()
	{
		if(isset($_POST['add'])) {
			$inputan = $this->input->post(null, TRUE);
			$this->robotik->add($inputan);
		} else if(isset($_POST['edit'])) {
			$inputan = $this->input->post(null, TRUE);
			$this->robotik->edit($inputan);
		}
		redirect('robotik');
	}

	public function del($id)
	{
		$this->robotik->del($id);
		redirect('robotik');
	}

}
