/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Imagenes_Label.tick;

import Vista.Imagenes_Label.factura.*;
import Vista.Imagenes_Label.database.*;
import Vista.Imagenes_Label.cruz.*;
import Vista.Imagenes_Label.canasto.*;
import Vista.Imagenes_Label.buscar.*;
import Vista.Imagenes_Label.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 * @author bastian
 */
public class Label_Tick32 extends JLabel{
    
    public Label_Tick32(){
        super();
        this.setText(null);
        this.setIcon(this.RetornaImagen());
        this.setSize(32, 32);
    }

    public ImageIcon RetornaImagen(){
        ImageIcon Imagen = new ImageIcon(this.getClass().getResource("/Vista/Imagenes_Files/tick/32.png"));
        return Imagen;
    }

    
}
