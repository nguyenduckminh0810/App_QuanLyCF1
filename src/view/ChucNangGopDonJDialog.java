package view;

import Dao.BanChiTietDAO;
import Dao.BanDao;
import Dao.HoaDonDAO;
import Dao.HoadonchitietDAO;
import Entity.BanChiTietEntity;
import Entity.HoaDonEntity;
import Entity.HoaDonChiTietEntity;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class ChucNangGopDonJDialog extends javax.swing.JDialog {

    public ChucNangGopDonJDialog(java.awt.Frame parent, boolean modal, HoaDonEntity hd) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        hoadon = hd;
        fillcbo();
        lblMadon.setText(hoadon.getIdHoaDon() + "");
    }
    static HoaDonEntity hoadon;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMadon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboMaDon = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnGop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Đơn:");

        lblMadon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMadon.setText("......");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("gộp vào");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        btnGop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGop.setText("Gộp vào");
        btnGop.setEnabled(false);
        btnGop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGop, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblMadon)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMadon)
                    .addComponent(jLabel2)
                    .addComponent(cboMaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
boolean status = true;
    HoadonchitietDAO DAOhdct = new HoadonchitietDAO();
    BanChiTietDAO DAOBanCT = new BanChiTietDAO();
    BanDao DAOBAN = new BanDao();
    HoaDonDAO DAOHD = new HoaDonDAO();
    private void btnGopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGopActionPerformed
        // TODO add your handling code here:
        HoaDonEntity hd = DAOHD.selectById(hoadon.getIdHoaDon());
        hd.setTrangThai(false);//xét trạng thái hủy
        DAOHD.updateTrangThai(hd);
        List<BanChiTietEntity> listbct = DAOBanCT.selectByIdHD(hoadon.getIdHoaDon());//xem có liên kết với bàn khác nữa không
        for (BanChiTietEntity banChitiet : listbct) {
            if (DAOBAN.selectIDBan(banChitiet.getID_Ban()).isEmpty()) {//xem còn bàn chưa hủy hay không còn thì không đổi trạng thái hủy
                DAOBAN.deleteHoatDong(banChitiet.getID_Ban());
            }
        }
        int goptoi = (int) cboMaDon.getSelectedItem();
        List<HoaDonChiTietEntity> listdoncu = DAOhdct.selectByIdHD(hoadon.getIdHoaDon());
        List<HoaDonChiTietEntity> listdonmoi = DAOhdct.selectByIdHD(goptoi);
        int tiendonmoi = 0;
        for (HoaDonChiTietEntity hdchitietcu : listdoncu) {

            HoaDonChiTietEntity hoadonchitietmoi = DAOhdct.selectById(goptoi, hdchitietcu.getID_SanPHam());
            if (hoadonchitietmoi != null) {
                int cong = hdchitietcu.getSoluong() + hoadonchitietmoi.getSoluong();
                int thanhten = cong * hoadonchitietmoi.getGia();
                HoaDonChiTietEntity hoadoncp = hoadonchitietmoi;
                hoadoncp.setSoluong(cong);
                hoadoncp.setTongGia(thanhten);
                hoadoncp.setGhiChu("Gộp từ đơn: " + hdchitietcu.getID_Hoadon() + ", SL: " + hdchitietcu.getSoluong());
                DAOhdct.update_SL(hoadoncp);
                DAOhdct.deletehoadonct(hdchitietcu.getID_Hoadon(), hdchitietcu.getID_SanPHam());
            } else {
                System.out.println("a");
                hdchitietcu.setGhiChu("Gộp từ đơn: " + hdchitietcu.getID_Hoadon() + ", SL: " + hdchitietcu.getSoluong());
                DAOhdct.update_ghichu(hdchitietcu);
                DAOhdct.updateIDHOADON(hdchitietcu.getID_Hoadon(), goptoi, hdchitietcu.getID_SanPHam());
                HoaDonEntity hdgopvao = DAOHD.selectById((int) cboMaDon.getSelectedItem());
            }
        }
        HoaDonEntity hdtachmoi = DAOHD.selectById(goptoi);
        List<HoaDonChiTietEntity> hdcongtien = DAOhdct.selectByIdHD(goptoi);
        for (HoaDonChiTietEntity hoadonchitiet : hdcongtien) {
            tiendonmoi += hoadonchitiet.getTongGia();
        }
        hdtachmoi.setThanhTien(tiendonmoi);
        DAOHD.updateThanhtien(hdtachmoi);
        DAOhd.delete(hoadon);
        dispose();
    }//GEN-LAST:event_btnGopActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        status = false;
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {
        //Dùng numbus để giao diện đẹp hơn(Có cũng đc kh có kh sao)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChucNangGopDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChucNangGopDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChucNangGopDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChucNangGopDonJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChucNangGopDonJDialog dialog = new ChucNangGopDonJDialog(new javax.swing.JFrame(), true, hoadon);
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
    private javax.swing.JButton btnGop;
    private javax.swing.JComboBox<String> cboMaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMadon;
    // End of variables declaration//GEN-END:variables
HoaDonDAO DAOhd = new HoaDonDAO();

    public void fillcbo() {

        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaDon.getModel();
        model.removeAllElements();
        List<HoaDonEntity> list = DAOhd.selectCTTALL();
        if (list.isEmpty()) {
            btnGop.setEnabled(false);
        } else {
            btnGop.setEnabled(true);
        }
        for (HoaDonEntity hd : list) {
            if (hd.getSDT() != null) {
                continue;
            }
            if (hd.getIdHoaDon() != hoadon.getIdHoaDon()) {
                model.addElement(hd.getIdHoaDon());
            }
        }
    }
}
