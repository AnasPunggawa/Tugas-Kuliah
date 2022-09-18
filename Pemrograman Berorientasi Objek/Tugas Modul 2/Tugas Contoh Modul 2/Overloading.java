public class Overloading {
    public void tampil(){
        System.out.println("I Love Java");
    }
    public void tampil(int i){
        System.out.println("Method dengan 1 parameter = " + i);
    }
    public void tampil(int i, int j){
        System.out.println("Method dengan 2 parameter = " + i + " & " + j);
    }
    public void tampil(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Overloading objek = new Overloading();
        objek.tampil();
        objek.tampil(8);
        objek.tampil(6, 7);
        objek.tampil("Hello World");
    }
}
