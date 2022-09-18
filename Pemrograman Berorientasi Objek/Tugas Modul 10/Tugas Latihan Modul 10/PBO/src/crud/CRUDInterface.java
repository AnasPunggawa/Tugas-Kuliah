/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.ResultSet;

/**
 *
 * @author MSI GF63
 */
public interface CRUDInterface {
    public ResultSet tampilData();
    public String simpanData(String id, String nama, String alamat);
    public String ubahData(String id, String nama, String alamat);
    public String hapusData(String id);
    public ResultSet cariData();
}
