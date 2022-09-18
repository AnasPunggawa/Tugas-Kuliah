<?php
class Home extends CI_Controller {

	public function index()
	{
		$data = array(
			'judul' => 'Home',
			'isi' => "Robotik UNM"
		);
		$this->load->view('templates/header', $data);
		$this->load->view('home/index');
		$this->load->view('templates/footer', $data);
	}

}
