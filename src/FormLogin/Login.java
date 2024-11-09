/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FormLogin;

import ServiceDNDK.AESEncryptionDecryption;
import java.awt.Color;

import java.awt.HeadlessException;
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
import view.Form_Trang_Chu;

/**
 *
 * @author trinh
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        btn_tat.setBorderPainted(false);
        btn_tat.setContentAreaFilled(false);
        datnutsm();
        datnutdn();
        connect();
    }

    private String jdbcURL = "trNiqDu94jZXBQhVpKVo2wAdQpWHcxHFASD6xS8Wk8AvaCS9vQNV94Bn1ntqbUdeBaIp7jkmxWJcghYj6yMBv6dBIP7IuYw1qPdPos7WiUpuzR02rPT7PEra7RRT2VSQXtqZAdYC+Z/AIEWBgb46Ig==";
// "jdbc:sqlserver://localhost:1433;databaseName=QLSV;trustServerCertificate=true";
    private String jdbcUsername = "Li1fiqKPnyDyawrodO+Hlg==";//sa
    private String jdbcPassword = "0uaNrq0j3wmymoEiYzbzAg==";// 123
    Connection con;
    private AESEncryptionDecryption aesEncryptionDecryption = new AESEncryptionDecryption();
    final String secretKey = "thekeyhere";

    private String MD5encoder(String text) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(StandardCharsets.UTF_8.encode(text));
        return String.format("%032x", new BigInteger(1, md5.digest()));
    }

    protected final Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(aesEncryptionDecryption.decrypt(jdbcURL, secretKey),
                aesEncryptionDecryption.decrypt(jdbcUsername, secretKey), aesEncryptionDecryption.decrypt(jdbcPassword, secretKey));
        return connection;
    }

    public void connect() {
        try {
            this.con = getConnection();
            System.out.println("Connection successful");
        } catch (SQLException ex) {
            System.out.println("Connection failed!");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backgr2 = new BackgrItem.Backgr2();
        jPanel2 = new javax.swing.JPanel();
        btn_dn = new javax.swing.JButton();
        btn_dk = new javax.swing.JButton();
        Pnl_main = new javax.swing.JPanel();
        Pnl_dn = new javax.swing.JPanel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_sm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1008, 631));

        btn_tat.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        btn_tat.setForeground(new java.awt.Color(255, 255, 255));
        btn_tat.setText("X");
        btn_tat.setName(""); // NOI18N
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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconItem/logonho.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Work time management");

        javax.swing.GroupLayout backgr3Layout = new javax.swing.GroupLayout(backgr3);
        backgr3.setLayout(backgr3Layout);
        backgr3Layout.setHorizontalGroup(
            backgr3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgr3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgr3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_tat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgr3Layout.setVerticalGroup(
            backgr3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgr3Layout.createSequentialGroup()
                .addComponent(btn_tat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        txt_username.setBackground(new java.awt.Color(204, 204, 204));
        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_username.setBorder(null);

        txt_password.setBackground(new java.awt.Color(204, 204, 204));
        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_password.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        btn_sm.setText("Submit");
        btn_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_smActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_dnLayout = new javax.swing.GroupLayout(Pnl_dn);
        Pnl_dn.setLayout(Pnl_dnLayout);
        Pnl_dnLayout.setHorizontalGroup(
            Pnl_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_dnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pnl_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_dnLayout.createSequentialGroup()
                        .addGroup(Pnl_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_dnLayout.createSequentialGroup()
                        .addComponent(btn_sm, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        Pnl_dnLayout.setVerticalGroup(
            Pnl_dnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_dnLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btn_sm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Pnl_mainLayout = new javax.swing.GroupLayout(Pnl_main);
        Pnl_main.setLayout(Pnl_mainLayout);
        Pnl_mainLayout.setHorizontalGroup(
            Pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_dn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pnl_mainLayout.setVerticalGroup(
            Pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_dn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(105, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dnMouseClicked

    }//GEN-LAST:event_btn_dnMouseClicked

    private void btn_dnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dnActionPerformed
        datnutdn();

    }//GEN-LAST:event_btn_dnActionPerformed

    private void btn_dkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dkMouseClicked

    }//GEN-LAST:event_btn_dkMouseClicked

    private void btn_dkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dkActionPerformed
        datnutdk();
        Singup dk = new Singup();
        dk.setVisible(true);
        dk.pack();
        dk.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_dkActionPerformed

    private void btn_tatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tatActionPerformed
        dispose();
    }//GEN-LAST:event_btn_tatActionPerformed

    private void btn_tatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tatMousePressed

    }//GEN-LAST:event_btn_tatMousePressed

    private void btn_tatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tatMouseEntered

    }//GEN-LAST:event_btn_tatMouseEntered

    private void btn_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_smActionPerformed
        String pwd = "";
        String SELECT_ALL_STUDENTS_SQL = "SELECT username FROM tbl_user WHERE username = ? and password = ?";
        try {
            pwd = MD5encoder(this.txt_password.getText());
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENTS_SQL);
            preparedStatement.setString(1, this.txt_username.getText());
            preparedStatement.setString(2, pwd);

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login sucessful.");
                Form_Trang_Chu tc = new Form_Trang_Chu();
                tc.setVisible(true);
                tc.pack();
                tc.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Login failed.");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Login failed.");

        }
    }//GEN-LAST:event_btn_smActionPerformed
    private void printSQLException(SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
