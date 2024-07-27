/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.BanChiTietDAO;
import Dao.BanDao;
import Dao.HoaDonDAO;
import Dao.*;
import Dao.SanPhamDao;
import Entity.BanEntity;
import Entity.BanChiTietEntity;
import Entity.HoaDonEntity;
import Entity.HoaDonChiTietEntity;
import view.ChucNangTachSLSPJDialog;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ChucNangTachDonJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ChucNangTachDonJDialog
     */
    public ChucNangTachDonJDialog(java.awt.Frame parent, boolean modal, int hd, int ban) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        idhd = hd;
        idban = ban;
        filltoTABLEhiendau();
        lblDonHienTai.setText(hd + "");
        mnTachdon.setEnabled(false);
    }
    static int idhd;
    static int idban;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnTachdon = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDonHienTai = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDontach = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHDchitiet = new javax.swing.JTable();
        btnTachDon = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHDchitiet1 = new javax.swing.JTable();
        btnXedon = new javax.swing.JButton();
        btnhuy = new javax.swing.JButton();

        mnTachdon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnTachdon.setText("Tách đơn");
        mnTachdon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTachdonActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnTachdon);

        jMenuItem1.setText("jMenuItem1");
        jPopupMenu2.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Đơn hiện tại:");

        lblDonHienTai.setBackground(new java.awt.Color(255, 255, 255));
        lblDonHienTai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDonHienTai.setText("......");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Đơn tách:");

        lblDontach.setBackground(new java.awt.Color(255, 255, 255));
        lblDontach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDontach.setText("......");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        tblHDchitiet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblHDchitiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá ", "Tổng giá", "Ghi chú"
            }
        ));
        tblHDchitiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblHDchitietMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblHDchitiet);

        btnTachDon.setBackground(new java.awt.Color(0, 255, 0));
        btnTachDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTachDon.setText("Tách đơn");
        btnTachDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTachDonActionPerformed(evt);
            }
        });

        tblHDchitiet1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblHDchitiet1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá ", "Tổng giá", "Ghi chú"
            }
        ));
        jScrollPane2.setViewportView(tblHDchitiet1);

        btnXedon.setBackground(new java.awt.Color(0, 255, 0));
        btnXedon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXedon.setText("Xé đơn");
        btnXedon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXedonActionPerformed(evt);
            }
        });

        btnhuy.setBackground(new java.awt.Color(255, 51, 51));
        btnhuy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhuy.setText("Hủy");
        btnhuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDonHienTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTachDon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDontach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnhuy, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnXedon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDonHienTai)
                    .addComponent(jLabel3)
                    .addComponent(btnTachDon))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblDontach)
                    .addComponent(btnXedon)
                    .addComponent(btnhuy))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if (tblHDchitiet1.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this, "Đang thực hiện dở xé đơn! Chắc chắn muốn thoát?") == JOptionPane.YES_OPTION) {
                dispose();
            }
        } else {
            dispose();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnTachDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTachDonActionPerformed

        // Kiểm tra xem có ít nhất một hàng nào đó được chọn trong bảng tblHDchitiet
        if (tblHDchitiet.getSelectedRows().length < 1) {
            JOptionPane.showMessageDialog(this, "Chưa chọn sản phẩm tách!");
            return; // Nếu không có hàng nào được chọn, hiển thị thông báo và thoát khỏi phương thức
        }

        // Lấy chỉ số hàng đã chọn
        int row = tblHDchitiet.getSelectedRow();

        // Kiểm tra nếu chỉ có một hàng trong bảng và số lượng sản phẩm là 1
        // Trong trường hợp này, không cho phép tách thêm sản phẩm nữa
        if (tblHDchitiet.getRowCount() == 1 && Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) == 1) {
            JOptionPane.showMessageDialog(this, "Không tách thêm nữa!");
            return; // Hiển thị thông báo và thoát nếu điều kiện đúng
        }

        // Nếu số lượng sản phẩm của hàng hiện tại lớn hơn 1
        if (Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) > 1) {
            // Mở hộp thoại để người dùng chọn số lượng sản phẩm cần tách
            ChucNangTachSLSPJDialog cnsl = new ChucNangTachSLSPJDialog(
                    null, true, idhd,
                    tblHDchitiet.getValueAt(row, 0).toString(),
                    Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()),
                    tblHDchitiet.getRowCount()
            );
            cnsl.setVisible(true); // Hiển thị hộp thoại

            // Cập nhật danh sách sản phẩm gốc với thông tin mới từ hộp thoại
            listbctgoc.set(row, cnsl.hdctsua());
            filltoTABLEsua(); // Làm mới bảng hiển thị thông tin sản phẩm gốc

            // Nếu danh sách sản phẩm được tách trống
            if (listbctduocXe.size() == 0) {
                listbctduocXe.add(cnsl.hdcttach()); // Thêm sản phẩm tách vào danh sách
                filltoTABLEDonTach(listbctduocXe); // Làm mới bảng hiển thị thông tin sản phẩm tách

                // Nếu số lượng sản phẩm của hàng hiện tại giảm xuống 0
                if (Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) == 0) {
                    listbctgoc.remove(row); // Xóa hàng khỏi danh sách sản phẩm gốc
                    filltoTABLEsua(); // Làm mới bảng hiển thị thông tin sản phẩm gốc
                }
                return; // Thoát khỏi phương thức
            }

            // Duyệt qua các hàng trong bảng tblHDchitiet1 để cập nhật sản phẩm tách
            for (int i = 0; i < tblHDchitiet1.getRowCount(); i++) {
                // Nếu sản phẩm tách đã tồn tại trong danh sách sản phẩm được tách
                if (cnsl.hdcttach().getID_SanPHam().equalsIgnoreCase(tblHDchitiet1.getValueAt(row, 0).toString())) {
                    // Cập nhật số lượng và giá của sản phẩm trong danh sách tách
                    int soluong = Integer.parseInt(tblHDchitiet1.getValueAt(i, 2).toString());
                    HoaDonChiTietEntity hdon = cnsl.hdcttach();
                    hdon.setSoluong(soluong + hdon.getSoluong());
                    hdon.setTongGia(hdon.getSoluong() * hdon.getGia());
                    listbctduocXe.set(i, hdon); // Cập nhật danh sách sản phẩm tách
                    filltoTABLEDonTach(listbctduocXe); // Làm mới bảng hiển thị thông tin sản phẩm tách

                    // Nếu số lượng sản phẩm của hàng hiện tại giảm xuống 0
                    if (Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) == 0) {
                        listbctgoc.remove(row); // Xóa hàng khỏi danh sách sản phẩm gốc
                        filltoTABLEsua(); // Làm mới bảng hiển thị thông tin sản phẩm gốc
                    }
                    return; // Thoát khỏi phương thức
                } else {
                    // Nếu sản phẩm tách không trùng với bất kỳ sản phẩm nào trong danh sách sản phẩm được tách
                    listbctduocXe.add(cnsl.hdcttach()); // Thêm sản phẩm tách vào danh sách
                    filltoTABLEDonTach(listbctduocXe); // Làm mới bảng hiển thị thông tin sản phẩm tách

                    // Nếu số lượng sản phẩm của hàng hiện tại giảm xuống 0
                    if (Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) == 0) {
                        listbctgoc.remove(row); // Xóa hàng khỏi danh sách sản phẩm gốc
                        filltoTABLEsua(); // Làm mới bảng hiển thị thông tin sản phẩm gốc
                    }
                    return; // Thoát khỏi phương thức
                }
            }
        } else {
            // Nếu số lượng sản phẩm của hàng hiện tại không lớn hơn 1
            for (int i = 0; i < tblHDchitiet1.getRowCount(); i++) {
                // Nếu sản phẩm trong bảng tblHDchitiet trùng với sản phẩm trong bảng tblHDchitiet1
                if (tblHDchitiet.getValueAt(row, 0).toString().equalsIgnoreCase(tblHDchitiet1.getValueAt(i, 0).toString())) {
                    // Cập nhật thông tin sản phẩm trong danh sách tách
                    HoaDonChiTietEntity hdct = findToHDCT(tblHDchitiet.getValueAt(row, 0).toString());
                    hdct.setSoluong(hdct.getSoluong() + Integer.parseInt(tblHDchitiet1.getValueAt(i, 2).toString()));
                    hdct.setTongGia(hdct.getSoluong() * hdct.getGia());
                    hdct.setGhiChu("Tách từ đơn: " + hdct.getID_Hoadon() + ", SL: " + hdct.getSoluong());
                    listbctduocXe.set(i, hdct); // Cập nhật danh sách sản phẩm tách
                    listbctgoc.remove(row); // Xóa hàng khỏi danh sách sản phẩm gốc
                    filltoTABLEsua(); // Làm mới bảng hiển thị thông tin sản phẩm gốc
                    filltoTABLEDonTach(listbctduocXe); // Làm mới bảng hiển thị thông tin sản phẩm tách
                    return; // Thoát khỏi phương thức
                }
            }
            // Nếu sản phẩm tách không có trong danh sách sản phẩm được tách
            HoaDonChiTietEntity hdct = findToHDCT(tblHDchitiet.getValueAt(row, 0).toString());
            hdct.setGhiChu("Tách từ đơn: " + hdct.getID_Hoadon() + ", SL: " + hdct.getSoluong());
            listbctduocXe.add(hdct); // Thêm sản phẩm tách vào danh sách
            listbctgoc.remove(row); // Xóa hàng khỏi danh sách sản phẩm gốc
            filltoTABLEsua(); // Làm mới bảng hiển thị thông tin sản phẩm gốc
            filltoTABLEDonTach(listbctduocXe); // Làm mới bảng hiển thị thông tin sản phẩm tách
        }
    }//GEN-LAST:event_btnTachDonActionPerformed
    public HoaDonChiTietEntity findToHDCT(String masp) {
        for (int i = 0; i < listbctgoc.size(); i++) {
            if (listbctgoc.get(i).getID_SanPHam().equalsIgnoreCase(masp)) {
                return listbctgoc.get(i);
            }
        }
        return null;
    }
    private void mnTachdonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTachdonActionPerformed
        // TODO add your handling code here:
////        if (lblDontach.getText().equals(".....")) {
////            mnTachdon.setEnabled(false);
////        }else{
////            mnTachdon.setEnabled(true);
////        }
//        Hoadon hdtachmoitien = DAOHD.selectById(Integer.parseInt(lblDontach.getText()));
//        int tiendonmoi = hdtachmoitien.getThanhTien();
//        int row = tblHDchitiet.getSelectedRow();
//        if (Integer.parseInt(tblHDchitiet.getValueAt(row, 2).toString()) == 1 && tblHDchitiet.getRowCount() == 1) {
//            JOptionPane.showMessageDialog(this, "hóa đơn không được phép tách hết sản phẩm");
//            return;
//        }
//        if ((int) tblHDchitiet.getValueAt(row, 2) > 1) {
//            ChucNangTachSLSPJDialog cnsl = new ChucNangTachSLSPJDialog(null, true, idhd, tblHDchitiet.getValueAt(row, 0).toString(),Integer.parseInt(lblDontach.getText()), tblHDchitiet.getRowCount());
//            cnsl.setVisible(true);
//            tiendonmoi += cnsl.tiencong;
//            filltoTABLE();
//        }else{
//            Hoadonchitiet hdchitietcu = DAOhdct.selectById(idhd, tblHDchitiet.getValueAt(row, 0).toString());
//            hdchitietcu.setGhiChu("Tách từ đơn: "+hdchitietcu.getID_Hoadon()+", SL: "+hdchitietcu.getSoluong());
//            DAOhdct.update_ghichu(hdchitietcu);
//            DAOhdct.updateIDHOADON( Integer.parseInt(lblDonHienTai.getText()),Integer.parseInt(lblDontach.getText()),tblHDchitiet.getValueAt(row, 0).toString());
//            tiendonmoi += (int) tblHDchitiet.getValueAt(row, 4);
//            filltoTABLE();
//        }
//        
//        Hoadon hdtachmoi = DAOHD.selectById(Integer.parseInt(lblDontach.getText()));
//        hdtachmoi.setThanhTien(tiendonmoi);
//        DAOHD.updateThanhtien(hdtachmoi);
//        filltoTABLE();
//        int tiendoncu = 0;
//        for (int j = 0; j < tblHDchitiet.getRowCount(); j++) {
//            tiendoncu += (int) tblHDchitiet.getValueAt(j, 4);
//        }
//        Hoadon hoadoncu = DAOHD.selectById(idhd);
//        hoadoncu.setThanhTien(tiendoncu);
//        DAOHD.updateThanhtien(hoadoncu);
//        filltoTABLEDonTach();
    }//GEN-LAST:event_mnTachdonActionPerformed

    private void tblHDchitietMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDchitietMouseReleased
        // TODO add your handling code here:
        int r = tblHDchitiet.rowAtPoint(evt.getPoint());
        if (r >= 0 && r < tblHDchitiet.getRowCount()) {
            tblHDchitiet.setRowSelectionInterval(r, r);
        } else {
            tblHDchitiet.clearSelection();
        }

        int rowindex = tblHDchitiet.getSelectedRow();
        if (rowindex < 0) {
            return;
        }
        if (evt.isPopupTrigger() && evt.getComponent() instanceof JTable) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblHDchitietMouseReleased

    private void btnXedonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXedonActionPerformed
        // TODO add your handling code here:
        // Lấy thông tin hóa đơn gốc từ cơ sở dữ liệu bằng cách sử dụng id của hóa đơn hiện tại
        HoaDonEntity hdgoc = DAOHD.selectById(idhd);

        // Tạo một đối tượng hóa đơn mới để chứa các sản phẩm đã được tách ra
        HoaDonEntity hdtach = new HoaDonEntity();
        hdtach.setIdNhanVien("NV1"); // Gán ID nhân viên cho hóa đơn mới
        hdtach.setNgayTao(hdgoc.getNgayTao()); // Gán ngày tạo hóa đơn mới giống như hóa đơn gốc
        hdtach.setTrangThai(true); // Đặt trạng thái của hóa đơn mới là "đã hoàn thành"
        hdtach.setTrangThaiTT(false); // Đặt trạng thái thanh toán của hóa đơn mới là "chưa thanh toán"
        DAOHD.insert(hdtach); // Thêm hóa đơn mới vào cơ sở dữ liệu

        // Lấy danh sách tất cả các hóa đơn để cập nhật giao diện
        List<HoaDonEntity> list = DAOHD.selectAll();
        lblDontach.setText(list.get(list.size() - 1).getIdHoaDon() + ""); // Cập nhật ID của hóa đơn tách mới lên giao diện

        // Lấy thông tin chi tiết bàn từ cơ sở dữ liệu
        BanChiTietEntity bct = DAObanct.selectById(idban, idhd);
        BanChiTietEntity banct = new BanChiTietEntity();
        banct.setID_Ban(idban); // Gán ID bàn
        banct.setID_HoaDon(Integer.parseInt(lblDontach.getText())); // Gán ID hóa đơn mới
        banct.setThoidiemCoNguoi(bct.getThoidiemCoNguoi()); // Gán thời điểm có người cho bàn mới
        banct.setBanChinh(true); // Đặt bàn mới là bàn chính
        DAObanct.insert(banct); // Thêm thông tin chi tiết bàn vào cơ sở dữ liệu

        // Lấy danh sách chi tiết hóa đơn của hóa đơn gốc
        List<HoaDonChiTietEntity> listhdct = DAOhdct.selectByIdHD(idhd);
        for (HoaDonChiTietEntity hdctgoc : listhdct) {
            // Duyệt qua danh sách sản phẩm tách để xử lý
            for (int i = 0; i < listbctduocXe.size(); i++) {
                if (listbctduocXe.get(i).getID_SanPHam().equalsIgnoreCase(hdctgoc.getID_SanPHam())) {
                    System.out.println("a+ " + listbctduocXe.get(i).getID_SanPHam());

                    if (hdctgoc.getSoluong() > 1) { // Nếu số lượng của sản phẩm gốc lớn hơn 1
                        System.out.println("a1+" + hdctgoc.getSoluong());
                        int soluong = hdctgoc.getSoluong() - listbctduocXe.get(i).getSoluong(); // Tính số lượng còn lại trong hóa đơn gốc

                        if (soluong == 0) { // Nếu số lượng còn lại là 0
                            hdctgoc.setGhiChu(listbctduocXe.get(i).getGhiChu()); // Cập nhật ghi chú
                            DAOhdct.update_ghichu(hdctgoc); // Cập nhật ghi chú trong cơ sở dữ liệu
                            DAOhdct.updateIDHOADON(Integer.parseInt(lblDonHienTai.getText()), Integer.parseInt(lblDontach.getText()), listbctduocXe.get(i).getID_SanPHam()); // Cập nhật ID hóa đơn
                        } else {
                            hdctgoc.setSoluong(soluong); // Cập nhật số lượng còn lại
                            hdctgoc.setTongGia(soluong * hdctgoc.getGia()); // Cập nhật tổng giá
                            DAOhdct.update_SL(hdctgoc); // Cập nhật số lượng và tổng giá trong cơ sở dữ liệu

                            // Thêm chi tiết hóa đơn tách vào cơ sở dữ liệu
                            HoaDonChiTietEntity hdcttach = listbctduocXe.get(i);
                            hdcttach.setID_Hoadon(Integer.parseInt(lblDontach.getText())); // Gán ID hóa đơn mới
                            DAOhdct.insert(hdcttach); // Thêm vào cơ sở dữ liệu
                        }
                    } else { // Nếu số lượng của sản phẩm gốc là 1
                        HoaDonChiTietEntity hdchitietcu = DAOhdct.selectById(idhd, hdctgoc.getID_SanPHam());
                        hdchitietcu.setGhiChu(listbctduocXe.get(i).getGhiChu()); // Cập nhật ghi chú
                        DAOhdct.update_ghichu(hdchitietcu); // Cập nhật ghi chú trong cơ sở dữ liệu
                        DAOhdct.updateIDHOADON(Integer.parseInt(lblDonHienTai.getText()), Integer.parseInt(lblDontach.getText()), listbctduocXe.get(i).getID_SanPHam()); // Cập nhật ID hóa đơn
                        System.out.println("a2");
                    }
                }
            }
        }

        // Cập nhật tổng tiền của hóa đơn gốc và hóa đơn mới
        List<HoaDonChiTietEntity> listupdatetiendoncu = DAOhdct.selectByIdHD(idhd);
        int tiendoncu = 0;
        int tiendonmoi = 0;

        for (HoaDonChiTietEntity hoadonchitiet : listupdatetiendoncu) {
            tiendoncu += hoadonchitiet.getTongGia(); // Tính tổng tiền của hóa đơn gốc
        }
        HoaDonEntity hoadoncu = DAOHD.selectById(idhd);
        hoadoncu.setThanhTien(tiendoncu); // Cập nhật tổng tiền của hóa đơn gốc
        DAOHD.updateThanhtien(hoadoncu); // Cập nhật trong cơ sở dữ liệu

        for (int i = 0; i < listbctduocXe.size(); i++) {
            HoaDonChiTietEntity hd = listbctduocXe.get(i);
            tiendonmoi += hd.getTongGia(); // Tính tổng tiền của hóa đơn mới
        }
        HoaDonEntity hoadonmoi = DAOHD.selectById(Integer.parseInt(lblDontach.getText()));
        hoadonmoi.setThanhTien(tiendonmoi); // Cập nhật tổng tiền của hóa đơn mới
        DAOHD.updateThanhtien(hoadonmoi); // Cập nhật trong cơ sở dữ liệu

        // Cập nhật thông tin bàn nếu hóa đơn gốc có nhiều hơn một bàn
        List<BanChiTietEntity> listbct = DAObanct.selectByIdHD(idhd);
        if (listbct.size() > 1) {
            for (BanChiTietEntity banChitiet : listbct) {
                if (banChitiet.isBanChinh() == true) {
                    continue; // Bỏ qua bàn chính
                }
                BanChiTietEntity bcte = DAObanct.selectById(idban, idhd);
                BanChiTietEntity banchitiet = new BanChiTietEntity();
                BanEntity bane = DAOban.selectById(banChitiet.getID_Ban());
                banchitiet.setID_Ban(bane.getIdBan()); // Gán ID bàn mới
                int mabangop = bane.getIdBan();
                banchitiet.setID_HoaDon(hoadonmoi.getIdHoaDon()); // Gán ID hóa đơn mới
                banchitiet.setThoidiemCoNguoi(bcte.getThoidiemCoNguoi()); // Gán thời điểm có người
                banchitiet.setBanChinh(false); // Đặt bàn mới là bàn phụ
                DAOban.updateHoatDong(mabangop); // Cập nhật trạng thái hoạt động của bàn gốc
                DAObanct.insert(banchitiet); // Thêm thông tin chi tiết bàn mới vào cơ sở dữ liệu
            }
        }

        dispose(); // Đóng cửa sổ hiện tại
    }//GEN-LAST:event_btnXedonActionPerformed
    BanDao DAOban = new BanDao();
    private void btnhuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyActionPerformed
        // TODO add your handling code here:
        filltoTABLEhiendau();
        listbctduocXe.removeAll(listbctduocXe);
        filltoTABLEDonTach(listbctduocXe);
    }//GEN-LAST:event_btnhuyActionPerformed

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
            java.util.logging.Logger.getLogger(ChucNangTachDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChucNangTachDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChucNangTachDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChucNangTachDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChucNangTachDonJDialog dialog = new ChucNangTachDonJDialog(new javax.swing.JFrame(), true, idhd, idban);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTachDon;
    private javax.swing.JButton btnXedon;
    private javax.swing.JButton btnhuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDonHienTai;
    private javax.swing.JLabel lblDontach;
    private javax.swing.JMenuItem mnTachdon;
    private javax.swing.JTable tblHDchitiet;
    private javax.swing.JTable tblHDchitiet1;
    // End of variables declaration//GEN-END:variables

    HoadonchitietDAO DAOhdct = new HoadonchitietDAO();
    HoaDonDAO DAOHD = new HoaDonDAO();
    SanPhamDao DAPSP = new SanPhamDao();
    BanChiTietDAO DAObanct = new BanChiTietDAO();
    List<HoaDonChiTietEntity> listbctduocXe = new ArrayList<>();
    List<HoaDonChiTietEntity> listbctgoc;

    public void filltoTABLEhiendau() {
        DefaultTableModel model = (DefaultTableModel) tblHDchitiet.getModel();
        model.setRowCount(0);
        List<HoaDonChiTietEntity> listbct = DAOhdct.selectByIdHD(idhd);
        listbctgoc = DAOhdct.selectByIdHD(idhd);
        for (HoaDonChiTietEntity hdct : listbct) {
            model.addRow(new Object[]{hdct.getID_SanPHam(),
                DAPSP.selectID(hdct.getID_SanPHam()).getTen_sp(),
                hdct.getSoluong(),
                hdct.getGia(),
                hdct.getTongGia(),
                hdct.getGhiChu()
            });
        }
    }

    public void filltoTABLEsua() {
        DefaultTableModel model = (DefaultTableModel) tblHDchitiet.getModel();
        model.setRowCount(0);
        List<HoaDonChiTietEntity> listbct = listbctgoc;
        for (HoaDonChiTietEntity hdct : listbct) {
            model.addRow(new Object[]{hdct.getID_SanPHam(),
                DAPSP.selectID(hdct.getID_SanPHam()).getTen_sp(),
                hdct.getSoluong(),
                hdct.getGia(),
                hdct.getTongGia(),
                hdct.getGhiChu()
            });
        }
    }

    public void filltoTABLEDonTach(List<HoaDonChiTietEntity> list) {
        DefaultTableModel model = (DefaultTableModel) tblHDchitiet1.getModel();
        model.setRowCount(0);
        //List<Hoadonchitiet> listbct = DAOhdct.selectByIdHD(Integer.parseInt(lblDontach.getText()));
        List<HoaDonChiTietEntity> listbct = list;
        for (HoaDonChiTietEntity hdct : listbct) {
            model.addRow(new Object[]{hdct.getID_SanPHam(),
                DAPSP.selectID(hdct.getID_SanPHam()).getTen_sp(),
                hdct.getSoluong(),
                hdct.getGia(),
                hdct.getTongGia(),
                hdct.getGhiChu()
            });
        }
    }

    public boolean tt() {
        for (int i = 0; i < tblHDchitiet.getRowCount(); i++) {
            int sl = Integer.parseInt(tblHDchitiet.getValueAt(i, 2).toString());
            if (tblHDchitiet.getRowCount() == 1 && sl == 1) {
                btnTachDon.setEnabled(false);
                return true;
            } else {
                btnTachDon.setEnabled(true);
            }
        }
        return false;
    }
}
