#include <GL/glut.h>
#include <math.h>

const double PI = 3.141592653589793;
int i;

void lingkaran(int jari2, int jumlah_titik, int x_tengah, int y_tengah) {
	glBegin(GL_POLYGON);
	for (i = 0; i <= 360; i++) {
		float sudut = i * (2 * PI / jumlah_titik);
		float x = x_tengah + jari2 * cos (sudut);
		float y = y_tengah + jari2 * sin (sudut);
		glVertex2f(x, y);
	}
	glEnd();
}

void renderScene(void) {
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1.0, 0.0, 1.0);
	lingkaran(1.0, 70.0, 14.0, 14.0);
	glColor3f(1.0, 1.0, 1.0);
	lingkaran(2.0, 70.0, 11.0, 11.0);
	glColor3f(0.0, 1.0, 0.0);
	lingkaran(3.0, 70.0, 6.0, 6.0);
	glColor3f(1.0, 0.0, 0.0);
	lingkaran(4.0, 70.0, 0.0, 0.0);
	glColor3f(0.0, 0.0, 1.0);
	lingkaran(5.0, 70.0, -8.0, -8.0);
	glFlush();
}

int main(int argc, char **argv) {
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_DEPTH | GLUT_SINGLE | GLUT_RGBA);
	glutInitWindowSize(480, 480);
	glutInitWindowPosition(100, 100);
	glutCreateWindow("Lingkaran");
	gluOrtho2D(-20.0, 20.0, -20.0, 20.0);
	glutDisplayFunc(renderScene);
	glutMainLoop();
}
