#include <GL/glut.h>

void gambar() {
	glColor3f(1.0,0.0,1.0);
	glBegin (GL_LINES);
	glVertex2f (0.1,0.10);
	glVertex2f (0.1,0.90);
	glEnd();
	glColor3f(0.0,1.0,0.0);
	glPointSize(6.0);
	glBegin (GL_POINTS);
	glVertex2f (0.2,0.20);
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
	glutCreateWindow("Membuat Garis");
	glClearColor(1.0,1.0,1.0,1.0);
	gluOrtho2D(-1.,1.,-1.,1.);
	glutIdleFunc(display); glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}

