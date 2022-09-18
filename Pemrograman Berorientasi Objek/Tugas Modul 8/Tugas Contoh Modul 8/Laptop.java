public abstract class Laptop {
    protected String merk, pemilik;

    protected abstract void setMerk(String merk);
    protected abstract String getMerk();
    protected abstract void setPemilik(String merk);
    protected abstract String getPemilik();
    protected abstract void tampil();
    protected abstract void hapus();

    protected void hidupkanLaptop(){
        System.out.println("Hidupkan Laptop");
    }
}