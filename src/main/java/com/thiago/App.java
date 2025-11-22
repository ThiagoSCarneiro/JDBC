package com.thiago;

import com.thiago.model.dao.DaoFactory;
import com.thiago.model.dao.SellerDao;
import com.thiago.model.entities.Department;
import com.thiago.model.entities.Seller;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Department dp = new Department(1L, "Thiago");
        Seller sl = new Seller(1L, "Thiago", "thiago@gmail.com", new Date(), 3000.0, dp);
        System.out.println(dp.toString());
        System.out.println(sl.toString());

        SellerDao sellerDao = DaoFactory.createSellerDao();

    }
}
