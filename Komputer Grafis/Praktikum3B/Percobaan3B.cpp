#include <GL/glut.h>

void persegi() {
	glColor3f (1.0, 1.0, 0.0);
	glBegin(GL_POLYGON);
	glVertex2f(-1.0, 0.0);
	glVertex2f(0.0, 1.0);
	glVertex2f(1.0, 0.0);
	glVertex2f(0.0, -1.0);
	glEnd ();
	
	glColor3f (0.0, 0.0, 1.0);
	glBegin(GL_POLYGON);
	glVertex2f(-2.0, 1.0);
	glVertex2f(-1.0, 2.0);
	glVertex2f(0.0, 1.0);
	glVertex2f(-1.0, 0.0);
	glEnd ();
	
	glColor3f (1.0, 0.0, 0.0);
	glBegin(GL_POLYGON);
	glVertex2f(0.0, 1.0);
	glVertex2f(1.0, 2.0);
	glVertex2f(2.0, 1.0);
	glVertex2f(1.0, 0.0);
	glEnd ();
	
	glColor3f (0.0, 1.0, 0.0);
	glBegin(GL_POLYGON); 
	glVertex2f(-2.0, -1.0);
	glVertex2f(-1.0, 0.0);
	glVertex2f(0.0, -1.0);
	glVertex2f(-1.0, -2.0);
	glEnd ();
	
	glColor3f (1.0, 0.0, 1.0); 
	glBegin(GL_POLYGON); 
	glVertex2f(0.0, -1.0);
	glVertex2f(1.0, 0.0);
	glVertex2f(2.0, -1.0);
	glVertex2f(1.0, -2.0);
	glEnd ();
}

void display(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	persegi();
	glutSwapBuffers();
}

int main(int argc, char** argv) {
	glutInit(&argc,argv);
	glutInitDisplayMode(GLUT_DOUBLE|GLUT_RGB);
	glutInitWindowPosition(100, 100);
	glutInitWindowSize(480, 480);
	glutCreateWindow("Praktikum 3 - PERSEGI");
	glClearColor(1.0, 1.0, 1.0, 1.0);
	gluOrtho2D(-2.0, 2.0, -2.0, 2.0);
	glutIdleFunc(display);
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}

