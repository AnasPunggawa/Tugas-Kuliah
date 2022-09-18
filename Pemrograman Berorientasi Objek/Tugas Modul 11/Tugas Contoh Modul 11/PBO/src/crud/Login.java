/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MSI GF63
 */
public class Login {
    private Connection koneksi;
    private PreparedStatement psmt;
    private ResultSet dataUser;
    private String query, userID, password, pesan;

    public Login() {
        KoneksiMysql connection = new KoneksiMysql();
        try {
            koneksi = connection.getKoneksi();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getUserID() {
        return userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public String cekLogin(String userID, String password){
        query = "SELECT nama FROM user WHERE id_user=? AND password=md5(?)";
        try {
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, userID);
            psmt.setString(2, password);
            dataUser = psmt.executeQuery();
            if (dataUser.next()) {
                Session.setUserID(userID);
                Session.setNama(dataUser.getString("nama"));
                Session.setStatusLogin("AKTIF");
                query = "INSERT INTO log_login (id_user) VALUES (?)";
                try {
                    psmt = koneksi.prepareStatement(query);
                    psmt.setString(1, userID);
                    psmt.executeUpdate();
                    psmt.close();
                } catch (SQLException e) {
                    System.out.println(e);
                    pesan = "Gagal Simpan data Log Login";
                }
            } else {
                pesan = "Gagal Login";
            }
        } catch (SQLException e) {
            System.out.println(e);
            pesan = "Gagal Login, Query Error";
        }
        return pesan;
    }

    public void Logout(String userID) {
        query = "UPDATE log_login SET waktu_logout=CURRENT_TIMESTAMP() WHERE id_user=? ORDER BY id DESC LIMIT 1";
        try {
            psmt = koneksi.prepareStatement(query);
            psmt.setString(1, userID);
            psmt.executeUpdate();
            psmt.close();
            koneksi.close();
            Session.setUserID(null);
            Session.setNama(null);
            Session.setStatusLogin(null);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
