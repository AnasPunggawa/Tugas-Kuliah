import java.util.Scanner;

public class Main extends VCDFilm {
    public static void main(String[] args) {
        Main ob = new Main();
        Scanner inStr = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);
        String judulFilm, publisher, aktor, sutradara;
        int pil, stok;

        //Identitas
        ob.identitas();

        //Input
        ob.tampil("\n============= Rental VCD Film =============");
        System.out.print("Masukkan Judul Film: ");
        judulFilm = inStr.nextLine();
        ob.setJudulFilm(judulFilm);
        System.out.print("Masukkan Publisher Film: ");
        publisher = inStr.nextLine();
        ob.setPublisher(publisher);
        System.out.print("Masukkan Stok Film: ");
        stok = inInt.nextInt();
        ob.setStok(stok);
        System.out.print("Masukkan Aktor Film: ");
        aktor= inStr.nextLine();
        ob.setAktor(aktor);
        System.out.print("Masukkan Sutradara Film: ");
        sutradara = inStr.nextLine();
        ob.setSutradara(sutradara);
        System.out.println("Daftar Kategori:");
        System.out.println("(1) SU = Semua Usia\n(2) D = Dewasa\n(3) R = Remaja\n(4) A = Anak-anak");
        System.out.print("Masukkan Kategori Film: ");
        pil = inInt.nextInt();
        ob.setKategori(pil);
        ob.tampil("===========================================");

        //Output
        ob.tampil("\n============= Keterangan FILM =============");
        ob.tampil("Judul Film: " + ob.getJudulFilm());
        ob.tampil("Publisher Film: " + ob.getPublisher());
        ob.tampil("Stok Film: " + ob.getStok());
        ob.tampil("Aktor Film: " + ob.getAktor());
        ob.tampil("Sutradara Film: " + ob.getSutradara());
        ob.tampil("Kategori Film: " + ob.getKategori());
        ob.tampil("===========================================");

        inStr.close();
        inInt.close();
        ob.hapus();
        inStr = null;
        inInt = null;
        judulFilm = null;
        publisher = null;
        stok = 0;
        aktor = null;
        sutradara = null;
    }
}
