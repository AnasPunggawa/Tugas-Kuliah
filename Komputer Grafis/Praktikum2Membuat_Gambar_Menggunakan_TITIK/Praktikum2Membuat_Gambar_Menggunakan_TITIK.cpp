#include<GL/glut.h>

void gambar() {
	glPointSize(25.0);
	glBegin (GL_POINTS);
	glColor3ub(104, 152, 102);
	glVertex2i (0,1);
	glColor3ub(102, 153, 154);
	glVertex2i (-1,0);
	glColor3ub(102, 153, 154);
	glVertex2i (0,0);
	glColor3ub(102, 153, 154);
	glVertex2i (1,0);
	glColor3ub(98, 154, 180);
	glVertex2i (-2,-1);
	glColor3ub(98, 154, 180);
	glVertex2i (-1,-1);
	glColor3ub(98, 154, 180);
	glVertex2i (0,-1);
	glColor3ub(98, 154, 180);
	glVertex2i (1,-1);
	glColor3ub(98, 154, 180);
	glVertex2i (2,-1);
	glEnd();
}

void display(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	glMatrixMode(GL_PROJECTION);
	gambar();
	glutSwapBuffers();
}

int main(int argc,char** argv) {
	glutInit(&argc,argv);
	glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
	glutInitWindowPosition(100,100);
	glutInitWindowSize(480,480);
	glutCreateWindow("MENGGAMBAR MENGGUNAKAN TITIK");
	glClearColor(1.0,1.0,1.0,1.0);
	gluOrtho2D(-10, 10, -10, 10);
	glutIdleFunc(display);
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}

