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
public interface LoginInterface {
     public String cekLogin(String userID, String password);
     public void Logout(String userID);
}
