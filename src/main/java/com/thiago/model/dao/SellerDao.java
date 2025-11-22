package com.thiago.model.dao;

import com.thiago.model.entities.Department;
import com.thiago.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void inser(Seller sl);
    void update(Seller sl);
    void delete(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findDepartment(Department dp);
}
