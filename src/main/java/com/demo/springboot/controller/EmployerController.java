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

import com.demo.springboot.dto.EmployerDTO;
import com.demo.springboot.service.EmployerService;

@RestController
@RequestMapping("/employer")
public class EmployerController {

    @Resource
    EmployerService employerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployer(@RequestBody EmployerDTO emp) {
        employerService.saveEmployer(emp);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteEmployerById(@PathVariable long id) {
        employerService.deleteEmployerById(id);
    }

    @PutMapping(value = "/exe")
    public void executeUpdateEmployer(@RequestBody EmployerDTO emp) {
        employerService.saveEmployer(emp);
    }

    @GetMapping(value = "/{id}")
    public Optional<EmployerDTO> getEmployerById(@PathVariable long id) {
        return employerService.findById(id);
    }

    @GetMapping(value = "/list")
    public List<EmployerDTO> getEmployers() {
        return employerService.findAll();
    }

    @PutMapping
    public void updateEmployer(@RequestBody EmployerDTO emp) {
        employerService.saveEmployer(emp);
    }
}
