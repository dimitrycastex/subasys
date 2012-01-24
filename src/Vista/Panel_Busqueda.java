/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Buscador.java
 *
 * Created on 20-ene-2012, 20:24:19
 */
package Vista;

import Modelo.Busqueda;
import Modelo.ExcelTableExporter;
import Vista.Tablas.Modelos.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deico
 */

public class Panel_Busqueda extends javax.swing.JPanel {


    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel tmodel_cliente = new Cliente_Busqueda();
    DefaultTableModel tmodel_factura = new Factura_Busqueda();
    DefaultTableModel tmodel_remate = new Remate_Busqueda();
    DefaultTableModel tmodel_producto = new Producto_Busqueda();
    DefaultTableModel tmodel_causa = new Causa_Busqueda();
    DefaultTableModel tmodel_recepcion_judicial = new Recepcion_Judicial_Busqueda();
    DefaultTableModel tmodel_recepcion_voluntaria = new Recepcion_Voluntaria_Busqueda();
    DefaultTableModel tmodel_producto_facturado = new Producto_Facturado_Busqueda();
    
    public static ArrayList<ArrayList> lista_seleccionados = new ArrayList();
    /** Creates new form Buscador */
    
    public Panel_Busqueda() {
        initComponents();
        model = tmodel_cliente;
        Tabla.setModel(model);
        Thread tread = new taskInitContents();
        tread.start();
       
       
    }

    private void initTableModels(){
        
        tmodel_cliente.addColumn("SEL");
        tmodel_cliente.addColumn("RUT");
        tmodel_cliente.addColumn("Apellido P");
        tmodel_cliente.addColumn("Apellido M");
        tmodel_cliente.addColumn("Nombre");
        tmodel_cliente.addColumn("Telefono");
        tmodel_cliente.addColumn("Direccion");
        tmodel_cliente.addColumn("Email");
        
        tmodel_factura.addColumn("SEL");
        tmodel_factura.addColumn("Factura");
        tmodel_factura.addColumn("Rut");
        tmodel_factura.addColumn("Apellido P");
        tmodel_factura.addColumn("Apellido M");
        tmodel_factura.addColumn("Nombre");
        tmodel_factura.addColumn("Total");
        tmodel_factura.addColumn("Garantia");
        tmodel_factura.addColumn("Fecha");
        tmodel_factura.addColumn("Estado");
        tmodel_factura.addColumn("Exento");
        tmodel_factura.addColumn("Neto");
        tmodel_factura.addColumn("Impuestos");
        tmodel_factura.addColumn("Comision");
        tmodel_factura.addColumn("IVA");
        tmodel_factura.addColumn("Comison factura");
       
        
        
        tmodel_remate.addColumn("SEL");
        tmodel_remate.addColumn("RUT");
        tmodel_remate.addColumn("Nombre");
        tmodel_remate.addColumn("Telefono");
        tmodel_remate.addColumn("Direccion");
        tmodel_remate.addColumn("Id factura");
        tmodel_remate.addColumn("Total Factura");
      
        tmodel_producto.addColumn("SEL");
        tmodel_producto.addColumn("Lote");
        tmodel_producto.addColumn("ID REMATE");
        tmodel_producto.addColumn("Descripcion");
        tmodel_producto.addColumn("Cantidad");
        tmodel_producto.addColumn("Precio");
        tmodel_producto.addColumn("Total");
        tmodel_producto.addColumn("Garantia");
       
        tmodel_causa.addColumn("SEL");
        tmodel_causa.addColumn("ROL");
        tmodel_causa.addColumn("Receptor");
        tmodel_causa.addColumn("Abogado");
        tmodel_causa.addColumn("Caratulado como");
        tmodel_causa.addColumn("Juzgado");
        tmodel_causa.addColumn("Remate");
        tmodel_causa.addColumn("ID RJ");
        
        tmodel_recepcion_judicial.addColumn("SEL");      
        tmodel_recepcion_judicial.addColumn("ROL");
        tmodel_recepcion_judicial.addColumn("ID_RJ");
        tmodel_recepcion_judicial.addColumn("ID PRODUCTO");
        tmodel_recepcion_judicial.addColumn("Descripcion Producto");
        tmodel_recepcion_judicial.addColumn("Garantia");
        tmodel_recepcion_judicial.addColumn("Total");
                
        tmodel_recepcion_voluntaria.addColumn("SEL");
        tmodel_recepcion_voluntaria.addColumn("ID PRODUCTO");
        tmodel_recepcion_voluntaria.addColumn("Descripcion Producto");
        tmodel_recepcion_voluntaria.addColumn("Garantia");
        tmodel_recepcion_voluntaria.addColumn("Total");
            
        tmodel_producto_facturado.addColumn("SEL");
        tmodel_producto_facturado.addColumn("ID_FACTURA");
        tmodel_producto_facturado.addColumn("RUT");
        tmodel_producto_facturado.addColumn("ApellidoP");
        tmodel_producto_facturado.addColumn("ApellidoM");
        tmodel_producto_facturado.addColumn("Nombre");
        tmodel_producto_facturado.addColumn("ID_PRODUCTO");
        tmodel_producto_facturado.addColumn("Descripcion producto");
        tmodel_producto_facturado.addColumn("Precio unitario");
        tmodel_producto_facturado.addColumn("Garantia");
        tmodel_producto_facturado.addColumn("Total");
         
        
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parametro_busqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Campo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Bar = new javax.swing.JProgressBar();

        parametro_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parametro_busquedaActionPerformed(evt);
            }
        });
        parametro_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                parametro_busquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                parametro_busquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                parametro_busquedaKeyTyped(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Campo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente",
            "Factura", "Remate", "Causa" ,"Producto", "Recepcion Judicial", "Recepcion Voluntaria","Productos Facturados"}));
Campo.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        CampoActionPerformed(evt);
    }
    });

    jLabel1.setText("Modo de Busqueda");

    Tabla.setModel(model);
    jScrollPane1.setViewportView(Tabla);

    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal","Plus" }));

    jLabel2.setText("Campo a buscar");

    jButton2.setText("to Excel");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(parametro_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Campo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                    .addComponent(Bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(53, 53, 53))
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton1)
                    .addGap(150, 150, 150)
                    .addComponent(jButton2)
                    .addContainerGap(243, Short.MAX_VALUE))))
        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        .addGroup(layout.createSequentialGroup()
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(Campo, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addComponent(Bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(parametro_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1)
                .addComponent(jButton2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
            .addGap(2, 2, 2)
            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    }// </editor-fold>//GEN-END:initComponents

private void parametro_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parametro_busquedaKeyReleased
// TODO add your handling code here:

  int campo = this.Campo.getSelectedIndex();
   if(campo==0){
       if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busca_cliente(parametro_busqueda.getText().toLowerCase(),model);
    }
   }
   else if(campo==1){
       if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busqueda_factura(parametro_busqueda.getText().toLowerCase(),model);
    }
   }
   else if(campo==2){
       if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
         if(Modelo.Remate.isRemate(parametro_busqueda.getText().toUpperCase()))
          Busqueda.busqueda_remate(parametro_busqueda.getText().toLowerCase(),model);
    }
   }
   else if(campo==3){
       
       if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);  
          Busqueda.busqueda_causa(parametro_busqueda.getText().toLowerCase(),model);
           
    }
       
   }
   else if(campo==4){
      
        if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busqueda_producto(parametro_busqueda.getText().toLowerCase(),model);
    }
   }
    else if(campo==5){
      
        if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busqueda_recepcion_judicial(parametro_busqueda.getText().toUpperCase(),model);
    }
    
   }
   
    else if(campo==6){
      
        if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busqueda_recepcion_voluntaria(parametro_busqueda.getText().toUpperCase(),model);
    }
    
   }
   
   else if(campo==7){
      
        if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busqueda_producto_facturado(parametro_busqueda.getText().toUpperCase(),model);
    }
    
   }
   
   
}//GEN-LAST:event_parametro_busquedaKeyReleased

public static ArrayList<ArrayList> getSelectedRows(DefaultTableModel model){

       lista_seleccionados.clear();
       
        for (int i = 0; i < model.getRowCount(); i++) {
            boolean sel = (Boolean)model.getValueAt(i, 0);
            if(sel){
                 ArrayList lista = new ArrayList();
                for (int j = 1; j < model.getColumnCount(); j++) {
                    
                    lista.add(model.getValueAt(i, j));
                }
                lista_seleccionados.add(lista);
            }
            
        }
        return lista_seleccionados;
    }

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList selectedRows = getSelectedRows(model);
        for (Iterator it = selectedRows.iterator(); it.hasNext();) {
        Object object = it.next();
            System.out.println(object);
    }
    
}//GEN-LAST:event_jButton1ActionPerformed

private void parametro_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parametro_busquedaKeyPressed
// TODO add your handling code here: 
   
}//GEN-LAST:event_parametro_busquedaKeyPressed

private void parametro_busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parametro_busquedaKeyTyped
// TODO add your handling code here:
     
}//GEN-LAST:event_parametro_busquedaKeyTyped

private void CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoActionPerformed
// TODO add your handling code here:
   int campo = this.Campo.getSelectedIndex();
   if(campo==0){
       model = tmodel_cliente;
       Tabla.setModel(model);
      // Modelo.Busqueda.initClientes();
   }
   else if(campo==1){
       model = tmodel_factura;
       Tabla.setModel(model);
      // Modelo.Busqueda.initFacturas();
   }
   else if(campo==2){
       model = tmodel_remate;
       Tabla.setModel(model);
      
   }
   else if(campo==3){
       model = tmodel_causa;
       Tabla.setModel(model);
      // Modelo.Busqueda.initCausas();
   }
   else if(campo==4){
       model = tmodel_producto;
       Tabla.setModel(model);
      // Modelo.Busqueda.initProductos();
   }
   else if(campo==5){
       model = tmodel_recepcion_judicial;
       Tabla.setModel(model);
      // Modelo.Busqueda.initRJ();
   }
   
   else if(campo==6){
       model = tmodel_recepcion_voluntaria;
       Tabla.setModel(model);
      // Modelo.Busqueda.initRV();
   }
   
   else if(campo==7){
       model = tmodel_producto_facturado;
       Tabla.setModel(model);
      // Modelo.Busqueda.initProductosFac();

   }
   
}//GEN-LAST:event_CampoActionPerformed

private void parametro_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parametro_busquedaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_parametro_busquedaActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
   try {
            List<JTable> tables = new ArrayList<JTable>();
            List<String> sheetsName = new ArrayList<String>();
            tables.add(Tabla);
            sheetsName.add("Planilla");
            ExcelTableExporter excelExporter = new ExcelTableExporter(tables, new File("exportar.xls"), sheetsName);
            if (excelExporter.export()) {
                JOptionPane.showMessageDialog(null, "Exportado con exito!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jButton2ActionPerformed

public void cleanModel(DefaultTableModel model){
    int a =model.getRowCount()-1;

    for (int i = a; i >=0; i--) {
        model.removeRow(i);
        
    }

    
}

class taskInitContents extends Thread{
        
      
      public void run() {
       
         
         // barra.setVisible(true);
        // Modelo.Busqueda.initAll();
          //barra.setMaximum(7);
           Modelo.Busqueda.initClientes();
           label.setText("Clientes Cargados..");
          // barra.setValue(1);
           Modelo.Busqueda.initCausas();
           label.setText("Causas Cargadas..");
          // barra.setValue(barra.getValue()+1);
           Modelo.Busqueda.initFacturas();
           label.setText("Facturas Cargadas..");
          // barra.setValue(barra.getValue()+1);
           Modelo.Busqueda.initProductos();
           label.setText("Productos Cargados..");
          // barra.setValue(barra.getValue()+1);
           Modelo.Busqueda.initProductosFac();
           label.setText("Productos Facturados Cargados..");
           //barra.setValue(barra.getValue()+1);
           Modelo.Busqueda.initRJ();
           label.setText("Recepciones Judiciales Cargadas..");
          // barra.setValue(barra.getValue()+1);
           Modelo.Busqueda.initRV();
           label.setText("Recepciones Voluntarias Cargadas..");
           //barra.setValue(barra.getValue()+1);
           //barra.setVisible(false);
           label.setText("Fuentes cargadas con exito!");
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Panel_Busqueda.class.getName()).log(Level.SEVERE, null, ex);
            }
            label.setText("");
           
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Bar;
    private javax.swing.JComboBox Campo;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel label;
    private javax.swing.JTextField parametro_busqueda;
    // End of variables declaration//GEN-END:variables
}
