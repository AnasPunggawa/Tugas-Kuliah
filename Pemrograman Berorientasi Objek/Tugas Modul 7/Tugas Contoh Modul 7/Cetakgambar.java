public class Cetakgambar extends Bentuk{
    private void tampil(Bentuk[] obj) {
        for (int i = 0; i < obj.length; i++) {
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("=====================");
        }
    }

    public static void main(String[] args) {
        Bentuk[] obj = {
            new Lingkaran(),
            new Elips(),
            new Segitiga()
        };
        
        Cetakgambar cetak = new Cetakgambar();
        cetak.gambar();
        cetak.hapus();
        System.out.println("=====================");
        cetak.tampil(obj);
    }
}
