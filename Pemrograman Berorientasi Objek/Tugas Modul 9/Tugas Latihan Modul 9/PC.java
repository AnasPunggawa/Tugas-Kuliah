public class PC extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    void perangkat(){
        System.out.println("1. PC");
    }
    @Override
    void hidupkan_os(){
        System.out.println("PC : menghidupkan OS");
    }
    @Override
    void matikan_os(){
        System.out.println("PC : mematikan OS");
    }
    @Override
    public void cetak_data(){
        System.out.println("Printer PC : mencetak data");
    }
    @Override
    public void klik_kanan(){
        System.out.println("Mouse PC : klik kanan");
    }
    @Override
    public void klik_kiri(){
        System.out.println("Mouse PC : klik kiri");
    }
    @Override
    public void tekan_enter(){
        System.out.println("Keyboard PC : tekan enter");
    }
}

