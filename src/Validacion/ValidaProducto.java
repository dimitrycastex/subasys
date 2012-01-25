/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import java.util.ArrayList;

/**
 *
 * @author Bastian
 */
public class ValidaProducto {
    
    public static boolean ProductoValido(ArrayList datos){
        
        boolean valido = true;
        
        for (int i = 0; i < datos.size(); i++) {
            
            if(i==2) continue;
            
            String temp = datos.get(i).toString();
            if(temp.isEmpty()){ 
                valido = false;
                break;
            }
        }
        
        
        return valido;    
    }
}
