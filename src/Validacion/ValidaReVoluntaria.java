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
public class ValidaReVoluntaria {
    
    public static boolean ReVoluntariaValida(ArrayList Datos){
    
        boolean valido = true;
        
        if(Datos.get(1) == null)
            valido = false;
        
        if(Datos.get(0).toString().isEmpty() || Datos.get(2).toString().isEmpty() || Datos.get(3).toString().isEmpty())
            valido = false;
        
       
    
        return valido;
    }
    
}
