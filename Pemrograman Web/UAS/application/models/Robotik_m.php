<?php
class Robotik_m extends CI_Model {

	public function get($id = null)
	{
		// $query = $this->db->query("SELECT * FROM data_robotik");
		$this->db->select('*');
		$this->db->from('data_robotik');
		if($id != null) {
			$this->db->where('id', $id);
		}
		$query = $this->db->get();
		return $query;
	}

	public function add($data)
	{
		$param = array(
			'nama' => $data['nama'],
			'sekolah' => $data['sekolah'],
			'kelas' => $data['kelas'],
			'usia' => $data['usia'],
			'nohp' => $data['nohp'],
		);
		$this->db->insert('data_robotik', $param);
	}

	public function edit($data)
	{
		$param = array(
			'nama' => $data['nama'],
			'sekolah' => $data['sekolah'],
			'kelas' => $data['kelas'],
			'nohp' => $data['nohp'],
			'usia' => $data['usia'],
		);
		$this->db->set($param);
		$this->db->where('id', $data['id']);
		$this->db->update('data_robotik');
	}

	public function del($id)
	{
		$this->db->where('id', $id);
		$this->db->delete('data_robotik');
	}

}