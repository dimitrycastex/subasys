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
public class Factura_Busqueda extends DefaultTableModel{

    //Tabla Vacia
    public Factura_Busqueda(){
        super();
        this.addColumn("SEL");
        this.addColumn("FACTURA");
        this.addColumn("RUT");
        this.addColumn("APELLIDOP");
        this.addColumn("APELLIDOM");
        this.addColumn("NOMBRE");
        this.addColumn("TOTAL");
        this.addColumn("GARANTIA");
        this.addColumn("FECHA");
        this.addColumn("ESTADO");
        this.addColumn("EXENTO");
        this.addColumn("NETO");
        this.addColumn("IMPUESTOS");
        this.addColumn("COMISION");
        this.addColumn("IVA");
        this.addColumn("COMISION FACTURA");
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
