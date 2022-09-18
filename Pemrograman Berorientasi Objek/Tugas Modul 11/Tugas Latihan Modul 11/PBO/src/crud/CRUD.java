/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MSI GF63
 */
public class CRUD extends CRUDAbs implements CRUDInterface{
    private String msg;
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private Statement CRUDstat;
    private ResultSet CRUDhasil;
    private String CRUDquery;
    
    public CRUD (){
        try {
            KoneksiMysql connection = new KoneksiMysql();
            CRUDkoneksi = connection.getKoneksi();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public String getNama() {
        return nama;
    }
    
    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    @Override
    public String getAlamat() {
        return alamat;
    }
    
    @Override
    public void setCari(String cari) {
        this.cari = cari;
    }
    @Override
    public String getCari() {
        return cari;
    }

    @Override
    public ResultSet tampilData(){
        CRUDquery = "select * from siswa";
        try {
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return CRUDhasil;
    }

    @Override
    public String simpanData(String id, String nama, String alamat) {
        CRUDquery = "insert into siswa values(?,?,?)";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, id);
            CRUDpsmt.setString(2, nama);
            CRUDpsmt.setString(3, alamat);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            msg = "Data berhasil tersimpan";
        } catch (SQLException e) {
            System.out.println(e);
            msg = "Data gagal tersimpan";
        }
        return msg;
    }

    @Override
    public String ubahData(String id, String nama, String alamat) {
        CRUDquery = "update siswa set nama=?, alamat=? where id=?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nama);
            CRUDpsmt.setString(2, alamat);
            CRUDpsmt.setString(3, id);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            msg = "Data berhasil diubah";
        } catch (SQLException e) {
            System.out.println(e);
            msg = "Data gagal diubah";
        }
        return msg;
    }
    
    @Override
    public String hapusData(String id) {
        CRUDquery = "delete from siswa where id=?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, id);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            msg = "Data berhasil dihapus";
        } catch (SQLException e) {
            System.out.println(e);
            msg = "Data gagal dihapus";
        }  
        return msg;
    }
    
    @Override
    public ResultSet cariData(){
        CRUDquery = "select * from siswa where id like '%"+this.cari+"%' or nama like '%"+this.cari+"%'";
        try {
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return CRUDhasil;
    }
}
