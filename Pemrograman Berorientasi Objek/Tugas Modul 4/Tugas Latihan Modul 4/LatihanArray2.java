public class LatihanArray2 {
    private int[][] data, hasilPenjumlahan;
    private float[][] hasilPerkalian;


    public void setData(int[][] data) {
        this.data = data;
        data = null;
    }
    public int[][] getData() {
        return data;
    }

    public void setPenjumlahanMatriks(int[][] m1, int[][] m2) {
        int[][] array = new int[m1.length][m1[0].length];
        hasilPenjumlahan = array;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                hasilPenjumlahan[i][j] = m1[i][j] + m2[i][j];
            }
        }
        array = null;
        m1 = null;
        m2 = null;
    }
    public int[][] getPenjumlahanMatriks() {
        return hasilPenjumlahan;
    }

    public void setPerkalianMatriks(int[][] m4, float b) {
        float[][] floatArray = new float[m4.length][m4.length]; 
        hasilPerkalian =  floatArray;
        for (int i = 0; i < m4.length; i++) {
            for (int j = 0; j < m4[i].length; j++) {
                hasilPerkalian[i][j] = b * m4[i][j];
            }
        }
        m4 = null;
        floatArray = null;
    }

    public float[][] getPerkalianMatriks() {
        return hasilPerkalian;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    public void tampil(int data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        data = null;
    }

    public void tampil(float data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length - 1; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        data = null;
    }

    public void identitas(){
        System.out.println("Latihan Array Dimensi 2 - Modul 4");
        System.out.println("Nama : Muhammad Anas Punggawa");
        System.out.println("NIM : 1929041008");
        System.out.println("Kelas : PTIK A 2019");
        System.out.println("================================");
    }

    public void hapus() {
        data = null;
        hasilPenjumlahan = null;
        hasilPerkalian = null;
    }
}