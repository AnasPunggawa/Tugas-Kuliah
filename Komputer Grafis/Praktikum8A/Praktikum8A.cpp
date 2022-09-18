//MUHAMMAD ANAS PUNGGAWA
//1929041008
//PRAKTIKUM 8A

#include <stdlib.h>
#include <GL/glut.h>

int c, d;

void triAngles() {
	glBegin(GL_TRIANGLES); 
	glVertex2i(280, 0); 
	glVertex2i(250, 60); 
	glVertex2i(220, 0); 
	glEnd();
}

void mySpecialKeyboard(int key, int x, int y) {
	switch (key) {
		case GLUT_KEY_LEFT: 
			 c += -4;
	 		 d += 0; 
			 break; 
		case GLUT_KEY_RIGHT: 
			 c += 4;
			 d += 0;
			 break;
		case GLUT_KEY_UP: 
			 c += 0; 
			 d += 4;
			 break;
		case GLUT_KEY_DOWN: 
			 c += 0;
			 d += -4;
			 break;
	}
}

void timer(int value) {
	glutPostRedisplay(); 
	glutTimerFunc(50, timer, 0);
}

void renderScene(void) {
	glClear(GL_COLOR_BUFFER_BIT); 
	glPushMatrix(); 
	glTranslatef(c, d, 0); 
	triAngles(); 
	glPopMatrix(); 
	glFlush();
}

int main(int argc, char **argv) {
	glutInit(&argc, argv); 
	glutInitWindowPosition(100, 100); 
	glutInitWindowSize(640, 480); 
	glutCreateWindow("uji keyfunc"); 
	gluOrtho2D(-320., 320., -240., 240.); 
	glutTimerFunc(50, timer, 0); 
	glutDisplayFunc(renderScene); 
	glutSpecialFunc(mySpecialKeyboard); 
	glutMainLoop();
}

