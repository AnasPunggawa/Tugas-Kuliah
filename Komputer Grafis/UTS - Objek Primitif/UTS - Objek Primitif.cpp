#include<GL/glut.h>

void persegi() {
	glColor3f (1.0, 0.0, 0.0);
	glBegin(GL_POLYGON);
	glVertex2f(-400, 200);
	glVertex2f(0, 400);
	glVertex2f(400, 200);
	glVertex2f(0, 0);
	glEnd ();
	glFlush();
	
	glColor3f (0.0, 1.0, 0.0);
	glBegin(GL_POLYGON);
	glVertex2f(-400, 200);
	glVertex2f(0, 0);
	glVertex2f(0, -450);
	glVertex2f(-400, -250);
	glEnd ();
	glFlush();
	
	glColor3f (0.0, 0.0, 1.0);
	glBegin(GL_POLYGON); 
	glVertex2f(400, 200);
	glVertex2f(0, 0);
	glVertex2f(0, -450);
	glVertex2f(400, -250);
	glEnd ();
	glFlush();
}

void garis() {
	glColor3f(0.0, 0.0, 0.0);
	glLineWidth(7.0);
	glBegin(GL_LINE_LOOP);
	glVertex2f(-400, 200);
	glVertex2f(0, 400);
	glVertex2f(400, 200);
	glVertex2f(0, 0);
	glEnd();
	glFlush();

	glColor3f(0.0, 0.0, 0.0);
	glLineWidth(7.0);
	glBegin(GL_LINE_LOOP);
	glVertex2f(-400, 200);
	glVertex2f(0, 0);
	glVertex2f(0, -450);
	glVertex2f(-400, -250);
	glEnd();
	glFlush();

	glColor3f(0.0, 0.0, 0.0);
	glLineWidth(7.0);
	glBegin(GL_LINE_LOOP);
	glVertex2f(400, 200);
	glVertex2f(0, 0);
	glVertex2f(0, -450);
	glVertex2f(400, -250);
	glEnd();
	glFlush();
	
	glColor3f(0.0, 0.0, 0.0);
	glLineWidth(7.0);
	glBegin(GL_LINES);
	glVertex2f(-140, 330);
	glVertex2f(280, 140);
	glVertex2f(140, 330);
	glVertex2f(-280, 140);
	glVertex2f(-280, 260);
	glVertex2f(130, 70);
	glVertex2f(280, 260);
	glVertex2f(-130, 70);
	glEnd();
	glFlush();

	glColor3f(0.0, 0.0, 0.0);
	glLineWidth(7.0);
	glBegin(GL_LINES);
	glVertex2f(-280, 140);
	glVertex2f(-280, -305);
	glVertex2f(-130, 70);
	glVertex2f(-130, -380);
	glVertex2f(-400, 50);
	glVertex2f(0, -150);
	glVertex2f(-400, -100);
	glVertex2f(0, -300);
	glEnd();
	glFlush();

	glColor3f(0.0, 0.0, 0.0);
	glLineWidth(7.0);
	glBegin(GL_LINES);
	glVertex2f(280, 140);
	glVertex2f(280, -305);
	glVertex2f(130, 70);
	glVertex2f(130, -380);
	glVertex2f(400, 50);
	glVertex2f(0, -150);
	glVertex2f(400, -100);
	glVertex2f(0, -300);
	glEnd();
	glFlush();
}

void display() {
	glClear(GL_COLOR_BUFFER_BIT);
	persegi();
	garis();
	glutSwapBuffers();
}

int main(int argc, char **argv) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DEPTH | GLUT_SINGLE | GLUT_RGBA);
	glutInitWindowSize(600, 600);
	glutInitWindowPosition(100, 100);
	glutCreateWindow("UTS - Objek Primitif");
	glClearColor(1.0, 1.0, 1.0, 1.0);
	gluOrtho2D(-600.0, 600.0, -600.0, 600.0);
	glutDisplayFunc(display);
	glutMainLoop();
}

