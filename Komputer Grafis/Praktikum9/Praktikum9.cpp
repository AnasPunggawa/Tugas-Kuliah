#include<GL/glut.h>

void drawBitmapText(char *string,float x,float y,float z) {
	char *c;
	glRasterPos3f(x, y,z);
	for (c=string; *c != '\0'; c++) {
		glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24, *c);
	}
}

void drawStrokeText(char*string,int x,int y,int z) {
	char *c;
	glPushMatrix();
	glTranslatef(x, y+8,z);
	glScalef(0.09f,-0.08f,z);
	for (c=string; *c != '\0'; c++) {
		glutStrokeCharacter(GLUT_STROKE_MONO_ROMAN , *c);
	}
	glPopMatrix();}

void init() {
	glClearColor(0.0,0.0,0.0,0.0); 
}

void reshape(int w,int h) {
	glViewport(0,0,w,h);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(0,w,h,0);
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity(); 
}

void render(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	glLoadIdentity();
	glColor3f(0,1,0);
	drawStrokeText("BELAJAR OPENGL ITU ASIK",200,200,0);
	glLineWidth(3.0);
	glColor3f(1,1,0);
	drawBitmapText("BELAJAR OPENGL ITU ASIK",200,250,0);
	glutSwapBuffers();
}

int main(int argc, char* argv[]) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_RGBA | GLUT_DOUBLE);
	glutInitWindowSize(600,600);
	glutInitWindowPosition(0,0);
	glutCreateWindow("OpenGL Fonts");
	glutDisplayFunc(render);
	glutIdleFunc(render);
	glutReshapeFunc(reshape);
	glutMainLoop();
	return 0;
}

