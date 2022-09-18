public class Laptop extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    void perangkat(){
        System.out.println("2. Laptop");
    }
    @Override
    void hidupkan_os(){
        System.out.println("Laptop : menghidupkan OS");
    }
    @Override
    void matikan_os(){
        System.out.println("Laptop : mematikan OS");
    }
    @Override
    public void cetak_data(){
        System.out.println("Printer Laptop : mencetak data");
    }
    @Override
    public void klik_kanan(){
        System.out.println("Mouse Laptop : klik kanan");
    }
    @Override
    public void klik_kiri(){
        System.out.println("Mouse Laptop : klik kiri");
    }
    @Override
    public void tekan_enter(){
        System.out.println("Keyboard Laptop : tekan enter");
    }
}
