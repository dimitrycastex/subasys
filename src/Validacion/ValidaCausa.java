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
public class ValidaCausa {
    
    public static boolean CausaValida(ArrayList datos){
        boolean valido = true;
        
        for (Iterator it = datos.iterator(); it.hasNext();) {
            Object object = it.next();
            if(object.toString().isEmpty()){
                valido = false;
                break;
            }
        }
        
        return valido;
    }
    
}
