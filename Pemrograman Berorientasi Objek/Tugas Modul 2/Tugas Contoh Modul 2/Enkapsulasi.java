public class Enkapsulasi {
    private int alas, tinggi;
    private double luasSegitiga;

    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getAlas() {
        return alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setLuasSegitiga(int alas, int tinggi) {
        luasSegitiga = 0.5 * (double)(alas * tinggi);
    }
    public double getLuasSegitiga() {
        return luasSegitiga;
    }
}