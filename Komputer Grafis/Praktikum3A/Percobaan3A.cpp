#include <GL/glut.h>
void garis() {
	glColor3f(0.0,1.0,1.0);
	glBegin (GL_POLYGON);
	glVertex2f (-0.5, -0.5);
	glVertex2f (-0.5, 0.5);
	glVertex2f (0.5, 0.5);
	glVertex2f (0.5, -0.5);
	glEnd();
	
	glColor3f(1.0,0.0,1.0);
	glBegin (GL_TRIANGLES);
	glVertex2f (-0.5, -0.5);
	glVertex2f (0.0, 0.0);
	glVertex2f (0.5, -0.5);
	glEnd();
	
	glColor3f(0.0,0.0,1.0);
	glBegin (GL_POLYGON);
	glVertex2f (-0.2, 0);
	glVertex2f (-0.4, 0.2);
	glVertex2f (-0.2, 0.4);
	glVertex2f (0.2, 0.4);
	glVertex2f (0.4, 0.2);
	glVertex2f (0.2, 0);
	glEnd();
}

void resize(int w, int h) {
	if (w >= h)
	glViewport(0, 0, (GLsizei)h, (GLsizei)h);
	else
	glViewport(0, 0, (GLsizei)w, (GLsizei)w);
}

void display(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	garis();
	glutSwapBuffers();
}

int main(int argc, char** argv) {
	glutInit(&argc,argv);
	glutInitDisplayMode(GLUT_DOUBLE|GLUT_RGB);
	glutInitWindowPosition(100,100);
	glutInitWindowSize(540,480);
	glutCreateWindow("praktikum 3");
	glClearColor(1.0,1.0,1.0,1.0);
	gluOrtho2D(-1.,1.,-1.,1);
	glutIdleFunc(display);
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}
