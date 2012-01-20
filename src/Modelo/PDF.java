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

public class PDF {
    
 public static ArrayList get_Lista_Clientes(){
     
     return Modelo.Cliente.get_Lista();
 }
 
 public static ArrayList get_Lista_Productos(){
     
     return Modelo.Producto.get_Lista();
 }
 
 public static ArrayList get_Lista_Recepcion_Judicial(){
     
     return Modelo.ReJudicial.get_Lista();
 }
 
 public static ArrayList get_Lista_Recepcion_Voluntaria(){
     
     return Modelo.ReVoluntaria.get_Lista();
 }
 
 public static ArrayList get_Lista_Remate(){
     
     return Modelo.Remate.get_Lista();
 }
     
     
  
     
}
