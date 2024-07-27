/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import Entity.SanPhamEntity;
import Dao.SanPhamDao;
/**
 *
 * @author Admin
 */
public class SanPhamService {
    SanPhamDao dao = new SanPhamDao();

    public void insert(SanPhamEntity sp) {
        dao.insert(sp);
    }

    public void update(SanPhamEntity sp) {
        dao.update(sp);
    }

    public void delete(SanPhamEntity sp) {
        dao.delete(sp.getId_sp());
    }
}
