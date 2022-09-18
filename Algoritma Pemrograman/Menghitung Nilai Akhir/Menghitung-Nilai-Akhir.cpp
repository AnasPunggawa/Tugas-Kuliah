#include <iostream>
#include <conio.h>
using namespace std;

int main()
{
	int nilai_tugas, nilai_midtes, nilai_finaltes, nilai_akhir;
	cout << "\tALGORITMA PEMROGRAMAN\n";
	cout << "\tMUHAMMAD ANAS PUNGGAWA\n";
	cout << "\t1929081008\n" << endl;

	cout << "====== Nilai Akhir Mahasiswa ======" << endl;
	cout << "Masukkan Nilai Tugas = ";
	cin >> nilai_tugas;
	cout << "Masukkan Nilai Mid Tes = ";
	cin >> nilai_midtes;
	cout << "Masukkan Nilai Final Tes = ";
	cin >> nilai_finaltes;
	nilai_akhir = 0.20 * nilai_tugas + 0.30 * nilai_midtes + 0.50 * nilai_finaltes;

	cout << "\n======== Hasil Nilai Akhir ========\n";
	cout << "Nilai Akhir = " << nilai_akhir << "\n";
	cout << "\n===================================" << endl;
	cout << "Arigatou :)" << endl;
	return 0();
	cin.get();
}
