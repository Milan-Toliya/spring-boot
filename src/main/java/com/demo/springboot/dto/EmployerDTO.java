package com.demo.springboot.dto;

public class EmployerDTO {

    String employerAddress;
    String employerEmail;
    Long employerId;
    String employerName;

    public String getemployerAddress() {
        return employerAddress;
    }

    public String getemployerEmail() {
        return employerEmail;
    }

    public Long getemployerId() {
        return employerId;
    }

    public String getemployerName() {
        return employerName;
    }

    public void setemployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }

    public void setemployerEmail(String employerEmail) {
        this.employerEmail = employerEmail;
    }

    public void setemployerId(Long employerId) {
        this.employerId = employerId;
    }

    public void setemployerName(String employerName) {
        this.employerName = employerName;
    }
}
