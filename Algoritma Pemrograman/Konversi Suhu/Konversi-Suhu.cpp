#include <iostream>
#include <conio.h>

int main()
{
	int main;
	float celc, fahr;
	std::cout << "\tALGORITMA PEMPROGRAMAN\n\tMuhammad Anas Punggawa\n\t1929041008\n\n";
	std::cout << "=========== KONVERSI SUHU ===========\n\n";
	std::cout << "       Celsius ke Fahrenheit\n";
	std::cout << "     Masukkan Nilai Celsius = ";
	std::cin >> celc;
	fahr = (celc * 9 / 5) + 32;
	std::cout << "        Fahrenheit = " << fahr << "\n\n";
	std::cout << "=====================================\n\n";
	std::cout << "       Fahrenheit ke Celcius\n";
	std::cout << "    Masukkan Nilai Fahrenheit = ";
	std::cin >> fahr;
	celc = (fahr - 32) * 5 / 9;
	std::cout << "        Celsius = " << celc << "\n\n";
	std::cout << "=====================================\n\n";
	std::cout << "Tekan Tombol Apapun Untuk Keluar" << std::endl;
	std::cout << "Arigatou :)\n" << std::endl;
	std::cin.get();
	return 0;
}