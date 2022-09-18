#include<GL/glut.h>
#include <math.h>

void draw_pixel(int ix,int iy)
{
    glBegin(GL_POINTS);
    glVertex2i(ix,iy);
    glEnd();
    glFlush();
}

void bres(GLfloat x1,GLfloat y1,GLfloat x2,GLfloat y2) {
    int dx, dy, i, e;
    int incx, incy, inc1, inc2;
    int x, y;
    dx = x2 - x1;
    dy = y2 - y1;
    if(dx < 0) dx = -dx;
    if(dy < 0) dy = -dy;
    incx = 1;
    if(x2 < x1) incx = -1;
    incy = 1;
    if(y2 < y1) incy = -1;
    x = x1;
    y = y1;
    if(dx > dy) {
        draw_pixel(x, y);
        e= 2 * dy - dx;
        inc1 = 2 * (dy - dx);
        inc2 = 2 * dy;
        for(i = 0 ; i < dx; i++) {
            if( e >= 0) {
                y += incy;
                e += inc1;
            }
            else
                e += inc2;
            x += incx;
            draw_pixel(x, y);
        }
    }
    else {
        draw_pixel(x, y);
        e= 2 * dx - dy;
        inc1= 2 * (dx - dy);
        inc2= 2 * dx;
        for(i=0; i < dy;i++) {
            if(e >= 0)
            {
                x += incx;
                e += inc1;
            }
            else
                e += inc2;
            y += incy;
            draw_pixel(x, y);
        }
    }    
}

void lingkaran(int jari2, int jumlah_titik, int x_tengah, int y_tengah) {
	const double PI = 3.141592653589793;
	int i;
	glBegin(GL_POLYGON);
	for (i = 0; i <= 360; i++) {
		float sudut = i * (2 * PI / jumlah_titik);
		float x = x_tengah + jari2 * cos (sudut);
		float y = y_tengah + jari2 * sin (sudut);
		glVertex2f(x, y);
	}
	glEnd();
	glFlush();
}

void display() {
	glClear(GL_COLOR_BUFFER_BIT);
	
// Rumah Atas
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(9.0);
	GLint x0 = -220;
	GLint y0 = 400;
	GLint xEnd = 195;
	GLint yEnd = 400;
	bres(x0, y0, xEnd, yEnd);

// Rumah Tengah
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(8.0);
	GLint x1 = -375;
	GLint y1 = 190;
	GLint x2 = 350;
	GLint y2 = 190;
	bres(x1, y1, x2, y2);
	
// Rumah Bawah
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(8.0);
	GLint x3 = -375;
	GLint y3 = -400;
	GLint x4 = 350;
	GLint y4 = -400;
	bres(x3, y3, x4, y4);
	
// Atap Kiri
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(9.0);
	GLint x5 = -220;
	GLint y5 = 400;
	GLint x6 = -374;
	GLint y6 = 190;
	bres(x5, y5, x6, y6);

// Atap Tengah
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(9.0);
	GLint x7 = -220;
	GLint y7 = 400;
	GLint x8 = -66;
	GLint y8 = 190;
	bres(x7, y7, x8, y8);

// Atap Kanan
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(9.0);
	GLint x9 = 194;
	GLint y9 = 400;
	GLint x10 = 349;
	GLint y10 = 190;
	bres(x9, y9, x10, y10);
	
// Rumah Kiri
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(8.0);
	GLint x11 = -375;
	GLint y11 = 190;
	GLint x12 = -375;
	GLint y12 = -400;
	bres(x11, y11, x12, y12);

// Rumah Tengah
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(8.0);
	GLint x13 = -65;
	GLint y13 = 190;
	GLint x14 = -65;
	GLint y14 = -400;
	bres(x13, y13, x14, y14);

// Rumah Kanan
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(8.0);
	GLint x15 = 350;
	GLint y15 = 190;
	GLint x16 = 350;
	GLint y16 = -400;
	bres(x15, y15, x16, y16);

// Pintu Atas
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(4.0);
	GLint x17 = -325;
	GLint y17 = 40;
	GLint x18 = -120;
	GLint y18 = 40;
	bres(x17, y17, x18, y18);

// Pintu Kiri
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(4.0);
	GLint x19 = -325;
	GLint y19 = 40;
	GLint x20 = -325;
	GLint y20 = -400;
	bres(x19, y19, x20, y20);

// Pintu Kanan
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(4.0);
	GLint x21 = -120;
	GLint y21 = 40;
	GLint x22 = -120;
	GLint y22 = -400;
	bres(x21, y21, x22, y22);

// Jendela Atas
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(4.0);
	GLint x23 = 90;
	GLint y23 = 40;
	GLint x24 = 195;
	GLint y24 = 40;
	bres(x23, y23, x24, y24);

// Jendela Tengah
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(4.0);
	GLint x25 = 90;
	GLint y25 = -30;
	GLint x26 = 195;
	GLint y26 = -30;
	bres(x25, y25, x26, y26);

// Jendela Bawah
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(4.0);
	GLint x27 = 90;
	GLint y27 = -100;
	GLint x28 = 195;
	GLint y28 = -100;
	bres(x27, y27, x28, y28);

// Jendela Kiri
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(4.0);
	GLint x29 = 90;
	GLint y29 = 40;
	GLint x30 = 90;
	GLint y30 = -100;
	bres(x29, y29, x30, y30);

// Jendela Kanan
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(4.0);
	GLint x31 = 195;
	GLint y31 = 40;
	GLint x32 = 195;
	GLint y32 = -100;
	bres(x31, y31, x32, y32);

// Pintu Atas 1
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(2.0);
	GLint x33 = -320;
	GLint y33 = 35;
	GLint x34 = -180;
	GLint y34 = 0;
	bres(x33, y33, x34, y34);
	
// Pintu Atas 2
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(2.0);
	GLint x35 = -305;
	GLint y35 = 0;
	GLint x36 = -195;
	GLint y36 = -30;
	bres(x35, y35, x36, y36);

// Pintu Tengah
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(2.0);
	GLint x37 = -305;
	GLint y37 = -100;
	GLint x38 = -195;
	GLint y38 = -125;
	bres(x37, y37, x38, y38);

// Pintu Bawah 1
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(2.0);
	GLint x39 = -195;
	GLint y39 = -285;
	GLint x40 = -305;
	GLint y40 = -320;
	bres(x39, y39, x40, y40);


// Pintu Bawah 2
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(2.0);
	GLint x41 = -180;
	GLint y41 = -340;
	GLint x42 = -325;
	GLint y42 = -390;
	bres(x41, y41, x42, y42);

// Pintu Kiri
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(2.0);
	GLint x43 = -305;
	GLint y43 = 0;
	GLint x44 = -305;
	GLint y44 = -320;
	bres(x43, y43, x44, y44);

// Pintu Tengah
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(2.0);
	GLint x45 = -245;
	GLint y45 = -15;
	GLint x46 = -245;
	GLint y46 = -300;
	bres(x45, y45, x46, y46);

// Pintu Kanan 1
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(2.0);
	GLint x47 = -195;
	GLint y47 = -30;
	GLint x48 = -195;
	GLint y48 = -285;
	bres(x47, y47, x48, y48);

// Pintu Kanan 2
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(2.0);
	GLint x49 = -180;
	GLint y49 = 0;
	GLint x50 = -180;
	GLint y50 = -340;
	bres(x49, y49, x50, y50);

// Gagang Pintu Persegi Panjang
	glColor3f(1.0, 1.0, 1.0);
	glPointSize(7.0);
	GLint x51 = -206;
	GLint y51 = -155;
	GLint x52 = -206;
	GLint y52 = -185;
	bres(x51, y51, x52, y52);

// Gagang Pintu Bulat
	glColor3f(0.53, 0.12, 0.47);
	lingkaran(7.0, 70.0, -200.0, -170.0);
}

int main(int argc, char **argv) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DEPTH | GLUT_SINGLE | GLUT_RGBA);
	glutInitWindowSize(640, 480);
	glutInitWindowPosition(100, 100);
	glutCreateWindow("Algoritma Garis - Latihan 2");
	gluOrtho2D(-500.0, 500.0, -500.0, 500.0);
	glutDisplayFunc(display);
	glutMainLoop();
}

