/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.fuente;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Bastian
 */
public class Harabara{
    
    private File file;
    private FileInputStream fis;
    private Font font;
    private InputStream in;

   
public Font getFont(int tamano){
        try {
            in = this.getClass().getResourceAsStream("/Vista/fuente/Harabara.ttf");
            font = Font.createFont(Font.TRUETYPE_FONT,in);
            font = font.deriveFont(Font.TRUETYPE_FONT,tamano);
            return font;
        } catch (FontFormatException ex) {
            Logger.getLogger(Harabara.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Harabara.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;

}
    
}
