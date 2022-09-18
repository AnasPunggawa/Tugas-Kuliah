/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MSI GF63
 */
public class Bentuk implements BentukInterface {
    private Connection koneksi;
    private PreparedStatement psmt;
    private String query;
    protected double a, b, c;
    protected String luas;

    public Bentuk() {
        KoneksiMysql connection = new KoneksiMysql();
        try {
            koneksi = connection.getKoneksi();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

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

    @Override
    public void LogAktifitas(String userID, String aktifitas, String keterangan) {
        query = "INSERT INTO log_aktifitas (id_user,aktifitas,keterangan) VALUES (?,?,?)";
        try {
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, userID);
            psmt.setString(2, aktifitas);
            psmt.setString(3, keterangan);
            psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
