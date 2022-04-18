package com.demo.springboot.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.demo.springboot.domain.Employer;
import com.demo.springboot.dto.EmployerDTO;

@Component
public class EmployerToEmployerDtoCoverter implements Converter<Employer, EmployerDTO> {
    @Override
    public EmployerDTO convert(Employer source) {
        EmployerDTO e = new EmployerDTO();
        e.setemployerId(source.getemployerId());
        e.setemployerName(source.getemployerName());
        e.setemployerAddress(source.getemployerAddress());
        e.setemployerEmail(source.getemployerEmail());
        return e;
    }
}
