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
public class ValidaCliente {
    
    private boolean ValidaRUN(String Elrun){

        if(Elrun!=null || !Elrun.isEmpty()){
            
            String digitos;
            String digitov;
            String Temp[];
            int rut,digito,suma=0,resto,resultado=0,factor,verificador;
            int tamano = Elrun.length();

           
            if(tamano < 8)
                return false;

             Temp = Elrun.split("-");
             for (int i = 0; i < Temp.length; i++) {
                 System.out.println("Temp: "+Temp[i]);
            }
             digitos = Temp[0];
             digitov = Temp[1];
             
            try{
                rut = Integer.parseInt(digitos);

                if(!digitov.equalsIgnoreCase("K"))
                verificador = Integer.parseInt(digitov);

                else verificador = 11;
            }

            catch(NumberFormatException e){

                return false;
            }


            for(factor = 2, suma = 0; rut > 0; factor++){

                digito = rut % 10;
                rut /= 10;
                suma += digito * factor;

                if(factor >= 7) factor = 1; //Para volver al ciclo
            }
            // Ahora viene el algoritmo del módulo 11
            resto = suma % 11;
            resultado = 11 -resto;

            if(resultado == 10 && digitov.equalsIgnoreCase("K") )
               return true;

            if(resultado == 11 && verificador == 0)
                return true;

            if(verificador == resultado)
                return true;

        }

        return false;
    }

    private boolean ValidaMail(String Mail){
        
        if(Mail.equals("-")) return true;
        
        String regex = "^[a-zA-Z0-9_-]{2,}@[a-zA-Z0-9_-]{2,}\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{2,4})?$";
        
        if(Mail.matches(regex))
            return true;
        
        else return false;
    }
    
    public boolean ClienteValido(ArrayList datos){
    
        String temp;
        boolean valido = true;
        
        //RUN y Email
        if(!this.ValidaRUN(datos.get(0).toString()) || !this.ValidaMail(datos.get(4).toString()))
            valido= false;
        
        
        //Numero de telefono
        if(datos.get(6).toString().length()< 6)
            valido = false;
        
        //Codigo Postal
        if(datos.get(7).toString().length()< 7)
            valido = false;
        
        for (int i = 1; i < datos.size(); i++) {
            
            if(i==4 || i==6 || i==7) continue;
            
            temp = datos.get(i).toString();
            
            if(EsVacio(temp)){
                valido = false;
                break;
            }
            
        }
        return valido;
        
    }
    
    private boolean EsVacio(String s){
    
        if(s==null || s.isEmpty())
            return true;
        
        else return false;
    }
    
    
}
