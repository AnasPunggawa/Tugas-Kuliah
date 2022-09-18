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
public class BentukLayangLayang extends Bentuk{
    @Override
    protected void set_C() {
        c = a * b * 0.5;
    }

    @Override
    protected String cetak() {
        luas = "Luas Layang - Layang : " + get_A() + " * " + get_B() + " * 0.5 = " + get_C();
        return luas;
    }
}
