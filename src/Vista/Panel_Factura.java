/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bastian
 */
public class Panel_Factura extends javax.swing.JPanel {

    /**
     * Creates new form Factura
     */
    public Panel_Factura() {
        initComponents();
    }
    
    private VentanaPrincipal V_Principal;
    
    public void setFrame(JFrame f){
        this.V_Principal= (VentanaPrincipal) f;
    }
    
    private void Limpiar(){
        this.jTextField_RUT.setText("");
        this.jTextField_Nombre.setText("");
        this.jTextField_Garantia.setText("");
        this.jTextField_IVAPorcentaje.setText("");
        this.jDateChooser_Fecha.setDate(null);
        this.jCheckBox_Demandante.setSelected(false);
        this.jCheckBox_Exenta.setSelected(false);
        this.jTextField_Comision.setText("");
        this.jTextField_IVAPesos.setText("");
        this.jTextField_Subtotal.setText("");
        this.jTextField_Total.setText("");
    }
    
    protected void FacturaNueva(boolean b){
        this.Limpiar();
        //this.llenatabla();
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Causa = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Buscar = new javax.swing.JButton();
        Label_Nombre = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jLabel_RUT = new javax.swing.JLabel();
        jTextField_RUT = new javax.swing.JTextField();
        jCheckBox_Demandante = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jTextField_Garantia = new javax.swing.JTextField();
        jLabel_Garantia = new javax.swing.JLabel();
        jLabel_IVAPorcentaje = new javax.swing.JLabel();
        jTextField_IVAPorcentaje = new javax.swing.JTextField();
        jCheckBox_Exenta = new javax.swing.JCheckBox();
        jLabel_Fecha = new javax.swing.JLabel();
        jDateChooser_Fecha = new com.toedter.calendar.JDateChooser();
        jLabel_Subtotal = new javax.swing.JLabel();
        jLabel_Comision = new javax.swing.JLabel();
        jLabel_IVAPesos = new javax.swing.JLabel();
        jLabel_Total = new javax.swing.JLabel();
        jTextField_Subtotal = new javax.swing.JTextField();
        jTextField_Comision = new javax.swing.JTextField();
        jTextField_IVAPesos = new javax.swing.JTextField();
        jTextField_Total = new javax.swing.JTextField();
        jButton_EliminarProductos = new javax.swing.JButton();
        jButton_Aceptar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jLabel_ListaProductos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane(tabla_Producto1);
        tabla_Producto1 = new Vista.Tablas.Tabla_Producto();
        jButton_AgregarProductos = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        jLabel_Causa.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_Causa.setText("Factura");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_Modificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Modificar.setText("Crear Cliente");
        jButton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarActionPerformed(evt);
            }
        });

        jButton_Buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Buscar.setText("Buscar Cliente");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        Label_Nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_Nombre.setText("Nombre");

        jTextField_Nombre.setEditable(false);
        jTextField_Nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NombreKeyTyped(evt);
            }
        });

        jLabel_RUT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_RUT.setText("RUT");

        jTextField_RUT.setEditable(false);
        jTextField_RUT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jCheckBox_Demandante.setText("Demandante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Nombre)
                    .addComponent(jLabel_RUT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox_Demandante))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_RUT)
                    .addComponent(jButton_Buscar)
                    .addComponent(jButton_Modificar)
                    .addComponent(jTextField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Nombre)
                    .addComponent(jCheckBox_Demandante))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_Garantia.setEditable(false);
        jTextField_Garantia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Garantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_GarantiaKeyTyped(evt);
            }
        });

        jLabel_Garantia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Garantia.setText("Garantía");

        jLabel_IVAPorcentaje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_IVAPorcentaje.setText("IVA (%)");

        jTextField_IVAPorcentaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_IVAPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_IVAPorcentajeKeyTyped(evt);
            }
        });

        jCheckBox_Exenta.setText("Exenta");

        jLabel_Fecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Fecha.setText("Fecha");

        jDateChooser_Fecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDateChooser_Fecha.setMaxSelectableDate(new java.util.Date(253370779303000L));
        jDateChooser_Fecha.setMinSelectableDate(new java.util.Date(1262318503000L));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Garantia)
                    .addComponent(jLabel_IVAPorcentaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Garantia, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_IVAPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox_Exenta)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Fecha)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateChooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Garantia)
                            .addComponent(jTextField_Garantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Fecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_IVAPorcentaje)
                            .addComponent(jTextField_IVAPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_Exenta))))
                .addContainerGap())
        );

        jLabel_Subtotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Subtotal.setText("Subtotal");

        jLabel_Comision.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Comision.setText("Comisión 10%");

        jLabel_IVAPesos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_IVAPesos.setText("IVA");

        jLabel_Total.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Total.setText("Precio Total");

        jTextField_Subtotal.setEditable(false);

        jTextField_Comision.setEditable(false);

        jTextField_IVAPesos.setEditable(false);

        jTextField_Total.setEditable(false);

        jButton_EliminarProductos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_EliminarProductos.setText("Eliminar productos seleccionados");
        jButton_EliminarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarProductosActionPerformed(evt);
            }
        });

        jButton_Aceptar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Aceptar.setText("Aceptar");
        jButton_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AceptarActionPerformed(evt);
            }
        });

        jButton_Cancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Cancelar.setText("Cancelar");
        jButton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelarActionPerformed(evt);
            }
        });

        jLabel_ListaProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_ListaProductos.setText("Lista de Productos");

        jScrollPane1.setViewportView(tabla_Producto1);

        jButton_AgregarProductos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_AgregarProductos.setText("Agregar Productos");
        jButton_AgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel_Causa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton_AgregarProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_EliminarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Comision)
                            .addComponent(jLabel_Subtotal))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jTextField_Comision))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_IVAPesos)
                            .addComponent(jLabel_Total))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_IVAPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_ListaProductos)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Aceptar)
                .addGap(6, 6, 6)
                .addComponent(jButton_Cancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel_Causa)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_ListaProductos)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField_Comision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField_Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel_IVAPesos)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel_Total))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_IVAPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton_EliminarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_AgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Comision)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel_Subtotal)))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Aceptar)
                    .addComponent(jButton_Cancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((!Character.isWhitespace(c)
                && !Character.isLetter(c)) || this.jTextField_Nombre.getText().length() > 50) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_NombreKeyTyped

    private void jTextField_GarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_GarantiaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || this.jTextField_Garantia.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_GarantiaKeyTyped

    private void jTextField_IVAPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_IVAPorcentajeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IVAPorcentajeKeyTyped

    private void jButton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AceptarActionPerformed
        // TODO add your handling code here:
        //ENVIAR INFORMACION
    }//GEN-LAST:event_jButton_AceptarActionPerformed

    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
        // TODO add your handling code here:
        //this.Limpiar();
        V_Principal.removePanel_Factura();
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    private void jButton_EliminarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarProductosActionPerformed
        // TODO add your handling code here:
        
        if(this.tabla_Producto1.getCantidadProductos()==0){
            JOptionPane.showMessageDialog(V_Principal, "¡No hay productos en la lista!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int  x = JOptionPane.showConfirmDialog(V_Principal, "¿Desea borrar los productos seleccionados?", "Eliminar Produtod", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        //x=0 --> si | x=1 --> no
        
        if(x==0){
            this.tabla_Producto1.BorraProductos();
            this.tabla_Producto1.repaint();
        }
    }//GEN-LAST:event_jButton_EliminarProductosActionPerformed

    private void jButton_AgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarProductosActionPerformed
        // TODO add your handling code here:
        
        /*ESTE METODO DEBE ABRIR OTRA PESATAÑA PARA BUSCAR PRODUCTOS, MIENTRAS 
         * LA PESTAÑA CON ESTE PANEL SE MANTIENE
         ABIERTA PERO DESHABILITADA*/
        
        /*A MEDIDA QUE SE AGREGAN PRODUTOS TIENEN QUE CALCULARSE LOS VALORES
         DE COMISION, IVA, SUBTOTAL Y PRECIO TOTAL
         */
        V_Principal.addPanel_BuscaProducto(1);
    }//GEN-LAST:event_jButton_AgregarProductosActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        // TODO add your handling code here:
        /*SE DEBE ABRIR UNA PESTAÑA DE BUSQUEDA DE CLIENTES, MIENTRAS ESTE PANEL
         PERMANECE ABIERTO PERO DESHABILITADO*/
        V_Principal.addPanel_BuscaCliente(2);
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jButton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarActionPerformed
        // TODO add your handling code here:
        /*SE DEBE ABRIR UNA PESTAÑA DE CREAR CLIENTE, MIENTRAS ESTE PANEL PERMANECE
         ABIERTO PERO DESHABILITADO*/
        V_Principal.addPanel_Cliente(true,2);
    }//GEN-LAST:event_jButton_ModificarActionPerformed

    protected void llenatabla(){
        tabla_Producto1.AgregaProductos();
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Nombre;
    private javax.swing.JButton jButton_Aceptar;
    private javax.swing.JButton jButton_AgregarProductos;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_EliminarProductos;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JCheckBox jCheckBox_Demandante;
    private javax.swing.JCheckBox jCheckBox_Exenta;
    private com.toedter.calendar.JDateChooser jDateChooser_Fecha;
    private javax.swing.JLabel jLabel_Causa;
    private javax.swing.JLabel jLabel_Comision;
    private javax.swing.JLabel jLabel_Fecha;
    private javax.swing.JLabel jLabel_Garantia;
    private javax.swing.JLabel jLabel_IVAPesos;
    private javax.swing.JLabel jLabel_IVAPorcentaje;
    private javax.swing.JLabel jLabel_ListaProductos;
    private javax.swing.JLabel jLabel_RUT;
    private javax.swing.JLabel jLabel_Subtotal;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    protected javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_Comision;
    private javax.swing.JTextField jTextField_Garantia;
    private javax.swing.JTextField jTextField_IVAPesos;
    private javax.swing.JTextField jTextField_IVAPorcentaje;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_RUT;
    private javax.swing.JTextField jTextField_Subtotal;
    private javax.swing.JTextField jTextField_Total;
    private Vista.Tablas.Tabla_Producto tabla_Producto1;
    // End of variables declaration//GEN-END:variables
}
