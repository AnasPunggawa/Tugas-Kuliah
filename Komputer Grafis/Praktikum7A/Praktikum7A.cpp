//	MUHAMMAD ANAS PUNGGAWA
//	1929041008
//	PTIK B 2019

//	PRAKTIKUM 7A

#include <stdlib.h>
#include <GL/glut.h>
#include <math.h>
int r = 0;
int ujung = 0;
const double PI = 3.141592653589793;
int i;
void lingkaran(int jari2, int jumlah_titik, int x_tengah, int y_tengah) {
	glBegin(GL_POLYGON);
	glColor3f (1,1,1);
	for (i=0;i<=360;i++) {
		float sudut=i*(2*PI/jumlah_titik);
		float x=x_tengah+jari2*cos(sudut);
		float y=y_tengah+jari2*sin(sudut);
		glVertex2f(x,y);
	}
	glEnd();
}

void kotak() {
	glBegin(GL_QUADS);
	glColor3f (1,1,1);
	glVertex2i (-75, -320);
	glVertex2i (75, -320);
	glVertex2i (75, -270);
	glVertex2i (-75, -270);
	glEnd();
}

void timer (int value) {
	if (r<320 && ujung == 0) {
		r++;
		if (r == 320) {
			ujung = 1;
		}
	}
	else if (ujung == 1 && r>-320) {
		r--;
		if(r==-320) {
			ujung = 0;}
	}
	glutPostRedisplay();
	glutTimerFunc(10,timer,0);
}

void renderScene() {
	glClear(GL_COLOR_BUFFER_BIT);
	glPushMatrix();
	glTranslatef(r,0,0);
	kotak();
	lingkaran(40,100,0,-240);
	glPopMatrix();
	glFlush();
}

int main(int argc, char **argv) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DEPTH | GLUT_SINGLE | GLUT_RGBA);
	glutInitWindowPosition(0,0);
	glutInitWindowSize(640,640);
	glutCreateWindow("Bergerak Mendatar");
	gluOrtho2D(-320.0,320.0,-320.,320.);
	glutDisplayFunc(renderScene);
	timer(20);
	glutMainLoop();
}

