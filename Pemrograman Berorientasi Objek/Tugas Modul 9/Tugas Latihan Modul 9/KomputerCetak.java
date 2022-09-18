final class KomputerCetak {
    public void identitas(){
        System.out.println("Latihan Interface - Modul 9");
        System.out.println("Nama : Muhammad Anas Punggawa");
        System.out.println("NIM : 1929041008");
        System.out.println("Kelas : PTIK A 2019");
        System.out.println("====================================\n");
    }

    final void cetak(Komputer[] obj){
        for (int i = 0; i < obj.length; i++) {
            obj[i].perangkat();
            obj[i].hidupkan_os();
            obj[i].matikan_os();
            obj[i].klik_kiri();
            obj[i].klik_kanan();
            obj[i].cetak_data();
            obj[i].tekan_enter();
        }
    }

    public static void main(String[] args) {
        KomputerCetak komputer_baru = new KomputerCetak();
        Komputer[] OB = {
            new PC(),
            new Laptop(), 
            new Netbook()
        };
        komputer_baru.identitas();
        System.out.println("============ Perangkat =============");
        komputer_baru.cetak(OB);
        System.out.println("====================================");
        OB = null;
    }
}
