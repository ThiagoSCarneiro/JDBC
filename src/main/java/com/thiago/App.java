package com.thiago;

import com.thiago.model.dao.DaoFactory;
import com.thiago.model.dao.SellerDao;
import com.thiago.model.entities.Department;
import com.thiago.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===TEST FindById SELLER ===");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller.toString());

        System.out.println("\n===TEST FindById Departmente ===");
        Department dep = new Department(2L, null);
        List<Seller> list = sellerDao.findDepartment(dep);
        for (Seller obj : list) {
            System.out.println(obj.toString());
        }

        System.out.println("\n===TEST FindById ALL ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj.toString());
        }
    }
}
