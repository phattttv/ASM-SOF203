/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import BackgrTC.Menu;
import java.awt.Color;

/**
 *
 * @author trinh
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        cCN1.setVisible(false);
        cCT1.setVisible(false);
        pB1.setVisible(false);
        Pnl_menu.setBackground(Color.decode("#ccdbfd"));
    }

    public void batnv() {
        cCT1.setVisible(false);
        cCN1.setVisible(false);
        pB1.setVisible(false);
        qLNV2.setVisible(true);
    }
    
    public void batcct() {
        qLNV2.setVisible(false);
        cCN1.setVisible(false);
        pB1.setVisible(false);
        cCT1.setVisible(true);
    }
    
    public void batccn() {
        qLNV2.setVisible(false);
        cCT1.setVisible(false);
        pB1.setVisible(false);
        cCN1.setVisible(true);
    }
    
    public void batpb() {
        qLNV2.setVisible(false);
        cCT1.setVisible(false);
        cCN1.setVisible(false);
        pB1.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pB1 = new BackgrTC.PB();
        cCN1 = new BackgrTC.CCN();
        cCT1 = new BackgrTC.CCT();
        qLNV2 = new BackgrTC.QLNV();
        Pnl_menu = new javax.swing.JPanel();
        Pnl_Clock = new javax.swing.JPanel();
        lbl_Clock = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lbl_UserName = new javax.swing.JLabel();
        lbl_ImgUser = new javax.swing.JLabel();
        nMenu1 = new BackgrTC.nMenu();
        jButton1 = new javax.swing.JButton();
        control1 = new BackgrTC.Control();
        jLabel1 = new javax.swing.JLabel();
        control2 = new BackgrTC.Control();
        jLabel2 = new javax.swing.JLabel();
        control3 = new BackgrTC.Control();
        jLabel3 = new javax.swing.JLabel();
        control5 = new BackgrTC.Control();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pnl_Clock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)));

        lbl_Clock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Alarm.png"))); // NOI18N

        lblTime.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 0));
        lblTime.setText("00:00 AM");

        javax.swing.GroupLayout Pnl_ClockLayout = new javax.swing.GroupLayout(Pnl_Clock);
        Pnl_Clock.setLayout(Pnl_ClockLayout);
        Pnl_ClockLayout.setHorizontalGroup(
            Pnl_ClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_ClockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Clock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        Pnl_ClockLayout.setVerticalGroup(
            Pnl_ClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_ClockLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Pnl_ClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lbl_UserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_UserName.setText("Username");

        lbl_ImgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile (2) (1).png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Log out.png"))); // NOI18N
        jButton1.setText("Đăng Xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Users.png"))); // NOI18N
        jLabel1.setText("Quản lý nhân viên");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout control1Layout = new javax.swing.GroupLayout(control1);
        control1.setLayout(control1Layout);
        control1Layout.setHorizontalGroup(
            control1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        control1Layout.setVerticalGroup(
            control1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        control2.setPreferredSize(new java.awt.Dimension(163, 52));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calendar.png"))); // NOI18N
        jLabel2.setText("Chấm công tháng");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout control2Layout = new javax.swing.GroupLayout(control2);
        control2.setLayout(control2Layout);
        control2Layout.setHorizontalGroup(
            control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        control2Layout.setVerticalGroup(
            control2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        control3.setPreferredSize(new java.awt.Dimension(218, 52));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Date.png"))); // NOI18N
        jLabel3.setText("Chấm công ngày");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout control3Layout = new javax.swing.GroupLayout(control3);
        control3.setLayout(control3Layout);
        control3Layout.setHorizontalGroup(
            control3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        control3Layout.setVerticalGroup(
            control3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        control5.setPreferredSize(new java.awt.Dimension(115, 52));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open door.png"))); // NOI18N
        jLabel4.setText("Phòng ban");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout control5Layout = new javax.swing.GroupLayout(control5);
        control5.setLayout(control5Layout);
        control5Layout.setHorizontalGroup(
            control5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        control5Layout.setVerticalGroup(
            control5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout nMenu1Layout = new javax.swing.GroupLayout(nMenu1);
        nMenu1.setLayout(nMenu1Layout);
        nMenu1Layout.setHorizontalGroup(
            nMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nMenu1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(nMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(control1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(control3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(control2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(control5, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        nMenu1Layout.setVerticalGroup(
            nMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nMenu1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(control1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(control2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(control3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(control5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Pnl_menuLayout = new javax.swing.GroupLayout(Pnl_menu);
        Pnl_menu.setLayout(Pnl_menuLayout);
        Pnl_menuLayout.setHorizontalGroup(
            Pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pnl_Clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Pnl_menuLayout.createSequentialGroup()
                        .addComponent(lbl_ImgUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Pnl_menuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        Pnl_menuLayout.setVerticalGroup(
            Pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_Clock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_ImgUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(nMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(qLNV2, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(302, 302, 302)
                    .addComponent(cCT1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(302, 302, 302)
                    .addComponent(cCN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(302, 302, 302)
                    .addComponent(pB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qLNV2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pnl_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cCT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cCN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        batnv();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       batcct();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        batccn();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        batpb();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Clock;
    private javax.swing.JPanel Pnl_menu;
    private BackgrTC.CCN cCN1;
    private BackgrTC.CCT cCT1;
    private BackgrTC.Control control1;
    private BackgrTC.Control control2;
    private BackgrTC.Control control3;
    private BackgrTC.Control control5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lbl_Clock;
    private javax.swing.JLabel lbl_ImgUser;
    private javax.swing.JLabel lbl_UserName;
    private BackgrTC.nMenu nMenu1;
    private BackgrTC.PB pB1;
    private BackgrTC.QLNV qLNV2;
    // End of variables declaration//GEN-END:variables
}
