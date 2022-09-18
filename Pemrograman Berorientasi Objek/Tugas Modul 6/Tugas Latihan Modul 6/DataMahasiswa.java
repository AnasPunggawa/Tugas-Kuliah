public class DataMahasiswa extends Mahasiswa {
    private String alamat, jurusan;

    protected DataMahasiswa(String nama, int nim, String alamat, int pil){
        super(nama, nim);
        this.alamat = alamat;
        if (pil == 61) {
            this.jurusan = "MATEMATIKA";
        } else if (pil == 62) {
            this.jurusan = "BIOLOGI";
        } else if (pil == 63) {
            this.jurusan = "KIMIA";
        } else if (pil == 64) {
            this.jurusan = "FISIKA";
        } else if (pil == 65) {
            this.jurusan= "TEKNIK INFORMATIKA";
        } else if (pil == 66) {
            this.jurusan = "TEKNIK ARSITEKTUR";
        } else {
            this.jurusan = "Tidak Ditemukan";
        }

        nama = null;
        nim = 0;
        alamat = null;
        pil = 0;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJurusan() {
        return jurusan;
    }

    protected void hapus() {
        alamat = null;
        jurusan = null;
        super.hapus();
    }
}
