package com.demo.springboot.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.demo.springboot.domain.Employer;
import com.demo.springboot.dto.EmployerDTO;
import com.demo.springboot.repository.EmployerRepository;

@Component
public class EmployerServiceImpl implements EmployerService {

    @Autowired
    Converter<EmployerDTO, Employer> employerDtoToEmployer;

    @Autowired
    EmployerRepository employerRepository;

    @Autowired
    Converter<Employer, EmployerDTO> employerToEmployerDTO;

    @Override
    public void deleteEmployerById(long id) {
        employerRepository.deleteById(id);
    }

    @Override
    public List<EmployerDTO> findAll() {
        List<Employer> list = employerRepository.findAll();
        return list.stream().map(employerToEmployerDTO::convert).collect(Collectors.toList());
    }

    @Override
    public Optional<EmployerDTO> findById(long id) {
        Optional<Employer> employer = employerRepository.findById(id);
        if (!employer.isPresent())
            return Optional.empty();
        EmployerDTO employerDto = employerToEmployerDTO.convert(employer.get());
        return employerDto == null ? Optional.empty() : Optional.of(employerDto);
    }

    @Override
    public void saveEmployer(EmployerDTO emp) {
        Employer employer = employerDtoToEmployer.convert(emp);
        if (employer != null)
            employerRepository.save(employer);
    }
}
