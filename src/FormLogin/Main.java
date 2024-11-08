/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormLogin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author trinh
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        btn_tat.setContentAreaFilled(false);
        datnutdn();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgrmain = new BackgrItem.Backgr1();
        backgr3 = new BackgrItem.Backgr3();
        btn_tat = new javax.swing.JButton();
        backgr2 = new BackgrItem.Backgr2();
        jPanel2 = new javax.swing.JPanel();
        btn_dn = new javax.swing.JButton();
        btn_dk = new javax.swing.JButton();
        Pnl_main = new javax.swing.JPanel();
        Pnl_dn = new javax.swing.JPanel();
        Pnl_dk = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btn_tat.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        btn_tat.setText("X");
        btn_tat.setName(""); // NOI18N
        btn_tat.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_tat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tatMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tatMousePressed(evt);
            }
        });
        btn_tat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgr3Layout = new javax.swing.GroupLayout(backgr3);
        backgr3.setLayout(backgr3Layout);
        backgr3Layout.setHorizontalGroup(
            backgr3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgr3Layout.createSequentialGroup()
                .addGap(0, 278, Short.MAX_VALUE)
                .addComponent(btn_tat, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgr3Layout.setVerticalGroup(
            backgr3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgr3Layout.createSequentialGroup()
                .addComponent(btn_tat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 30));
        jPanel2.setPreferredSize(new java.awt.Dimension(364, 53));

        btn_dn.setText("Đăng nhập");
        btn_dn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_dn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dnMouseClicked(evt);
            }
        });
        btn_dn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dnActionPerformed(evt);
            }
        });

        btn_dk.setText("Đăng ký");
        btn_dk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_dk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dkMouseClicked(evt);
            }
        });
        btn_dk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_dk, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_dn, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addComponent(btn_dk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Pnl_main.setBackground(new java.awt.Color(0, 0, 0, 90));

        Pnl_dk.setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Password");

        javax.swing.GroupLayout Pnl_dkLayout = new javax.swing.GroupLayout(Pnl_dk);
        Pnl_dk.setLayout(Pnl_dkLayout);
        Pnl_dkLayout.setHorizontalGroup(
            Pnl_dkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_dkLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(Pnl_dkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_dkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                        .addComponent(jPasswordField1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        Pnl_dkLayout.setVerticalGroup(
            Pnl_dkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_dkLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout Pnl_dnLayout = new javax.swing.GroupLayout(Pnl_dn);
        Pnl_dn.setLayout(Pnl_dnLayout);
        Pnl_dnLayout.setHorizontalGroup(
            Pnl_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_dk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pnl_dnLayout.setVerticalGroup(
            Pnl_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_dk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout Pnl_mainLayout = new javax.swing.GroupLayout(Pnl_main);
        Pnl_main.setLayout(Pnl_mainLayout);
        Pnl_mainLayout.setHorizontalGroup(
            Pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_dn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pnl_mainLayout.setVerticalGroup(
            Pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_mainLayout.createSequentialGroup()
                .addComponent(Pnl_dn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgr2Layout = new javax.swing.GroupLayout(backgr2);
        backgr2.setLayout(backgr2Layout);
        backgr2Layout.setHorizontalGroup(
            backgr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgr2Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(backgr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        backgr2Layout.setVerticalGroup(
            backgr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgr2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgrmainLayout = new javax.swing.GroupLayout(backgrmain);
        backgrmain.setLayout(backgrmainLayout);
        backgrmainLayout.setHorizontalGroup(
            backgrmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgrmainLayout.createSequentialGroup()
                .addComponent(backgr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(backgr3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgrmainLayout.setVerticalGroup(
            backgrmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backgr3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrmain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void datnutdk() {
        btn_dk.setOpaque(true);
        btn_dk.setContentAreaFilled(true);
        btn_dk.setBorderPainted(false);
        btn_dk.setBackground(Color.decode("#6A8BF7"));
        btn_dn.setOpaque(true);
        btn_dn.setContentAreaFilled(true);
        btn_dn.setBorderPainted(false);
        btn_dn.setBackground(Color.decode("#6AB8F7")); // Đặt màu nền

    }
    public void datnutdn() {
        btn_dk.setOpaque(true);
        btn_dk.setContentAreaFilled(true);
        btn_dk.setBorderPainted(false);
        btn_dk.setBackground(Color.decode("#6AB8F7")); // Đặt màu nền
        btn_dn.setOpaque(true);
        btn_dn.setContentAreaFilled(true);
        btn_dn.setBorderPainted(false);
        btn_dn.setBackground(Color.decode("#6A8BF7"));

    }

//    public void tat() {
//        // Để không tô màu nền mặc định của JButton
////        btn_tat.setFocusPainted(false);       // Không có viền khi nút được chọn
////        btn_tat.setBorder(BorderFactory.createEmptyBorder());  // Xóa bỏ border mặc định
////        if (btn_tat.getModel().isPressed()) {
//
////        if (btn_tat.getModel().isPressed()) {
////            btn_tat.setBackground(new Color(0, 0, 0));
////        } // Màu khi nhấn nút
////        else {
////
////            btn_tat.setContentAreaFilled(false);// Màu nền khi không nhấn
////        }
//    }

    private void btn_tatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tatActionPerformed
        dispose();
    }//GEN-LAST:event_btn_tatActionPerformed

    private void btn_tatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tatMouseEntered

    }//GEN-LAST:event_btn_tatMouseEntered

    private void btn_tatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tatMousePressed

    }//GEN-LAST:event_btn_tatMousePressed

    private void btn_dnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dnMouseClicked
        
    }//GEN-LAST:event_btn_dnMouseClicked

    private void btn_dkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dkMouseClicked
        
    }//GEN-LAST:event_btn_dkMouseClicked

    private void btn_dkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dkActionPerformed
        datnutdk();
        
        
    }//GEN-LAST:event_btn_dkActionPerformed

    private void btn_dnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dnActionPerformed
        datnutdn();
        
    }//GEN-LAST:event_btn_dnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_dk;
    private javax.swing.JPanel Pnl_dn;
    private javax.swing.JPanel Pnl_main;
    private BackgrItem.Backgr2 backgr2;
    private BackgrItem.Backgr3 backgr3;
    private BackgrItem.Backgr1 backgrmain;
    private javax.swing.JButton btn_dk;
    private javax.swing.JButton btn_dn;
    private javax.swing.JButton btn_tat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
