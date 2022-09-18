public class Laptop extends Komputer implements MouseBaru, Keyboard {
    public void jenis() {
        System.out.println("Jenis Mouse Laptop : " + jenis);
    }
    public void klik_kanan() {
        System.out.println("Mouse Komputer : Klik Kanan...");
    }
    public void klik_kiri() {
        System.out.println("Mouse Komputer : Klik Kiri...");
    }
    public void double_klik() {
        System.out.println("Mouse Komputer : Double Klik...");
    }
    public void tekan_enter() {
        System.out.println("Keyboard PC : Tekan Enter...");
    }
}
