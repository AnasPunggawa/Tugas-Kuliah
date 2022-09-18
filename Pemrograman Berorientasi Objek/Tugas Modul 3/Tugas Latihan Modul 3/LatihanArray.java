public class LatihanArray {
    private int[] bil;
    private float nilaiRataRata;
    private int nilaiMaks;
    private int nilaiMin;
    private int posisiNilai;

    public void setBil(int[] bil) {
        this.bil = bil;
        bil = null;
    }
    public int[] getBil() {
        return bil;
    }    

    public void setNilaiRataRata(int[] bil) {
        int a = 0;
        for (int i = 0; i < bil.length; i++) {
            a += bil[i];
        }
        this.nilaiRataRata = (float)a / bil.length;
        bil = null;
    }
    public float getNilaiRataRata() {
        return nilaiRataRata;
    }

    public void setNilaiMaks(int[] bil) {
        this.nilaiMaks = bil[0];
        for (int i = 0; i < bil.length; i++) {
            if (bil[i] > this.nilaiMaks) {
                this.nilaiMaks = bil[i];
            }
        }
        bil = null;
    }
    public int getNilaiMaks() {
        return nilaiMaks;
    }

    public void setNilaiMin(int[] bil) {
        this.nilaiMin = bil[0];
        for (int i = 0; i < bil.length; i++) {
            if (bil[i] < this.nilaiMin) {
                this.nilaiMin = bil[i];
            }
        }
        bil = null;
    }
    public int getNilaiMin() {
        return nilaiMin;
    }

    public void setPosisiNilai(int posisiNilai) {
        this.posisiNilai = posisiNilai;
    }
    public int getPosisiNilai() {
        return posisiNilai;
    }

    public void tampil(String a){
        System.out.println(a);
        a = null;
    
    }
    public void tampil(int a){
        System.out.println(a);
        a = 0;
    }

    public void tampil(float a){
        System.out.println(a);
        a = 0;
    }
    
    public void tampil(int[] a){
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }
    
    public void tampil(int a, int[] b){
        String data = "";
        for (int i = 0; i < b.length; i++) {
            if (b[i] == a) {
                if (i == 1) {
                    data += i;
                } else {
                    data += ", " + i;
                }
            }
        }
        System.out.println(data);
        a = 0;
        b = null;
        data = null;
    }

    public void identitas(){
        System.out.println("Latihan Array - Modul 3");
        System.out.println("Nama : Muhammad Anas Punggawa");
        System.out.println("NIM : 1929041008");
        System.out.println("Kelas : PTIK A 2019");
        System.out.println("================================");
    }

    public void hapus(){
        bil = null;
        nilaiRataRata = 0;
        nilaiMaks = 0;
        nilaiMin = 0;
    }
}