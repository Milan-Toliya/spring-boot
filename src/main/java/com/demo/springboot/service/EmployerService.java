package com.demo.springboot.service;

import java.util.List;
import java.util.Optional;

import com.demo.springboot.dto.EmployerDTO;

public interface EmployerService {
    void deleteEmployerById(long id);

    List<EmployerDTO> findAll();

    Optional<EmployerDTO> findById(long id);

    void saveEmployer(EmployerDTO emp);
}
