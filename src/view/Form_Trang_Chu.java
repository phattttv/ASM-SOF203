package view;

import java.awt.Color;

public class Form_Trang_Chu extends javax.swing.JFrame {

    public Form_Trang_Chu() {
        initComponents();
        setLocationRelativeTo(null);
        Time();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Pnl_NenMenu = new javax.swing.JPanel();
        Pnl_Clock = new javax.swing.JPanel();
        lbl_Clock = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lbl_ImgUser = new javax.swing.JLabel();
        lbl_UserName = new javax.swing.JLabel();
        Pnl_Menu = new javax.swing.JPanel();
        lbl_User = new javax.swing.JLabel();
        lbl_ChamCongThang = new javax.swing.JLabel();
        lbl_ChamCongNgay = new javax.swing.JLabel();
        lbl_PhongBan = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Pnl_QuanLyNhanVien = new javax.swing.JPanel();
        Pnl_QLNV_01 = new javax.swing.JPanel();
        lbl_ThongTinNhanVien = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_QLNV_Them = new javax.swing.JButton();
        btn_QLNV_Luu = new javax.swing.JButton();
        btn_QLNV_Xoa = new javax.swing.JButton();
        txt_QLNV_Tim = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btn_QLNV_CapNhat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_MaNhanVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_HoVaTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_Email = new javax.swing.JTextField();
        cbx_ChanGa = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_SDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_ChucVu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Luong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_QuanLyNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pnl_NenMenu.setBackground(new java.awt.Color(0, 51, 255));
        Pnl_NenMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 204), new java.awt.Color(0, 0, 204), new java.awt.Color(0, 0, 204), new java.awt.Color(0, 0, 204)));

        Pnl_Clock.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255), new java.awt.Color(51, 153, 255)));

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

        lbl_ImgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile (2) (1).png"))); // NOI18N

        lbl_UserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_UserName.setText("Username");

        Pnl_Menu.setBackground(new java.awt.Color(102, 204, 255));
        Pnl_Menu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 255)));

        lbl_User.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Unknown person.png"))); // NOI18N
        lbl_User.setText("Quảng Lý Nhân Viên");

        lbl_ChamCongThang.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_ChamCongThang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calendar.png"))); // NOI18N
        lbl_ChamCongThang.setText("Chấm Công Tháng");

        lbl_ChamCongNgay.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_ChamCongNgay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calendar.png"))); // NOI18N
        lbl_ChamCongNgay.setText("Chấm Công Ngày");

        lbl_PhongBan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_PhongBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Unknown person.png"))); // NOI18N
        lbl_PhongBan.setText("Phòng Ban");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Log out.png"))); // NOI18N
        jButton1.setText("Đăng Xuất");

        javax.swing.GroupLayout Pnl_MenuLayout = new javax.swing.GroupLayout(Pnl_Menu);
        Pnl_Menu.setLayout(Pnl_MenuLayout);
        Pnl_MenuLayout.setHorizontalGroup(
            Pnl_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_User, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ChamCongThang, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ChamCongNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_PhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        Pnl_MenuLayout.setVerticalGroup(
            Pnl_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_MenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_User)
                .addGap(18, 18, 18)
                .addComponent(lbl_ChamCongThang)
                .addGap(18, 18, 18)
                .addComponent(lbl_ChamCongNgay)
                .addGap(18, 18, 18)
                .addComponent(lbl_PhongBan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout Pnl_NenMenuLayout = new javax.swing.GroupLayout(Pnl_NenMenu);
        Pnl_NenMenu.setLayout(Pnl_NenMenuLayout);
        Pnl_NenMenuLayout.setHorizontalGroup(
            Pnl_NenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_NenMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_NenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pnl_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pnl_Clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Pnl_NenMenuLayout.createSequentialGroup()
                        .addComponent(lbl_ImgUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_UserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Pnl_NenMenuLayout.setVerticalGroup(
            Pnl_NenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_NenMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_Clock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_NenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_ImgUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pnl_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pnl_QuanLyNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255)));

        Pnl_QLNV_01.setBackground(new java.awt.Color(0, 51, 255));

        lbl_ThongTinNhanVien.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_ThongTinNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ThongTinNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ThongTinNhanVien.setText("Thông Tin Nhân Viên");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_QLNV_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        btn_QLNV_Them.setText("Thêm");

        btn_QLNV_Luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        btn_QLNV_Luu.setText("Lưu");

        btn_QLNV_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btn_QLNV_Xoa.setText("Xóa");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        jButton2.setText("Tìm");

        btn_QLNV_CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N
        btn_QLNV_CapNhat.setText("Cập Nhật");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_QLNV_Them)
                .addGap(18, 18, 18)
                .addComponent(btn_QLNV_Luu)
                .addGap(18, 18, 18)
                .addComponent(btn_QLNV_Xoa)
                .addGap(18, 18, 18)
                .addComponent(btn_QLNV_CapNhat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_QLNV_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_QLNV_Them)
                    .addComponent(btn_QLNV_Luu)
                    .addComponent(btn_QLNV_Xoa)
                    .addComponent(txt_QLNV_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(btn_QLNV_CapNhat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Pnl_QLNV_01Layout = new javax.swing.GroupLayout(Pnl_QLNV_01);
        Pnl_QLNV_01.setLayout(Pnl_QLNV_01Layout);
        Pnl_QLNV_01Layout.setHorizontalGroup(
            Pnl_QLNV_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_ThongTinNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Pnl_QLNV_01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Pnl_QLNV_01Layout.setVerticalGroup(
            Pnl_QLNV_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_QLNV_01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_ThongTinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setText("Thông Tin Nhân Viên");

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Họ và Tên");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        cbx_ChanGa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Mã Phòng Ban");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Số Điện Thoại");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Chức Vụ");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Lương");

        txt_Luong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LuongActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Giới Tính");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nam");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nữ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_HoVaTen)
                        .addComponent(btn_Email)
                        .addComponent(cbx_ChanGa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_SDT, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                    .addComponent(txt_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_ChucVu)
                        .addComponent(txt_Luong, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)))
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btn_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btn_HoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Luong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_ChanGa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btn_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_QuanLyNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Họ Và Tên", "Email", "Mã Phòng Ban", "Gender", "Số Điện Thoại", "Chức Vụ", "Lương"
            }
        ));
        jScrollPane1.setViewportView(tbl_QuanLyNhanVien);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 570, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Pnl_QuanLyNhanVienLayout = new javax.swing.GroupLayout(Pnl_QuanLyNhanVien);
        Pnl_QuanLyNhanVien.setLayout(Pnl_QuanLyNhanVienLayout);
        Pnl_QuanLyNhanVienLayout.setHorizontalGroup(
            Pnl_QuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_QLNV_01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pnl_QuanLyNhanVienLayout.setVerticalGroup(
            Pnl_QuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_QuanLyNhanVienLayout.createSequentialGroup()
                .addComponent(Pnl_QLNV_01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pnl_NenMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pnl_QuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pnl_NenMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pnl_QuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_LuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LuongActionPerformed

    private void Time() {
        ClockThread clockThread = new ClockThread(lblTime);
        Thread thread = new Thread(clockThread);
        thread.start();
    }

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
            java.util.logging.Logger.getLogger(Form_Trang_Chu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Trang_Chu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Trang_Chu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Trang_Chu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Trang_Chu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Clock;
    private javax.swing.JPanel Pnl_Menu;
    private javax.swing.JPanel Pnl_NenMenu;
    private javax.swing.JPanel Pnl_QLNV_01;
    private javax.swing.JPanel Pnl_QuanLyNhanVien;
    private javax.swing.JTextField btn_ChucVu;
    private javax.swing.JTextField btn_Email;
    private javax.swing.JTextField btn_HoVaTen;
    private javax.swing.JButton btn_QLNV_CapNhat;
    private javax.swing.JButton btn_QLNV_Luu;
    private javax.swing.JButton btn_QLNV_Them;
    private javax.swing.JButton btn_QLNV_Xoa;
    private javax.swing.JTextField btn_SDT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_ChanGa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lbl_ChamCongNgay;
    private javax.swing.JLabel lbl_ChamCongThang;
    private javax.swing.JLabel lbl_Clock;
    private javax.swing.JLabel lbl_ImgUser;
    private javax.swing.JLabel lbl_PhongBan;
    private javax.swing.JLabel lbl_ThongTinNhanVien;
    private javax.swing.JLabel lbl_User;
    private javax.swing.JLabel lbl_UserName;
    private javax.swing.JTable tbl_QuanLyNhanVien;
    private javax.swing.JTextField txt_Luong;
    private javax.swing.JTextField txt_MaNhanVien;
    private javax.swing.JTextField txt_QLNV_Tim;
    // End of variables declaration//GEN-END:variables
}
