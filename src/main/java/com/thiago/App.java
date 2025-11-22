package com.thiago;

import com.thiago.model.dao.DaoFactory;
import com.thiago.model.dao.SellerDao;
import com.thiago.model.entities.Department;
import com.thiago.model.entities.Seller;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(1);
        System.out.println(seller.toString());
    }
}
