public class MainLatihanArray2 {
    public static void main(String[] args) {
        LatihanArray2 ob = new LatihanArray2();
        int[][] m1 = {
            {1, 2},
            {3, 5},
            {6, 7}
        }; 
        int[][] m2 = {
            {8, 9},
            {10, 11},
            {12, 13}
        }; 
        float kali = 0.5f;

        ob.identitas();
        System.out.println("Matriks A");
        ob.setData(m1);
        ob.tampil(ob.getData());
        System.out.println("Matriks B");
        ob.setData(m2);
        ob.tampil(ob.getData());
        System.out.println("Penjumlahan Matriks C = A + B");
        ob.setPenjumlahanMatriks(m1, m2);
        ob.tampil(ob.getPenjumlahanMatriks());
        System.out.println("Perkalian Matriks C x " + kali);
        ob.setPerkalianMatriks(ob.getPenjumlahanMatriks(), kali);
        ob.tampil(ob.getPerkalianMatriks());
        
        
        ob.hapus();
        m1 = null;
        m2 = null;
    }
}
