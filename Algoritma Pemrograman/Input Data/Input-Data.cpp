#include <iostream>
#include <conio.h>
using namespace std;

int main()
{
	string nama, tempat_lahir, agama, status, pangkat;
	int nip, tgl_lahir;
	char jenkel;

	cout << "\tALGORITMA PEMPROGRAMAN\n";
	cout << "\tMUHAMMAD ANAS PUNGGAWA\n";
	cout << "\t1929041008\n" << endl;

	cout << "=========== DATA PEGAWAI ==========" << endl;
	cout << "Masukkan NIP : ";
	cin >> nip;
	cout << "Masukkan Nama : ";
	cin >> nama;
	cout << "Masukkan Tanggal Lahir : ";
	cin >> tgl_lahir;
	cout << "Masukkan Tempat Lahir : ";
	cin >> tempat_lahir;
	cout << "Masukkan Jenis Kelamin (L/P) : ";
	cin >> jenkel;
	cout << "Masukkan Agama : ";
	cin >> agama;
	cout << "Masukkan Status : ";
	cin >> status;
	cout << "Masukkan Pangkat : ";
	cin >> pangkat;

	cout << "\n======== HASIL MASUKAN DATA =======" << endl;
	cout << "NIP : " << nip << endl;
	cout << "Nama : " << nama << endl;
	cout << "Tanggal Lahir : " << tgl_lahir << endl;
	cout << "Tempat Lahir : " << tempat_lahir << endl;
	cout << "Jenis Kelamin : " << jenkel << endl;
	cout << "Agama : " << agama << endl;
	cout << "Status : " << status << endl;
	cout << "Pangkat : " << pangkat << endl;

	cout << "\n===================================" << endl;
	cout << "Arigatou :)" << endl;
	return 0 ();
	cin.get();
}
