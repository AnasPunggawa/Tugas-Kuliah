public class RentalVCD {
    private String judulFilm, publisher;
    private int stok;
    
    protected void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
        judulFilm = null;
    }
    protected String getJudulFilm() {
        return judulFilm;
    }

    protected void setPublisher(String publisher) {
        this.publisher = publisher;
        publisher = null;
    }
    protected String getPublisher() {
        return publisher;
    }

    protected void setStok(int stok) {
        this.stok = stok;
        stok = 0;
    }
    protected int getStok() {
        return stok;
    }

    protected void tampil(String a){
        System.out.println(a);
        a = null;
    }

    protected void tampil(int a){
        System.out.println(a);
        a = 0;
    }

    public void identitas(){
        System.out.println("Latihan Aplikasi Rental VCD - Modul 5");
        System.out.println("Nama : Muhammad Anas Punggawa");
        System.out.println("NIM : 1929041008");
        System.out.println("Kelas : PTIK A 2019");
        System.out.println("================================");
    }

    protected void hapus() {
        judulFilm = null;
        publisher = null;
        stok = 0;
    }
}