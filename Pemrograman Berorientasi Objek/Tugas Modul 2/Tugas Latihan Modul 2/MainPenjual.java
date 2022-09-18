public class MainPenjual {
    public static void main(String[] args) {
        Penjual bolpoint = new Penjual();
        Penjual pensil = new Penjual();
        Penjual penghapus = new Penjual();
        Penjual penjualan = new Penjual();

        // Set
        bolpoint.setNamaAlatTulis("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHargaSatuan(2000);
        bolpoint.setHargaAlatTulis(bolpoint.getStok(), bolpoint.getHargaSatuan());
        
        pensil.setNamaAlatTulis("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);
        pensil.setHargaAlatTulis(pensil.getStok(), pensil.getHargaSatuan());
        
        penghapus.setNamaAlatTulis("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);
        penghapus.setHargaAlatTulis(penghapus.getStok(), penghapus.getHargaSatuan());

        penjualan.setTotalHarga(bolpoint.getHargaAlatTulis(), pensil.getHargaAlatTulis(), penghapus.getHargaAlatTulis());

        // Menampilkan (Get)
        penjualan.identitas();
        System.out.println("\nNama Alat Tulis : " + bolpoint.getNamaAlatTulis());
        System.out.println("Stok : " + bolpoint.getStok());
        System.out.println("Harga Satuan : " + bolpoint.getHargaSatuan());
        System.out.println("Harga " + bolpoint.getNamaAlatTulis() + " : " + bolpoint.getHargaAlatTulis());

        System.out.println("\nNama Alat Tulis : " + pensil.getNamaAlatTulis());
        System.out.println("Stok : " + pensil.getStok());
        System.out.println("Harga Satuan : " + pensil.getHargaSatuan());
        System.out.println("Harga " + pensil.getNamaAlatTulis() + " : " + pensil.getHargaAlatTulis());

        System.out.println("\nNama Alat Tulis : " + penghapus.getNamaAlatTulis());
        System.out.println("Stok : " + penghapus.getStok());
        System.out.println("Harga Satuan : " + penghapus.getHargaSatuan());
        System.out.println("Harga " + penghapus.getNamaAlatTulis() + " : " + penghapus.getHargaAlatTulis());
        
        System.out.println("\n================================");
        System.out.println("Total Harga : " + penjualan.getTotalHarga());
    }
}