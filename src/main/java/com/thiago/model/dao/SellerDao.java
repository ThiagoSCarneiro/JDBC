package com.thiago.model.dao;

import com.thiago.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void inser(Seller sl);
    void update(Seller sl);
    void delete(Seller sl);
    Seller findById(Seller sl);
    List<Seller> findAll(Seller sl);
}
