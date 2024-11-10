/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package BackgrTC;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author trinh
 */
public class QLNV extends javax.swing.JPanel {

    /**
     * Creates new form QLNV
     */
    public QLNV() {
        initComponents();
        setbackgr();
        setBackground(Color.decode("#c1d3fe"));
    }

    
    
    public void setbackgr() {
        Pnl_QLNV_01.setBackground(Color.decode("#b6ccfe"));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_QLNV_01 = new javax.swing.JPanel();
        lbl_ThongTinNhanVien = new javax.swing.JLabel();
        control1 = new BackgrTC.Control();
        txt_QLNV_Tim1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btn_QLNV_CapNhat1 = new javax.swing.JButton();
        btn_QLNV_Xoa1 = new javax.swing.JButton();
        btn_QLNV_Luu1 = new javax.swing.JButton();
        btn_QLNV_Them1 = new javax.swing.JButton();
        br11 = new BackgrTC.Br1();
        txt_Luong1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_ChucVu1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_QuanLyNhanVien = new javax.swing.JTable();

        Pnl_QLNV_01.setBackground(new java.awt.Color(51, 51, 255));

        lbl_ThongTinNhanVien.setFont(new java.awt.Font("Dosis", 1, 24)); // NOI18N
        lbl_ThongTinNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ThongTinNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ThongTinNhanVien.setText("Thông Tin Nhân Viên");

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        jButton3.setText("Tìm");

        btn_QLNV_CapNhat1.setBackground(new java.awt.Color(204, 255, 255));
        btn_QLNV_CapNhat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N
        btn_QLNV_CapNhat1.setText("Cập Nhật");

        btn_QLNV_Xoa1.setBackground(new java.awt.Color(204, 255, 255));
        btn_QLNV_Xoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btn_QLNV_Xoa1.setText("Xóa");

        btn_QLNV_Luu1.setBackground(new java.awt.Color(204, 255, 255));
        btn_QLNV_Luu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        btn_QLNV_Luu1.setText("Lưu");

        btn_QLNV_Them1.setBackground(new java.awt.Color(204, 255, 255));
        btn_QLNV_Them1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        btn_QLNV_Them1.setText("Thêm");
        btn_QLNV_Them1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLNV_Them1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout control1Layout = new javax.swing.GroupLayout(control1);
        control1.setLayout(control1Layout);
        control1Layout.setHorizontalGroup(
            control1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_QLNV_Them1)
                .addGap(18, 18, 18)
                .addComponent(btn_QLNV_Luu1)
                .addGap(18, 18, 18)
                .addComponent(btn_QLNV_Xoa1)
                .addGap(18, 18, 18)
                .addComponent(btn_QLNV_CapNhat1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_QLNV_Tim1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        control1Layout.setVerticalGroup(
            control1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(control1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_QLNV_Them1)
                    .addComponent(btn_QLNV_Luu1)
                    .addComponent(btn_QLNV_Xoa1)
                    .addComponent(txt_QLNV_Tim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(btn_QLNV_CapNhat1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Pnl_QLNV_01Layout = new javax.swing.GroupLayout(Pnl_QLNV_01);
        Pnl_QLNV_01.setLayout(Pnl_QLNV_01Layout);
        Pnl_QLNV_01Layout.setHorizontalGroup(
            Pnl_QLNV_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ThongTinNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Pnl_QLNV_01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(control1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Pnl_QLNV_01Layout.setVerticalGroup(
            Pnl_QLNV_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_QLNV_01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_ThongTinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(control1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        txt_Luong1.setText("Nhập Lương");
        txt_Luong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Luong1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Giới Tính");

        jRadioButton3.setText("Nam");

        jRadioButton4.setText("Nữ");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Lương");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Chức Vụ");

        btn_ChucVu1.setText("Nhập Chức Vụ");

        jTextField4.setText("Nhập Mã Nhân Viên");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Mã Nhân Viên");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Họ và Tên");

        jTextField6.setText("Nhập Họ và Tên");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Email");

        jTextField7.setText("Nhập Email");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công Nghê Thông Tin", "Thiết Kế Đồ Họa", "Trí Tuệ Nhân Tạo" }));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Mã Phòng Ban");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Số Điện Thoại");

        jTextField8.setText("Nhập Số Điện Thoại");

        javax.swing.GroupLayout br11Layout = new javax.swing.GroupLayout(br11);
        br11.setLayout(br11Layout);
        br11Layout.setHorizontalGroup(
            br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(br11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(br11Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(br11Layout.createSequentialGroup()
                        .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_ChucVu1)
                                .addComponent(txt_Luong1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(br11Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)))
                        .addGap(48, 48, 48))))
        );
        br11Layout.setVerticalGroup(
            br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(br11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(btn_ChucVu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11)
                    .addComponent(txt_Luong1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(br11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tbl_QuanLyNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Họ Và Tên", "Email", "Mã Phòng Ban", "Gender", "Số Điện Thoại", "Chức Vụ", "Lương"
            }
        ));
        jScrollPane1.setViewportView(tbl_QuanLyNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_QLNV_01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(br11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pnl_QLNV_01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(br11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Luong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Luong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Luong1ActionPerformed

    private void btn_QLNV_Them1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QLNV_Them1ActionPerformed
        JOptionPane.showMessageDialog(this, "dsdasd");
    }//GEN-LAST:event_btn_QLNV_Them1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_QLNV_01;
    private BackgrTC.Br1 br11;
    private javax.swing.JTextField btn_ChucVu1;
    private javax.swing.JButton btn_QLNV_CapNhat1;
    private javax.swing.JButton btn_QLNV_Luu1;
    private javax.swing.JButton btn_QLNV_Them1;
    private javax.swing.JButton btn_QLNV_Xoa1;
    private BackgrTC.Control control1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lbl_ThongTinNhanVien;
    private javax.swing.JTable tbl_QuanLyNhanVien;
    private javax.swing.JTextField txt_Luong1;
    private javax.swing.JTextField txt_QLNV_Tim1;
    // End of variables declaration//GEN-END:variables
}
