public class OperasiPembagian extends OperasiBilanganAbs{
    protected double a, b, c;

    protected void set_A(double a) {
        this.a = a;
    }
    protected double get_A() {
        return a;
    }
    
    protected void set_B(double b) {
        this.b = b;
    }
    protected double get_B() {
        return b;
    }
    
    protected void set_C() {
        this.c = this.a / this.b;
    }
    protected double get_C() {
        return c;
    }

    protected void tampil(){
        System.out.println("4. Pembagian");
        System.out.println("A : B = C");
        System.out.println(this.a + " : " + this.b + " = " + this.c);
    }

    protected void hapus() {
        a = 0;
        b = 0;
        c = 0;
    }
}
