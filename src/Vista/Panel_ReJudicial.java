/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author bastian
 */
public class Panel_ReJudicial extends javax.swing.JPanel {

    /**
     * Creates new form Panel_ReJudicial
     */
    public Panel_ReJudicial() {
        initComponents();
    }
    
    private VentanaPrincipal V_Principal;
    
    public void setFrame(JFrame f){
        this.V_Principal= (VentanaPrincipal) f;
    }
    
    private void Limpiar(){
        this.TextField_ID.setText("");
        this.jTextField_Bodegaje.setText("");
        this.jTextField_Demandado.setText("");
        this.jTextField_Demandante.setText("");
        this.jDateChooser_FeDevolucion.setDate(null);
        this.jDateChooser_FeIngreso.setDate(null);
    
    }
    
    public ArrayList getDatos(){
        ArrayList datos = new ArrayList();
        
        datos.add(this.TextField_ID.getText());
        datos.add(this.jDateChooser_FeIngreso.getDate());
        datos.add(this.jDateChooser_FeDevolucion.getDate());
        datos.add(this.jTextField_Demandante.getText());
        datos.add(this.jTextField_Demandado.getText());
        datos.add(this.jTextField_Bodegaje.getText());
        
        return datos;
    }
    
    protected void ReJudicialNueva(boolean b){
        this.Limpiar();
        this.jButton_Buscar.setEnabled(!b);
        this.jButton_Modificar.setEnabled(!b);
        this.TextField_ID.setEditable(!b);
        
        this.jDateChooser_FeIngreso.setEnabled(b);
        this.jDateChooser_FeDevolucion.setEnabled(b);
        this.jTextField_Bodegaje.setEditable(b);
        this.jTextField_Demandante.setEditable(b);
        this.jTextField_Demandado.setEditable(b);
        
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton_Modificar = new javax.swing.JButton();
        jLabel_FeIngreso = new javax.swing.JLabel();
        jLabel_FeDevolucion = new javax.swing.JLabel();
        jTextField_Demandante = new javax.swing.JTextField();
        jLabel_Demandante = new javax.swing.JLabel();
        jTextField_Demandado = new javax.swing.JTextField();
        jLabel_Demandado = new javax.swing.JLabel();
        jLabel_Bodegaje = new javax.swing.JLabel();
        jTextField_Bodegaje = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        Label_ID = new javax.swing.JLabel();
        TextField_ID = new javax.swing.JTextField();
        jButton_Cancelar = new javax.swing.JButton();
        jButton_Aceptar = new javax.swing.JButton();
        jDateChooser_FeIngreso = new com.toedter.calendar.JDateChooser();
        jDateChooser_FeDevolucion = new com.toedter.calendar.JDateChooser();

        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Recepcion Judicial");

        jButton_Modificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Modificar.setText("Modificar");

        jLabel_FeIngreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_FeIngreso.setText("Fecha Ingreso");

        jLabel_FeDevolucion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_FeDevolucion.setText("Fecha Devolución");

        jTextField_Demandante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Demandante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_DemandanteKeyTyped(evt);
            }
        });

        jLabel_Demandante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Demandante.setText("Demandante");

        jTextField_Demandado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Demandado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_DemandadoKeyTyped(evt);
            }
        });

        jLabel_Demandado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Demandado.setText("Demandado");

        jLabel_Bodegaje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_Bodegaje.setText("Bodegaje Pagado ($)");

        jTextField_Bodegaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Bodegaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_BodegajeKeyTyped(evt);
            }
        });

        jButton_Buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Buscar.setText("Buscar");

        Label_ID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_ID.setText("ID Recepción");

        TextField_ID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextField_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextField_IDKeyTyped(evt);
            }
        });

        jButton_Cancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Cancelar.setText("Cancelar");
        jButton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelarActionPerformed(evt);
            }
        });

        jButton_Aceptar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Aceptar.setText("Aceptar");
        jButton_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AceptarActionPerformed(evt);
            }
        });

        jDateChooser_FeIngreso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDateChooser_FeIngreso.setMaxSelectableDate(new java.util.Date(253370779303000L));
        jDateChooser_FeIngreso.setMinSelectableDate(new java.util.Date(1262318503000L));

        jDateChooser_FeDevolucion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jDateChooser_FeDevolucion.setMaxSelectableDate(new java.util.Date(253370779303000L));
        jDateChooser_FeDevolucion.setMinSelectableDate(new java.util.Date(1262318503000L));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_Demandante)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_FeIngreso)
                                            .addComponent(jDateChooser_FeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel_FeDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDateChooser_FeDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel_Bodegaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField_Bodegaje, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Label_ID)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Buscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Modificar))
                                    .addComponent(jLabel_Demandado)
                                    .addComponent(jTextField_Demandante)
                                    .addComponent(jTextField_Demandado))))
                        .addGap(0, 298, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Label_ID))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Buscar)
                        .addComponent(jButton_Modificar)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Bodegaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Bodegaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_FeIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser_FeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_FeDevolucion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser_FeDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jLabel_Demandante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Demandante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel_Demandado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Demandado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Aceptar)
                    .addComponent(jButton_Cancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
        // TODO add your handling code here:
        this.Limpiar();
        V_Principal.removePanel_ReJudicial();
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    private void jButton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AceptarActionPerformed
        // TODO add your handling code here:
        //ENVIAR INFORMACION
    }//GEN-LAST:event_jButton_AceptarActionPerformed

    private void TextField_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_IDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c) || this.TextField_ID.getText().length()>10){
            evt.consume();
        }
    }//GEN-LAST:event_TextField_IDKeyTyped

    private void jTextField_DemandanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DemandanteKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if( (!Character.isWhitespace(c) &&
                !Character.isLetter(c) )|| this.jTextField_Demandante.getText().length()>100){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_DemandanteKeyTyped

    private void jTextField_DemandadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DemandadoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if( (!Character.isWhitespace(c) &&
                !Character.isLetter(c) )|| this.jTextField_Demandado.getText().length()>100){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_DemandadoKeyTyped

    private void jTextField_BodegajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_BodegajeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || this.jTextField_Bodegaje.getText().length()>10){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_BodegajeKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_ID;
    private javax.swing.JTextField TextField_ID;
    private javax.swing.JButton jButton_Aceptar;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Modificar;
    private com.toedter.calendar.JDateChooser jDateChooser_FeDevolucion;
    private com.toedter.calendar.JDateChooser jDateChooser_FeIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Bodegaje;
    private javax.swing.JLabel jLabel_Demandado;
    private javax.swing.JLabel jLabel_Demandante;
    private javax.swing.JLabel jLabel_FeDevolucion;
    private javax.swing.JLabel jLabel_FeIngreso;
    private javax.swing.JTextField jTextField_Bodegaje;
    private javax.swing.JTextField jTextField_Demandado;
    private javax.swing.JTextField jTextField_Demandante;
    // End of variables declaration//GEN-END:variables
}
