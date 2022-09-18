#include<GL/glut.h>

void draw_pixel(int ix,int iy)
{
    glBegin(GL_POINTS);
    glVertex2i(ix,iy);
    glEnd();
    glFlush();
}

void bres(GLfloat x1,GLfloat y1,GLfloat x2,GLfloat y2) {
    int dx, dy, i, e;
    int incx, incy, inc1, inc2;
    int x, y;
    dx = x2 - x1;
    dy = y2 - y1;
    if(dx < 0) dx = -dx;
    if(dy < 0) dy = -dy;
    incx = 1;
    if(x2 < x1) incx = -1;
    incy = 1;
    if(y2 < y1) incy = -1;
    x = x1;
    y = y1;
    if(dx > dy) {
        draw_pixel(x, y);
        e= 2 * dy - dx;
        inc1 = 2 * (dy - dx);
        inc2 = 2 * dy;
        for(i = 0 ; i < dx; i++) {
            if( e >= 0) {
                y += incy;
                e += inc1;
            }
            else
                e += inc2;
            x += incx;
            draw_pixel(x, y);
        }
    }
    else {
        draw_pixel(x, y);
        e= 2 * dx - dy;
        inc1= 2 * (dx - dy);
        inc2= 2 * dx;
        for(i=0; i < dy;i++) {
            if(e >= 0)
            {
                x += incx;
                e += inc1;
            }
            else
                e += inc2;
            y += incy;
            draw_pixel(x, y);
        }
    }    
}

void garis() {
	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x0 = -140;
	GLint y0 = 330;
	GLint x1 = 280;
	GLint y1 = 140;
	bres(x0, y0, x1, y1);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x2 = 140;
	GLint y2 = 330;
	GLint x3 = -280;
	GLint y3 = 140;
	bres(x2, y2, x3, y3);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x4 = -280;
	GLint y4 = 260;
	GLint x5 = 130;
	GLint y5 = 70;
	bres(x4, y4, x5, y5);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x6 = 280;
	GLint y6 = 260;
	GLint x7 = -130;
	GLint y7 = 70;
	bres(x6, y6, x7, y7);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x8 = -280;
	GLint y8 = 140;
	GLint x9 = -280;
	GLint y9 = -300;
	bres(x8, y8, x9, y9);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x10 = -130;
	GLint y10 = 70;
	GLint x11 = -130;
	GLint y11 = -380;
	bres(x10, y10, x11, y11);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x12 = 130;
	GLint y12 = 70;
	GLint x13 = 130;
	GLint y13 = -380;
	bres(x12, y12, x13, y13);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x14 = 280;
	GLint y14 = 140;
	GLint x15 = 280;
	GLint y15 = -300;
	bres(x14, y14, x15, y15);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x16 = -400;
	GLint y16 = 50;
	GLint x17 = 0;
	GLint y17 = -150;
	bres(x16, y16, x17, y17);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x18 = -400;
	GLint y18 = -100;
	GLint x19 = 0;
	GLint y19 = -300;
	bres(x18, y18, x19, y19);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x20 = 400;
	GLint y20 = 50;
	GLint x21 = 0;
	GLint y21 = -150;
	bres(x20, y20, x21, y21);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x22 = 400;
	GLint y22 = -100;
	GLint x23 = 0;
	GLint y23 = -300;
	bres(x22, y22, x23, y23);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x24 = 0;
	GLint y24 = 400;
	GLint x25 = -400;
	GLint y25 = 200;
	bres(x24, y24, x25, y25);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x26 = 0;
	GLint y26 = 400;
	GLint x27 = 400;
	GLint y27 = 200;
	bres(x26, y26, x27, y27);
	
	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x28 = 0;
	GLint y28 = 0;
	GLint x29 = -400;
	GLint y29 = 200;
	bres(x28, y28, x29, y29);
	
	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x30 = 0;
	GLint y30 = 0;
	GLint x31 = 400;
	GLint y31 = 200;
	bres(x30, y30, x31, y31);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x32 = -400;
	GLint y32 = 200;
	GLint x33 = -400;
	GLint y33 = -250;
	bres(x32, y32, x33, y33);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x34 = 0;
	GLint y34 = 0;
	GLint x35 = 0;
	GLint y35 = -450;
	bres(x34, y34, x35, y35);
	
	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x36 = 400;
	GLint y36 = 200;
	GLint x37 = 400;
	GLint y37 = -250;
	bres(x36, y36, x37, y37);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x38 = 0;
	GLint y38 = -450;
	GLint x39 = -400;
	GLint y39 = -250;
	bres(x38, y38, x39, y39);

	glColor3f(0.0, 0.0, 0.0);
	glPointSize(6.0);
	GLint x40 = 0;
	GLint y40 = -450;
	GLint x41 = 400;
	GLint y41 = -250;
	bres(x40, y40, x41, y41);
}

void persegi(void) {
	int p1[] = {-400, 200};
	int p2[] = {0, 400};
	int p3[] = {400, 200};
	int p4[] = {0, 0};
	int p5[] = {-400, -250};
	int p6[] = {400, -250};
	int p7[] = {0, -450};
	
	glColor3f(1.0,0.0,0.0);
	glBegin(GL_POLYGON);
	glVertex2iv(p1);
	glVertex2iv(p2);
	glVertex2iv(p3);
	glVertex2iv(p4);
	glEnd();
	glFlush();
	
	glColor3f(0.0, 1.0, 0.0);
	glBegin(GL_POLYGON);
	glVertex2iv(p1);
	glVertex2iv(p4);
	glVertex2iv(p7);
	glVertex2iv(p5);
	glEnd();
	glFlush();

	glColor3f(0.0, 0.0, 1.0);
	glBegin(GL_POLYGON);
	glVertex2iv(p3);
	glVertex2iv(p4);
	glVertex2iv(p7);
	glVertex2iv(p6);
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
	glutCreateWindow("UTS - Algoritma Pembentuk Objek");
	glClearColor(1.0, 1.0, 1.0, 1.0);
	gluOrtho2D(-600.0, 600.0, -600.0, 600.0);
	glutDisplayFunc(display);
	glutMainLoop();
}

