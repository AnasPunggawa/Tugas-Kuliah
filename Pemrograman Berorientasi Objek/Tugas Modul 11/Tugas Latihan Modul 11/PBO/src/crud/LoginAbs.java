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
public abstract class LoginAbs {
    protected String userID, password;

    protected abstract void setUserID(String userID);
    protected abstract String getUserID();

    protected abstract void setPassword(String password);
    protected abstract String getPassword();
}
