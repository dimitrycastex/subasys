/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
        jTextField_FeIngreso = new javax.swing.JTextField();
        jButton_BuscarRec = new javax.swing.JButton();
        Label_ID = new javax.swing.JLabel();
        TextField_ID = new javax.swing.JTextField();
        jButton_Agregar = new javax.swing.JButton();
        jButton_Limpiar = new javax.swing.JButton();
        jTextField_Nombre = new javax.swing.JTextField();
        jLabel_Nombre = new javax.swing.JLabel();
        jTextField_Direccion = new javax.swing.JTextField();
        jLabel_Direccion = new javax.swing.JLabel();
        jButton_BuscarRUT = new javax.swing.JButton();
        Label_RUT = new javax.swing.JLabel();
        TextField_RUT = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel_ReVoluntaria.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel_ReVoluntaria.setText("Recepcion Voluntaria");

        jButton_ModificarRec.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_ModificarRec.setText("Modificar");

        jLabel_FeIngreso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_FeIngreso.setText("Fecha Ingreso");

        jTextField_FeIngreso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton_BuscarRec.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_BuscarRec.setText("Buscar");

        Label_ID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label_ID.setText("ID Recepción");

        TextField_ID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton_Agregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Agregar.setText("Agregar");

        jButton_Limpiar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Limpiar.setText("Limpiar Datos");

        jTextField_Nombre.setEditable(false);
        jTextField_Nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel_Nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Nombre.setText("Nombre");

        jTextField_Direccion.setEditable(false);
        jTextField_Direccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel_Direccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Direccion.setText("Dirección");

        jButton_BuscarRUT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_BuscarRUT.setText("Buscar");

        Label_RUT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label_RUT.setText("RUT");

        TextField_RUT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ReVoluntaria)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_Nombre)
                        .addComponent(jTextField_Nombre)
                        .addComponent(jTextField_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_Direccion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_RUT)
                        .addGap(18, 18, 18)
                        .addComponent(TextField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton_BuscarRUT)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Agregar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel_FeIngreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_FeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Label_ID)
                                .addGap(18, 18, 18)
                                .addComponent(TextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addComponent(jButton_BuscarRec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_ModificarRec)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ReVoluntaria)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Label_ID))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_BuscarRec)
                        .addComponent(jButton_ModificarRec)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_FeIngreso)
                    .addComponent(jTextField_FeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Label_RUT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TextField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_BuscarRUT)
                        .addComponent(jButton_Agregar)
                        .addComponent(jButton_Limpiar)))
                .addGap(18, 18, 18)
                .addComponent(jLabel_Nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Direccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_ID;
    private javax.swing.JLabel Label_RUT;
    private javax.swing.JTextField TextField_ID;
    private javax.swing.JTextField TextField_RUT;
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_BuscarRUT;
    private javax.swing.JButton jButton_BuscarRec;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JButton jButton_ModificarRec;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_FeIngreso;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_ReVoluntaria;
    private javax.swing.JTextField jTextField_Direccion;
    private javax.swing.JTextField jTextField_FeIngreso;
    private javax.swing.JTextField jTextField_Nombre;
    // End of variables declaration//GEN-END:variables
}
