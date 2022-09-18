import javax.swing.JOptionPane;

public class MainMobil extends Mobil{
    public static void main(String[] args) {
        MainMobil ob = new MainMobil();
        String merk, warna, harga;

        merk = JOptionPane.showInputDialog("Merk Mobil");
        ob.setMerk(merk);
        ob.tampil("Merek Mobil : " + ob.getMerk());
        
        warna = JOptionPane.showInputDialog("Warna Mobil");
        ob.setWarna(warna);
        ob.tampil("Warna Mobil : " + ob.getWarna());
        
        harga = JOptionPane.showInputDialog("Harga Mobil");
        ob.setHarga(harga);
        ob.tampil("Harga Mobil : " + ob.getHarga());

        ob.hapus();
        merk = null;
        warna = null;
        harga = null;
        ob = null;

        System.exit(0);
    }
}
