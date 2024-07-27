/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entity.HoaDonEntity;
import javax.swing.table.DefaultTableModel;
import view.QuanLyHoaDonJPanel;
import java.util.ArrayList;
import java.util.List;
import Dao.HoaDonDAO;
import Helper.Auth;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
/**
 *
 * @author ADMIN ASUS
 */
public class SerHoaDon {

    HoaDonDAO dao = new HoaDonDAO();
    Locale vn = new Locale("vi", "VN");
    public void filltotablehoadon() {
        List<HoaDonEntity> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectByIdNV(Auth.user.getId_Nhanvien());
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    NumberFormat.getInstance().format(hd.getThanhTien()),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }
    public void filltotablehoadon_chuathanhtoan() {
        List<HoaDonEntity> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai1_chuathanhtoan(Auth.user.getId_Nhanvien());
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                   NumberFormat.getInstance().format(hd.getThanhTien()),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }
     public void filltotablehoadon_dathanhtoan() {
        List<HoaDonEntity> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai1_dathanhtoan(Auth.user.getId_Nhanvien());
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    NumberFormat.getInstance().format(hd.getThanhTien()),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }

    public void filltotablehoadonhuy() {
        List<HoaDonEntity> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai0v1(Auth.user.getId_Nhanvien());
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }
     public void filltotablehoadonhuy_chuathanhtoan() {
        List<HoaDonEntity> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai0_chuathanhtoan(Auth.user.getId_Nhanvien());
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }
        public void filltotablehoadonhuy_dathanhtoan() {
        List<HoaDonEntity> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectAll_trangthai0_dathanhtoan(Auth.user.getId_Nhanvien());
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });
            }
        } catch (Exception e) {
        }
    }

    public void Find() {
        List<HoaDonEntity> list = new ArrayList<>();
        List<HoaDonEntity> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);
        Date a = QuanLyHoaDonJPanel.Jdatebatdau.getDate();
        Date b = QuanLyHoaDonJPanel.Jdateketthuc.getDate();
        try {
            if (a.getTime() > b.getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày trước phải nhỏ hơn ngày sau");
                return;
            }
            if (b.getTime() > new Date().getTime() || a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_KoHoatDong(a, b);
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_HoatDong(a, b);
            for (HoaDonEntity hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }
    public void Find_dathanhtoan() {
        List<HoaDonEntity> list = new ArrayList<>();
        List<HoaDonEntity> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);
        Date a = QuanLyHoaDonJPanel.Jdatebatdau.getDate();
        Date b = QuanLyHoaDonJPanel.Jdateketthuc.getDate();
        try {
            if (a.getTime() > b.getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày trước phải nhỏ hơn ngày sau");
                return;
            }
            if (b.getTime() > new Date().getTime() || a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_KoHoatDong_dathanhtoan(a, b);
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_HoatDong_dathanhtoan(a, b);
            for (HoaDonEntity hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }
     public void Find_chuathanhtoan() {
        List<HoaDonEntity> list = new ArrayList<>();
        List<HoaDonEntity> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);
        Date a = QuanLyHoaDonJPanel.Jdatebatdau.getDate();
        Date b = QuanLyHoaDonJPanel.Jdateketthuc.getDate();
        try {
            if (a.getTime() > b.getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày trước phải nhỏ hơn ngày sau");
                return;
            }
            if (b.getTime() > new Date().getTime() || a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_KoHoatDong_chuathanhtoan(a, b);
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_HoatDong_chuathanhtoan(a, b);
            for (HoaDonEntity hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }

    public void Find_1ngay(Date a) {
        List<HoaDonEntity> list = new ArrayList<>();
        List<HoaDonEntity> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);

        try {

            if (a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_HoatDong_1ngay(a);
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_KoHoatDong_1ngay(a);
            for (HoaDonEntity hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }
    public void Find_1ngay_dathanhtoan(Date a) {
        List<HoaDonEntity> list = new ArrayList<>();
        List<HoaDonEntity> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);

        try {

            if (a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_HoatDong_1ngay_dathanhtoan(a);
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_KoHoatDong_1ngay_dathanhtoan(a);
            for (HoaDonEntity hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }
     public void Find_1ngay_chuathanhtoan(Date a) {
        List<HoaDonEntity> list = new ArrayList<>();
        List<HoaDonEntity> list1 = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        model1.setRowCount(0);

        try {

            if (a.getTime() > new Date().getTime()) {
                JOptionPane.showMessageDialog(null, "Ngày  không hợp lệ");
                return;
            }
            list = dao.selectAll_SQL_Find_HoatDong_1ngay_chuathanhtoan(a);
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
        try {
            list1 = dao.selectAll_SQL_Find_KoHoatDong_1ngay_chuathanhtoan(a);
            for (HoaDonEntity hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()

                });

            }
        } catch (Exception e) {
        }
    }

    public void fillTableSearch(String keyword) {
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        model1.setRowCount(0);
        try {

            List<HoaDonEntity> list = dao.selectAll_SQL_Find_HoatDong_keyword(keyword);
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
        try {

            List<HoaDonEntity> list1 = dao.selectAll_SQL_Find_koHoatDong_keyword(keyword);
            for (HoaDonEntity hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }

    public void fillTableSearch_IDMaNV(String keyword) {
        DefaultTableModel model = (DefaultTableModel) QuanLyHoaDonJPanel.tblHoadon.getModel();
        model.setRowCount(0);
        DefaultTableModel model1 = (DefaultTableModel) QuanLyHoaDonJPanel.tblhuydon.getModel();
        model1.setRowCount(0);
        try {

            List<HoaDonEntity> list = dao.select_all_sql_find_HoatDong_keyword_IDMaNV(keyword);
            for (HoaDonEntity hd : list) {
                model.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                        hd.getSDT()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
        try {

            List<HoaDonEntity> list1 = dao.select_all_sql_find_KoHoatDong_keyword_IDMaNV(keyword);
            for (HoaDonEntity hd : list1) {
                model1.addRow(new Object[]{
                    hd.getIdHoaDon(),
                    hd.getNgayTao(),
                    hd.isTrangThai() ? "Hoạt Động" : "Hủy Đơn",
                    hd.isTrangThaiTT() ? "Đã Thanh Toán" : "Chưa Thanh Toán",
                    hd.getIdNhanVien(),
                    hd.getThanhTien(),
                    hd.getSlSanPhamHuy(),
                    hd.getLyDoHuy(),
                        hd.getSDT()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }

    public void huydon(int a) {
        HoaDonEntity hd = dao.selectById(a);
        hd.setTrangThai(false);
        dao.updateTrangThai(hd);
        filltotablehoadon();
        filltotablehoadonhuy();
    }
     public void hoantacdon(int a) {
        HoaDonEntity hd = dao.selectById(a);
        hd.setTrangThai(true);
        dao.updateTrangThai(hd);
        filltotablehoadon();
        filltotablehoadonhuy();
    }
}
