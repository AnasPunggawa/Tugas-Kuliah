//	UJIAN AKHIR SEMESTER - KOMPUTER GRAFIS
//	MUHAMMAD ANAS PUNGGAWA
//	1929041008

#include <stdio.h> 		// Memanggil library fungsi INPUT-OUTPUT
#include <stdlib.h> 	// Memanggil library operasi pembanding dan operasi konversi
#include <GL/glut.h> 	// Memanggil library grafik dan opengl


float sudut = 0, sx = 0, sy = 0, sz = 0;	// Menetapkan nilai sudut, sx, sy, dan sz

// Membuat method initGL
void initGL() {		// Method initGL untuk mengatur grafik
	glClearColor(0.0, 0.0, 0.0, 1.0);	// Mengatur warna latar menjadi hitam dan buram
	glClearDepth(1.0);	// Mengaur kedalaman latar belakang ke terjauh
	glEnable(GL_DEPTH_TEST);	// Mengaktifkan pengujian kedalaman untuk z-culling
	glDepthFunc(GL_LEQUAL);		// Setel jenis uji kedalaman
	glShadeModel(GL_SMOOTH);	// Mengaktifkan bayangan halus
	glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);	// Koreksi perspektif yang bagus
}

// Membuat method pyramida
void pyramid() {	// Method pyramida untuk membuat objek piramida terdiri dari 4 segitiga
	glBegin(GL_TRIANGLES);	// Mulai gambar piramida dengan 4 segitiga
	
	// Depan
	glColor3f(1.0, 0.0, 0.0);		// Merah
	glVertex3f(0.0, 1.0, 0.0);		// Titik koordinat 0.0, 1.0, 0.0
	glColor3f(0.0f, 1.0, 0.0);		// Hijau
	glVertex3f(-1.0, -1.0, 1.0);	// Titik koordinat -1.0, -1.0, 1.0
	glColor3f(0.0, 0.0, 1.0);		// Biru
	glVertex3f(1.0, -1.0, 1.0);		// Titik koordinat 1.0, -1.0, 1.0
	
	// Kanan
	glColor3f(1.0, 0.0, 0.0);		// Merah
	glVertex3f(0.0, 1.0, 0.0);		// Titik koordinat 0.0, 1.0, 0.0
	glColor3f(0.0, 0.0, 1.0);		// Biru
	glVertex3f(1.0, -1.0, 1.0);		// Titik koordinat 1.0, -1.0, 1.0
	glColor3f(0.0, 1.0, 0.0);		// Hijau
	glVertex3f(1.0, -1.0, -1.0);	// Titik koordinat 1.0, -1.0, -1.0
	
	// Belakang
	glColor3f(1.0, 0.0, 0.0);		// Merah
	glVertex3f(0.0, 1.0, 0.0);		// Titik koordinat 0.0, 1.0, 0.0
	glColor3f(0.0, 1.0, 0.0);		// Hijau
	glVertex3f(1.0, -1.0, -1.0);	// Titik koordinat 1.0, -1.0, -1.0
	glColor3f(0.0, 0.0, 1.0);		// Biru
	glVertex3f(-1.0, -1.0, -1.0);	// Titik koordinat -1.0, -1.0, -1.0
	
	// Kiri
	glColor3f(1.0, 0.0, 0.0);       // Merah
	glVertex3f(0.0, 1.0, 0.0);		// Titik koordinat 0.0, 1.0, 0.0
	glColor3f(0.0, 0.0, 1.0);       // Biru
	glVertex3f(-1.0, -1.0, -1.0);	// Titik koordinat -1.0, -1.0, -1.0
	glColor3f(0.0, 1.0, 0.0);       // Hijau
	glVertex3f(-1.0, -1.0, 1.0);	// Titik koordinat -1.0, 1.0, 1.0
	glEnd();		// Selesai menggambar piramid
	glFlush();		// Memastikan perintah OpenGL dieksekusi
}

// Membuat method display
void display() {	// Method display untuk mengatur objek yang akan ditampilkan
	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);		// Untuk membersihkan layar dan kedalaman buffer
	glPushMatrix();					// Menyimpan koordinat yang ada untuk objek pyramid
	glMatrixMode(GL_MODELVIEW);		// Untuk beroperasi pada matriks model-view
	glLoadIdentity();				// Atur ulang matriks model-view
	glTranslatef(0.0, 0.0, -6.0);	// Objek berada pada posisi koordinat 0.0, 0.0, -6.0
	glRotatef(sudut, sx, sy, sz);	// Objek melakukan rotasi
	pyramid(); 						// Memanggil method pyramid
	glPopMatrix();					// Memangil fungsi yang telah disimpan pada glPushMatrix()
	
	glPushMatrix();					// Menyimpan koordinat yang ada untuk objek uaskg
    glTranslatef(-2.0, 2.0, 0.0);   // Objek berada pada posisi koordinat -2.0, 2.0, 0.0
    char uaskg[] = {"UJIAN AKHIR SEMESTER KOMPUTER GRAFIS" };	// Teks yang ditampilkan   
    glColor3f(1.0, 1.0, 1.0);    	// Putih
    glRasterPos2f(0.0, 0.0);    	// Objek berada pada posisi koordinat 0.0, 0.0
        for (int i = 0; i < strlen(uaskg); i++) {	// Melakukan perulangan i 
        glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24, uaskg[i]);	// Menggunakan font Times Roman dengan ukuran 24  
    }
    glPopMatrix();					// Memangil fungsi yang telah disimpan pada glPushMatrix()
    
	glPushMatrix();					// Menyimpan koordinat yang ada untuk objek nama
    glTranslatef(-0.9, 1.7, 0.0);   // Objek berada pada posisi koordinat -0.9, 1.7, 0.0
    char nama[] = {"Muhammad Anas Punggawa"};	// Teks yang ditampilkan  
    glColor3f(1.0, 1.0, 1.0);    	// Putih
    glRasterPos2f(0.0, 0.0);    	// Objek berada pada posisi koordinat 0.0, 0.0
        for (int i = 0; i < strlen(nama); i++) {	// Melakukan perulangan i
        glutBitmapCharacter(GLUT_BITMAP_HELVETICA_18, nama[i]);		// Menggunakan font Helvetica dengan ukuran 18  
    }
    glPopMatrix();					// Memangil fungsi yang telah disimpan pada glPushMatrix()
	
	glPushMatrix();					// Menyimpan koordinat yang ada untuk objek nim
    glTranslatef(-0.4, 1.5, 0.0);   // Objek berada pada posisi koordinat -0.4, 1.5, 0.0
    char nim[] = {"1929041008"};  	// Teks yang ditampilkan  
    glColor3f(1.0, 1.0, 1.0);    	// Putih
    glRasterPos2f(0.0, 0.0);    	// Objek berada pada posisi koordinat 0.0, 0.0
        for (int i = 0; i < strlen(nim); i++) {		// Melakukan perulangan i
        glutBitmapCharacter(GLUT_BITMAP_HELVETICA_18, nim[i]);		// Menggunakan font Helvetica dengan ukuran 18
    }
    glPopMatrix();					// Memangil fungsi yang telah disimpan pada glPushMatrix()
    
	glPushMatrix();					// Menyimpan koordinat yang ada untuk objek ket
    glTranslatef(-1.3, -1.7, 0.0);  // Objek berada pada posisi koordinat -1.3, -1.7, 0.0
    char ket[] = {"Keterangan Tombol:" };	// Teks yang ditampilkan  
    glColor3f(1.0, 0.0, 0.0);    	// Merah
    glRasterPos2f(0.0, 0.0);    	// Objek berada pada posisi koordinat 0.0, 0.0
        for (int i = 0; i < strlen(ket); i++) {		// Melakukan perulangan i    
        glutBitmapCharacter(GLUT_BITMAP_HELVETICA_18, ket[i]);		// Menggunakan font Helvetica dengan ukuran 18
    }
    glPopMatrix();					// Memangil fungsi yang telah disimpan pada glPushMatrix()
    
	glPushMatrix();    				// Menyimpan koordinat yang ada untuk objek tmblx
    glTranslatef(-1.3, -1.9, 0.0);  // Objek berada pada posisi koordinat -1.3, -1.9, 0.0 
    char tmblx[] = {"- Tombol X = Rotasi secara vertikal" };	// Teks yang ditampilkan   
    glColor3f(1.0, 1.0, 0.0);    	// Kuning
    glRasterPos2f(0.0, 0.0);    	// Objek berada pada posisi koordinat 0.0, 0.0
        for (int i = 0; i < strlen(tmblx); i++) {	// Melakukan perulangan i
        glutBitmapCharacter(GLUT_BITMAP_HELVETICA_18, tmblx[i]);	// Menggunakan font Helvetica dengan ukuran 18
    }
    glPopMatrix();					// Memangil fungsi yang telah disimpan pada glPushMatrix()
    
    glPushMatrix();    				// Menyimpan koordinat yang ada untuk objek tmbly
    glTranslatef(-1.3, -2.1, 0.0);  // Objek berada pada posisi koordinat -1.3, -2.1, 0.0
    char tmbly[] = {"- Tombol Y = Rotasi secara horizontal" };	// Teks yang ditampilkan 
    glColor3f(0.0, 1.0, 0.0);    	// Hijau
    glRasterPos2f(0.0, 0.0);    	// Objek berada pada posisi koordinat 0.0, 0.0
        for (int i = 0; i < strlen(tmbly); i++) {	// Melakukan perulangan i
        glutBitmapCharacter(GLUT_BITMAP_HELVETICA_18, tmbly[i]); 	// Menggunakan font Helvetica dengan ukuran 18
    }
    glPopMatrix();					// Memangil fungsi yang telah disimpan pada glPushMatrix()
    glutSwapBuffers();  			// Tukar frame depan dan belakang buffer (buffering ganda)
	glFlush();						// Memastikan perintah OpenGL dieksekusi
}

// Membuat method myKeyboard
void myKeyboard(unsigned char key, int x, int y) {	// Method myKeyboard untuk mengatur perubahan gambar berdasarkan tombol pada keyboard 
	if (key == 'x') {		// Lakukan jika tombol X ditekan
		sx = 1;				// sx bernilai 1
		sy = 0;				// sy bernilai 0
		sz = 0;				// sz bernilai 0
		sudut += 10;		// Nilai sudut bertambah 10
	}
	else if (key == 'y') {	// Lakukan jika tombol Y ditekan		
		sx = 0;				// sx bernilai 0
		sy = 1;				// sy bernilai 1
		sz = 0;				// sz bernilai 0
		sudut += 10;		// Nilai sudut bertambah 10
	}
}

// Membuat method timer
void timer(int value) {				// Method timer untuk mengatur waktu
	glutPostRedisplay();			// Mengirimkan perintah saat mengaktifkan display secara berkala (looping)
	glutTimerFunc(50, timer, 0);	// Mengaktifkan pengaturan timer function, dimana 50 merupakan nilai dari parameter 
					  		 		// unsign millisecond, Timer merupakan GLUT function (callback) dan 0 merupakan nilai dari variabel value
}

// Membuat method reshape
void reshape(GLsizei width, GLsizei height) { // Dipanggil kembali ketika jendela pertama kali muncul dan setiap kali jendela diukur ulang 
	 				 						  // dengan lebar dan tinggi baru
	// Hitung rasio aspek dari jendela baru
	if (height == 0) height = 1;                		// Mencegah pembagian dengan 0
	GLfloat aspect = (GLfloat)width / (GLfloat)height;	// Menentukan nilai dari aspect
	glViewport(0, 0, width, height); 					//Menyetel viewport untuk menutupi jendela baru
	
	// Menyetel rasio aspek
	glMatrixMode(GL_PROJECTION);  						// Inisialisasi matriks GL_PROJECTION
	glLoadIdentity();             						// Memuat ulang matriks identitas
	gluPerspective(45.0, aspect, 0.1, 100.0);			// Mengatur perspektif objek yang tampil pada layar
}

// Program utama
int main(int argc, char** argv) {	// Method utama untuk mengeksekusi keseluruhan program
	glutInit(&argc, argv);            					// Inisialisasi GLUT
	glutInitDisplayMode(GLUT_DOUBLE); 					// Menghidupkan mode dobel
	glutInitWindowSize(640, 640);   					// Ukuran tampilan jendela
	glutInitWindowPosition(0, 0); 						// Posisi jendela tampilan berada pada kiri atas layar
	glutCreateWindow("UAS - Muhammad Anas Punggawa");	// Membuat jendela dengan judul UAS - Muhammad Anas Punggawa
	glutDisplayFunc(display);   		    			// Memanggil function display
	glutReshapeFunc(reshape);       					// Memanggil handler untuk merubah ukuran jendela
	initGL();                       					// Inisialisasi OpenGL
	glutTimerFunc(50, timer, 0);						// Mengaktifkan pengaturan timer function, dimana 50 merupakan nilai dari parameter 
 					  		 							// nsign millisecond, Timer merupakan GLUT function (callback) dan 0 merupakan nilai dari variabel value
	glutKeyboardFunc(myKeyboard);						// Sintaks memanggil method myKeyboard untuk tombol-tombol spesialnya
	glutMainLoop();                 					// Sintaks untuk mengulang fungsi/method main
	return 0;											// Sintaks untuk kembali ke program utama
}


