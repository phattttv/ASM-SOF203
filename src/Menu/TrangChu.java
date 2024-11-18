/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import java.util.logging.Level;
import java.util.logging.Logger;

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
    }
    
    //1250, 786 Trang chu
    //245, 786 menu

    int dai = 243;
    // mở menu
    public void MoMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < dai; i++) {
                    Pnl_Menu.setSize(i,getHeight());
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
        
    }
    // đóng menu
    
    public void DongMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = dai; i > 0; i--) {
                    Pnl_Menu.setSize(i,getHeight());
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Menu = new javax.swing.JPanel();
        lbl_tatmenu = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        panel_custom1 = new Control.Panel_custom();
        lbl_menu = new javax.swing.JLabel();
        Pnl_Layout = new javax.swing.JPanel();
        Pnl_Home = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Pnl_nhanvien = new javax.swing.JPanel();
        Pnl_ccn = new javax.swing.JPanel();
        Pnl_cct = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_tatmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tatmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconItem/menu2.png"))); // NOI18N
        lbl_tatmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_tatmenuMouseClicked(evt);
            }
        });

        lbl_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconItem/logonho.png"))); // NOI18N

        javax.swing.GroupLayout panel_custom1Layout = new javax.swing.GroupLayout(panel_custom1);
        panel_custom1.setLayout(panel_custom1Layout);
        panel_custom1Layout.setHorizontalGroup(
            panel_custom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel_custom1Layout.setVerticalGroup(
            panel_custom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Pnl_MenuLayout = new javax.swing.GroupLayout(Pnl_Menu);
        Pnl_Menu.setLayout(Pnl_MenuLayout);
        Pnl_MenuLayout.setHorizontalGroup(
            Pnl_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_MenuLayout.createSequentialGroup()
                .addGroup(Pnl_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_MenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_tatmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pnl_MenuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbl_logo)
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Pnl_MenuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(panel_custom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnl_MenuLayout.setVerticalGroup(
            Pnl_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tatmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_logo)
                .addGap(147, 147, 147)
                .addComponent(panel_custom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        lbl_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconItem/menu.png"))); // NOI18N
        lbl_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_menuMouseClicked(evt);
            }
        });

        Pnl_Layout.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1213, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Pnl_HomeLayout = new javax.swing.GroupLayout(Pnl_Home);
        Pnl_Home.setLayout(Pnl_HomeLayout);
        Pnl_HomeLayout.setHorizontalGroup(
            Pnl_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_HomeLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pnl_HomeLayout.setVerticalGroup(
            Pnl_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_HomeLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pnl_Layout.add(Pnl_Home, "card2");

        javax.swing.GroupLayout Pnl_nhanvienLayout = new javax.swing.GroupLayout(Pnl_nhanvien);
        Pnl_nhanvien.setLayout(Pnl_nhanvienLayout);
        Pnl_nhanvienLayout.setHorizontalGroup(
            Pnl_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1219, Short.MAX_VALUE)
        );
        Pnl_nhanvienLayout.setVerticalGroup(
            Pnl_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        Pnl_Layout.add(Pnl_nhanvien, "card3");

        javax.swing.GroupLayout Pnl_ccnLayout = new javax.swing.GroupLayout(Pnl_ccn);
        Pnl_ccn.setLayout(Pnl_ccnLayout);
        Pnl_ccnLayout.setHorizontalGroup(
            Pnl_ccnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1219, Short.MAX_VALUE)
        );
        Pnl_ccnLayout.setVerticalGroup(
            Pnl_ccnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        Pnl_Layout.add(Pnl_ccn, "card4");

        javax.swing.GroupLayout Pnl_cctLayout = new javax.swing.GroupLayout(Pnl_cct);
        Pnl_cct.setLayout(Pnl_cctLayout);
        Pnl_cctLayout.setHorizontalGroup(
            Pnl_cctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1219, Short.MAX_VALUE)
        );
        Pnl_cctLayout.setVerticalGroup(
            Pnl_cctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        Pnl_Layout.add(Pnl_cct, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pnl_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Pnl_Layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pnl_Layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_tatmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_tatmenuMouseClicked
        DongMenu();
    }//GEN-LAST:event_lbl_tatmenuMouseClicked

    private void lbl_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_menuMouseClicked
        MoMenu();
    }//GEN-LAST:event_lbl_menuMouseClicked

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
    private javax.swing.JPanel Pnl_Home;
    private javax.swing.JPanel Pnl_Layout;
    private javax.swing.JPanel Pnl_Menu;
    private javax.swing.JPanel Pnl_ccn;
    private javax.swing.JPanel Pnl_cct;
    private javax.swing.JPanel Pnl_nhanvien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_tatmenu;
    private Control.Panel_custom panel_custom1;
    // End of variables declaration//GEN-END:variables
}
