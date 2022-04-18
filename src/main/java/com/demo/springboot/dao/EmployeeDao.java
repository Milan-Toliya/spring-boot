package com.demo.springboot.dao;

import java.util.List;
import java.util.Optional;

import com.demo.springboot.dto.EmployeeDTO;

public interface EmployeeDao {

    public void deleteEmployerById(long id);

    void executeUpdateEmployee(EmployeeDTO emp);

    List<EmployeeDTO> findAll();

    Optional<EmployeeDTO> findById(long id);

    void insertEmployee(EmployeeDTO emp);

    void updateEmployee(EmployeeDTO emp);
}
