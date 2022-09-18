public class OperasiPerkalian extends OperasiBilangan {
    protected double a, b, c;

    protected void set_A(double a) {
        this.a = a;
        a = 0;
    }
    protected double get_A() {
        return a;
    }
    
    protected void set_B(double b) {
        this.b = b;
        b = 0;
    }
    protected double get_B() {
        return b;
    }
    
    protected void set_C() {
        this.c = this.a * this.b;
    }
    protected double get_C() {
        return c;
    }

    protected void tampil(){
        System.out.println("3. Perkalian");
        System.out.println("A x B = C");
        System.out.println(this.a + " x " + this.b + " = " + this.c);
    }
}
