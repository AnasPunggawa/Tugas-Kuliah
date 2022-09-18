public final class OperasiBilanganAbsCetak extends OperasiBilanganAbs{
    @Override
    protected void set_A(double a) {
    }
    @Override
    protected double get_A() {
        return 0;
    }
    @Override
    protected void set_B(double b) {
    }
    @Override
    protected double get_B() {
        return 0;
    }
    @Override
    protected void set_C() {
    }
    @Override
    protected double get_C() {
        return 0;
    }
    @Override
    protected void tampil() {
    }
    @Override
    protected void hapus() {
    }

    private final void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
        for (int i = 0; i < OB.length; i++) {
            System.out.println();
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C();
            OB[i].tampil();
        }
        OB = null;
        a = 0;
        b = 0;
    }
    
    public static void main(String[] args) {
        OperasiBilanganAbsCetak cetakBilangan = new OperasiBilanganAbsCetak();
        OperasiBilanganAbs[] OB = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };
        double a = 6.5;
        double b = 0.5;

        cetakBilangan.identitas();
        System.out.println("========= Operasi Bilangan =========");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = Hasil Operasi Bilangan");
        
        cetakBilangan.set_A(a);
        cetakBilangan.set_B(b);
        cetakBilangan.tampil();
        cetakBilangan.cetakSemua(OB, 6.5, 0.5);
        System.out.println("====================================");

        cetakBilangan.hapus();
        OB = null;
        a = 0;
        b = 0;
    }
}
