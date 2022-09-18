/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author MSI GF63
 */
public class Main {
    public static void main(String[] args) {
          try {
              Form_Siswa form = new Form_Siswa();
              form.setVisible(true);
          } catch (Exception ex) {
              System.out.println(ex.toString());
          }
    }
}
