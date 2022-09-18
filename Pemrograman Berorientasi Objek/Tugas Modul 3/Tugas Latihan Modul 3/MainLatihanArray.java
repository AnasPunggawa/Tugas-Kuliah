public class MainLatihanArray {
    public static void main(String[] args) {
        LatihanArray ob = new LatihanArray();
        int bil[] = {-5, -3, -6, -3, -4};

        //Set
        ob.setBil(bil);
        ob.setNilaiRataRata(bil);
        ob.setNilaiMaks(bil);
        ob.setNilaiMin(bil);
        ob.setPosisiNilai(-3);

        //Menampilkan (Get)
        ob.identitas();
        ob.tampil("\nBilangan : ");
        ob.tampil(ob.getBil());
        ob.tampil("a. Nilai Rata-Rata");
        ob.tampil(ob.getNilaiRataRata());
        ob.tampil("b. Nilai Maksimum");
        ob.tampil(ob.getNilaiMaks());
        ob.tampil("c. Nilai Minimum");
        ob.tampil(ob.getNilaiMin());
        ob.tampil("d. Angka -3 berada pada indeks");
        ob.tampil(ob.getPosisiNilai(), ob.getBil());

        //Membersihkan Memori
        ob.hapus();
        ob = null;
        bil = null;
    }
}
