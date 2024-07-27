/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.HoaDonEntity;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public interface InterfaceHoadon {
    abstract public void insert(HoaDonEntity Entity);

    abstract public void updateThanhToan(HoaDonEntity Entity);
    
    abstract public void updateTrangThai(HoaDonEntity Entity);
    
    abstract public void updateThanhtien(HoaDonEntity Entity);
    
    abstract public void updateLydohuy(HoaDonEntity Entity);
    
    abstract public void updateSLSPHUY(HoaDonEntity Entity);

    abstract public void delete(HoaDonEntity Entity);

    abstract public HoaDonEntity selectById(int id);
    
    abstract public List<HoaDonEntity> selectAll();
    abstract public List<HoaDonEntity> selectAll_trangthai1();

    abstract public List<HoaDonEntity> selectAll_trangthai0();

    abstract public List<HoaDonEntity> selectAll_SQL_Find_HoatDong(Date a, Date b);

    abstract public List<HoaDonEntity> selectAll_SQL_Find_HoatDong_keyword(String keyword);

    abstract public List<HoaDonEntity> select_all_sql_find_HoatDong_keyword_IDMaNV(String keyword);

    abstract public List<HoaDonEntity> select_all_sql_find_KoHoatDong_keyword_IDMaNV(String keyword);

    abstract public List<HoaDonEntity> selectAll_SQL_Find_koHoatDong_keyword(String keyword);

    abstract public List<HoaDonEntity> selectAll_SQL_Find_KoHoatDong(Date a, Date b);

    abstract public List<HoaDonEntity> selectAll_SQL_Find_HoatDong_1ngay(Date a);

    abstract public List<HoaDonEntity> selectAll_SQL_Find_KoHoatDong_1ngay(Date a);

    abstract public List<HoaDonEntity> selectBySql(String sql, Object... args);
}
