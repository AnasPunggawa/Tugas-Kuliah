#include <GL/glut.h>
#include <stdlib.h>

void gambar(int titik1x, int titik1y, int titik2x, int titik2y, int titik3x, int titik3y, int titik4x, int titik4y) {
	glBegin(GL_QUADS);
	glVertex2f(titik1x, titik1y);
	glVertex2f(titik2x, titik2y);
	glVertex2f(titik3x, titik3y);
	glVertex2f(titik4x, titik4y);
	glEnd();
}

void garis() {
	glColor3f(1.0, 1.0, 1.0);
	glBegin(GL_LINES);
	glVertex2f(0, -10);
	glVertex2f(0, 10);
	glEnd();
}

void resize(int w, int h) {
	if(w >= h)
		glViewport(0, 0, (GLsizei)h, (GLsizei)h);
	else
		glViewport(0, 0, (GLsizei)w, (GLsizei)w);
}

void render() {
	garis();
//transisi
	glColor3f(1.0, 1.0, 1.0);
	gambar(-6, 1, -6, 3, -1, 3, -1, 1);
	
	glTranslatef(-3, 5, 0);
	glColor3f(1.0, 0.2, 0.0);
	gambar(-6, 1, -6, 3, -1, 3, -1, 1);
	
//rotasi
	glColor3f(1.0, 0.0, 1.0);
	gambar(5, 1, 5, 3, 9, 3, 9, 1);
	glRotatef(-20, 0, 0, 1);
	glColor3f(0.1, 0.2, 0.5);
	gambar(5, 1, 5, 3, 9, 3, 9, 1);
	glFlush();
}

int main(int argc, char **argv) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DEPTH | GLUT_SINGLE | GLUT_RGBA);
	glutInitWindowSize(640, 640);
	glutInitWindowPosition(10, 10);
	glutCreateWindow("Scale");
	gluOrtho2D(-10.0, 10.0, -10.0, 10.0);
	glutDisplayFunc(render);
	glutReshapeFunc(resize);
	glutMainLoop();
}

