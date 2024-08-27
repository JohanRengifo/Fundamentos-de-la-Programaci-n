package vistas;
// Importaciones
import javax.swing.JOptionPane;
import modelos.Conductor; // Importe del Modelo
import modelos.Taxi;
import modelos.taxi; // Importe del Modelo

public class Ventana extends javax.swing.JFrame {

    // Definición del Objeto
    Conductor conductor; 
    Taxi taxi;
    
    public Ventana() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Img_Tx = new javax.swing.JLabel();
        Lbl_Empresa_Tx = new javax.swing.JLabel();
        Lbl_Telefono_Tx = new javax.swing.JLabel();
        Lbl_Conductor_Tx = new javax.swing.JLabel();
        Tf_Empresa_Tx = new javax.swing.JTextField();
        Btn_Registrar_Taxi = new javax.swing.JButton();
        Tf_Telefono_Tx = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Img_Cn = new javax.swing.JLabel();
        Lbl_Nombre_Cn = new javax.swing.JLabel();
        Lbl_Apellido_Cn = new javax.swing.JLabel();
        Lbl_Licencia_Cn = new javax.swing.JLabel();
        Tf_Nombre_Cn = new javax.swing.JTextField();
        Tf_Apellido_Cn = new javax.swing.JTextField();
        Btn_Licencia_Activa_Cn = new javax.swing.JRadioButton();
        Tf_Celular_Cn = new javax.swing.JTextField();
        Lbl_Celular_Cn = new javax.swing.JLabel();
        Btn_Registrar_Cn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relacion de Clases");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Taxi"));

        Img_Tx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taxi-ezgif.com-resize.gif"))); // NOI18N

        Lbl_Empresa_Tx.setText("Empresa:");

        Lbl_Telefono_Tx.setText("Telefono");

        Lbl_Conductor_Tx.setText("Conductor: ");

        Tf_Empresa_Tx.setText("Peluches Empresa");

        Btn_Registrar_Taxi.setBackground(new java.awt.Color(255, 153, 51));
        Btn_Registrar_Taxi.setText("Registrar Taxi");
        Btn_Registrar_Taxi.setEnabled(false);
        Btn_Registrar_Taxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Registrar_TaxiActionPerformed(evt);
            }
        });

        Tf_Telefono_Tx.setText("3101231234");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(Img_Tx, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Conductor_Tx)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbl_Telefono_Tx)
                            .addComponent(Lbl_Empresa_Tx))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_Registrar_Taxi)
                            .addComponent(Tf_Empresa_Tx, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(Tf_Telefono_Tx))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Img_Tx, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Empresa_Tx)
                    .addComponent(Tf_Empresa_Tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Telefono_Tx)
                    .addComponent(Tf_Telefono_Tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbl_Conductor_Tx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Registrar_Taxi)
                .addGap(21, 21, 21))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Conductor"));

        Img_Cn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Conductor-ezgif.com-resize.png"))); // NOI18N
        Img_Cn.setText("jLabel3");

        Lbl_Nombre_Cn.setText("Nombre:");

        Lbl_Apellido_Cn.setText("Apellido:");

        Lbl_Licencia_Cn.setText("Licencia:");

        Tf_Nombre_Cn.setText("Lulo Santiago");

        Tf_Apellido_Cn.setText("Suares Restrepo");

        Btn_Licencia_Activa_Cn.setText("Activo");

        Tf_Celular_Cn.setText("3101231234");

        Lbl_Celular_Cn.setText("Celular: ");

        Btn_Registrar_Cn.setBackground(new java.awt.Color(0, 255, 102));
        Btn_Registrar_Cn.setText("Registrar");
        Btn_Registrar_Cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Registrar_CnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Img_Cn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lbl_Celular_Cn)
                                .addGap(18, 18, 18)
                                .addComponent(Tf_Celular_Cn))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lbl_Licencia_Cn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Licencia_Activa_Cn))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lbl_Apellido_Cn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tf_Apellido_Cn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lbl_Nombre_Cn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tf_Nombre_Cn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(Btn_Registrar_Cn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Img_Cn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Nombre_Cn)
                    .addComponent(Tf_Nombre_Cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Apellido_Cn)
                    .addComponent(Tf_Apellido_Cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Celular_Cn)
                    .addComponent(Tf_Celular_Cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Licencia_Cn)
                    .addComponent(Btn_Licencia_Activa_Cn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Registrar_Cn)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Empresa", jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 255, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Agregación", jPanel7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Composición", jPanel5);

        jLabel1.setText("Empresa Peluche");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton Registrar Conductor
    private void Btn_Registrar_CnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Registrar_CnActionPerformed
        // Definicion del Objeto
        conductor = new Conductor();
        
        // Establecemos los Datos a recopilar
        conductor.setNombre(Tf_Nombre_Cn.getText());
        conductor.setApellido(Tf_Apellido_Cn.getText());
       
        // Boton de Actividad
        if(Btn_Licencia_Activa_Cn.isSelected()){
            conductor.setLicencia(true);
        }else{
            conductor.setLicencia(false);
        }
        
        // Mostramos Mensaje Confirmación
        JOptionPane.showMessageDialog(null, "Registrado el Conductor");
        
        // Imprimimos Datos Registrados
        Lbl_Conductor_Tx.setText("Conductor: "+ conductor.getNombre() + " " + conductor.getApellido());
        
        // Habilitamos el Btn
        Btn_Registrar_Taxi.setEnabled(true);
    }//GEN-LAST:event_Btn_Registrar_CnActionPerformed

    private void Btn_Registrar_TaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Registrar_TaxiActionPerformed
        // Definicion del Objeto
        taxi = new Taxi(Tf_Empresa_Tx.getText(), Tf_Telefono_Tx.getText(), conductor);
        
        // Mostramos Mensaje Confirmación
        JOptionPane.showMessageDialog(null, "Registrado el Taxi");
    }//GEN-LAST:event_Btn_Registrar_TaxiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Btn_Licencia_Activa_Cn;
    private javax.swing.JButton Btn_Registrar_Cn;
    private javax.swing.JButton Btn_Registrar_Taxi;
    private javax.swing.JLabel Img_Cn;
    private javax.swing.JLabel Img_Tx;
    private javax.swing.JLabel Lbl_Apellido_Cn;
    private javax.swing.JLabel Lbl_Celular_Cn;
    private javax.swing.JLabel Lbl_Conductor_Tx;
    private javax.swing.JLabel Lbl_Empresa_Tx;
    private javax.swing.JLabel Lbl_Licencia_Cn;
    private javax.swing.JLabel Lbl_Nombre_Cn;
    private javax.swing.JLabel Lbl_Telefono_Tx;
    private javax.swing.JTextField Tf_Apellido_Cn;
    private javax.swing.JTextField Tf_Celular_Cn;
    private javax.swing.JTextField Tf_Empresa_Tx;
    private javax.swing.JTextField Tf_Nombre_Cn;
    private javax.swing.JTextField Tf_Telefono_Tx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
