/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Visual;

import java.awt.Color;
import javax.swing.JOptionPane;
import model.Config;
import model.Eventos;
import model.ProductosDAO;

/**
 *
 * @author maico
 */
public class JP_Ajustes extends javax.swing.JPanel {
    Eventos event = new Eventos();
    Config conf = new Config();
    ProductosDAO proDAO = new ProductosDAO();
    /**
     * Creates new form JP_Ajustes
     */
    public JP_Ajustes() {
        initComponents();
        Jtf_id.setVisible(false);
        ListarConfig();
    }
    
    
    private void ListarConfig(){
        conf = proDAO.BuscarDatos();
        Jtf_id.setText(""+conf.getId());
        Jtf_cc.setText(""+conf.getCc());
        Jtf_nombre.setText(""+conf.getNombre());
        Jtf_telefono.setText(""+conf.getTelefono());
        Jtf_razonSocial.setText(""+conf.getRazonSocial());
        Jtf_direccion.setText(""+conf.getDireccion());
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Jlb_cc = new javax.swing.JLabel();
        Jlb_nombre = new javax.swing.JLabel();
        Jlb_razonSocial = new javax.swing.JLabel();
        Jlb_direccion = new javax.swing.JLabel();
        Jlb_telefono = new javax.swing.JLabel();
        Jbn_actualizar = new javax.swing.JButton();
        Jtf_cc = new javax.swing.JTextField();
        Jtf_nombre = new javax.swing.JTextField();
        Jtf_razonSocial = new javax.swing.JTextField();
        Jtf_direccion = new javax.swing.JTextField();
        Jtf_telefono = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Jtf_id = new javax.swing.JTextField();

        JP_BG.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/empresa.png"))); // NOI18N
        jLabel1.setText("Datos de la Empresa");

        Jlb_cc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_cc.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_cc.setText("RUC");

        Jlb_nombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_nombre.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_nombre.setText("Nombre:");

        Jlb_razonSocial.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_razonSocial.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_razonSocial.setText("Razon social:");

        Jlb_direccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_direccion.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_direccion.setText("Dirección:");

        Jlb_telefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jlb_telefono.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_telefono.setText("Telefono:");

        Jbn_actualizar.setBackground(new java.awt.Color(255, 102, 0));
        Jbn_actualizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jbn_actualizar.setForeground(new java.awt.Color(102, 102, 102));
        Jbn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_actualizar.png"))); // NOI18N
        Jbn_actualizar.setText("Actualizar datos");
        Jbn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jbn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jbn_actualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jbn_actualizarMouseExited(evt);
            }
        });
        Jbn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbn_actualizarActionPerformed(evt);
            }
        });

        Jtf_cc.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_cc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jtf_cc.setForeground(new java.awt.Color(0, 0, 0));
        Jtf_cc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtf_cc.setToolTipText("");
        Jtf_cc.setBorder(null);
        Jtf_cc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_ccKeyTyped(evt);
            }
        });

        Jtf_nombre.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_nombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jtf_nombre.setForeground(new java.awt.Color(0, 0, 0));
        Jtf_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtf_nombre.setToolTipText("");
        Jtf_nombre.setBorder(null);
        Jtf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_nombreActionPerformed(evt);
            }
        });
        Jtf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_nombreKeyTyped(evt);
            }
        });

        Jtf_razonSocial.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_razonSocial.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jtf_razonSocial.setForeground(new java.awt.Color(0, 0, 0));
        Jtf_razonSocial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtf_razonSocial.setToolTipText("");
        Jtf_razonSocial.setBorder(null);
        Jtf_razonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_razonSocialKeyTyped(evt);
            }
        });

        Jtf_direccion.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_direccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jtf_direccion.setForeground(new java.awt.Color(0, 0, 0));
        Jtf_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtf_direccion.setToolTipText("");
        Jtf_direccion.setBorder(null);

        Jtf_telefono.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_telefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jtf_telefono.setForeground(new java.awt.Color(0, 0, 0));
        Jtf_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtf_telefono.setToolTipText("");
        Jtf_telefono.setBorder(null);
        Jtf_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_telefonoKeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator4.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator5.setForeground(new java.awt.Color(255, 102, 0));

        Jtf_id.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_id.setText("1");

        javax.swing.GroupLayout JP_BGLayout = new javax.swing.GroupLayout(JP_BG);
        JP_BG.setLayout(JP_BGLayout);
        JP_BGLayout.setHorizontalGroup(
            JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BGLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(Jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JP_BGLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jtf_cc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Jlb_cc))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Jlb_direccion))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(Jlb_telefono)
                        .addContainerGap())
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator5)
                                .addComponent(Jtf_telefono)
                                .addComponent(Jtf_nombre)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JP_BGLayout.createSequentialGroup()
                                .addComponent(Jlb_nombre)
                                .addGap(66, 66, 66)))
                        .addGap(140, 174, Short.MAX_VALUE)
                        .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_BGLayout.createSequentialGroup()
                                    .addComponent(Jtf_razonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27))
                                .addGroup(JP_BGLayout.createSequentialGroup()
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_BGLayout.createSequentialGroup()
                                .addComponent(Jlb_razonSocial)
                                .addGap(75, 75, 75))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_BGLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(355, 355, 355))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_BGLayout.createSequentialGroup()
                        .addComponent(Jbn_actualizar)
                        .addGap(391, 391, 391))))
        );
        JP_BGLayout.setVerticalGroup(
            JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_BGLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addComponent(Jlb_cc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jtf_cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jlb_direccion)
                            .addComponent(Jlb_telefono)))
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jlb_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jlb_razonSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jtf_razonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addComponent(Jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_BGLayout.createSequentialGroup()
                        .addComponent(Jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(Jbn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JP_BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Jtf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_nombreActionPerformed

    private void Jbn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbn_actualizarActionPerformed
        if (!Jtf_cc.getText().isEmpty() || !Jtf_nombre.getText().isEmpty() || !Jtf_razonSocial.getText().isEmpty() || !Jtf_direccion.getText().isEmpty() || !Jtf_telefono.getText().isEmpty()) {
            conf.setCc(Jtf_cc.getText());
            conf.setNombre(Jtf_nombre.getText());
            conf.setDireccion(Jtf_direccion.getText());
            conf.setTelefono(Jtf_telefono.getText());
            conf.setId(Integer.parseInt(Jtf_id.getText()));
            conf.setRazonSocial(Jtf_razonSocial.getText());
            
            proDAO.ModificarDatos(conf);
            JOptionPane.showMessageDialog(null, "Datos Actualizados","Message: Data",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No deje campos vacios!", "Message: Error Data", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Jbn_actualizarActionPerformed

    private void Jbn_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jbn_actualizarMouseEntered
        Jbn_actualizar.setForeground(Color.white);
    }//GEN-LAST:event_Jbn_actualizarMouseEntered

    private void Jbn_actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jbn_actualizarMouseExited
        Jbn_actualizar.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_Jbn_actualizarMouseExited

    private void Jtf_ccKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_ccKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_Jtf_ccKeyTyped

    private void Jtf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_nombreKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_Jtf_nombreKeyTyped

    private void Jtf_razonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_razonSocialKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_Jtf_razonSocialKeyTyped

    private void Jtf_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_telefonoKeyTyped
        event.numberKeyPress(evt);
        event.txtCelularKeyTyped(evt, Jtf_telefono);
    }//GEN-LAST:event_Jtf_telefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_BG;
    private javax.swing.JButton Jbn_actualizar;
    private javax.swing.JLabel Jlb_cc;
    private javax.swing.JLabel Jlb_direccion;
    private javax.swing.JLabel Jlb_nombre;
    private javax.swing.JLabel Jlb_razonSocial;
    private javax.swing.JLabel Jlb_telefono;
    private javax.swing.JTextField Jtf_cc;
    private javax.swing.JTextField Jtf_direccion;
    private javax.swing.JTextField Jtf_id;
    private javax.swing.JTextField Jtf_nombre;
    private javax.swing.JTextField Jtf_razonSocial;
    private javax.swing.JTextField Jtf_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
