<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class News extends CI_Controller {
	public function index()
	{
        $data['title'] = 'News';
		$this->load->view('news/index', $data);
	}
}
