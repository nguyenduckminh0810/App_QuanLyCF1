/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.NhanVienEntity;

import java.util.List;

/**
 * @author HP
 */
public interface InterfaceNhanVien {
    abstract public void insert(NhanVienEntity Entity);

    abstract public void update(NhanVienEntity Entity);

    abstract public void delete(String id);

    abstract public NhanVienEntity selectById(String id);

    abstract public NhanVienEntity selectByAccount(String account);

    abstract public List<NhanVienEntity> selectAll();

    abstract public List<NhanVienEntity> selectBySql(String sql, Object... args);
}
