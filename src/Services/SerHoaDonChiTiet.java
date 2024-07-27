/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entity.GiamGiaEntity;
import Entity.HoaDonChiTietEntity;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import view.HoadonchitietJDialog;
import Dao.HoadonchitietDAO;
import Entity.DonViSanPhamEntity;
import Entity.GiamGiaChiTietEntity;
import Entity.HoaDonEntity;
import Dao.*;
import Entity.SanPhamEntity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ADMIN ASUS
 */
public class SerHoaDonChiTiet {

    Locale vn = new Locale("vi", "VN");
    HoadonchitietDAO dao = new HoadonchitietDAO();

    public void filltotablehoadonchitiet(int a) {
        List<HoaDonChiTietEntity> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) HoadonchitietJDialog.tblHoaDonChiTiet.getModel();
        model.setRowCount(0);
        try {
            list = dao.selectById1(a);
            for (HoaDonChiTietEntity hd : list) {
//               hd.setGia(GiaTheoSize(hd.getID_SanPHam()));
//               hd.setTongGia(hd.getGia() * hd.getSoluong());
                model.addRow(new Object[]{
                    hd.getID_Hoadon(),
                    hd.getID_SanPHam(),
                    hd.getSoluong(),
                    //                    GiaTheoSize(hd.getID_SanPHam()),
                    //                    GiaTheoSize(hd.getID_SanPHam()) * hd.getSoluong(),
                    NumberFormat.getInstance().format(hd.getGia()),
                    NumberFormat.getInstance().format(hd.getTongGia() * hd.getSoluong()),
                    hd.isTrangThai() ? "" : "Hủy",
                    hd.getLyDoHuy()

                });

            }
        } catch (Exception e) {
        }
    }

    public int GiaTheoSize(String masp) {

        SanPhamDao DAOSP = new SanPhamDao();
        DonViSanPhamDao DAODVSP = new DonViSanPhamDao();
        SanPhamEntity sp = new SanPhamEntity();
        DonViSanPhamEntity dvdu = new DonViSanPhamEntity();
        sp = DAOSP.selectID(masp);
        dvdu = DAODVSP.selectID(sp.getId_donviSP());
        int gia = sp.getGia_sp();
        System.out.println(dvdu.getThemTien());
        sp.setGia_sp(gia);
        return gia;
    }
}
