public class OperasiBilangan {
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
    }

    protected double get_C() {
        return c;
    }

    protected void tampil(){
        System.out.println("A = " + this.a);
        System.out.println("B = " + this.b);
        System.out.println("C = Hasil Operasi");
    }

    public void identitas(){
        System.out.println("Latihan Operasi Bilangan Polimorfisme - Modul 7");
        System.out.println("Nama : Muhammad Anas Punggawa");
        System.out.println("NIM : 1929041008");
        System.out.println("Kelas : PTIK A 2019");
        System.out.println("====================================\n");
    }

    protected void hapus() {
        a = 0;
        b = 0;
        c = 0;
    }
}