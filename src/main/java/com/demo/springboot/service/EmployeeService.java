package com.demo.springboot.service;


import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.springboot.dto.EmployeeDTO;

public interface EmployeeService {
    void deleteEmployerById(@PathVariable long id);

    void executeUpdateEmployee(EmployeeDTO emp);

    List<EmployeeDTO> findAll();

    Optional<EmployeeDTO> findById(long id);

    void insertEmployee(EmployeeDTO emp);

    void updateEmployee(EmployeeDTO emp);
}
