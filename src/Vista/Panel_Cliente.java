/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Validacion.ValidaCliente;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Modelo.Cliente;

/**
 *
 * @author bastian
 */
public class Panel_Cliente extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Cliente
     */
    public Panel_Cliente() {
        initComponents();
    }
    
    
    private VentanaPrincipal V_Principal;
    private ValidaCliente validador;
    private boolean desdePrincipal, desdeFactura, nuevo;
    
    public void setFrame(JFrame f){
        this.V_Principal= (VentanaPrincipal) f;
        this.validador = new ValidaCliente();
        desdePrincipal = false;
        desdeFactura = false;
    }
    
    public ArrayList getDatos(){
        ArrayList Datos = new ArrayList();
        
        Datos.add(this.jTextField_RUT.getText());
        Datos.add(this.jTextField_ApPaterno.getText());
        Datos.add(this.jTextField_ApMaterno.getText());
        Datos.add(this.jTextField_Nombre.getText());
        Datos.add(this.jTextField_Email.getText());
        Datos.add(this.jTextField_Web.getText());
        Datos.add(this.jTextField_Telefono.getText());
        Datos.add(this.jTextField_CodPostal.getText());
        Datos.add(this.jTextField_Direccion.getText());
        Datos.add(this.jTextField_Ciudad.getText());
        Datos.add(this.jTextField_Comuna.getText());
        return Datos;
    }
    
    private void Limpiar(){
        this.jTextField_RUT.setText("");
        this.jTextField_ApMaterno.setText("");
        this.jTextField_ApPaterno.setText("");
        this.jTextField_Nombre.setText("");
        this.jTextField_Email.setText("");
        this.jTextField_Web.setText("");
        this.jTextField_Telefono.setText("");
        this.jTextField_CodPostal.setText("");
        this.jTextField_Direccion.setText("");
        this.jTextField_Ciudad.setText("");
        this.jTextField_Comuna.setText("");
        this.jRadioButton_CodPostal.setSelected(false);
        this.jRadioButton_Email.setSelected(false);
        this.jRadioButton_Web.setSelected(false);
    
    }
    
    protected void ClienteNuevo(boolean b){
        this.Limpiar();
        this.nuevo=b;
        this.jButton_Modificar.setVisible(!b);
        this.jButton_Buscar.setVisible(!b);
        this.jTextField_RUT.setEditable(b);
        this.jTextField_Nombre.setEditable(b);
        this.jTextField_ApPaterno.setEditable(b);
        this.jTextField_ApMaterno.setEditable(b);
        this.jTextField_Direccion.setEditable(b);
        this.jTextField_Ciudad.setEditable(b);
        this.jTextField_Comuna.setEditable(b);
        this.jTextField_Telefono.setEditable(b);
        this.jTextField_Email.setEditable(b);
        this.jTextField_Web.setEditable(b);
        this.jTextField_CodPostal.setEditable(b);
        this.jRadioButton_CodPostal.setEnabled(b);
        this.jRadioButton_Email.setEnabled(b);
        this.jRadioButton_Web.setEnabled(b);
    }
    
    public void esPrincipal(){
        desdePrincipal = true;
        desdeFactura = false;
    }
    
    public void esFactura(){
        desdeFactura = true;
        desdePrincipal = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Cliente = new javax.swing.JLabel();
        jLabel_RUT = new javax.swing.JLabel();
        Label_ApPaterno = new javax.swing.JLabel();
        Label_ApMaterno = new javax.swing.JLabel();
        jTextField_RUT = new javax.swing.JTextField();
        Label_Nombre = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        Label_Direccion = new javax.swing.JLabel();
        jTextField_Direccion = new javax.swing.JTextField();
        Label_CodPostal = new javax.swing.JLabel();
        Label_Web = new javax.swing.JLabel();
        jTextField_Telefono = new javax.swing.JTextField();
        Label_Email = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_ApPaterno = new javax.swing.JTextField();
        Label_Telefono = new javax.swing.JLabel();
        jTextField_Web = new javax.swing.JTextField();
        jTextField_ApMaterno = new javax.swing.JTextField();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Buscar = new javax.swing.JButton();
        jTextField_CodPostal = new javax.swing.JTextField();
        jRadioButton_Web = new javax.swing.JRadioButton();
        jRadioButton_Email = new javax.swing.JRadioButton();
        jRadioButton_CodPostal = new javax.swing.JRadioButton();
        jButton_Cancelar = new javax.swing.JButton();
        jButton_Aceptar = new javax.swing.JButton();
        Label_Ciudad = new javax.swing.JLabel();
        Label_Comuna = new javax.swing.JLabel();
        jTextField_Comuna = new javax.swing.JTextField();
        jTextField_Ciudad = new javax.swing.JTextField();

        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setName("Cliente");
        setPreferredSize(new java.awt.Dimension(1000, 550));

        Label_Cliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Label_Cliente.setText("Cliente");

        jLabel_RUT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel_RUT.setText("RUT");

        Label_ApPaterno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_ApPaterno.setText("Apellido Paterno");

        Label_ApMaterno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_ApMaterno.setText("Apellido Materno");

        jTextField_RUT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_RUT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_RUTKeyTyped(evt);
            }
        });

        Label_Nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_Nombre.setText("Nombres");

        jTextField_Nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NombreKeyTyped(evt);
            }
        });

        Label_Direccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_Direccion.setText("Dirección");

        jTextField_Direccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_DireccionKeyTyped(evt);
            }
        });

        Label_CodPostal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_CodPostal.setText("Codigo Postal");

        Label_Web.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_Web.setText("Dirección Web");

        jTextField_Telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TelefonoKeyTyped(evt);
            }
        });

        Label_Email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_Email.setText("E-Mail");

        jTextField_Email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_EmailKeyTyped(evt);
            }
        });

        jTextField_ApPaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_ApPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ApPaternoKeyTyped(evt);
            }
        });

        Label_Telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_Telefono.setText("Teléfono/Movil");

        jTextField_Web.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Web.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_WebKeyTyped(evt);
            }
        });

        jTextField_ApMaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_ApMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ApMaternoKeyTyped(evt);
            }
        });

        jButton_Modificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Modificar.setText("Modificar");

        jButton_Buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jTextField_CodPostal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_CodPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CodPostalKeyTyped(evt);
            }
        });

        jRadioButton_Web.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButton_Web.setText("No tiene");
        jRadioButton_Web.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton_WebItemStateChanged(evt);
            }
        });

        jRadioButton_Email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButton_Email.setText("No tiene");
        jRadioButton_Email.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton_EmailItemStateChanged(evt);
            }
        });

        jRadioButton_CodPostal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButton_CodPostal.setText("No tiene");
        jRadioButton_CodPostal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton_CodPostalItemStateChanged(evt);
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

        Label_Ciudad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_Ciudad.setText("Ciudad");

        Label_Comuna.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Label_Comuna.setText("Comuna");

        jTextField_Comuna.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Comuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ComunaKeyTyped(evt);
            }
        });

        jTextField_Ciudad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField_Ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CiudadKeyTyped(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Label_Cliente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_Web)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton_Web))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField_Web, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(Label_Email)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton_Email))
                                            .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Label_Direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Direccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Label_Telefono)
                                            .addComponent(jTextField_Ciudad)
                                            .addComponent(Label_Ciudad)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(Label_ApPaterno))
                                            .addComponent(jTextField_ApPaterno)
                                            .addComponent(jTextField_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(91, 91, 91)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_CodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Comuna, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Label_Comuna)
                                            .addComponent(jTextField_ApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Label_ApMaterno)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Label_CodPostal)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton_CodPostal))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_RUT)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton_Buscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton_Modificar)))))
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Label_Cliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_RUT)
                    .addComponent(jButton_Buscar)
                    .addComponent(jButton_Modificar))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Label_Direccion)
                        .addGap(16, 16, 16)
                        .addComponent(jTextField_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Email)
                            .addComponent(jRadioButton_Email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_ApPaterno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_ApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(Label_Ciudad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_ApMaterno)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_ApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Label_Comuna)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Label_CodPostal)
                                    .addComponent(jRadioButton_CodPostal))
                                .addGap(4, 4, 4)
                                .addComponent(jTextField_CodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_Telefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Web)
                    .addComponent(jRadioButton_Web))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Web, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Aceptar)
                    .addComponent(jButton_Cancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_CodPostalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton_CodPostalItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
            this.jTextField_CodPostal.setText("-");
            this.jTextField_CodPostal.setEnabled(false);
        }
        
        
        if(evt.getStateChange() == ItemEvent.DESELECTED){
            this.jTextField_CodPostal.setText("");
            this.jTextField_CodPostal.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton_CodPostalItemStateChanged

    private void jRadioButton_EmailItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton_EmailItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
            this.jTextField_Email.setText("-");
            this.jTextField_Email.setEnabled(false);
        }
        
        
        if(evt.getStateChange() == ItemEvent.DESELECTED){
            this.jTextField_Email.setText("");
            this.jTextField_Email.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton_EmailItemStateChanged

    private void jRadioButton_WebItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton_WebItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
                this.jTextField_Web.setText("-");
            this.jTextField_Web.setEnabled(false);
        }
        
        
        if(evt.getStateChange() == ItemEvent.DESELECTED){
            this.jTextField_Web.setText("");
            this.jTextField_Web.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton_WebItemStateChanged

    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
        // TODO add your handling code here:
        this.Limpiar();
        
        if(desdePrincipal){
            V_Principal.removePanel_Cliente();
            V_Principal.addPanel_Bienvenido();
        }
        
        else if(desdeFactura){
            V_Principal.removePanel_Cliente();
        }
        
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    private void jButton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AceptarActionPerformed
        // TODO add your handling code here:
        //ENVIAR INFORMACION
        boolean esValido = validador.ClienteValido(this.getDatos());
       
        if(esValido)
            JOptionPane.showMessageDialog(V_Principal, "Cliente Validado", "Información", JOptionPane.INFORMATION_MESSAGE);
        
        else
            JOptionPane.showMessageDialog(V_Principal, "Datos invalidos", "Error", JOptionPane.ERROR_MESSAGE);
        
        if(esValido && nuevo){
            Cliente.nuevo(this.getDatos());
            JOptionPane.showMessageDialog(V_Principal, "Cliente Validado", "Información", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
        else if(esValido && !nuevo){
            int opcion = JOptionPane.showConfirmDialog(V_Principal, "Está seguro de actualizar los datos del Cliente"
                    + "", "Modificar Cliente", JOptionPane.YES_NO_OPTION);
            
            if(opcion == 0){
                Cliente.setUpdate(this.getDatos());            
            }
            
        }
        
    }//GEN-LAST:event_jButton_AceptarActionPerformed

    private void jTextField_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if( (!Character.isWhitespace(c) &&
                !Character.isLetter(c) )|| this.jTextField_Nombre.getText().length()>50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_NombreKeyTyped

    private void jTextField_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TelefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || this.jTextField_Telefono.getText().length()>12){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_TelefonoKeyTyped

    private void jTextField_ApPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ApPaternoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if( (!Character.isWhitespace(c) &&
                !Character.isLetter(c) )|| this.jTextField_ApPaterno.getText().length()>25){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_ApPaternoKeyTyped

    private void jTextField_ApMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ApMaternoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if( (!Character.isWhitespace(c) &&
                !Character.isLetter(c) )|| this.jTextField_ApMaterno.getText().length()>25){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_ApMaternoKeyTyped

    private void jTextField_CodPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CodPostalKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) || this.jTextField_CodPostal.getText().length()>7){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_CodPostalKeyTyped

    private void jTextField_DireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DireccionKeyTyped
        // TODO add your handling code here:
        if(this.jTextField_Direccion.getText().length()>50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_DireccionKeyTyped

    private void jTextField_EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_EmailKeyTyped
        // TODO add your handling code here:
        if(this.jTextField_Email.getText().length()>50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_EmailKeyTyped

    private void jTextField_WebKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_WebKeyTyped
        // TODO add your handling code here:
        if(this.jTextField_Web.getText().length()>50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_WebKeyTyped

    private void jTextField_ComunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ComunaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if( (!Character.isWhitespace(c) &&
                !Character.isLetter(c) )|| this.jTextField_Comuna.getText().length()>30){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_ComunaKeyTyped

    private void jTextField_CiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CiudadKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if( (!Character.isWhitespace(c) &&
                !Character.isLetter(c) )|| this.jTextField_Ciudad.getText().length()>30){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_CiudadKeyTyped

    private void jTextField_RUTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_RUTKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if( (!Character.isDigit(c) && c!='-') || this.jTextField_CodPostal.getText().length()>10){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_RUTKeyTyped

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_BuscaCliente(1);
    }//GEN-LAST:event_jButton_BuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_ApMaterno;
    private javax.swing.JLabel Label_ApPaterno;
    private javax.swing.JLabel Label_Ciudad;
    private javax.swing.JLabel Label_Cliente;
    private javax.swing.JLabel Label_CodPostal;
    private javax.swing.JLabel Label_Comuna;
    private javax.swing.JLabel Label_Direccion;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_Nombre;
    private javax.swing.JLabel Label_Telefono;
    private javax.swing.JLabel Label_Web;
    private javax.swing.JButton jButton_Aceptar;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JLabel jLabel_RUT;
    private javax.swing.JRadioButton jRadioButton_CodPostal;
    private javax.swing.JRadioButton jRadioButton_Email;
    private javax.swing.JRadioButton jRadioButton_Web;
    private javax.swing.JTextField jTextField_ApMaterno;
    private javax.swing.JTextField jTextField_ApPaterno;
    private javax.swing.JTextField jTextField_Ciudad;
    private javax.swing.JTextField jTextField_CodPostal;
    private javax.swing.JTextField jTextField_Comuna;
    private javax.swing.JTextField jTextField_Direccion;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_RUT;
    private javax.swing.JTextField jTextField_Telefono;
    private javax.swing.JTextField jTextField_Web;
    // End of variables declaration//GEN-END:variables
}
