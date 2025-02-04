package Services;

import Dao.NhanVienDAO;
import Entity.NhanVienEntity;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SerNhanVien {

    NhanVienDAO dao = new NhanVienDAO();

    public void insert(NhanVienEntity nv) {
        dao.insert(nv);//thằng này thao tác với SQL
    }

    public void update(NhanVienEntity nv) {
        dao.update(nv);
    }

    public void delete(NhanVienEntity nv) {
        dao.delete(nv.getId_Nhanvien());
    }

    private boolean checkSame(JTextField txtMaNV) {
        if (dao.selectById(txtMaNV.getText()) == null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Trùng mã nhân viên");
            return false;
        }
    }

    private boolean checkSameAccount(JTextField txtTaikhoan) {
        if (dao.selectByAccount(txtTaikhoan.getText()) == null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Trùng tài khoản nhân viên");
            return false;
        }
    }
}
