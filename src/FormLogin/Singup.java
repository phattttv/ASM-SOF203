/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormLogin;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author trinh
 */
public class Singup extends javax.swing.JFrame {

    /**
     * Creates new form Singup
     */
    public Singup() {
        initComponents();
        btn_tat.setBorderPainted(false);
        btn_tat.setContentAreaFilled(false);
        datnutsm();
        datnutdk();
    }
    
//    public void hinh() {
//        String imagePath = "iconItem/logo.png";
//
//        try {
//            // Tải hình ảnh từ file
//            BufferedImage image = ImageIO.read(new File(imagePath));
//
//            // Điều chỉnh kích thước hình ảnh (ví dụ 200x200)
//            Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
//
//            // Đặt hình ảnh vào JLabel
//            lbl_logo.setIcon(new ImageIcon(scaledImage));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    

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
    
    
    public void datnutsm() {
        btn_sm.setOpaque(true);
        btn_sm.setContentAreaFilled(true);
        btn_sm.setBorderPainted(false);
        btn_sm.setBackground(Color.decode("#6AB8F7")); // Đặt màu nền

    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backgrmain = new BackgrItem.Backgr1();
        backgr3 = new BackgrItem.Backgr3();
        btn_tat = new javax.swing.JButton();
        backgr2 = new BackgrItem.Backgr2();
        jPanel2 = new javax.swing.JPanel();
        btn_dn = new javax.swing.JButton();
        btn_dk = new javax.swing.JButton();
        Pnl_main = new javax.swing.JPanel();
        Pnl_dn = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btn_sm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1008, 631));

        jPanel1.setPreferredSize(new java.awt.Dimension(1008, 631));

        btn_tat.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
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
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(btn_tat, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        backgr3Layout.setVerticalGroup(
            backgr3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgr3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 30));
        jPanel2.setPreferredSize(new java.awt.Dimension(364, 53));

        btn_dn.setText("Đăng nhập");
        btn_dn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_dn.setBorderPainted(false);
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
        btn_dk.setBorderPainted(false);
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

        Pnl_main.setBackground(new java.awt.Color(153, 51, 255));

        Pnl_dn.setBackground(new java.awt.Color(0, 0, 0, 90));

        jTextField5.setBackground(new java.awt.Color(204, 204, 204));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);

        jPasswordField3.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField3.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);

        btn_sm.setText("Submit");

        javax.swing.GroupLayout Pnl_dnLayout = new javax.swing.GroupLayout(Pnl_dn);
        Pnl_dn.setLayout(Pnl_dnLayout);
        Pnl_dnLayout.setHorizontalGroup(
            Pnl_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_dnLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(Pnl_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField3)
                    .addComponent(jTextField5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_dnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_sm, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        Pnl_dnLayout.setVerticalGroup(
            Pnl_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_dnLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_sm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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
                    .addComponent(Pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        backgr2Layout.setVerticalGroup(
            backgr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgr2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrmain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tatMouseEntered

    }//GEN-LAST:event_btn_tatMouseEntered

    private void btn_tatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tatMousePressed

    }//GEN-LAST:event_btn_tatMousePressed

    private void btn_tatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tatActionPerformed
        dispose();
    }//GEN-LAST:event_btn_tatActionPerformed

    private void btn_dnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dnMouseClicked

    }//GEN-LAST:event_btn_dnMouseClicked

    private void btn_dnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dnActionPerformed
        datnutdn();

    }//GEN-LAST:event_btn_dnActionPerformed

    private void btn_dkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dkMouseClicked

    }//GEN-LAST:event_btn_dkMouseClicked

    private void btn_dkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dkActionPerformed
        datnutdk();

    }//GEN-LAST:event_btn_dkActionPerformed

   public void gd() {
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
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_dk;
    private javax.swing.JPanel Pnl_dk1;
    private javax.swing.JPanel Pnl_dn;
    private javax.swing.JPanel Pnl_main;
    private BackgrItem.Backgr2 backgr2;
    private BackgrItem.Backgr3 backgr3;
    private BackgrItem.Backgr1 backgrmain;
    private javax.swing.JButton btn_dk;
    private javax.swing.JButton btn_dn;
    private javax.swing.JButton btn_sm;
    private javax.swing.JButton btn_tat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
