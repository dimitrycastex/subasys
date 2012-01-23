/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Imagenes_Label.canasto;

import Vista.Imagenes_Label.buscar.*;
import Vista.Imagenes_Label.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 * @author bastian
 */
public class Label_Canasto128 extends JLabel{
    
    public Label_Canasto128(){
        super();
        this.setText(null);
        this.setIcon(this.RetornaImagen());
        this.setSize(128, 128);
    }

    public ImageIcon RetornaImagen(){
        ImageIcon Imagen = new ImageIcon(this.getClass().getResource("/Vista/Imagenes_Files/canasto/128.png"));
        return Imagen;
    }

    
}
