package com.thiago.model.dao.impl;

import com.thiago.db.DB;
import com.thiago.db.DbException;
import com.thiago.model.dao.SellerDao;
import com.thiago.model.entities.Department;
import com.thiago.model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {
    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void inser(Seller sl) {

    }

    @Override
    public void update(Seller sl) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            pstm = conn.prepareStatement(
                    "SELECT seller.*, department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE seller.Id = ?");
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            if (rs.next()) {
                Department dep = new Department();
                dep.setId(rs.getLong("DepartmentId"));
                dep.setName(rs.getString("Name"));
                Seller sl = new Seller();
                sl.setId(rs.getLong("Id"));
                sl.setName(rs.getString("Name"));
                sl.setBaseSalary(rs.getDouble("BaseSalary"));
                sl.setBirthDate(rs.getDate("BirthDate"));
                sl.setDepartment(dep);
                return sl;
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }finally {
            DB.closePrepareStatement(pstm);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Seller> findAll() {
        return null;
    }

    @Override
    public List<Seller> findDepartment(Department dp) {
        return null;
    }
}
