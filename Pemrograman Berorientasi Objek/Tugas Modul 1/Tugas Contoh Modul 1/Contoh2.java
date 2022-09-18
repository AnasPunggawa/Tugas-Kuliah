public class Contoh2 {
    static void cetak(int a){
        System.out.println("Nilai x: "+a);
    }
    public static void main(String[] args) {
        int x;
        for ( x = 0; x < 3; x++) {
            cetak(x);
        }
        System.out.println("Nilai x terakhir: "+x);
    }
}
