/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Bastian
 */
public class ValidaRemate {
    
    public static boolean RemateValido(ArrayList datos){
        boolean valido = true;
        
        if(datos.get(3)==null) 
            valido = false;
        
        for (int i = 0; i < datos.size(); i++) {
            
            if(i==3) continue;
            
            String temp = datos.get(i).toString();
            
            if(temp.isEmpty()){
                valido = false;
                break;
            }
        }
                
        return valido;
    }
    
}
