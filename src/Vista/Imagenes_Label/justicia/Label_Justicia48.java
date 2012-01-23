/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Imagenes_Label.justicia;

import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 * @author bastian
 */
public class Label_Justicia48 extends JLabel{
    
    public Label_Justicia48(){
        super();
        this.setText(null);
        this.setIcon(this.RetornaImagen());
        this.setSize(48, 48);
    }

    public ImageIcon RetornaImagen(){
        ImageIcon Imagen = new ImageIcon(this.getClass().getResource("/Vista/Imagenes_Files/justicia/48.png"));
        return Imagen;
    }

    
}
