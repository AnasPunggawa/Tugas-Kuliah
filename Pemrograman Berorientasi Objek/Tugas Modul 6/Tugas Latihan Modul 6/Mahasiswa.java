public class Mahasiswa {
    private String nama;
    private int nim;
    private static String univ;

    protected Mahasiswa(){
        nama = null;
        nim = 0;
    }

    protected Mahasiswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
        nama = null;
        nim = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
        nama = null;
    }
    public String getNama() {
        return nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
        nim = 0;
    }
    public int getNim() {
        return nim;
    }

    public static void setUniv(String univ) {
        Mahasiswa.univ = univ;
    }
    public static String getUniv() {
        return univ;
    }
    
    protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }
    protected void tampil(int a) {
        System.out.println(a);
        a = 0;
    }
    
    protected void hapus() {
        univ = null;
        nama = null;
        nim = 0;
    }
}