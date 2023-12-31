/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.LoginDAO;
import model.login;
import org.apache.commons.net.util.Base64;

/**
 *
 * @author maico
 */
public class Login extends javax.swing.JFrame {

    login lg = new login();
    LoginDAO login = new LoginDAO();

    /**
     * Creates new form Login
     */
    public Login() {
        super("Login");
        initComponents();
        setIconImage(getIconImage());
        setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Image/iconoprincipal.png"));
        return retValue;
    }
    
    private static String encriptar(String contr){
        return new String(Base64.encodeBase64(contr.getBytes()));
    }
    
    public void valida() {
        String user = this.Jtf_username.getText();
        String pass = String.copyValueOf(Jpf_password.getPassword());
        String passencrip = encriptar(pass);

        if (!user.isEmpty() && !pass.isEmpty()) {

            lg = login.log(user, passencrip);
            if (lg.getUsername() != null && lg.getPassword() != null) {
                if (lg.getRol().equals("Administrador")) {
                    Principal_Administrador p = new Principal_Administrador(lg.getNombre()+" "+lg.getApellido());
                    p.setVisible(true);
                    this.dispose();
                }else{
                    Principal_Usuario p_u = new Principal_Usuario(lg.getNombre()+" "+lg.getApellido());
                    p_u.setVisible(true);
                    this.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta!", "Error: Incorrect data", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese usuario y contraseña", "Error: No data", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        JP_BG = new javax.swing.JPanel();
        JP_login = new javax.swing.JPanel();
        Jlb_login = new javax.swing.JLabel();
        Jlb_username = new javax.swing.JLabel();
        Jtf_username = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Jlb_password = new javax.swing.JLabel();
        Jpf_password = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        Jbn_Login = new javax.swing.JButton();
        JP_imagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JP_BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_login.setBackground(new java.awt.Color(255, 255, 255));

        Jlb_login.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        Jlb_login.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_login.setText("LOGIN");

        Jlb_username.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Jlb_username.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_username.setText("Username:");

        Jtf_username.setBackground(new java.awt.Color(255, 255, 255));
        Jtf_username.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jtf_username.setForeground(new java.awt.Color(0, 0, 0));
        Jtf_username.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(187, 187, 187));
        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        Jlb_password.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Jlb_password.setForeground(new java.awt.Color(255, 102, 0));
        Jlb_password.setText("Password:");

        Jpf_password.setBackground(new java.awt.Color(255, 255, 255));
        Jpf_password.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Jpf_password.setForeground(new java.awt.Color(0, 0, 0));
        Jpf_password.setBorder(null);
        Jpf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Jpf_passwordKeyPressed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));

        Jbn_Login.setBackground(new java.awt.Color(255, 102, 0));
        Jbn_Login.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Jbn_Login.setForeground(new java.awt.Color(255, 255, 255));
        Jbn_Login.setText("Ingresar");
        Jbn_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jbn_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jbn_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jbn_LoginMouseExited(evt);
            }
        });
        Jbn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbn_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_loginLayout = new javax.swing.GroupLayout(JP_login);
        JP_login.setLayout(JP_loginLayout);
        JP_loginLayout.setHorizontalGroup(
            JP_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_loginLayout.createSequentialGroup()
                .addGroup(JP_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_loginLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(Jlb_login))
                    .addGroup(JP_loginLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(JP_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jlb_password)
                            .addComponent(Jlb_username)
                            .addComponent(Jtf_username)
                            .addComponent(jSeparator2)
                            .addComponent(Jpf_password)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JP_loginLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(Jbn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        JP_loginLayout.setVerticalGroup(
            JP_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_loginLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Jlb_login)
                .addGap(34, 34, 34)
                .addComponent(Jlb_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jtf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlb_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jpf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Jbn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        JP_BG.add(JP_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 420));

        JP_imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/image1.jpg"))); // NOI18N
        JP_imagen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 420));

        JP_BG.add(JP_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 260, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbn_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jbn_LoginMouseEntered
        Jbn_Login.setBackground(new Color(255, 117, 23));
    }//GEN-LAST:event_Jbn_LoginMouseEntered

    private void Jbn_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jbn_LoginMouseExited
        Jbn_Login.setBackground(new Color(255, 102, 0));
    }//GEN-LAST:event_Jbn_LoginMouseExited

    private void Jbn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbn_LoginActionPerformed
        valida();
    }//GEN-LAST:event_Jbn_LoginActionPerformed

    private void Jpf_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jpf_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            valida();
        }
    }//GEN-LAST:event_Jpf_passwordKeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_BG;
    private javax.swing.JPanel JP_imagen;
    private javax.swing.JPanel JP_login;
    private javax.swing.JButton Jbn_Login;
    private javax.swing.JLabel Jlb_login;
    private javax.swing.JLabel Jlb_password;
    private javax.swing.JLabel Jlb_username;
    private javax.swing.JPasswordField Jpf_password;
    private javax.swing.JTextField Jtf_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
