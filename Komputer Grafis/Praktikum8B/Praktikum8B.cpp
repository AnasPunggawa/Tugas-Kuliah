//MUHAMMAD ANAS PUNGGAWA
//1929041008
//PRAKTIKUM 8A

#include <stdio.h>
#include <stdlib.h>
#include <GL/glut.h>

float x = 1, y = 1, z = 0;
int w = 480, h = 480, flag = 0, flg;

void drawQuad() {
	glBegin(GL_POLYGON); 
	glColor3f(0, 0, 1); 
	glVertex2f(-20., -20.); 
	glVertex2f(20., -20.); 
	glVertex2f(20., 20.); 
	glVertex2f(-20., 20.); 
	glEnd();
}

void mouse(int button, int state, int xmouse, int ymouse) {
	if (flg == 0) {
		if (state == GLUT_DOWN) {
			if (button == GLUT_LEFT_BUTTON) {
				flag++;
				if (flag == 2) {
					flg = 3; x = 3; y = 3;
					printf("%d", flg);
				}
			}
		}
	}
	if (flg == 3) {
		if (state == GLUT_DOWN) {
			if (button == GLUT_LEFT_BUTTON) {
				flag--;
			 	if (flag == 0) {
					x = 1; y = 1; flg =0;
				}
			} 
		}
	}
}

void renderScene(void) {
	glClear(GL_COLOR_BUFFER_BIT); 
	glClearColor(1, 1, 1, 1); 
	glPushMatrix();
	glScalef(x, y, z);
	drawQuad(); 
	glPopMatrix(); 
	glFlush(); 
}

void timer(int value) {
	glutPostRedisplay();
	glutTimerFunc(50, timer, 0);
}

int main(int argc, char **argv) {
	glutInit(&argc, argv);
	glutInitWindowPosition(100, 100); 
	glutInitWindowSize(w, h); 
	glutCreateWindow("Interaksi Mouse"); 
	gluOrtho2D(-w / 2, w / 2, -h / 2, h / 2); 
	glutDisplayFunc(renderScene); 
	glutMouseFunc(mouse);
	glutTimerFunc(1, timer, 0);
	glutMainLoop();
}

