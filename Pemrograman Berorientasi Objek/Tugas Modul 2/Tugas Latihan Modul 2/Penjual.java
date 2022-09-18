public class Penjual {
    private String namaAlatTulis;
    private int stok;
    private float hargaSatuan;
    private float hargaAlatTulis;
    private float totalHarga;
    

    public void setNamaAlatTulis(String namaAlatTulis) {
        this.namaAlatTulis = namaAlatTulis;
    }
    public String getNamaAlatTulis() {
        return namaAlatTulis;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getStok() {
        return stok;
    }

    public void setHargaSatuan(float hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }
    public float getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaAlatTulis(int stok, float hargaSatuan) {
        this.hargaAlatTulis = (float) stok * hargaSatuan;
    }
    public float getHargaAlatTulis() {
        return hargaAlatTulis;
    }
    
    public void setTotalHarga(float barang1, float barang2, float barang3) {
        this.totalHarga = barang1 + barang2 + barang3;
    }
    public float getTotalHarga() {
        return totalHarga;
    }

    public void identitas(){
        System.out.println("Latihan Penjualan - Modul 2");
        System.out.println("Nama : Muhammad Anas Punggawa");
        System.out.println("NIM : 1929041008");
        System.out.println("Kelas : PTIK A 2019");
        System.out.println("================================");
    }
}
