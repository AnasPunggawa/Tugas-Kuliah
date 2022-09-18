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
public abstract class CRUDAbs {
    protected String id, nama, alamat, cari;
    
    protected abstract void setId(String id);
    protected abstract String getId();

    protected abstract void setNama(String nama);
    protected abstract String getNama();

    protected abstract void setAlamat(String alamat);
    protected abstract String getAlamat();

    protected abstract void setCari(String cari);
    protected abstract String getCari();
}
