#include <GL/glut.h>

void display(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	glutSwapBuffers();
}

int main(int argc, char** argv) {
	glutInit(&argc,argv);
	glutInitDisplayMode(GLUT_DOUBLE|GLUT_RGB);
	glutInitWindowPosition(100,100);
	glutInitWindowSize(640,480);
	glutCreateWindow("Membuat Window");
	glClearColor(1.0,0.0,0.0,0.0);
	gluOrtho2D(-320.,320.,-240.0,240.0);
	glutIdleFunc(display); glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}

