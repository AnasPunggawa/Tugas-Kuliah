#include <GL/glut.h>

void setPixel (GLint xCoordinate, GLint yCoordinate) {
	glBegin (GL_POINTS);
	glVertex2i (xCoordinate, yCoordinate);
	glEnd();
	glFlush();
}

void lineBres (GLint x0, GLint y0, GLint xEnd, GLint yEnd) {
	GLint dx = (xEnd - x0);
	GLint dy = (yEnd - y0);
	GLint p = 2 * dy - dx;
	GLint twoDy = 2 * dy;
	GLint twoDyMinusDx = 2 * (dy - dx);
	GLint x, y;
	
	if(x0 > xEnd) {
		x = xEnd;
		y = yEnd;
		xEnd = x;
	}
	
	else {
		x = x0;
		y = y0;
	}
	
	setPixel(x, y);
	while(x < xEnd) {
		x++;
		if(p < 0)
		p+=twoDy;
		else {
			y++;
			p+=twoDyMinusDx;
		}
		setPixel(x, y);
	}
}

void drawMyLine() {
	glColor3f(1.0, 0.0, 0.0);
	glPointSize(4.0);
	GLint x0 = 50;
	GLint y0 = 50;
	GLint xEnd = 150;
	GLint yEnd = 50;
	lineBres(x0, y0, xEnd, yEnd);
	
	glColor3f(0.0, 1.0, 0.0);
	glPointSize(4.0);
	GLint x1 = 50;
	GLint y1 = 100;
	GLint x2 = 150;
	GLint y2 = 100;
	lineBres(x1, y1, x2, y2);
	
	glColor3f(0.0, 0.0, 1.0);
	glPointSize(4.0);
	GLint x3 = 50;
	GLint y3 = 150;
	GLint x4 = 150;
	GLint y4 = 150;
	lineBres(x3, y3, x4, y4);
}

int main(int argc, char **argv) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DEPTH | GLUT_SINGLE | GLUT_RGBA);
	glutInitWindowSize(640, 480);
	glutInitWindowPosition(100, 100);
	glutCreateWindow("Algoritma Garis");
	gluOrtho2D(-320.0, 320.0, -240.0, 240.0);
	glutDisplayFunc(drawMyLine);
	glutMainLoop();
}

