package com.thiago.model.dao;

import com.thiago.model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void inser(Department dp);
    void update(Department dp);
    void delete(Department dp);
    Department findById(Department dp);
    List<Department> findAll(Department dp);

}
