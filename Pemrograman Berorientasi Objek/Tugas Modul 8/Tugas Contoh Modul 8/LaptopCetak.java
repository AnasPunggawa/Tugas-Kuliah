public final class LaptopCetak {
    private final String barang = "Laptop";

    private final void cetak(Laptop[] ob, String pemilik) {
        System.out.println("Nama Barang " + barang);
        System.out.println("");
        for (int i = 0; i < ob.length; i++) {
            ob[i].getMerk();
            ob[i].setPemilik(pemilik);
            ob[i].getPemilik();
            ob[i].tampil();
            ob[i].hapus();
            System.out.println("#########################");
        }
        ob = null;
        pemilik = null;
    }

    public static void main(String[] args) {
        String pemilik = "Ahmad";
        Laptop[] ob = {
            new LaptopAsus("Asus"),
            new LaptopDell("Dell"),
            new LaptopToshiba("Toshiba")
        };

        LaptopCetak abc = new LaptopCetak();
        abc.cetak(ob, pemilik);

        pemilik = null;
        ob = null;
        abc = null;
    }
}
