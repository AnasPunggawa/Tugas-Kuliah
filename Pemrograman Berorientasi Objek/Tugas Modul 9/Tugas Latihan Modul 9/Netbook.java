public class Netbook extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    void perangkat(){
        System.out.println("3. Netbook");
    }
    @Override
    void hidupkan_os(){
        System.out.println("Netbook : menghidupkan OS");
    }
    @Override
    void matikan_os(){
        System.out.println("Netbook : mematikan OS");
    }
    @Override
    public void cetak_data(){
        System.out.println("Printer Netbook : mencetak data");
    }
    @Override
    public void klik_kanan(){
        System.out.println("Mouse Netbook : klik kanan");
    }
    @Override
    public void klik_kiri(){
        System.out.println("Mouse Netbook : klik kiri");
    }
    @Override
    public void tekan_enter(){
        System.out.println("Keyboard Netbook : tekan enter");
    }
}
