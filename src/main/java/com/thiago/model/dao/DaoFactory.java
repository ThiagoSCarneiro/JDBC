package com.thiago.model.dao;

import com.thiago.db.DB;
import com.thiago.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return  new SellerDaoJDBC(DB.getConnection());
    }
}
