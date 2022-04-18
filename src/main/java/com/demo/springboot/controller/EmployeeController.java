package com.demo.springboot.controller;

import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.dto.EmployeeDTO;
import com.demo.springboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Resource
    EmployeeService employeeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee(@RequestBody EmployeeDTO emp) {
        employeeService.insertEmployee(emp);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteEmployerById(@PathVariable long id) {
        employeeService.deleteEmployerById(id);
    }

    @PutMapping(value = "/exe")
    public void executeUpdateEmployee(@RequestBody EmployeeDTO emp) {
        employeeService.executeUpdateEmployee(emp);
    }

    @GetMapping(value = "/{id}")
    public Optional<EmployeeDTO> getEmployeeById(@PathVariable long id) {
        return employeeService.findById(id);
    }

    @GetMapping(value = "/list")
    public List<EmployeeDTO> getEmployees() {
        return employeeService.findAll();
    }

    @PutMapping
    public void updateEmployee(@RequestBody EmployeeDTO emp) {
        employeeService.updateEmployee(emp);
    }
}
