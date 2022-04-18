package com.demo.springboot.dto;

public class EmployeeDTO {

    String employeeAddress;
    String employeeEmail;
    Long employeeId;
    String employeeName;

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
