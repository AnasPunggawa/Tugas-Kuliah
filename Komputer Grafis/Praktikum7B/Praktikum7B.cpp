//	MUHAMMAD ANAS PUNGGAWA
//	1929041008
//	PTIK B 2019

//	PRAKTIKUM 7B

#include <stdlib.h>
#include <GL/glut.h>
int r = 0;
int ujung = 0;
void timer (int value) {
	if (r<320 && ujung == 0) {
		r++;
		if (r == 320) {
			ujung = 1;
		}
	}
	else if (ujung == 1 && r>-320) {
		r--;
		if(r==-320) {
			ujung = 0;
		}
	}
	glutPostRedisplay();
	glutTimerFunc(10,timer,0);
}

void kotak() {
	glBegin(GL_QUADS);
	glColor3f (1,0.4,1);
	glVertex2i (-50, -50);
	glVertex2i (-50, 50);
	glVertex2i (50, 50);
	glVertex2i (50, -50);
	glEnd();
}

void garis() {
	glBegin(GL_LINES);
	glColor3f (1,1,1);
	glVertex2i (0, 20);
	glVertex2i (0, -40);
	glEnd();
}

void renderScene() {
	glClear(GL_COLOR_BUFFER_BIT);
	glPushMatrix();
	glRotatef(r,0,0,1);
	kotak();
	glPopMatrix();
	glPushMatrix();
	glTranslatef(0,r,0);
	garis();
	glPopMatrix();
	glFlush();
}

int main(int argc, char **argv) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DEPTH | GLUT_SINGLE | GLUT_RGBA);
	glutInitWindowPosition(0,0);
	glutInitWindowSize(640,640);
	glutCreateWindow("Berputar dan bergerak tegak lurus");
	gluOrtho2D(-320.0,320.0,-320.,320.);
	glutDisplayFunc(renderScene);
	timer(20);
	glutMainLoop();
}

