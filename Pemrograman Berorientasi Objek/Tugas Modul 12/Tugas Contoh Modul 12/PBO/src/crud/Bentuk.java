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
public class Bentuk {
    protected double a, b, c;
    protected String luas;

    protected void set_A(double a) {
        this.a = a;
    }
    protected double get_A() {
        return a;
    }

    protected void set_B(double b) {
        this.b = b;
    }
    protected double get_B() {
        return b;
    }

    protected void set_C() {
    }
    protected double get_C() {
        return c;
    }

    protected String cetak() {
        return luas;
    }
}
