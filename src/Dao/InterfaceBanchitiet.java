/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.BanChiTietEntity;
import java.util.List;

/**
 *
 * @author HP
 */
public interface InterfaceBanchitiet {
    abstract public void insert(BanChiTietEntity Entity);

    abstract public void update(int idban,int idHoadon);

    abstract public void delete(int id);

    abstract public BanChiTietEntity selectById(int idban,int idHoadon);
    
    abstract public List<BanChiTietEntity> selectByIdHD(int idHoadon);
    
    abstract public List<BanChiTietEntity> selectByIdBan(int idban);
    
    abstract public List<BanChiTietEntity> selectAll();
    

    abstract public List<BanChiTietEntity> selectBySql(String sql, Object... args);
}
