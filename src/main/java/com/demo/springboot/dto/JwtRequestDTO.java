package com.demo.springboot.dto;

import java.io.Serializable;

public class JwtRequestDTO implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    private String password;
    private String username;

    // need default constructor for JSON Parsing
    public JwtRequestDTO() {

    }

    public JwtRequestDTO(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
