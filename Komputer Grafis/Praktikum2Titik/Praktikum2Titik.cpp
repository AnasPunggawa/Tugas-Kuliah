#include <GL/glut.h>

void gambar() {
	glPointSize(6.0);
	glBegin (GL_POINTS);
	glColor3f(0.0, 0.0, 0.5);
	glVertex2i (20,40);
	glColor3f(1.5, 0.5, 0.2);
	glVertex2i (10,10);
	glColor3f(0.4, 0.0, 0.1);
	glVertex2f (40.0,-1.5);
	glColor3f(0.0, 0.25, 1.0);
	glVertex2i (-40,-20);
	glColor3f(0.0, 1.0, 0.5);
	glVertex2i (-40,30);
	glEnd();
} 

void display(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	gambar();
	glutSwapBuffers();
}

int main(int argc,char** argv) {
	glutInit(&argc,argv);
	glutInitDisplayMode(GLUT_DOUBLE|GLUT_RGB);
	glutInitWindowPosition(100,100);
	glutInitWindowSize(640,480);
	glutCreateWindow("Membuat Titik");
	glClearColor(1.0,1.0,1.0,1.0);
	gluOrtho2D(-320.,240.,-320.,240.);
	glutIdleFunc(display);
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}

