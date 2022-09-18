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
public class Session {
    private static String UserID, Nama, StatusLogin;

    public static void setUserID(String userId) {
        UserID = userId;
    }
    public static String getUserID() {
        return UserID;
    }

    public static void setNama(String nama) {
        Nama = nama;
    }
    public static String getNama() {
        return Nama;
    }

    public static void setStatusLogin(String statusLogin) {
        StatusLogin = statusLogin;
    }
    public static String getStatusLogin() {
        return StatusLogin;
    }
}
