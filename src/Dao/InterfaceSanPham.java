/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;


import Entity.SanPhamEntity;
import java.util.List;
/**
 *
 * @author Admin
 */

public interface InterfaceSanPham {
    
    abstract public void insert(SanPhamEntity sp);
    
    abstract public void update(SanPhamEntity sp);
    
    abstract public void delete(String id);
    
    abstract public List<SanPhamEntity> selectAll();
    
    abstract public SanPhamEntity selectID(String id);
    
    abstract public List<SanPhamEntity> selectBySQL(String sql, Object...args);
}
