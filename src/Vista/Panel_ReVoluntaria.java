/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author bastian
 */
public class Panel_ReVoluntaria extends javax.swing.JPanel {

    /**
     * Creates new form Panel_ReJudicial
     */
    public Panel_ReVoluntaria() {
        initComponents();
    }
    
    private VentanaPrincipal V_Principal;
    
    public void setFrame(JFrame f){
        this.V_Principal= (VentanaPrincipal) f;
    }
    
    private void Limpiar(){
        this.TextField_ID.setText("");
        this.TextField_RUT.setText("");
        this.jTextField_Nombre.setText("");
        this.jTextField_Direccion.setText("");
        this.jDateChooser_Fecha.setDate(null);
    }
    
    public ArrayList getDatos(){
        ArrayList datos = new ArrayList();
        
        datos.add(this.TextField_ID.getText());
        datos.add(this.jDateChooser_Fecha.getDate());
        datos.add(this.jTextField_Direccion.getText());
        datos.add(this.jTextField_Nombre.getText());
        
        return datos;
    }
    
    protected void ReVoluntariaNueva(boolean b){
        this.Limpiar();
        this.TextField_ID.setEditable(!b);
        this.jButton_BuscarRec.setEnabled(!b);
        this.jButton_ModificarRec.setEnabled(!b);
        this.TextField_RUT.setEditable(b);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_ReVoluntaria = new javax.swing.JLabel();
        jButton_ModificarRec = new javax.swing.JButton();
        jLabel_FeIngreso = new javax.swing.JLabel();
        jButton_BuscarRec = new javax.swing.JButton();
        Label_ID = new javax.swing.JLabel();
        TextField_ID = new javax.swing.JTextField();
        jButton_Agregar = new javax.swing.JButton();
        jTextField_Nombre = new javax.swing.JTextField();
        jLabel_Nombre = new javax.swing.JLabel();
        jTextField_Direccion = new javax.swing.JTextField();
        jLabel_Direccion = new javax.swing.JLabel();
        jButton_BuscarRUT = new javax.swing.JButton();
        Label_RUT = new javax.swing.JLabel();
        TextField_RUT = new javax.swing.JTextField();
        jButton_Aceptar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jDateChooser_Fecha = new com.toedter.calendar.JDateChooser();

        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        jLabel_ReVoluntaria.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_ReVoluntaria.setText("Recepcion Voluntaria");

        jButton_ModificarRec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_ModificarRec.setText("Modificar");

        jLabel_FeIngreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_FeIngreso.setText("Fecha Ingreso");

        jButton_BuscarRec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_BuscarRec.setText("Buscar");

        Label_ID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_ID.setText("ID Recepción");

        TextField_ID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextField_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_IDKeyTyped(evt);
            }
        });

        jButton_Agregar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Agregar.setText("Agregar");

        jTextField_Nombre.setEditable(false);
        jTextField_Nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel_Nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Nombre.setText("Nombre");

        jTextField_Direccion.setEditable(false);
        jTextField_Direccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel_Direccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Direccion.setText("Dirección");

        jButton_BuscarRUT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_BuscarRUT.setText("Buscar");

        Label_RUT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_RUT.setText("RUT");

        TextField_RUT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextField_RUT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_RUTKeyTyped(evt);
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

        jDateChooser_Fecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDateChooser_Fecha.setMaxSelectableDate(new java.util.Date(253370779303000L));
        jDateChooser_Fecha.setMinSelectableDate(new java.util.Date(1262318503000L));
        jDateChooser_Fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooser_FechaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel_ReVoluntaria)
                .addGap(652, 652, 652))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Aceptar)
                        .addGap(9, 9, 9)
                        .addComponent(jButton_Cancelar)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_FeIngreso)
                                .addGap(10, 10, 10)
                                .addComponent(jDateChooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_ID)
                                .addGap(18, 18, 18)
                                .addComponent(TextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_Nombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_RUT)
                                        .addComponent(jLabel_Direccion))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TextField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton_BuscarRUT)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(jButton_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton_BuscarRec)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton_ModificarRec))))))))
                        .addGap(191, 191, 191))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel_ReVoluntaria)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Label_ID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_BuscarRec)
                            .addComponent(jButton_ModificarRec)
                            .addComponent(TextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_FeIngreso)
                            .addComponent(jDateChooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButton_BuscarRUT)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Label_RUT)
                                    .addComponent(TextField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButton_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Direccion)
                    .addComponent(jTextField_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Aceptar)
                    .addComponent(jButton_Cancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AceptarActionPerformed
        // TODO add your handling code here:
        //ENVIAR INFORMACION
    }//GEN-LAST:event_jButton_AceptarActionPerformed

    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
        // TODO add your handling code here:
        this.Limpiar();
        V_Principal.removePanel_ReVoluntaria();
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    private void TextField_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_IDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c) || this.TextField_ID.getText().length()>10){
            evt.consume();
        }
    }//GEN-LAST:event_TextField_IDKeyTyped

    private void TextField_RUTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_RUTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_RUTKeyTyped

    private void jDateChooser_FechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser_FechaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '-') {
            evt.consume();
        }
    }//GEN-LAST:event_jDateChooser_FechaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_ID;
    private javax.swing.JLabel Label_RUT;
    private javax.swing.JTextField TextField_ID;
    private javax.swing.JTextField TextField_RUT;
    private javax.swing.JButton jButton_Aceptar;
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_BuscarRUT;
    private javax.swing.JButton jButton_BuscarRec;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_ModificarRec;
    private com.toedter.calendar.JDateChooser jDateChooser_Fecha;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_FeIngreso;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_ReVoluntaria;
    private javax.swing.JTextField jTextField_Direccion;
    private javax.swing.JTextField jTextField_Nombre;
    // End of variables declaration//GEN-END:variables
}
