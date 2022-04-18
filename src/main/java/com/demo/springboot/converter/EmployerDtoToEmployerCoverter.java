package com.demo.springboot.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.demo.springboot.domain.Employer;
import com.demo.springboot.dto.EmployerDTO;

@Component
public class EmployerDtoToEmployerCoverter implements Converter<EmployerDTO, Employer> {
    @Override
    public Employer convert(EmployerDTO source) {
        Employer e = new Employer();
        e.setemployerId(source.getemployerId());
        e.setemployerName(source.getemployerName());
        e.setemployerAddress(source.getemployerAddress());
        e.setemployerEmail(source.getemployerEmail());
        return e;
    }
}
