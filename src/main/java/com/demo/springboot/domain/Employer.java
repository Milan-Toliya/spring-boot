package com.demo.springboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employer {

    @Column(name = "employerAddress")
    String employerAddress;
    @Column(name = "employerEmail")
    String employerEmail;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long employerId;
    @Column(name = "emoloyerName")
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
