package com.demo.springboot.service;

import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

import com.demo.springboot.dao.EmployeeDao;
import com.demo.springboot.dto.EmployeeDTO;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    EmployeeDao employeeDao;

    @Override
    public void deleteEmployerById(long id) {
        employeeDao.deleteEmployerById(id);
    }

    @Override
    public void executeUpdateEmployee(EmployeeDTO emp) {
        employeeDao.executeUpdateEmployee(emp);
    }

    @Override
    public List<EmployeeDTO> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Optional<EmployeeDTO> findById(long id) {
        return employeeDao.findById(id);
    }

    @Override
    public void insertEmployee(EmployeeDTO emp) {
        employeeDao.insertEmployee(emp);
    }

    @Override
    public void updateEmployee(EmployeeDTO emp) {
        employeeDao.updateEmployee(emp);
    }
}
