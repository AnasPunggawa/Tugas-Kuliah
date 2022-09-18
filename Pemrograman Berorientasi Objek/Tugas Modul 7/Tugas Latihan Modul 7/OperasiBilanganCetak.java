public class OperasiBilanganCetak extends OperasiBilangan{
    private void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        for (int i = 0; i < OB.length; i++) {
            System.out.println();
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C();
            OB[i].tampil();
        }
    }
    
    public static void main(String[] args) {
        OperasiBilanganCetak cetakBilangan = new OperasiBilanganCetak();
        OperasiBilangan[] OB = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };
        double a = 10.5;
        double b = 0.5;

        cetakBilangan.identitas();
        
        System.out.println("========= Operasi Bilangan =========");
        cetakBilangan.set_A(a);
        cetakBilangan.set_B(b);
        cetakBilangan.tampil();
        cetakBilangan.cetakSemua(OB, 10.5, 0.5);
        System.out.println("====================================\n");

        cetakBilangan.hapus();
        OB = null;
        a = 0;
        b = 0;
    }
}
