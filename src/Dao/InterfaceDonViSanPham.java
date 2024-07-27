/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;
import Entity.DonViSanPhamEntity;
import java.util.List;
/**
 *
 * @author Admin
 */
public interface InterfaceDonViSanPham {
    abstract public void insert(DonViSanPhamEntity dv);
    abstract public void update(DonViSanPhamEntity dv);
    abstract public void delete(String id);
    abstract public List<DonViSanPhamEntity> selectAll();
    abstract public DonViSanPhamEntity selectID(String id);
    abstract public List<DonViSanPhamEntity> selectBySQL(String sql, Object...agrs);
}
