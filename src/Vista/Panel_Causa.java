/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author bastian
 */
public class Panel_Causa extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Causa
     */
    public Panel_Causa() {
        initComponents();
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
        TextField_ROL = new javax.swing.JTextField();
        jButton_ModificarROL = new javax.swing.JButton();
        Label_ROL = new javax.swing.JLabel();
        jButton_BuscarROL = new javax.swing.JButton();
        jButton_BuscarID = new javax.swing.JButton();
        Label_ID = new javax.swing.JLabel();
        TextField_ID = new javax.swing.JTextField();
        Label_Receptor = new javax.swing.JLabel();
        TextField_Receptor = new javax.swing.JTextField();
        Label_Abogado = new javax.swing.JLabel();
        TextField_Abogado = new javax.swing.JTextField();
        Label_Juzgado = new javax.swing.JLabel();
        TextField_Juzgado = new javax.swing.JTextField();
        TextField_Caratulado = new javax.swing.JTextField();
        Label_Caratulado = new javax.swing.JLabel();

        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));

        jLabel_Causa.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel_Causa.setText("Causa");

        TextField_ROL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton_ModificarROL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_ModificarROL.setText("Modificar");

        Label_ROL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label_ROL.setText("ROL");

        jButton_BuscarROL.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_BuscarROL.setText("Buscar");

        jButton_BuscarID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_BuscarID.setText("Buscar");

        Label_ID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label_ID.setText("ID Recepcion");

        TextField_ID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        Label_Receptor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label_Receptor.setText("Receptor");

        TextField_Receptor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        Label_Abogado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label_Abogado.setText("Abogado");

        TextField_Abogado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        Label_Juzgado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label_Juzgado.setText("Juzgado");

        TextField_Juzgado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        TextField_Caratulado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        Label_Caratulado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label_Caratulado.setText("Caratulado como");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Causa)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_ID)
                            .addComponent(Label_ROL))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextField_ROL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_BuscarROL)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_ModificarROL))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_BuscarID))))
                    .addComponent(Label_Receptor)
                    .addComponent(Label_Abogado)
                    .addComponent(TextField_Receptor)
                    .addComponent(TextField_Abogado)
                    .addComponent(TextField_Juzgado)
                    .addComponent(Label_Juzgado)
                    .addComponent(Label_Caratulado)
                    .addComponent(TextField_Caratulado))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Causa)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_ROL)
                    .addComponent(TextField_ROL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_BuscarROL)
                    .addComponent(jButton_ModificarROL))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Label_ID))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_BuscarID)))
                .addGap(20, 20, 20)
                .addComponent(Label_Receptor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_Receptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_Abogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_Abogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Juzgado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_Juzgado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_Caratulado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_Caratulado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Abogado;
    private javax.swing.JLabel Label_Caratulado;
    private javax.swing.JLabel Label_ID;
    private javax.swing.JLabel Label_Juzgado;
    private javax.swing.JLabel Label_ROL;
    private javax.swing.JLabel Label_Receptor;
    private javax.swing.JTextField TextField_Abogado;
    private javax.swing.JTextField TextField_Caratulado;
    private javax.swing.JTextField TextField_ID;
    private javax.swing.JTextField TextField_Juzgado;
    private javax.swing.JTextField TextField_ROL;
    private javax.swing.JTextField TextField_Receptor;
    private javax.swing.JButton jButton_BuscarID;
    private javax.swing.JButton jButton_BuscarROL;
    private javax.swing.JButton jButton_ModificarROL;
    private javax.swing.JLabel jLabel_Causa;
    // End of variables declaration//GEN-END:variables
}
