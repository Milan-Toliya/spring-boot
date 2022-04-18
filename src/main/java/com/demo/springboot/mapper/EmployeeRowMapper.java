package com.demo.springboot.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.demo.springboot.dto.EmployeeDTO;

public class EmployeeRowMapper implements RowMapper<EmployeeDTO> {

    @Override
    public EmployeeDTO mapRow(ResultSet rs, int arg1) throws SQLException {
        EmployeeDTO emp = new EmployeeDTO();
        emp.setEmployeeId(rs.getLong("employee_Id"));
        emp.setEmployeeName(rs.getString("employee_Name"));
        emp.setEmployeeEmail(rs.getString("employee_Email"));
        emp.setEmployeeAddress(rs.getString("employee_Address"));
        return emp;
    }
}
