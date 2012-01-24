/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas.Modelos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Deico
 */
public class Producto_Facturado_Busqueda extends DefaultTableModel{

    //Tabla Vacia
    public Producto_Facturado_Busqueda(){
        super();
        this.addColumn("SEL");
        this.addColumn("ID_PRODUCTO");
        this.addColumn("ID_FACTURA");
        this.addColumn("RUT");
        this.addColumn("APELLIDOP");
        this.addColumn("APELLIDOM");
        this.addColumn("NOMBRE");
        this.addColumn("DESCRIPCION PRODUCTO");
        this.addColumn("PRECIO UNITARIO");
        this.addColumn("GARANTIA");
        this.addColumn("TOTAL");
    }
     
      @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == 0)
            return Boolean.class;
        else
            return super.getColumnClass(columnIndex);
    }

    @Override
    public boolean isCellEditable (int row, int column)
   {
       if (column == 0)
          return true;

       return false;
   }
    
    
}
