/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.HoaDonChiTietEntity;
import java.util.List;
import Entity.SanPhamEntity;
/**
 *
 * @author HP
 */
public interface InterfaceHoadonchittiet {
    abstract public void insert(HoaDonChiTietEntity Entity);

    abstract public void update_TT(HoaDonChiTietEntity Entity);
    
    abstract public void update_SL(HoaDonChiTietEntity Entity);
    
    abstract public void update_LD(HoaDonChiTietEntity Entity);

    abstract public void delete(HoaDonChiTietEntity Entity);

    abstract public HoaDonChiTietEntity selectById(int idHD, String idMaSP);
    
    abstract public List<HoaDonChiTietEntity> selectByIdHD_TT1(int idHD, String idSP);
    
    abstract public List<HoaDonChiTietEntity> selectByIdHD_TT0(int idHD, String idSP);
    
    abstract public List<HoaDonChiTietEntity> selectAll();
    
    abstract public int selectCountdonHuy(int idhd);

    abstract public List<HoaDonChiTietEntity> selectBySql(String sql, Object... args);
    
    abstract public int selectCount(String sql, Object... args);
   
}
