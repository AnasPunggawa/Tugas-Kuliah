import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inStr = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);
        String univ, nama, alamat, opt;
        int nim, pil;
        boolean lagi = true;

        System.out.println("Latihan Constructor - Modul 6");
        System.out.println("Nama : Muhammad Anas Punggawa");
        System.out.println("NIM : 1929041008");
        System.out.println("Kelas : PTIK A 2019");
        System.out.println("==================================\n");

        univ = "   *Universitas Negeri Makassar*";
        Mahasiswa.setUniv(univ);
        System.out.println(Mahasiswa.getUniv());
        System.out.println("==================================\n");
        
        while (lagi) {
            System.out.println("=========== Input Data ===========");
            System.out.print("Masukkan Nama : ");
            nama = inStr.nextLine();
            System.out.print("Masukkan NIM : ");
            nim = inInt.nextInt();
            System.out.print("Masukkan Alamat : ");
            alamat = inStr.nextLine();
            System.out.println("Pilihan Jurusan :");
            System.out.println("61 = MATEMATIKA\n62 = BIOLOGI\n63 = KIMIA\n64 = FISIKA\n65 = TEKNIK INFORMATIKA\n66 = TEKNIK ARSITEKTUR");
            System.out.print("Masukkan Code Jurusan : ");
            pil = inInt.nextInt();
            System.out.println("==================================\n");
            
            DataMahasiswa mhs = new DataMahasiswa(nama, nim, alamat, pil);
            System.out.println("========= Data Mahasiswa =========");
            mhs.tampil("Nama : "+mhs.getNama());
            mhs.tampil("NIM : "+mhs.getNim());
            mhs.tampil("Alamat : "+mhs.getAlamat());
            mhs.tampil("Jurusan : "+mhs.getJurusan());
            System.out.println("==================================\n");
            System.out.println("Apakah Anda ingin memasukkan data lagi? (Y) Ya / (T) Tidak");
            System.out.print("Pilihan : ");
            opt = inStr.nextLine();
            if (opt.equalsIgnoreCase("T")) {
                System.out.println("\nTerima Kasih :)");
                lagi = false;
            } else if (opt.equalsIgnoreCase("Y")) {
                System.out.println("\nMemasukkan Data Kembali");
                lagi = true;
            } else {
                System.out.println("\nPilihan Tidak Valid");
                lagi = false;
            }
            mhs.hapus();
        }
        
        univ = null;
        nama = null;
        alamat = null;
        opt = null;
        nim = 0;
        pil = 0;
        inStr.close();
        inInt.close();
    }
}
