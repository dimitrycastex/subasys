/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Imagenes_Label.cliente;

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
public class Label_Cliente24 extends JLabel{
    
    public Label_Cliente24(){
        super();
        this.setText(null);
        this.setIcon(this.RetornaImagen());
        this.setSize(24, 24);
    }

    public ImageIcon RetornaImagen(){
        ImageIcon Imagen = new ImageIcon(this.getClass().getResource("/Vista/Imagenes_Files/cliente/24.png"));
        return Imagen;
    }

    
}
