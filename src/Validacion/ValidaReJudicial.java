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
public class ValidaReJudicial {
    
    public static boolean ReJucicialValida(ArrayList Datos){
    
        boolean valido = true;
        
        if(Datos.get(0).toString().isEmpty())
            valido = false;
        
        if(Datos.get(1)==null && Datos.get(2) == null)
            valido = false;
        
        if(Datos.get(3).toString().isEmpty() || Datos.get(4).toString().isEmpty()
                || Datos.get(5).toString().isEmpty())
            valido = false;
                    
    
        return valido;
    }
    
}
