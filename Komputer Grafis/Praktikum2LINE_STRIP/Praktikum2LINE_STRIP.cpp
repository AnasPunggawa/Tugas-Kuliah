#include<GL/glut.h>

void gambar() {
	glColor3f(0.0, 0.0, 1.0);
	glBegin(GL_LINE_STRIP);
	glVertex2f(-3.00, 3.00);
	glVertex2f(3.00, -3.00);
	glVertex2f(2.00, 1.00);
	glVertex2f(-2.00, -1.00);
	glVertex2f(-2.50, -2.50);
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
	glutInitDisplayMode(GLUT_DOUBLE|GLUT_RGB);
	glutInitWindowPosition(100,100);
	glutInitWindowSize(640,480);
	glutCreateWindow("LINE STRIP");
	glClearColor(1.0,1.0,1.0,1.0);
	gluOrtho2D(-10, 10, -10, 10);
	glutIdleFunc(display);
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}

