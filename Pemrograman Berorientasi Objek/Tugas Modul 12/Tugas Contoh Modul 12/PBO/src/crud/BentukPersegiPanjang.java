/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/**
 *
 * @author MSI GF63
 */
public class BentukPersegiPanjang extends Bentuk {
    @Override
    protected void set_C() {
        c = a * b;
    }

    @Override
    protected String cetak() {
        luas = "Luas Persegi Panjang : " + get_A() + " * " + get_B() + " = " + get_C();
        return luas;
    }
}
