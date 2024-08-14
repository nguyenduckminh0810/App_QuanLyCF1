/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Entity.NhanVienEntity;
import java.util.List;
import Dao.ThongKeDao;
import Helper.PrintThongKe;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class MainThongKeJPanel extends javax.swing.JPanel {

    DefaultTableModel dtm;
    ThongKeDao sv = new ThongKeDao();
    NhanVienEntity nv = new NhanVienEntity();

    /**
     * Creates new form MainThongKeJPanel
     */
    public MainThongKeJPanel() {

        initComponents();

        fillcombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        lbldoanhthutext = new javax.swing.JLabel();
        lblDoanhthu = new javax.swing.JLabel();
        lblsosanh = new javax.swing.JLabel();
        lblsosanhso = new javax.swing.JLabel();
        lblDoanhthu1 = new javax.swing.JLabel();
        lbldoanhthutext1 = new javax.swing.JLabel();
        lbltongsanpham = new javax.swing.JLabel();
        lbldoanhthutext2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cboDate = new javax.swing.JComboBox<>();
        jDateNgaybd = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jDatengayKt = new com.toedter.calendar.JDateChooser();
        btnTimkiem = new javax.swing.JButton();
        btnTimkiem2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnTimkiem3 = new javax.swing.JButton();
        btnTimkiem4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblsoluong = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhuydon = new javax.swing.JTable();

        setBackground(new java.awt.Color(241, 241, 241));

        jPanel4.setBackground(new java.awt.Color(255, 193, 75));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Doanh thu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        lbldoanhthutext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldoanhthutext.setForeground(new java.awt.Color(255, 255, 255));
        lbldoanhthutext.setText("Doanh thu");

        lblDoanhthu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDoanhthu.setText("00000000000000");

        lblsosanh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsosanh.setForeground(new java.awt.Color(255, 255, 255));
        lblsosanh.setText("Doanh Thu So Với ");

        lblsosanhso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblsosanhso.setText("00000000000000");

        lblDoanhthu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDoanhthu1.setText("00000000000000");

        lbldoanhthutext1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldoanhthutext1.setForeground(new java.awt.Color(255, 255, 255));
        lbldoanhthutext1.setText("Tổng Đơn Đã Bán");

        lbltongsanpham.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltongsanpham.setText("00000000000000");

        lbldoanhthutext2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldoanhthutext2.setForeground(new java.awt.Color(255, 255, 255));
        lbldoanhthutext2.setText("Tổng Sản Phẩm Bán ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldoanhthutext, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldoanhthutext1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoanhthu1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsosanh, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsosanhso)
                    .addComponent(lbltongsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldoanhthutext2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldoanhthutext)
                    .addComponent(lblsosanh))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoanhthu)
                    .addComponent(lblsosanhso))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbldoanhthutext1)
                        .addGap(15, 15, 15)
                        .addComponent(lblDoanhthu1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbldoanhthutext2)
                        .addGap(15, 15, 15)
                        .addComponent(lbltongsanpham)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 193, 75));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        cboDate.setToolTipText("");
        cboDate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDateItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Đến");

        btnTimkiem.setText("Tìm kiếm ");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        btnTimkiem2.setText("Biểu Đồ");
        btnTimkiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiem2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Thống Kê Từ Ngày:");

        btnTimkiem3.setText("Gửi Mail Báo Cáo");
        btnTimkiem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiem3ActionPerformed(evt);
            }
        });

        btnTimkiem4.setText("IN ");
        btnTimkiem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiem4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jDateNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jDatengayKt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimkiem))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cboDate, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(btnTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnTimkiem4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnTimkiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnTimkiem2, btnTimkiem3, btnTimkiem4, cboDate, jDateNgaybd, jDatengayKt});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiem4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateNgaybd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jDatengayKt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnTimkiem, btnTimkiem2, btnTimkiem3, btnTimkiem4, cboDate});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateNgaybd, jDatengayKt});

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doanh Thu Sản Phẩm:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblsoluong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Sản Phẩm", "Số Lượng Đã Bán", "Tổng Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblsoluong.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tblsoluong);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đơn Hủy Theo Nhân Viên:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblhuydon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Số Lượng Đơn Hủy", "Số Lượng Sản Phẩm Hủy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblhuydon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblhuydon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel3, jPanel4});

    }// </editor-fold>//GEN-END:initComponents

    private void cboDateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDateItemStateChanged

        if (cboDate.getSelectedIndex() == 0) {
            filldoanhthu_ngay_label("Hôm Nay");
            fillsosanh_Ngay_label("Hôm Qua");
            filltongspban_ngay_label("Hôm Nay");
            filltotablengay();
        }
        if (cboDate.getSelectedIndex() == 1) {
            filldoanhthu_thang_label("Tháng Này");
            fillsosanh_Thang_label("Tháng Trước");
            filltongspban_thang_label("Tháng Này");
            filltotablethang();
        }
        if (cboDate.getSelectedIndex() == 2) {
            filldoanhthu_nam_label("Năm Nay");
            fillsosanh_nam_label("Năm Trước");
            filltongspban_nam_label("Năm Nay");
            filltotablenam();

        }

    }//GEN-LAST:event_cboDateItemStateChanged

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        if (jDateNgaybd.getDate() == null || jDatengayKt.getDate() == null) {
            JOptionPane.showMessageDialog(this, "vui lòng chọn đủ 2 ngày");

            return;
        }
        Date a = jDateNgaybd.getDate();
        Date b = jDatengayKt.getDate();
        if (a.getTime() > b.getTime() || a == b) {
            JOptionPane.showMessageDialog(btnTimkiem, "Ngày trước phải nhỏ hơn ngày sau");
            return;
        }
        if (jDateNgaybd.getDate() != null && jDatengayKt.getDate() != null) {
            sv.Find();
        }

    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnTimkiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiem2ActionPerformed
        BieuDo bd = new BieuDo();
        bd.setVisible(true);
    }//GEN-LAST:event_btnTimkiem2ActionPerformed

    private void btnTimkiem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiem3ActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn gửi mail?", "Gửi Mail Báo Cáo", JOptionPane.YES_NO_OPTION);
        if (hoi == JOptionPane.YES_OPTION) {
            if (cboDate.getSelectedIndex() == 0) {
                try {
                    sendmailngay("Hàng Ngày", "Hôm Nay");
                } catch (MessagingException ex) {
                    Logger.getLogger(MainThongKeJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cboDate.getSelectedIndex() == 1) {
                try {
                    sendmailngay("Hàng Tháng", "Tháng này");
                } catch (MessagingException ex) {
                    Logger.getLogger(MainThongKeJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cboDate.getSelectedIndex() == 2) {
                try {
                    sendmailngay("Hàng Năm", "Năm Nay");
                } catch (MessagingException ex) {
                    Logger.getLogger(MainThongKeJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnTimkiem3ActionPerformed

    public void sendmailngay(String a, String b) throws MessagingException {
        // Khởi tạo đối tượng Properties để cấu hình thông tin gửi email
        Properties p = new Properties();
        p.put("mail.smtp.auth", "true"); // Sử dụng xác thực SMTP
        p.put("mail.smtp.starttls.enable", "true"); // Kích hoạt mã hóa TLS
        p.put("mail.smtp.host", "smtp.gmail.com"); // Địa chỉ máy chủ SMTP
        p.put("mail.smtp.port", 587); // Cổng SMTP (587 cho STARTTLS)

        // Thông tin tài khoản email gửi
        String username = "testquanlycafeda@gmail.com";
        String password = "tokvytsaxqmxiuus";

        // Tạo phiên làm việc email với xác thực
        Session s = Session.getInstance(p, new javax.mail.Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(username, password);
            }
        });

        // Nhập email người nhận từ hộp thoại nhập liệu
        String mail = JOptionPane.showInputDialog("Nhập mail gửi đến?");
        if (mail.isEmpty()) { // Kiểm tra nếu email nhập vào trống
            JOptionPane.showMessageDialog(btnTimkiem, "Vui lòng nhập Mail!");
            return;
        }

        // Kiểm tra định dạng email hợp lệ
        String checkEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!mail.matches(checkEmail)) { // Nếu email không hợp lệ
            JOptionPane.showMessageDialog(this, "Email không hợp lệ");
            return;
        }

        // Tạo đối tượng Message để soạn thảo email
        Message message = new MimeMessage(s);
        try {
            message.setFrom(new InternetAddress("testquanlycafeda@gmail.com")); // Địa chỉ email gửi
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(mail) // Địa chỉ email người nhận
            );

            // Soạn thảo nội dung email
            message.setSubject("Báo Cáo Thống Kê " + a); // Chủ đề email, ví dụ: "Báo Cáo Thống Kê Hàng Ngày"
            String Htmlcode = "<h3>Kính Gửi Sếp!</h3>";
            String Htmlcode1 = "<h4>Tình hình doanh thu, số lượng sản phẩm bán được, số lượng đơn hàng "
                    + "bán được " + b + " như sau:</h4>"; // Nội dung email, ví dụ: "hôm nay"
            String Htmlcode2 = "<h3>Ngày:</h3>" + new Date() + ""; // Ngày gửi báo cáo
            String Htmlcode3 = "<h3>Doanh Thu:</h3>";
            String Htmlcode4 = "Tổng Doanh Thu " + b + ": " + lblDoanhthu.getText() + "<br>";
            String Htmlcode5 = "<h3>Đơn Bán:</h3>";
            String Htmlcode6 = "Tổng Đơn Bán " + b + ": " + lblDoanhthu1.getText() + "<br>";
            String Htmlcode7 = "<h3>Sản Phẩm Bán:</h3>";
            String Htmlcode8 = "Tổng Sản Phẩm Bán " + b + ": " + lbltongsanpham.getText() + "<br>";

            // Kết hợp các phần nội dung HTML và đặt vào email
            message.setContent(Htmlcode + Htmlcode1 + Htmlcode2 + Htmlcode3 + Htmlcode4 + Htmlcode5 + Htmlcode6 + Htmlcode7 + Htmlcode8, "text/html;charset=UTF-8");

            // Gửi email
            Transport.send(message);

            // Hiển thị thông báo gửi thành công
            JOptionPane.showMessageDialog(this, "Đã gửi!");
        } catch (MessagingException e) {
            // Xử lý ngoại lệ nếu có lỗi trong quá trình gửi email
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gửi email không thành công!");
        }
    }


    private void btnTimkiem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiem4ActionPerformed

        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn in PDF?", "In Thống Kê", JOptionPane.YES_NO_OPTION);
        if (hoi == JOptionPane.YES_OPTION) {
            if (cboDate.getSelectedIndex() == 0) {
                new PrintThongKe().xuatpdf_ngay((DefaultTableModel) tblsoluong.getModel(), (DefaultTableModel) tblhuydon.getModel());
            }
            if (cboDate.getSelectedIndex() == 1) {
                new PrintThongKe().xuatpdf_thang((DefaultTableModel) tblsoluong.getModel(), (DefaultTableModel) tblhuydon.getModel());
            }
            if (cboDate.getSelectedIndex() == 2) {
                new PrintThongKe().xuatpdf_nam((DefaultTableModel) tblsoluong.getModel(), (DefaultTableModel) tblhuydon.getModel());
            }
        }

    }//GEN-LAST:event_btnTimkiem4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnTimkiem2;
    private javax.swing.JButton btnTimkiem3;
    private javax.swing.JButton btnTimkiem4;
    public static javax.swing.JComboBox<String> cboDate;
    public static com.toedter.calendar.JDateChooser jDateNgaybd;
    public static com.toedter.calendar.JDateChooser jDatengayKt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDoanhthu;
    private javax.swing.JLabel lblDoanhthu1;
    private javax.swing.JLabel lbldoanhthutext;
    private javax.swing.JLabel lbldoanhthutext1;
    private javax.swing.JLabel lbldoanhthutext2;
    private javax.swing.JLabel lblsosanh;
    private javax.swing.JLabel lblsosanhso;
    private javax.swing.JLabel lbltongsanpham;
    public static javax.swing.JTable tblhuydon;
    public static javax.swing.JTable tblsoluong;
    // End of variables declaration//GEN-END:variables

    private void filltotablengay() {
        DefaultTableModel model = (DefaultTableModel) tblsoluong.getModel();
        model.setRowCount(0);
        DefaultTableModel model1 = (DefaultTableModel) tblhuydon.getModel();
        model1.setRowCount(0);

        List< Object[]> list = sv.getDoanhThu_ngay_table();
        List<Object[]> list1 = sv.getdonhuyngay();

        for (Object[] row : list) {
            model.addRow(row);

        }
        for (Object[] row : list1) {
            String ma = row[0].toString();
            model1.addRow(new Object[]{row[0], row[1], sv.getsphuyngay(ma)});

        }

    }

    private void filltotablethang() {
        DefaultTableModel model = (DefaultTableModel) tblsoluong.getModel();
        model.setRowCount(0);
        DefaultTableModel model1 = (DefaultTableModel) tblhuydon.getModel();
        model1.setRowCount(0);

        List<Object[]> list = sv.getDoanhThu_Thang_table();
        List<Object[]> list1 = sv.getdonhuythang();

        for (Object[] row : list) {
            model.addRow(row);

        }
        for (Object[] row : list1) {
            String ma = row[0].toString();
            model1.addRow(new Object[]{row[0], row[1], sv.getsphuythang(ma)});

        }

    }

    private void filltotablenam() {
        DefaultTableModel model = (DefaultTableModel) tblsoluong.getModel();
        model.setRowCount(0);
        DefaultTableModel model1 = (DefaultTableModel) tblhuydon.getModel();
        model1.setRowCount(0);

        List<Object[]> list = sv.getDoanhThu_nam_table();
        List<Object[]> list1 = sv.getdonhuynam();

        for (Object[] row : list) {
            model.addRow(row);

        }
        for (Object[] row : list1) {
            String ma = row[0].toString();
            model1.addRow(new Object[]{row[0], row[1], sv.getsphuynam(ma)});

        }

    }

    public void filldoanhthu_ngay_label(String a) {

        List<Long> list = sv.selectdaonhthu_ngay_label();

        lbldoanhthutext.setText("Doanh Thu " + a);
        for (Long tien : list) {

            String patternTienTe = "###,###,###,###,### " + "VND";
            DecimalFormat formatTienTe = new DecimalFormat(patternTienTe);
            String stringTienTe = formatTienTe.format(tien);
            lblDoanhthu.setText(stringTienTe);

        }
        List<Integer> list1 = sv.selecttongdon_ngay_label();
        lbldoanhthutext1.setText("Tổng Đơn Đã Bán " + a);
        for (Integer tien1 : list1) {

            String stringTienTe = String.valueOf(tien1);
            lblDoanhthu1.setText(stringTienTe);

        }

    }

    public void filltotablehuy() {
        DefaultTableModel model = (DefaultTableModel) tblhuydon.getModel();
        model.setRowCount(0);
        int Nam = (int) cboDate.getSelectedItem();
        List<Object[]> list = sv.getDoanhThu_ngay_table();
        System.out.println(Nam);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    private void fillcombo() {
        String[] a = {"Hôm Nay", "Tháng Này", "Năm Này"};
        DefaultComboBoxModel modelcb = (DefaultComboBoxModel) cboDate.getModel();
        for (int i = 0; i < a.length; i++) {
            modelcb.addElement(a[i]);
        }
    }

    private void filldoanhthu_thang_label(String a) {
        List<Long> list = sv.selectdaonhthu_Thang_label();
        lbldoanhthutext.setText("Doanh Thu " + a);
        for (Long tien : list) {

            String patternTienTe = "###,###,###,###,### " + "VND";
            DecimalFormat formatTienTe = new DecimalFormat(patternTienTe);
            String stringTienTe = formatTienTe.format(tien);
            lblDoanhthu.setText(stringTienTe);

        }
        List<Integer> list1 = sv.selecttongdon_thang_label();
        lbldoanhthutext1.setText("Tổng Đơn Đã Bán " + a);
        for (Integer tien1 : list1) {

            String stringTienTe = String.valueOf(tien1);
            lblDoanhthu1.setText(stringTienTe);

        }
    }

    private void filldoanhthu_nam_label(String a) {
        List<Long> list = sv.selectdaonhthu_nam_label();
        lbldoanhthutext.setText("Doanh Thu " + a);
        for (Long tien : list) {

            String patternTienTe = "###,###,###,###,### " + "VND";
            DecimalFormat formatTienTe = new DecimalFormat(patternTienTe);
            String stringTienTe = formatTienTe.format(tien);
            lblDoanhthu.setText(stringTienTe);

        }
        List<Integer> list1 = sv.selecttongdon_nam_label();
        lbldoanhthutext1.setText("Tổng Đơn Đã Bán " + a);
        for (Integer tien1 : list1) {

            String stringTienTe = String.valueOf(tien1);
            lblDoanhthu1.setText(stringTienTe);

        }
    }

    private void fillsosanh_Thang_label(String a) {
        List<Long> list = sv.selectsosanh_Thang_label();
        lblsosanh.setText("Doanh Thu " + a);
        for (Long tien : list) {

            String patternTienTe = "###,###,###,###,### " + "VND";
            DecimalFormat formatTienTe = new DecimalFormat(patternTienTe);
            String stringTienTe = formatTienTe.format(tien);
            lblsosanhso.setText(stringTienTe);

        }
    }

    private void fillsosanh_Ngay_label(String a) {
        List<Long> list = sv.selectsosanh_ngay_label();
        lblsosanh.setText("Doanh Thu " + a);
        for (Long tien : list) {

            String patternTienTe = "###,###,###,###,### " + "VND";
            DecimalFormat formatTienTe = new DecimalFormat(patternTienTe);
            String stringTienTe = formatTienTe.format(tien);
            lblsosanhso.setText(stringTienTe);

        }
    }

    private void fillsosanh_nam_label(String a) {
        List<Long> list = sv.selectsosanh_nam_label();
        lblsosanh.setText("Doanh Thu " + a);
        for (Long tien : list) {

            String patternTienTe = "###,###,###,###,### " + "VND";
            DecimalFormat formatTienTe = new DecimalFormat(patternTienTe);
            String stringTienTe = formatTienTe.format(tien);
            lblsosanhso.setText(stringTienTe);

        }
    }

    private void filltongspban_thang_label(String a) {
        List<Integer> list1 = sv.selecttongsp_thang_label();
        lbldoanhthutext2.setText("Tổng Sản Phẩm Bán " + a);
        for (Integer tien1 : list1) {

            String stringTienTe = String.valueOf(tien1);
            lbltongsanpham.setText(stringTienTe);

        }
    }

    private void filltongspban_ngay_label(String a) {
        List<Integer> list1 = sv.selecttongsp_ngay_label();
        lbldoanhthutext2.setText("Tổng Sản Phẩm Bán " + a);
        for (Integer tien1 : list1) {

            String stringTienTe = String.valueOf(tien1);
            lbltongsanpham.setText(stringTienTe);

        }
    }

    private void filltongspban_nam_label(String a) {
        List<Integer> list1 = sv.selecttongsp_nam_label();
        lbldoanhthutext2.setText("Tổng Sản Phẩm Bán " + a);
        for (Integer tien1 : list1) {

            String stringTienTe = String.valueOf(tien1);
            lbltongsanpham.setText(stringTienTe);

        }
    }

}
