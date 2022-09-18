#include <GL/glut.h>
#include <stdlib.h>

void persegi(int titik1x, int titik1y, int titik2x, int titik2y, int titik3x, int titik3y, int titik4x, int titik4y) {
	glBegin(GL_QUADS);
	glVertex2f(titik1x, titik1y);
	glVertex2f(titik2x, titik2y);
	glVertex2f(titik3x, titik3y);
	glVertex2f(titik4x, titik4y);
	glEnd();
	glFlush();
}

void segitiga(int titik1x, int titik1y, int titik2x, int titik2y, int titik3x, int titik3y) {
	glBegin(GL_TRIANGLES);
	glVertex2f(titik1x, titik1y);
	glVertex2f(titik2x, titik2y);
	glVertex2f(titik3x, titik3y);
	glEnd();
}

void garis() {
	glColor3f(0.0, 0.0, 1.0);
	glBegin(GL_LINES);
	glVertex2f(0, 15);
	glVertex2f(0, 0);
	glEnd();
	
	glColor3f(0.0, 0.0, 1.0);
	glBegin(GL_LINES);
	glVertex2f(0, 0);
	glVertex2f(15, 0);
	glEnd();
}

void resize(int w, int h) {
	if(w >= h)
		glViewport(0, 0, (GLsizei)h, (GLsizei)h);
	else
		glViewport(0, 0, (GLsizei)w, (GLsizei)w);
	glEnd();
}

void transformasi() {
	glColor3f(0.5, 1.0, 1.0);
	persegi(4, 2, 6, 2, 6, 0, 4, 0);
	glColor3f(0.0, 0.0, 0.0);
	segitiga(6, 2, 8, 1, 6, 0);
	glFlush();
	glEnd();

	glTranslatef(2, 5, 0);
	glColor3f(0.0, 0.0, 0.0);
	persegi(4, 2, 6, 2, 6, 0, 4, 0);
	glColor3f(0.5, 1.0, 1.0);
	segitiga(6, 2, 8, 1, 6, 0);
	glFlush();
	glEnd();
	
	glRotatef(90, 0, 0, 1);
	glColor3f(0.5, 1.0, 1.0);
	persegi(4, 2, 6, 2, 6, 0, 4, 0);
	glColor3f(0.0, 0.0, 0.0);
	segitiga(6, 2, 8, 1, 6, 0);
	glFlush();
	glEnd();
}

void display(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	garis();
	transformasi();
	glFlush();
}

int main(int argc, char **argv) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DEPTH | GLUT_SINGLE | GLUT_RGBA);
	glutInitWindowSize(640, 640);
	glutInitWindowPosition(0, 0);
	glutCreateWindow("Latihan Praktikum 6B");
	glClearColor(1.0, 1.0, 1.0, 1.0);
	gluOrtho2D(-11.0, 15.0, -11.0, 15.0);
	glutDisplayFunc(display);
	glutReshapeFunc(resize);
	glutMainLoop();
}


