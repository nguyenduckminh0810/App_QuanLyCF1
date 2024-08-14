package view;

import Dao.BanChiTietDAO;
import Dao.BanDao;
import Dao.DonViSanPhamDao;
import Dao.HoaDonDAO;
import Dao.HoadonchitietDAO;
import Dao.LoaiSanPhamDao;
import Dao.NhanVienDAO;
import Dao.SanPhamDao;
import Helper.Auth;
import Entity.BanEntity;
import Entity.BanChiTietEntity;
import Entity.HoaDonEntity;
import Entity.HoaDonChiTietEntity;
import Entity.LoaiSanPhamEntity;
import Entity.SanPhamEntity;
import Helper.PrintPDF;
import Helper.Xdate;
import Entity.DonViSanPhamEntity;
import view.ChucNangGopDonJDialog;
import view.ChucNangNhomBanJDialog;
import view.ChucNangTachDonJDialog;
import view.ChucNangThanhToanNhieuDonJDialog;
import view.ChuyenBanJDialog;
import view.GopBanJDialog;
import view.LoaiDonJDialog;
import view.LydoHoaDonHuyJDialog;
import view.LydohuySanPhamJDialog;
import view.NhapThongTinKhachHangDonShipJDialog;
import view.NhapsoluongSanPhamJDialog;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class QuanLyBanHangJPanel extends javax.swing.JPanel {
    
    Locale vn = new Locale("vi", "VN");

    public QuanLyBanHangJPanel() {
        initComponents();
        getDateNow();
        filltoDesk();
        filltoDesktaiquay();
        filltoComboboxLSP();
        filltableSanPham();

        filltoHoadonCTT();
        txtTongTien.setEditable(false);
        txttienThoi.setEditable(false);
        txttienKhachTra.setEditable(false);
        btnHuydon.setEnabled(false);
        btnThanhToan.setEnabled(false);
        setSizetblehoadon();
        setSizetblehoadonctt();
//        int row = tblHoadon.getSelectedRow();

        if (Auth.isLogin() == true) {
            txthientennhanvien.setText(Auth.user.getTenNV());
        }

    }

    public void setSizetblehoadon() {
        tblHoadonchitiet.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblHoadonchitiet.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblHoadonchitiet.getColumnModel().getColumn(1).setPreferredWidth(20);
        tblHoadonchitiet.getColumnModel().getColumn(2).setPreferredWidth(120);
        tblHoadonchitiet.getColumnModel().getColumn(3).setPreferredWidth(15);
        tblHoadonchitiet.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblHoadonchitiet.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblHoadonchitiet.getColumnModel().getColumn(6).setPreferredWidth(160);
    }

    public void setSizetblehoadonctt() {
        tblHoadon.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblHoadon.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblHoadon.getColumnModel().getColumn(5).setPreferredWidth(20);
        tblHoadon.getColumnModel().getColumn(6).setPreferredWidth(120);

    }

    public void getDateNow() {
        Date date = new Date();
        String nowDay = Helper.Xdate.toString(date, "yyyy-MM-dd");
        lblNgay.setText(nowDay);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnaddDEsk = new javax.swing.JMenuItem();
        pmnHoadonchitiet = new javax.swing.JPopupMenu();
        btnxoaHDchitiet = new javax.swing.JMenuItem();
        mnSuaSl = new javax.swing.JMenuItem();
        pmnHoadonctt = new javax.swing.JPopupMenu();
        mnChuyenban = new javax.swing.JMenuItem();
        mnHuyDon = new javax.swing.JMenuItem();
        mnTachDon = new javax.swing.JMenuItem();
        mnGopDon = new javax.swing.JMenuItem();
        mnSuaThongtinkhach = new javax.swing.JMenuItem();
        pmnBan = new javax.swing.JPopupMenu();
        mnXoaDan = new javax.swing.JMenuItem();
        mnSua = new javax.swing.JMenuItem();
        mnNhomBan = new javax.swing.JMenuItem();
        mnGopBan = new javax.swing.JMenuItem();
        pnBan = new javax.swing.JPanel();
        pnHoadon = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblMaHoaDon = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txttienKhachTra = new javax.swing.JTextField();
        txttienThoi = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnThanhToan = new javax.swing.JButton();
        btnHuydon = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txthientennhanvien = new javax.swing.JLabel();
        btnTaoDon = new javax.swing.JButton();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHoadon = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHoadonchitiet = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        lblBan = new javax.swing.JLabel();
        btnTaoDon1 = new javax.swing.JButton();
        btnThemBan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtTimkiem = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cboLoaidouong = new javax.swing.JComboBox<>();
        btnThemDo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        pnTaiQuay = new javax.swing.JPanel();

        jPopupMenu1.setBackground(new java.awt.Color(102, 102, 255));

        mnaddDEsk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnaddDEsk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        mnaddDEsk.setText("Thêm bàn");
        mnaddDEsk.setPreferredSize(new java.awt.Dimension(120, 20));
        mnaddDEsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnaddDEskActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnaddDEsk);

        btnxoaHDchitiet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnxoaHDchitiet.setText("Xóa sản phẩm");
        btnxoaHDchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaHDchitietActionPerformed(evt);
            }
        });
        pmnHoadonchitiet.add(btnxoaHDchitiet);

        mnSuaSl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnSuaSl.setText("Sửa số lượng");
        mnSuaSl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSuaSlActionPerformed(evt);
            }
        });
        pmnHoadonchitiet.add(mnSuaSl);

        mnChuyenban.setText("Chuyển bàn");
        mnChuyenban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnChuyenbanActionPerformed(evt);
            }
        });
        pmnHoadonctt.add(mnChuyenban);

        mnHuyDon.setText("Hủy Đơn");
        mnHuyDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnHuyDonActionPerformed(evt);
            }
        });
        pmnHoadonctt.add(mnHuyDon);

        mnTachDon.setText("Tách đơn");
        mnTachDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTachDonActionPerformed(evt);
            }
        });
        pmnHoadonctt.add(mnTachDon);

        mnGopDon.setText("Gộp tới");
        mnGopDon.setToolTipText("");
        mnGopDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGopDonActionPerformed(evt);
            }
        });
        pmnHoadonctt.add(mnGopDon);

        mnSuaThongtinkhach.setText("Sửa thông tin khách hàng");
        mnSuaThongtinkhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSuaThongtinkhachActionPerformed(evt);
            }
        });
        pmnHoadonctt.add(mnSuaThongtinkhach);

        mnXoaDan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnXoaDan.setText("Xoá bàn");
        mnXoaDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnXoaDanActionPerformed(evt);
            }
        });
        pmnBan.add(mnXoaDan);

        mnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnSua.setText("Sửa");
        mnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSuaActionPerformed(evt);
            }
        });
        pmnBan.add(mnSua);

        mnNhomBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnNhomBan.setText("Nhóm Bàn");
        mnNhomBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNhomBanActionPerformed(evt);
            }
        });
        pmnBan.add(mnNhomBan);

        mnGopBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnGopBan.setText("Gộp bàn tới");
        mnGopBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGopBanActionPerformed(evt);
            }
        });
        pmnBan.add(mnGopBan);

        setBackground(new java.awt.Color(241, 241, 241));

        pnBan.setBackground(new java.awt.Color(241, 241, 241));
        pnBan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Bàn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        pnBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnBanMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnBanLayout = new javax.swing.GroupLayout(pnBan);
        pnBan.setLayout(pnBanLayout);
        pnBanLayout.setHorizontalGroup(
            pnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnBanLayout.setVerticalGroup(
            pnBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        pnHoadon.setBackground(new java.awt.Color(241, 241, 241));
        pnHoadon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Mã Hóa Đơn: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Ngày:");

        lblMaHoaDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMaHoaDon.setText("......");

        lblNgay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNgay.setText("......");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Tổng tiền:");

        txtTongTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTongTien.setText("0");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Tiền khách trả:");

        txttienKhachTra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttienKhachTra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttienKhachTraKeyReleased(evt);
            }
        });

        txttienThoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttienThoi.setText("0");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Tiền thối:");

        btnThanhToan.setBackground(new java.awt.Color(0, 255, 0));
        btnThanhToan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnHuydon.setBackground(new java.awt.Color(255, 51, 0));
        btnHuydon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHuydon.setForeground(new java.awt.Color(255, 255, 255));
        btnHuydon.setText("Hủy đơn");
        btnHuydon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuydonActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("Nhân viên:");

        txthientennhanvien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txthientennhanvien.setText("..............................");

        btnTaoDon.setBackground(new java.awt.Color(0, 255, 0));
        btnTaoDon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTaoDon.setText("Tạo đơn");
        btnTaoDon.setToolTipText("");
        btnTaoDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoDonActionPerformed(evt);
            }
        });

        tblHoadon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "Ngày", "Thanh toán", "Người tạo", "Tổng tiền (VND)", "Bàn", "SĐT khách hàng"
            }
        ));
        tblHoadon.setEditingColumn(1);
        tblHoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblHoadonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblHoadonMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblHoadon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabs.addTab("Hóa đơn", jPanel2);

        tblHoadonchitiet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblHoadonchitiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Mã SP", "Tên Sản  Phẩm", "SL", "Size", "Tiền upsize", "Tổng tiền", "Ghi chú"
            }
        ));
        tblHoadonchitiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblHoadonchitietMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblHoadonchitiet);
        if (tblHoadonchitiet.getColumnModel().getColumnCount() > 0) {
            tblHoadonchitiet.getColumnModel().getColumn(0).setMinWidth(70);
            tblHoadonchitiet.getColumnModel().getColumn(1).setMinWidth(70);
            tblHoadonchitiet.getColumnModel().getColumn(3).setMinWidth(70);
            tblHoadonchitiet.getColumnModel().getColumn(5).setMinWidth(100);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        tabs.addTab("Hóa đơn chi tiết", jPanel3);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setText("Bàn:");

        lblBan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBan.setText("......");

        btnTaoDon1.setBackground(new java.awt.Color(255, 204, 204));
        btnTaoDon1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTaoDon1.setText("In");
        btnTaoDon1.setToolTipText("");
        btnTaoDon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoDon1ActionPerformed(evt);
            }
        });

        btnThemBan.setBackground(new java.awt.Color(0, 255, 0));
        btnThemBan.setText("Thêm bàn");
        btnThemBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemBanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnHoadonLayout = new javax.swing.GroupLayout(pnHoadon);
        pnHoadon.setLayout(pnHoadonLayout);
        pnHoadonLayout.setHorizontalGroup(
            pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(pnHoadonLayout.createSequentialGroup()
                        .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnHoadonLayout.createSequentialGroup()
                                .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHoadonLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(pnHoadonLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnHoadonLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnHuydon, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnHoadonLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(20, 20, 20)
                                        .addComponent(txttienKhachTra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThanhToan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTaoDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnHoadonLayout.createSequentialGroup()
                                .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnHoadonLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(txttienThoi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnHoadonLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txthientennhanvien)))
                                .addGap(173, 173, 173)
                                .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnThemBan, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTaoDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnHoadonLayout.setVerticalGroup(
            pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoadonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblBan))
                        .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblMaHoaDon)))
                    .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTaoDon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHuydon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txttienKhachTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnHoadonLayout.createSequentialGroup()
                        .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(lblNgay))
                            .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(txttienThoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(pnHoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txthientennhanvien)))
                    .addGroup(pnHoadonLayout.createSequentialGroup()
                        .addComponent(btnThemBan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTaoDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        txtTimkiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimkiemKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Tìm kiếm(theo tên)");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Loại đồ uống");

        cboLoaidouong.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cboLoaidouong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaidouongItemStateChanged(evt);
            }
        });

        btnThemDo.setBackground(new java.awt.Color(0, 255, 0));
        btnThemDo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThemDo.setText("Chọn đồ uống");
        btnThemDo.setBorder(null);
        btnThemDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDoActionPerformed(evt);
            }
        });

        tblSanPham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản phẩm", "Tên sản phẩm", "Loại", "Giá (VND)"
            }
        ));
        jScrollPane2.setViewportView(tblSanPham);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboLoaidouong, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemDo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboLoaidouong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnThemDo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pnTaiQuay.setBackground(new java.awt.Color(241, 241, 241));
        pnTaiQuay.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tại quầy", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        pnTaiQuay.setPreferredSize(new java.awt.Dimension(440, 100));

        javax.swing.GroupLayout pnTaiQuayLayout = new javax.swing.GroupLayout(pnTaiQuay);
        pnTaiQuay.setLayout(pnTaiQuayLayout);
        pnTaiQuayLayout.setHorizontalGroup(
            pnTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );
        pnTaiQuayLayout.setVerticalGroup(
            pnTaiQuayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnHoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnTaiQuay, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnTaiQuay, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnHoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDoActionPerformed
        // TODO add your handling code here:
        //nếu cái dòng thông tin mã hóa đơn bị trống ...... thì là chưa tạo hóa đơn
        if (lblMaHoaDon.getText().equals("......")) {
            JOptionPane.showMessageDialog(this, "Chưa tạo đơn");
            return;
        }
        int row = tblSanPham.getSelectedRow(); // lấy vào dòng đang chọn
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "chưa chọn sản phẩm");
            return;
        }
        // lấy mã sản phẩm từ bảng sản phẩm 
        String masp = tblSanPham.getValueAt(row, 0).toString();

        if (!DAOHDCHITIET.selectByIdHD_TT0(Integer.parseInt(lblMaHoaDon.getText()), masp).isEmpty()) {
            if (JOptionPane.showConfirmDialog(this, "Sản phẩm này đã bị hủy bạn có muốn khôi phục và sửa số lượng?") == JOptionPane.YES_OPTION) {
                HoaDonChiTietEntity hdtc = DAOHDCHITIET.selectById(Integer.parseInt(lblMaHoaDon.getText()), masp);
                hdtc.setTrangThai(true);
                DAOHDCHITIET.update_TT(hdtc);
                suaSl(masp, Integer.parseInt(lblMaHoaDon.getText()));
            }
        } else if (!DAOHDCHITIET.selectByIdHD_TT1(Integer.parseInt(lblMaHoaDon.getText()), masp).isEmpty()) {
            if (JOptionPane.showConfirmDialog(this, "Đồ uống này đã có trong hóa đơn, vui lòng sửa số lượng\n WARNNING: Size không thể thay đổi!") == JOptionPane.YES_OPTION) {
                suaSl(masp, Integer.parseInt(lblMaHoaDon.getText()));
            }
        } else {
            NhapsoluongSanPhamJDialog a = new NhapsoluongSanPhamJDialog(null, true, masp, Integer.parseInt(lblMaHoaDon.getText()));
            a.setVisible(true);
            filltoTableHDCT();
            HoaDonEntity hd = DAOHOADON.selectById(Integer.parseInt(lblMaHoaDon.getText()));
            hd.setThanhTien(Integer.parseInt(txtTongTien.getText()));
            DAOHOADON.updateThanhtien(hd);
        }
        filltoHoadonCTT();
    }//GEN-LAST:event_btnThemDoActionPerformed

    private void pnBanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBanMouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger() == true) {
            jPopupMenu1.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_pnBanMouseReleased

    private void txtTimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimkiemKeyReleased
        // TODO add your handling code here:
        filltableSanPham();
    }//GEN-LAST:event_txtTimkiemKeyReleased

    private void cboLoaidouongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaidouongItemStateChanged
        // TODO add your handling code here:
        filltableSanPham();
    }//GEN-LAST:event_cboLoaidouongItemStateChanged

    private void mnaddDEskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnaddDEskActionPerformed
        // TODO add your handling code here:
        if (Auth.isManager()) {
            ThemBanJDialog themBan = new ThemBanJDialog(null, true);
            themBan.setVisible(true);
            filltoDesk();
            filltoDesktaiquay();
            updateUI();
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập tài khoản quản lý để sử dụng chức năng này!");
            return;
        }
    }//GEN-LAST:event_mnaddDEskActionPerformed

    private void btnTaoDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoDonActionPerformed
        // TODO add your handling code here:
        LoaiDonJDialog ld = new LoaiDonJDialog(null, true);
        ld.setVisible(true);
        if (ld.buttonsa==1) {
            taoDon();
            filltoHoadonCTT();
            filltoDesktaiquay();
        } else if (ld.buttonsa==0) {
            if (numberDesk == null) {
                JOptionPane.showMessageDialog(this, "Chưa chọn bàn!!!!");
                return;
            }
            if (numberDesk.isHoatDong() == false) {
                JOptionPane.showMessageDialog(this, "Bàn đang có người không thể tạo!");
                return;
            }
            if (numberDesk.isTrangThai() == true) {
                JOptionPane.showMessageDialog(this, "Hãy chọn bàn ảo để lập đơn mang về!");
                return;
            }
            NhapThongTinKhachHangDonShipJDialog nhapthongtin = new NhapThongTinKhachHangDonShipJDialog(null, true, numberDesk, lblNgay.getText());
            nhapthongtin.setVisible(true);
            List<HoaDonEntity> list = DAOHOADON.selectAll();
            filltoDesk();

            filltoDesktaiquay();
            lblMaHoaDon.setText(list.get(list.size() - 1).getIdHoaDon() + "");
            resettrue();
            filltoHoadonCTT();

        }else if(ld.buttonsa==2){
            ld.dispose();
        }
    }//GEN-LAST:event_btnTaoDonActionPerformed

    private void btnHuydonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuydonActionPerformed
        // TODO add your handling code here:
        try {
            if (!lblMaHoaDon.getText().equals("......")) {
                huyDon(numberDesk.getIdBan(), lblMaHoaDon.getText());
                filltoTableHDCT();
                filltoHoadonCTT();
            } else {
                JOptionPane.showMessageDialog(this, "Không có đơn hủy");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHuydonActionPerformed

    private void tblHoadonchitietMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoadonchitietMouseReleased
        // TODO add your handling code here:
        int r = tblHoadonchitiet.rowAtPoint(evt.getPoint());
        if (r >= 0 && r < tblHoadonchitiet.getRowCount()) {
            tblHoadonchitiet.setRowSelectionInterval(r, r);
        } else {
            tblHoadonchitiet.clearSelection();
        }

        int rowindex = tblHoadonchitiet.getSelectedRow();
        if (rowindex < 0) {
            return;
        }
        if (evt.isPopupTrigger() && evt.getComponent() instanceof JTable) {
            pmnHoadonchitiet.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblHoadonchitietMouseReleased

    private void tblHoadonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoadonMouseReleased
        // TODO add your handling code here:
        int r = tblHoadon.rowAtPoint(evt.getPoint());
        if (r >= 0 && r < tblHoadon.getRowCount()) {
            tblHoadon.setRowSelectionInterval(r, r);
        } else {
            tblHoadon.clearSelection();
        }

        int rowindex = tblHoadon.getSelectedRow();
        if (rowindex < 0) {
            return;
        }
        HoaDonEntity hoadon = DAOHOADON.selectById(Integer.parseInt(tblHoadon.getValueAt(rowindex, 0).toString()));
        if (hoadon.getSDT() == null) {
            mnTachDon.setEnabled(true);
            mnChuyenban.setEnabled(true);
            mnGopDon.setEnabled(true);
            mnSuaThongtinkhach.setEnabled(false);
        } else {
            mnTachDon.setEnabled(false);
            mnChuyenban.setEnabled(false);
            mnGopDon.setEnabled(false);
            mnSuaThongtinkhach.setEnabled(true);
        }
        if (evt.isPopupTrigger() && evt.getComponent() instanceof JTable) {
            pmnHoadonctt.show(evt.getComponent(), evt.getX(), evt.getY());
        }

    }//GEN-LAST:event_tblHoadonMouseReleased

    private void txttienKhachTraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttienKhachTraKeyReleased
        // TODO add your handling code here:
        tinhTienThoi();
    }//GEN-LAST:event_txttienKhachTraKeyReleased

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Xác nhận thanh toán!") != JOptionPane.YES_OPTION) {
            return;
        }
        List<HoaDonEntity> list = DAOHOADON.selectCTT(numberDesk.getIdBan());
        if (list.size() > 1) {
            ChucNangThanhToanNhieuDonJDialog cnThanhtoan = new ChucNangThanhToanNhieuDonJDialog(null, true, list, (DefaultTableModel) tblHoadonchitiet.getModel());
            cnThanhtoan.setVisible(true);
            lblMaHoaDon.setText("......");
            filltoDesk();
            resetfalse();
        } else {
            int tienkhachtra = Integer.parseInt(txttienKhachTra.getText());
            if (txttienKhachTra.getText().equals("") || tienkhachtra == 0) {
                JOptionPane.showMessageDialog(this, "Thanh toán thất bại! \nKhách chưa trả tiền hóa đơn");
                return;
            }
            int tienThoi = Integer.parseInt(txttienThoi.getText());
            if (tienThoi < 0) {
                JOptionPane.showMessageDialog(this, "Thanh toán thất bại! \n Khách trả thiếu tiền hóa đơn.");
                return;
            }
            thanhToanDon();
            JOptionPane.showMessageDialog(this, "Thanh toán thành công");
            DAOSP.update_size2("DV1");
        }
        filltoTableHDCT();
        filltoHoadonCTT();
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void mnHuyDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnHuyDonActionPerformed
        // TODO add your handling code here:
        try {
            int row = tblHoadon.getSelectedRow();
            huyDon(DAOBAN.selectIDHD(Integer.parseInt(tblHoadon.getValueAt(row, 0).toString())).getIdBan(), tblHoadon.getValueAt(row, 0).toString());
            filltoTableHDCT();
            filltoHoadonCTT();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnHuyDonActionPerformed

    private void mnChuyenbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnChuyenbanActionPerformed
        // TODO add your handling code here:
        int row = tblHoadon.getSelectedRow();
        int idban = (int) tblHoadon.getValueAt(row, 5);
        int idHd = (int) tblHoadon.getValueAt(row, 0);
        ChuyenBanJDialog cb = new ChuyenBanJDialog(null, true, idban, idHd);
        cb.setVisible(true);
        if (cb.status == false) {
            return;
        }
        filltoHoadonCTT();
        filltoDesk();
        filltoDesktaiquay();
    }//GEN-LAST:event_mnChuyenbanActionPerformed

    private void btnxoaHDchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaHDchitietActionPerformed
        // TODO add your handling code here:
        huySP();
    }//GEN-LAST:event_btnxoaHDchitietActionPerformed

    private void mnXoaDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnXoaDanActionPerformed
        // TODO add your handling code here:
        if (numberDesk.isHoatDong() == false) {
            JOptionPane.showMessageDialog(this, "Bàn đang có người không thể xóa");
            return;
        } else {
            DAOBanCT.delete(numberDesk.getIdBan());
            DAOBAN.delete(numberDesk.getIdBan());

            filltoDesk();
            filltoDesktaiquay();
        }
    }//GEN-LAST:event_mnXoaDanActionPerformed

    private void mnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSuaActionPerformed
        // TODO add your handling code here:
        SuaBanJDialog sua = new SuaBanJDialog(null, true);
        sua.setVisible(true);
        if (sua.status == true) {
            filltoDesk();
            filltoDesktaiquay();
        }
    }//GEN-LAST:event_mnSuaActionPerformed

    private void tblHoadonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoadonMousePressed
        // TODO add your handling code here:
        try {
            if (evt.getClickCount() == 2) {
                HoaDonDAO hdDAOEdit = new HoaDonDAO();
                HoaDonEntity hdEdit = new HoaDonEntity();
                int row = tblHoadon.getSelectedRow();
                numberDesk = DAOBAN.selectIDHD(Integer.parseInt(tblHoadon.getValueAt(row, 0).toString()));
                hoadonNumber = DAOHOADON.selectById(Integer.parseInt(tblHoadon.getValueAt(row, 0).toString()));
                lblMaHoaDon.setText(tblHoadon.getValueAt(row, 0).toString());
                lblBan.setText(tblHoadon.getValueAt(row, 5).toString());
                txtTongTien.setText(tblHoadon.getValueAt(row, 4).toString());
                hdEdit.setIdHoaDon(Integer.parseInt(tblHoadon.getValueAt(row, 0).toString()));
                //cần tìm thành tiền qua mã hđ
//                int idHD = Integer.parseInt(tblHoadon.getValueAt(row, 0).toString());
//                hdEdit.setIdHoaDon(idHD);
//                String input = tblHoadon.getValueAt(row, 4).toString();
//                input=input.replaceAll(",", "");
//                hdEdit.setThanhTien(Integer.parseInt(input));
//                DAOHOADON.updateThanhtien(hdEdit);
                txtTongTien.setText((String) tblHoadon.getValueAt(row, 4));
                filltoTableHDCT();
                resettrue();
                tabs.setSelectedIndex(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblHoadonMousePressed

    private void mnNhomBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNhomBanActionPerformed
        // TODO add your handling code here:
        List<BanChiTietEntity> listbct = DAOBanCT.selectByIdBan(numberDesk.getIdBan());
        if (listbct.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bàn chưa có đơn");
        } else {
            List<BanEntity> list = DAOBAN.selectAll_banthuc();
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hiện tại không có bàn để nhóm");
                return;
            }
            ChucNangNhomBanJDialog cnGopBan = new ChucNangNhomBanJDialog(null, true, numberDesk.getIdBan(), Integer.parseInt(lblMaHoaDon.getText()));
            cnGopBan.setVisible(true);
            if (cnGopBan.trangthaitao != true) {
                return;
            }
            filltoDesk();
            filltoDesktaiquay();
            filltoHoadonCTT();
        }
    }//GEN-LAST:event_mnNhomBanActionPerformed

    private void mnTachDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTachDonActionPerformed
        // TODO add your handling code here:
        try {
            int row = tblHoadon.getSelectedRow();
            ChucNangTachDonJDialog cnTachDon = new ChucNangTachDonJDialog(null, true, Integer.parseInt(tblHoadon.getValueAt(row, 0).toString()), Integer.parseInt(tblHoadon.getValueAt(row, 5).toString()));
            if (!cnTachDon.tt()) {
                cnTachDon.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Số lượng đơn chỉ còn 1 không được tách");
                cnTachDon.dispose();
            }
            filltoHoadonCTT();
            filltoTableHDCT();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnTachDonActionPerformed

    private void mnGopDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGopDonActionPerformed
        // TODO add your handling code here:
        int row = tblHoadon.getSelectedRow();
        int maHD = Integer.parseInt(tblHoadon.getValueAt(row, 0).toString());
        int maB = Integer.parseInt(tblHoadon.getValueAt(row, 5).toString());
        List<HoaDonEntity> list = DAOHOADON.selectCTTALL();
        if (list.size() == 1) {
            JOptionPane.showMessageDialog(this, "Hiện tại không có đơn để gộp tới");
            return;
        }
        List<HoaDonChiTietEntity> listhdct = DAOHDCHITIET.selectByIdHD(Integer.parseInt(tblHoadon.getValueAt(row, 0).toString()));
        if (listhdct.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hóa đơn không có sản phẩm nào.\\nGộp đơn thất bại!");
            return;
        }
        HoaDonEntity hd = DAOHOADON.selectById(Integer.parseInt(tblHoadon.getValueAt(row, 0).toString()));
        ChucNangGopDonJDialog cnGopDon = new ChucNangGopDonJDialog(null, true, hd);
        cnGopDon.setVisible(true);

        if (cnGopDon.status == true) {
            filltoDesk();
            filltoDesktaiquay();
            filltoHoadonCTT();
            filltoTableHDCT();
        }
    }//GEN-LAST:event_mnGopDonActionPerformed

    private void mnGopBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGopBanActionPerformed
        // TODO add your handling code here:
        GopBanJDialog gopban = new GopBanJDialog(null, true, numberDeskhover.getIdBan());
        gopban.setVisible(true);
        if (gopban.status == true) {
            filltoDesk();
            filltoDesktaiquay();
            System.out.println("oke lam");
            filltoHoadonCTT();
            filltoTableHDCT();
        }
    }//GEN-LAST:event_mnGopBanActionPerformed

    private void btnTaoDon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoDon1ActionPerformed
        // TODO add your handling code here:
        PrintPDF p = new PrintPDF();
        if (!lblMaHoaDon.getText().equals("......")) {
            JOptionPane.showMessageDialog(this, "In hóa đơn thành công");
            p.a((DefaultTableModel) tblHoadonchitiet.getModel(), Integer.parseInt(lblMaHoaDon.getText()), Integer.parseInt(txttienKhachTra.getText()), Integer.parseInt(txttienThoi.getText()));
        } else {
            JOptionPane.showMessageDialog(this, "Chưa chọn đơn để in!");
        }
    }//GEN-LAST:event_btnTaoDon1ActionPerformed

    private void mnSuaSlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSuaSlActionPerformed
        // TODO add your handling code here:
        int row = tblHoadonchitiet.getSelectedRow();
        String masp = tblHoadonchitiet.getValueAt(row, 1).toString();
        int mahd = Integer.parseInt(tblHoadonchitiet.getValueAt(row, 0).toString());
        suaSl(masp, mahd);
        filltoHoadonCTT();
        filltoTableHDCT();
    }//GEN-LAST:event_mnSuaSlActionPerformed

    private void mnSuaThongtinkhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSuaThongtinkhachActionPerformed
        // TODO add your handling code here:
        int row = tblHoadon.getSelectedRow();
        HoaDonEntity hd = DAOHOADON.selectById(Integer.parseInt(tblHoadon.getValueAt(row, 0).toString()));
        SuaThongTinKhachhangJDialog suatt = new SuaThongTinKhachhangJDialog(null, true, hd);
        suatt.setVisible(true);
        filltoHoadonCTT();
    }//GEN-LAST:event_mnSuaThongtinkhachActionPerformed

    private void btnThemBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBanActionPerformed
        // TODO add your handling code here:
        if (Auth.isManager()) {
            ThemBanJDialog themBan = new ThemBanJDialog(null, true);
            themBan.setVisible(true);
            filltoDesk();
            filltoDesktaiquay();
            updateUI();
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập tài khoản quản lý để sử dụng chức năng này!");
            return;
        }
    }//GEN-LAST:event_btnThemBanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuydon;
    private javax.swing.JButton btnTaoDon;
    private javax.swing.JButton btnTaoDon1;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemBan;
    private javax.swing.JButton btnThemDo;
    private javax.swing.JMenuItem btnxoaHDchitiet;
    private javax.swing.JComboBox<String> cboLoaidouong;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblBan;
    private javax.swing.JLabel lblMaHoaDon;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JMenuItem mnChuyenban;
    private javax.swing.JMenuItem mnGopBan;
    private javax.swing.JMenuItem mnGopDon;
    private javax.swing.JMenuItem mnHuyDon;
    private javax.swing.JMenuItem mnNhomBan;
    private javax.swing.JMenuItem mnSua;
    private javax.swing.JMenuItem mnSuaSl;
    private javax.swing.JMenuItem mnSuaThongtinkhach;
    private javax.swing.JMenuItem mnTachDon;
    private javax.swing.JMenuItem mnXoaDan;
    private javax.swing.JMenuItem mnaddDEsk;
    private javax.swing.JPopupMenu pmnBan;
    private javax.swing.JPopupMenu pmnHoadonchitiet;
    private javax.swing.JPopupMenu pmnHoadonctt;
    private javax.swing.JPanel pnBan;
    private javax.swing.JPanel pnHoadon;
    private javax.swing.JPanel pnTaiQuay;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHoadon;
    private javax.swing.JTable tblHoadonchitiet;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JLabel txthientennhanvien;
    private javax.swing.JTextField txttienKhachTra;
    private javax.swing.JTextField txttienThoi;
    // End of variables declaration//GEN-END:variables

    BanDao DAOBAN = new BanDao();
    SanPhamDao DAOSP = new SanPhamDao();
    LoaiSanPhamDao DAOLSP = new LoaiSanPhamDao();
    DonViSanPhamDao DAODVSP = new DonViSanPhamDao();
    HoaDonDAO DAOHOADON = new HoaDonDAO();
    HoadonchitietDAO DAOHDCHITIET = new HoadonchitietDAO();
    BanChiTietDAO DAOBanCT = new BanChiTietDAO();
    NhanVienDAO DAONV = new NhanVienDAO();

    HashMap<JButton, BanEntity> hmap = new HashMap<>();//Gán thông tin riêng cho từng nút(Ở đây cụ thể là phần pnBan)
    // Hiển thị thông tin bàn lên pn

    public void filltoDesk() {
        // Khởi tạo và xoá sạch JPanel
        pnBan.removeAll();// Xóa tất cả các thành phần hiện tại của pn
        JPanel aa = new JPanel();// Tạo một JPanel mớ
        aa.removeAll();// Xóa tất cả các thành phần hiện tại của pn

        // Lấy danh sách tất cả các bàn từ cơ sở dữ liệu
        List<BanEntity> listBan = DAOBAN.selectAll();
        ClassLoader classLoader = this.getClass().getClassLoader();// Tải lớp hiện tại

        // Duyệt qua tất cả các bàn
        for (BanEntity ban : listBan) {
            if (ban.isTrangThai() != true) {// Nếu bàn không hoạt động thì bỏ qua
                continue;
            }
            JButton button = new JButton();// Tạo một JButton mới cho mỗi bàn
            List<BanChiTietEntity> bct = DAOBanCT.selectByIdBan(ban.getIdBan());//Lấy thông tin của bàn ct đã có trong DB

            // Nếu bàn không hoạt động và có chi tiết bàn
            if (ban.isHoatDong() != true) {
                HoaDonEntity hd = DAOHOADON.selectById(bct.get(0).getID_HoaDon());// Lấy hóa đơn của bàn
                if (ban.isHoatDong() == false && ban.isTrangThai() == true) {
                    URL imagepath = classLoader.getResource("icon/Untitled-1.png");// Lấy đường dẫn đến ảnh icon
                    Image imgBan = new ImageIcon(imagepath).getImage();// Tải ảnh icon
                    Icon iconBan = new ImageIcon(imgBan.getScaledInstance(90, 24, imgBan.SCALE_SMOOTH));// Tạo Icon với kích thước cụ thể để không bị quá kích thước trong pn và dễ sắp xếp
                    button.setIcon(iconBan);
                    //Set vị trí cho text của nút
                    button.setVerticalTextPosition(3);//Đặt text ở phía dưới nút
                    button.setHorizontalTextPosition(0);//Đặt text ở giữa theo chiều ngang
                }
            }
            // Thiết lập văn bản và định dạng cho nút theo mã của bàn
            button.setText(ban.getIdBan() + "");
            button.setFont(new Font("Segoe UI", Font.BOLD, 18));
            if (ban.isTrangThai() == true) {
                button.setBackground(Color.white);// Bàn hoạt động sẽ có nền trắng
            } else {
                button.setBackground(Color.yellow);// Bàn không hoạt động sẽ có nền vàng
            }
            button.setPreferredSize(new Dimension(100, 100));// Đặt kích thước cho nút

            // Thiết lập màu nền của nút dựa trên trạng thái bàn
            if (ban.isHoatDong() == false && ban.isTrangThai() == true) {
                button.setBackground(Color.red);// Nếu bàn không hoạt động và trạng thái bàn = 1, nền sẽ là đỏ
            } else if (ban.isHoatDong() == false && ban.isTrangThai() == false) {
                button.setBackground(Color.orange);// Nếu bàn không hoạt động và trạng thái = 1, nền sẽ là cam
            }

            // Nếu có bàn nhóm, đặt màu nhóm cho nút
            List<Integer> listIDHD = DAOBanCT.selectallbangop();// Lấy tất cả ID hóa đơn bàn gộp
            if (!listIDHD.isEmpty()) {
                doMauBanNhom(ban.getIdBan(), button);// Đặt màu cho bàn nhóm
            }

            // Thêm ActionListener cho nút để xử lý sự kiện nhấn chuột
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedButton(e, button);
                }
            });

            // Thêm MouseListener cho button để hiển thị popup menu
            button.addMouseListener(new MouseAdapter() {
                public void mouseReleased(MouseEvent e) {
                    selectedButtonPopup(e, button);
                }
            });

            // Tạo một đối tượng ThongTinBanJFrame để hiển thị thông tin bàn
            ThongtinBanJFrame av = new ThongtinBanJFrame(bct, ban.getIdBan());
            // Thêm MouseListener cho nút để xử lý sự kiện chuột di vào
            button.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    hoverButton(e, button);// Hiển thị hiệu ứng khi chuột di vào
                    ThongtinBanJFrame avt = bbth(av);
                    PointerInfo pointerInfo = MouseInfo.getPointerInfo();// Lấy thông tin con trỏ chuột
                    Point nn = pointerInfo.getLocation();// Lấy vị trí của con trỏ chuột
                    avt.setLocation((int) nn.getX(), (int) nn.getY());// Đặt vị trí của cửa sổ thông tin bàn
                    avt.setVisible(true);// Hiển thị cửa sổ thông tin bàn
                }
            });
            // Thêm MouseListener để ẩn thông tin bàn khi chuột được di ra ngoài
            button.addMouseListener(new MouseAdapter() {
                public void mouseExited(MouseEvent e) {
                    ThongtinBanJFrame avt = bbth(av);
                    avt.setVisible(false);// Tắt cửa sổ thông tin bàn khi chuột di ra ngoài
                }
            });

            // Lưu trữ thông tin bàn vào hmap với nút tương ứng
            BanEntity bana = ban;
            hmap.put(button, bana);// Lưu trữ bàn vào hashmap với button làm key để gán thông tin cho bàn
            aa.add(button);// Thêm button vào JPanel
        }

        // Đặt bố cục cho JPanel và cập nhật giao diện
        // Đặt bố cục cho JPanel sắp xếp các thành phần theo dòng từ trái sang phải,
        //trên xuống dưới và chỉ định các thành phần được căn trái theo dòng
        aa.setLayout(new FlowLayout(FlowLayout.LEFT));
        aa.updateUI();
        aa.setPreferredSize(new Dimension(440, 2621));// Đặt kích thước cho JPanel
        aa.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                selectedPanelPopup(e, aa);
            }
        });
        aa.setBackground(new Color(255, 193, 75));// Đặt màu nền cho JPane
        JScrollPane scrollPane = new JScrollPane(aa);// Tạo JScrollPane cho JPanel
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);// Ẩn thanh cuộn ngang
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);// Hiển thị thanh cuộn dọc
        scrollPane.setBounds(1, 22, 439, 440);// Đặt vị trí và kích thước cho JScrollPane
        JPanel contentPane = pnBan;
        contentPane.setLayout(null);//Đặt layout cho pnBan
        contentPane.setPreferredSize(new Dimension(440, 466));// Đặt kích thước ưu tiên cho pnBan
        contentPane.add(scrollPane);//thêm nút cuộn vào pnBan

    }

    public void filltoDesktaiquay() {
        // Xóa tất cả các thành phần trong pnTaiQuay
        pnTaiQuay.removeAll();

        // Khởi tạo JPanel mới
        JPanel aa = new JPanel();
        aa.removeAll();

        // Lấy danh sách tất cả các bàn từ cơ sở dữ liệu
        List<BanEntity> listBan = DAOBAN.selectAllAO();
        ClassLoader classLoader = this.getClass().getClassLoader();

        for (BanEntity ban : listBan) {
            // Nếu bàn đang hoạt động, bỏ qua và tiếp tục vòng lặp
            if (ban.isTrangThai() == true) {
                continue;
            }

            JButton button = new JButton();

            List<BanChiTietEntity> bct = DAOBanCT.selectByIdBan(ban.getIdBan());// Lấy danh sách chi tiết bàn theo ID bàn

            if (ban.isHoatDong() != true) {
                HoaDonEntity hd = DAOHOADON.selectById(bct.get(0).getID_HoaDon());// Lấy hóa đơn theo ID hóa đơn của chi tiết bàn đầu tiên

                // Nếu bàn không hoạt động, không có trạng thái và có số điện thoại trong hóa đơn, bỏ qua và tiếp tục vòng lặp
                if (ban.isHoatDong() == false && ban.isTrangThai() == false && hd.getSDT() != null) {
                    URL imagepath = classLoader.getResource("icon/Untitled-3.png");
                    Image imgBan = new ImageIcon(imagepath).getImage();
                    Icon iconBan = new ImageIcon(imgBan.getScaledInstance(90, 24, imgBan.SCALE_SMOOTH));
                    button.setIcon(iconBan);
                    button.setVerticalTextPosition(3);
                    button.setHorizontalTextPosition(0);
                } else {
                    URL imagepath = classLoader.getResource("icon/Untitled-2.png");
                    Image imgBan = new ImageIcon(imagepath).getImage();
                    Icon iconBan = new ImageIcon(imgBan.getScaledInstance(90, 24, imgBan.SCALE_SMOOTH));
                    button.setIcon(iconBan);
                    button.setVerticalTextPosition(3);
                    button.setHorizontalTextPosition(0);
                }
            }

            // Thiết lập văn bản và phông chữ cho nút
            button.setText(ban.getIdBan() + "");
            button.setFont(new Font("Segoe UI", Font.BOLD, 18));
            if (ban.isTrangThai() == true) {
                button.setBackground(Color.white);
            } else {
                button.setBackground(Color.yellow);
            }
            button.setPreferredSize(new Dimension(100, 100));

            if (ban.isHoatDong() == false && ban.isTrangThai() == true) {
                button.setBackground(Color.red);
            } else if (ban.isHoatDong() == false && ban.isTrangThai() == false) {
                button.setBackground(Color.orange);
            }

            // Thiết lập màu sắc cho bàn nhóm nếu có
            List<Integer> listIDHD = DAOBanCT.selectallbangop();
            if (!listIDHD.isEmpty()) {
                doMauBanNhom(ban.getIdBan(), button);
            }

            // Khi nhấp chuột vào nút
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedButton(e, button);
                }
            });

            //hiển thị menu khi nhấp chuột phải
            button.addMouseListener(new MouseAdapter() {
                public void mouseReleased(MouseEvent e) {
                    selectedButtonPopup(e, button);
                }
            });

            ThongtinBanJFrame av = new ThongtinBanJFrame(bct, ban.getIdBan());

            //Hiển thị thông tin bàn khi di chuột vào
            button.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    hoverButton(e, button);
                    ThongtinBanJFrame avt = bbth(av);
                    PointerInfo pointerInfo = MouseInfo.getPointerInfo();
                    Point nn = pointerInfo.getLocation();
                    avt.setLocation((int) nn.getX(), (int) nn.getY());
                    avt.setVisible(true);
                }
            });

            //Ẩn thông tin khi di chuột ra
            button.addMouseListener(new MouseAdapter() {
                public void mouseExited(MouseEvent e) {
                    ThongtinBanJFrame avt = bbth(av);
                    avt.setVisible(false);
                }
            });

            //đoạn này đến cuối như filltodesk
            BanEntity bana = ban;
            hmap.put(button, bana);
            aa.add(button);
        }
        aa.setLayout(new FlowLayout(FlowLayout.LEFT));
        aa.updateUI();
        aa.setPreferredSize(new Dimension(440, 2000));
        aa.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                selectedPanelPopup(e, aa);
            }
        });
        aa.setBackground(new Color(255, 193, 75));
        JScrollPane scrollPane = new JScrollPane(aa);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(1, 22, 439, 260);
        JPanel contentPane = pnTaiQuay;
        contentPane.setLayout(null);
        contentPane.setPreferredSize(new Dimension(440, 300));
        contentPane.add(scrollPane);

    }

    //Hiển thị menupopup trên 1 panel tại vị trí chuột
    public void selectedPanelPopup(MouseEvent e, JPanel panel) {
        //kiểm tra sự kiện của chuột có cùng loại với panel không
        if (e.getSource().getClass() == panel.getClass()) {
            // Ép kiểu nguồn sự kiện của chuột thành JPanel
            JPanel b = (JPanel) e.getSource();
            //Kiểm tra sự kiện chuột nếu là nhấp chuột phải
            if (e.isPopupTrigger()) {
                //Hiển thị popupMenu tại vị trí nhấp chuột phải
                jPopupMenu1.show(e.getComponent(), e.getX(), e.getY());
            }
        }
    }

    //Dùng để mở rộng sự kiện trên thongtinbanJframe
    public ThongtinBanJFrame bbth(ThongtinBanJFrame avt) {
        return avt;
    }

    //Xử lý hiệu ứng khi di chuột vào nút
    public void hoverButton(MouseEvent e, JButton button) {
        if (e.getSource().getClass() == button.getClass()) {
            b1 = (JButton) e.getSource();
            //Liên kết đối tượng BanEntity với nút b1 từ hashMap để lấy thông tin của
            //BanEntity cho nút
            numberDeskhover = hmap.get(b1);
        }
    }

    public void selectedButtonPopup(MouseEvent e, JButton button) {
        //Xử lý hiệu ứng khi di chuột lên nút
        hoverButton(e, button);

        //Kiểm tra sự kiện có phải từ 1 nút hay không cụ thể là Bàn trong pnBan
        if (e.getSource().getClass() == button.getClass()) {

            //Lấy nút từ nguồn sự kiện chuột
            JButton b = (JButton) e.getSource();

            //Kiểm tra nếu là bấm chuột phải
            if (e.isPopupTrigger()) {
                //Hiển thị menu tại vị trí ấn chuột phải
                pmnBan.show(e.getComponent(), e.getX(), e.getY());
                //Hiển thị menu
                mnGopBan.setEnabled(true);
                mnSua.setEnabled(true);

                //Đánh dấu nút được bấm chuột phải là đã chọn
                b.setSelected(true);
                //Lấy thông tin bàn qua ID bàn
                numberDesk = DAOBAN.selectById(Integer.parseInt(b.getText()));

                // Lấy danh sách hóa đơn chưa thanh toán cho bàn hiện tại
                List<HoaDonEntity> listhd = DAOHOADON.selectCTT(numberDesk.getIdBan());

                // Lấy danh sách chi tiết bàn cho bàn hiện tại
                List<BanChiTietEntity> listbct = DAOBanCT.selectByIdBan(numberDesk.getIdBan());

                // Nếu danh sách hóa đơn hoặc danh sách chi tiết bàn trống
                if (listhd.isEmpty() || listbct.isEmpty()) {
                    lblMaHoaDon.setText("......");

                    //Đặt tẽxt của bàn thành ID đang được di chuột vào
                    lblBan.setText(numberDeskhover.getIdBan() + "");
                    resetfalse();//Đặt lại trạng thái của các nút

                    //Hiển thị thành phân mnNhomBan
                    mnNhomBan.setEnabled(true);

                    // Kiểm tra nếu bàn không hoạt động và trạng thái là true thì đặt trạng thái cho menuitem
                    if (numberDesk.isTrangThai() == false && numberDesk.isHoatDong() == true) {
                        mnNhomBan.setEnabled(false);
                        mnGopBan.setEnabled(false);
                    }
                    return;
                    // Nếu bàn không phải là bàn chính
                } else if (listbct.get(0).isBanChinh() == false) {
                    lblMaHoaDon.setText(listhd.get(0).getIdHoaDon() + "");//Đặt tẽxt của HD thành ID HD
                    lblBan.setText(numberDeskhover.getIdBan() + ""); //Đặt tẽxt của bàn thành ID đang được di chuột vào

                    //Vô hiệu hoá các menuItem và đặt trạng thái cho các nút
                    mnNhomBan.setEnabled(false);
                    mnGopBan.setEnabled(false);
                    mnSua.setEnabled(false);
                    resetfalse();
                    return;
                } else {// Nếu bàn là bàn chính, cập nhật thông tin hóa đơn và bàn, và đặt lại trạng thái
                    lblMaHoaDon.setText(listhd.get(0).getIdHoaDon() + "");
                    lblBan.setText(numberDeskhover.getIdBan() + "");
                    resettrue();
                    mnNhomBan.setEnabled(true);
                }

                // Kiểm tra số điện thoại trong hóa đơn và cập nhật trạng thái của các menu item
                HoaDonEntity hoadin = listhd.get(0);
                if (hoadin.getSDT() == null && numberDesk.isTrangThai() == true) {
                    mnNhomBan.setEnabled(true);
                    mnGopBan.setEnabled(true);
                    mnSua.setEnabled(true);
                } else if (hoadin.getSDT() == null && numberDesk.isTrangThai() == false) {
                    mnNhomBan.setEnabled(false);
                    mnGopBan.setEnabled(false);
                } else {
                    mnNhomBan.setEnabled(false);
                    mnGopBan.setEnabled(false);
                    mnSua.setEnabled(false);
                }
            }
        }
    }
    BanEntity numberDesk;
    BanEntity numberDeskhover;
    HoaDonEntity hoadonNumber;
    JButton b1;

    //Xử lý sự kiện khi 1 nut được nhấn
    public void selectedButton(ActionEvent e, JButton button) {
        if (e.getSource().getClass() == button.getClass()) {
            //Lấy nút từ nguồn sự kiện chuột
            b1 = (JButton) e.getSource();
            numberDesk = hmap.get(b1);
            List<HoaDonEntity> listhd = DAOHOADON.selectCTT(numberDesk.getIdBan());
            List<BanChiTietEntity> listbct = DAOBanCT.selectByIdBan(numberDesk.getIdBan());

            // Nếu danh sách hóa đơn hoặc danh sách chi tiết bàn trống
            if (listhd.isEmpty() || listbct.isEmpty()) {
                lblMaHoaDon.setText("......");
                lblBan.setText(numberDesk.getIdBan() + "");
                resetfalse();//Đặt lại trạng thái cho các nút

                // Nếu bàn không phải là bàn chính
            } else if (listbct.get(0).isBanChinh() == false) {
                hoadonNumber = listhd.get(0);
                lblMaHoaDon.setText(listhd.get(0).getIdHoaDon() + "");
                lblBan.setText(numberDesk.getIdBan() + "");
                resetfalse();//Đặt lại trạng thái cho các nút

            } else {// Nếu bàn là bàn chính
                lblMaHoaDon.setText(listhd.get(0).getIdHoaDon() + "");
                lblBan.setText(numberDesk.getIdBan() + "");
                resettrue();//Đặt lại trạng thái cho các nút
            }
            tabs.setSelectedIndex(1);
            filltoTableHDCT();
        }
    }

    //Đặt trạng thái cho các nút
    public void resettrue() {
        txttienKhachTra.setEditable(true);
        btnHuydon.setEnabled(true);
        btnThanhToan.setEnabled(true);
        txttienKhachTra.setText("0");
        txttienThoi.setText("0");
        txtTongTien.setText("0");
    }

    //Đặt trạng thái cho các nút
    public void resetfalse() {
        txttienKhachTra.setEditable(false);
        btnHuydon.setEnabled(false);
        btnThanhToan.setEnabled(false);
        txttienKhachTra.setText("0");
        txttienThoi.setText("0");
        txtTongTien.setText("0");
    }

    public void filltableSanPham() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        try {
            LoaiSanPhamEntity lsp = (LoaiSanPhamEntity) cboLoaidouong.getSelectedItem();
            List<SanPhamEntity> list = DAOSP.selectByKeyword(txtTimkiem.getText(), lsp.getID_LoaiSP());
            for (SanPhamEntity sp : list) {
                model.addRow(new Object[]{sp.getId_sp(),
                    sp.getTen_sp(), DAOLSP.selectId_LSP(sp.getId_loaiSP()).getTenLoai(),
                    NumberFormat.getInstance().format(sp.getGia_sp())
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int GiaTheoSize(String masp) {
        SanPhamEntity sp = new SanPhamEntity();
        DonViSanPhamEntity dvdu = new DonViSanPhamEntity();
        sp = DAOSP.selectID(masp);
        dvdu = DAODVSP.selectID(sp.getId_donviSP());
        int gia = sp.getGia_sp();
        System.out.println(dvdu.getThemTien());
        gia += dvdu.getThemTien();
        sp.setGia_sp(gia);
        return gia;
    }

    public void filltoComboboxLSP() {
        DefaultComboBoxModel<LoaiSanPhamEntity> modelcb = (DefaultComboBoxModel) cboLoaidouong.getModel();
        modelcb.removeAllElements();
        List<LoaiSanPhamEntity> list = DAOLSP.selectAll();
        if (list != null) {
            for (LoaiSanPhamEntity loaiSP : list) {
                modelcb.addElement(loaiSP);
            }
        }
        filltableSanPham();
    }

//chọn bàn hiển thị đơn đã thanh toán hay chưa (thanh toán rồi thì không hiển thị chưa thanh toán bàn thì hiển thị đỏ màu đỏ)
//bước tạo đơn nếu đối tượng bàn trống thì hỏi đây có chắc là đơn mang về
//thêm món chọn món tồi button thêm hiện thị nhập số lượng
    public void filltoTableHDCT() {
        DefaultTableModel model = (DefaultTableModel) tblHoadonchitiet.getModel();
        model.setRowCount(0);
        int i = 0;
        try {
            if (numberDesk == null) {//Nếu không có bàn 
                return;
            }
            List<HoaDonChiTietEntity> list = DAOHDCHITIET.selectByIDBan(numberDesk.getIdBan());
            if (list.isEmpty()) {
                return;
            }
            for (HoaDonChiTietEntity hdct : list) {
                if (lblMaHoaDon.getText().equals("......")) {
                    return;
                }

                if (Integer.parseInt(lblMaHoaDon.getText()) == hdct.getID_Hoadon()) {
                    i += GiaTheoSize(hdct.getID_SanPHam()) * hdct.getSoluong();
                }
            }
            for (HoaDonChiTietEntity hdct : list) {
                hdct.setTongGia(GiaTheoSize(hdct.getID_SanPHam()) * hdct.getSoluong());
                SanPhamEntity sp = DAOSP.selectID(hdct.getID_SanPHam());
                model.addRow(new Object[]{
                    hdct.getID_Hoadon(),
                    hdct.getID_SanPHam(),
                    DAOSP.selecteByIDSP(hdct.getID_SanPHam()).getTen_sp(),
                    hdct.getSoluong(),
                    DAODVSP.selectid_DVDU(sp.getId_donviSP()).getTenDonvi(),
                    NumberFormat.getInstance().format(DAODVSP.selectid_DVDU(sp.getId_donviSP()).getThemTien()),
                    NumberFormat.getInstance().format(hdct.getTongGia()),
                    hdct.getGhiChu()
                });
            }
            tongTien(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addDesk() {//

    }

    public void taoDon() {
        HoaDonEntity hd;
        if (numberDesk == null) {
            JOptionPane.showMessageDialog(this, "Chưa chọn bàn!!!!");
            return;
        }
        if (numberDesk.isHoatDong() == true) {
            DAOHOADON.insert(setInforHoaDon());
            DAOBAN.updateHoatDong(numberDesk.getIdBan());
            numberDesk.setHoatDong(false);
            List<HoaDonEntity> list = DAOHOADON.selectAll();
            BanChiTietEntity bct = new BanChiTietEntity(list.get(list.size() - 1).getIdHoaDon(), numberDesk.getIdBan(), new Date(), true);
            System.out.println(list.get(list.size() - 1).getIdHoaDon() + "");
            DAOBanCT.insert(bct);
            filltoDesk();
            lblMaHoaDon.setText(list.get(list.size() - 1).getIdHoaDon() + "");
            resettrue();
        } else if (numberDesk.isHoatDong() == false) {
            JOptionPane.showMessageDialog(this, "Bàn có người không thể lập hóa đơn");
        } else {
            if (JOptionPane.showConfirmDialog(this, "Bạn chưa chọn bàn cho đơn này, bạn có chắc đây là đơn mang về") == JOptionPane.YES_OPTION) {
            }
        }
    }

    private HoaDonEntity setInforHoaDon() {
        HoaDonEntity hd = new HoaDonEntity();
        if (Auth.isLogin() == true) {
            hd.setIdNhanVien(Auth.user.getId_Nhanvien());
            hd.setNgayTao(Xdate.toDate(lblNgay.getText(), "yyyy-MM-dd"));
            hd.setTrangThai(true);
            hd.setTrangThaiTT(false);
            hd.setThanhTien(0);
            hd.setSlSanPhamHuy(0);
            hd.setLyDoHuy("");
        }
        return hd;
    }

    public void huyDon(int idBan, String maHD) {
        HoaDonEntity hd = DAOHOADON.selectById(Integer.parseInt(maHD));
        List<BanChiTietEntity> listbct = DAOBanCT.selectByIdHD(Integer.parseInt(maHD));
        LydoHoaDonHuyJDialog LDDH = new LydoHoaDonHuyJDialog(null, true, hd);
        LDDH.setVisible(true);
        if (!LDDH.exit) {
            hd.setTrangThai(false);
            DAOHOADON.updateTrangThai(hd);
            JOptionPane.showMessageDialog(this, "Hủy đơn thành công!");
            for (BanChiTietEntity banChitiet : listbct) {
                if (DAOBAN.selectIDBan(banChitiet.getID_Ban()).isEmpty()) {// kiểm tra trống thì bỏ qua
                    DAOBAN.deleteHoatDong(banChitiet.getID_Ban());
                }
            }
            lblMaHoaDon.setText("......");
        }
        filltoDesk();

        filltoDesktaiquay();
        resetfalse();
    }

    public void thanhToanDon() {
        HoaDonEntity hd = DAOHOADON.selectById(Integer.parseInt(lblMaHoaDon.getText()));
        List<BanChiTietEntity> listbct = DAOBanCT.selectByIdHD(Integer.parseInt(lblMaHoaDon.getText()));
        hd.setTrangThaiTT(true);
        DAOHOADON.updateThanhToan(hd);
        for (BanChiTietEntity banChitiet : listbct) {
            if (DAOBAN.selectIDBan(banChitiet.getID_Ban()).isEmpty()) {
                DAOBAN.deleteHoatDong(banChitiet.getID_Ban());
            }
        }
        PrintPDF p = new PrintPDF();
        p.a((DefaultTableModel) tblHoadonchitiet.getModel(), Integer.parseInt(lblMaHoaDon.getText()), Integer.parseInt(txttienKhachTra.getText()), Integer.parseInt(txttienThoi.getText()));
        lblMaHoaDon.setText("......");
        filltoDesk();
        filltoDesktaiquay();
        resetfalse();
    }

    public void tongTien(int i) {
        txtTongTien.setText(i + "");
    }

    public void filltoHoadonCTT() {
        DefaultTableModel model = (DefaultTableModel) tblHoadon.getModel();
        model.setRowCount(0);
        List<HoaDonEntity> list = DAOHOADON.selectCTTALL();
        for (HoaDonEntity hd : list) {
            model.addRow(new Object[]{
                hd.getIdHoaDon(),
                hd.getNgayTao(),
                hd.isTrangThaiTT() ? "Thanh toán" : "Chưa thanh toán",
                DAONV.selectById(Auth.user.getId_Nhanvien()).getTenNV(),
                NumberFormat.getInstance().format(hd.getThanhTien()),
                DAOBAN.selectIDHD(hd.getIdHoaDon()).getIdBan(),
                hd.getSDT()
            });

            System.out.println("thành tiền: " + hd.getThanhTien());
        }
    }

    public void tinhTienThoi() {
        if (checkTienKT()) {
            return;
        }
        int tienKT = Integer.parseInt(txttienKhachTra.getText());
        int tongTien = Integer.parseInt(txtTongTien.getText());
        if (tienKT > tongTien) {
            int tienThoi = tienKT - tongTien;
            txttienThoi.setText(tienThoi + "");
        } else if (tienKT < tongTien) {
            int tienThoi = tienKT - tongTien;
            txttienThoi.setText(tienThoi + "");
        } else {
            txttienThoi.setText("0");
        }
    }

    public boolean checkTienKT() {
        if (txttienKhachTra.getText().equals("")) {
            txttienThoi.setText("0");
            return true;
        } else {
            try {
                int i = Integer.parseInt(txttienKhachTra.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tiền khách trả phải nhập số!!!");
                return true;
            }
            return false;
        }
    }

    public void huySP() {
        int row = tblHoadonchitiet.getSelectedRow();
        int maHD = (int) tblHoadonchitiet.getValueAt(row, 0);
        String maSP = tblHoadonchitiet.getValueAt(row, 1).toString();
        HoaDonChiTietEntity hdct = DAOHDCHITIET.selectById(maHD, maSP);
        LydohuySanPhamJDialog ldhsp = new LydohuySanPhamJDialog(null, true, hdct);
        ldhsp.setVisible(true);
        hdct.setTrangThai(false);
        System.out.println(hdct.getID_Hoadon());
        DAOHDCHITIET.delete(hdct);
        filltoTableHDCT();
        HoaDonEntity hd = DAOHOADON.selectById(Integer.parseInt(lblMaHoaDon.getText()));
        hd.setThanhTien(Integer.parseInt(txtTongTien.getText()));
        hd.setSlSanPhamHuy(hdct.getSoluong() + hd.getSlSanPhamHuy());
        DAOHOADON.updateThanhtien(hd);
        DAOHOADON.updateSLSPHUY(hd);
        filltoHoadonCTT();
    }

    public void suaSl(String masp, int mahd) {
        SuaSoLuongSanPhamHDCTJDialog suaSL = new SuaSoLuongSanPhamHDCTJDialog(null, true, masp, mahd);
        suaSL.setVisible(true);
        filltoTableHDCT();
        HoaDonEntity hd = DAOHOADON.selectById(mahd);
        hd.setThanhTien(Integer.parseInt(txtTongTien.getText()));
        DAOHOADON.updateThanhtien(hd);
    }

    public void doMauBanNhom(int idban, JButton button) {
        List<BanChiTietEntity> listban = DAOBanCT.selectByIdBan(idban);
        if (listban.isEmpty()) {
            return;
        }
        List<Integer> listIDHD = DAOBanCT.selectallbangop();
        if (listIDHD.isEmpty()) {
            return;
        }
        if (listIDHD.get(0) == listban.get(0).getID_HoaDon()) {
            button.setBackground(Color.BLUE);
            if (listban.get(0).isBanChinh() == false) {
                button.setForeground(Color.WHITE);
            }
        } else if (listIDHD.size() == 1) {
            return;
        } else if (listIDHD.get(1) == listban.get(0).getID_HoaDon()) {
            button.setBackground(Color.CYAN);
            if (listban.get(0).isBanChinh() == false) {
                button.setForeground(Color.WHITE);
            }
        } else if (listIDHD.size() == 2) {
            return;
        } else if (listIDHD.get(2) == listban.get(0).getID_HoaDon()) {
            button.setBackground(Color.PINK);
            if (listban.get(0).isBanChinh() == false) {
                button.setForeground(Color.WHITE);
            }
        } else if (listIDHD.size() == 3) {
            return;
        } else if (listIDHD.get(3) == listban.get(0).getID_HoaDon()) {
            button.setBackground(Color.GREEN);
            if (listban.get(0).isBanChinh() == false) {
                button.setForeground(Color.WHITE);
            }
        } else if (listIDHD.size() == 4) {
            return;
        }
        if (listIDHD.size() > 5) {
            JOptionPane.showMessageDialog(this, "Giới hạn 4 bàn nhóm!!");
            return;
        }
    }
}
