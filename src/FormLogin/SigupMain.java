/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormLogin;

import ServiceDNDK.AESEncryptionDecryption;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.Form_Trang_Chu;

/**
 *
 * @author trinh
 */
public class SigupMain extends javax.swing.JFrame {

    /**
     * Creates new form LoginMain
     */
    public SigupMain() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        settext();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgr41 = new BackgrItem.Backgr4();
        formDN2 = new BackgrItem.FormDN();
        jLabel3 = new javax.swing.JLabel();
        pwf_pass = new Control.pwf_custom();
        txf_name = new Control.txf_custom();
        btn_submit = new Control.button_custom();
        btn_dn = new Control.button_custom();
        txf_username = new Control.txf_custom();
        jLabel4 = new javax.swing.JLabel();
        backgr51 = new BackgrItem.Backgr5();
        jLabel2 = new javax.swing.JLabel();
        pNG21 = new BackgrPNG.PNG2();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Signup");

        pwf_pass.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pwf_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwf_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwf_passFocusLost(evt);
            }
        });

        txf_name.setText("Name");
        txf_name.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txf_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txf_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txf_nameFocusLost(evt);
            }
        });
        txf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nameActionPerformed(evt);
            }
        });

        btn_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit.setText("Submit");
        btn_submit.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        btn_submit.setRadius(30);
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_dn.setForeground(new java.awt.Color(255, 255, 255));
        btn_dn.setText("Signin");
        btn_dn.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        btn_dn.setRadius(30);
        btn_dn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dnActionPerformed(evt);
            }
        });

        txf_username.setText("Username");
        txf_username.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txf_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txf_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txf_usernameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout formDN2Layout = new javax.swing.GroupLayout(formDN2);
        formDN2.setLayout(formDN2Layout);
        formDN2Layout.setHorizontalGroup(
            formDN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDN2Layout.createSequentialGroup()
                .addGroup(formDN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formDN2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formDN2Layout.createSequentialGroup()
                        .addContainerGap(51, Short.MAX_VALUE)
                        .addGroup(formDN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formDN2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        formDN2Layout.setVerticalGroup(
            formDN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDN2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(txf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pwf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(formDN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout backgr41Layout = new javax.swing.GroupLayout(backgr41);
        backgr41.setLayout(backgr41Layout);
        backgr41Layout.setHorizontalGroup(
            backgr41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgr41Layout.createSequentialGroup()
                .addGap(0, 78, Short.MAX_VALUE)
                .addComponent(formDN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );
        backgr41Layout.setVerticalGroup(
            backgr41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgr41Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(formDN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        getContentPane().add(backgr41, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 630, 820));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconItem/logo1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 370, 410));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Work time management");

        javax.swing.GroupLayout backgr51Layout = new javax.swing.GroupLayout(backgr51);
        backgr51.setLayout(backgr51Layout);
        backgr51Layout.setHorizontalGroup(
            backgr51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgr51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgr51Layout.setVerticalGroup(
            backgr51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgr51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(backgr51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 550, 100));
        getContentPane().add(pNG21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_nameFocusGained
        if (txf_name.getText().equals("Name")) {
                    txf_name.setText("");
            }
    }//GEN-LAST:event_txf_nameFocusGained

    private void txf_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_nameFocusLost
        if (txf_name.getText().isEmpty()) {
                    txf_name.setText("Name");
            }
    }//GEN-LAST:event_txf_nameFocusLost

    private void pwf_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwf_passFocusGained
        if (pwf_pass.getText().equals("Password")) {
                    pwf_pass.setText("");
            }
    }//GEN-LAST:event_pwf_passFocusGained

    private void pwf_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwf_passFocusLost
        if (pwf_pass.getText().isEmpty()) {
                    pwf_pass.setText("Password");
        }
    }//GEN-LAST:event_pwf_passFocusLost

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        JOptionPane.showMessageDialog(this, "Submit sucessful");
        dispose();
        LoginMain lg = new LoginMain();
        lg.setVisible(true);
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_dnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dnActionPerformed
        dispose();
        LoginMain lg = new LoginMain();
        lg.setVisible(true);
    }//GEN-LAST:event_btn_dnActionPerformed

    private void txf_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_usernameFocusGained
        if (txf_username.getText().equals("Username")) {
                    txf_username.setText("");
            }
    }//GEN-LAST:event_txf_usernameFocusGained

    private void txf_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_usernameFocusLost
        if (txf_username.getText().isEmpty()) {
                    txf_username.setText("Username");
            }
    }//GEN-LAST:event_txf_usernameFocusLost

    private void txf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nameActionPerformed

    private void printSQLException(SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void settext() {
        txf_name.setText("Name");
        pwf_pass.setText("Password");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException ignored) {
            Toolkit.getDefaultToolkit().beep();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
            return;
        }
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SigupMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BackgrItem.Backgr4 backgr41;
    private BackgrItem.Backgr5 backgr51;
    private Control.button_custom btn_dn;
    private Control.button_custom btn_submit;
    private BackgrItem.FormDN formDN2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private BackgrPNG.PNG2 pNG21;
    private Control.pwf_custom pwf_pass;
    private Control.txf_custom txf_name;
    private Control.txf_custom txf_username;
    // End of variables declaration//GEN-END:variables
}
