/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.BanEntity;
import java.util.List;

/**
 *
 * @author HP
 */
public interface InterfaceBan {
    abstract public void insert(BanEntity Entity);

    abstract public void update(BanEntity Entity);
    
    abstract public void updateTrangThai(int id);
    
    abstract public void updateHoatDong(int id);

    abstract public void deleteTRangThai(int id);
    
    abstract public void deleteHoatDong(int id);
    
    abstract public void delete(int id);

    abstract public BanEntity selectById(int id);
    
    abstract public List<BanEntity> selectByIdcheck(int id);
    
    abstract public List<BanEntity> selectAll();
    
    abstract public List<BanEntity> selectAll_banthuc();

    abstract public List<BanEntity> selectBySql(String sql, Object... args);
}
