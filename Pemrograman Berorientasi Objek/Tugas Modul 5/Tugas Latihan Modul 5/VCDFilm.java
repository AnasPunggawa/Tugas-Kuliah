public class VCDFilm extends RentalVCD {
    private String aktor, sutradara, kategori;

    protected void setAktor(String aktor) {
        this.aktor = aktor;
        aktor = null;
    }
    protected String getAktor() {
        return aktor;
    }

    protected void setSutradara(String sutradara) {
        this.sutradara = sutradara;
        sutradara = null;
    }
    protected String getSutradara() {
        return sutradara;
    }
    
    protected void setKategori(int pil) {
        if (pil == 1) {
            this.kategori = "Semua Usia";
        } else if (pil == 2) {
            this.kategori = "Dewasa";
        } else if (pil == 3) {
            this.kategori = "Remaja";
        } else if (pil == 4) {
            this.kategori = "Anak-anak";
        } else {
            this.kategori = "Tidak Ditemukan";
        }
        pil = 0;
    }    
    protected String getKategori() {
        return kategori;
    }

    protected void hapus() {
        aktor = null;
        sutradara = null;
        kategori = null;
        super.hapus();
    }
}
