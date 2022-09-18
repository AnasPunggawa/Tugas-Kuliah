public abstract class OperasiBilanganAbs {
    protected double a, b, c;

    protected abstract void set_A(double a); 
    protected abstract double get_A(); 
    
    protected abstract void set_B(double b);
    protected abstract double get_B();
    
    protected abstract void set_C();
    protected abstract double get_C();
    protected abstract void tampil();
    protected abstract void hapus();

    public void identitas(){
        System.out.println("Latihan Operasi Bilangan Final & Abstract - Modul 8");
        System.out.println("Nama : Muhammad Anas Punggawa");
        System.out.println("NIM : 1929041008");
        System.out.println("Kelas : PTIK A 2019");
        System.out.println("====================================\n");
    }
}