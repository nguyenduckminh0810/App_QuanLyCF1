/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;
import Entity.LoaiSanPhamEntity;
import java.util.List;
/**
 *
 * @author Admin
 */
public interface InterfaceLoaiSanPham {
    abstract public void insert(LoaiSanPhamEntity lsp);
    
    abstract public void update(LoaiSanPhamEntity lsp);
    
    abstract public void delete(String id);
    
    abstract public List<LoaiSanPhamEntity> selectAll();
    
    abstract public LoaiSanPhamEntity selectID(String id);
    
    abstract public List<LoaiSanPhamEntity> selectBySQL(String sql, Object...agrs);
}
