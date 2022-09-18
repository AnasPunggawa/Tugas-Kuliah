public class Cetak {
    public static void main(String[] args) {
        System.out.println("Komputer : ");
        Komputer komputer_baru = new Komputer();
        komputer_baru.klik_kanan();
        komputer_baru.klik_kiri();
        komputer_baru.double_klik();
        System.out.println("===================");
        
        System.out.println("PC : ");
        PC pc_baru = new PC();
        pc_baru.tekan_enter();
        System.out.println("===================");
        
        System.out.println("Laptop : ");
        Laptop laptop_baru = new Laptop();
        laptop_baru.klik_kanan();
        laptop_baru.klik_kiri();
        laptop_baru.double_klik();
        laptop_baru.tekan_enter();
        
    }
}
