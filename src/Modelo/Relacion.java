/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Deico
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Relacion {
    
     public static void remate_has_factura(int ID_REMATE,int ID_FACTURA)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Remate_has_Factura (ID_REMATE,ID_FACTURA) values (?,?);");
           
            prep.setInt(1, ID_REMATE);
            prep.setInt(2, ID_FACTURA); 
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
     
}
