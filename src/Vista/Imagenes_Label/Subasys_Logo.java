/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Imagenes_Label;

import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 * @author bastian
 */
public class Subasys_Logo extends JLabel{
    
    public Subasys_Logo(){
        super();
        this.setText(null);
        this.setIcon(this.RetornaImagen());
        this.setSize(200, 82);
    }

    public ImageIcon RetornaImagen(){
        ImageIcon Imagen = new ImageIcon(this.getClass().getResource("/Vista/Imagenes_Files/subasys.png"));
        return Imagen;
    }

    
}
