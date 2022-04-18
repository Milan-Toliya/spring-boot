package com.demo.springboot.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.demo.springboot.dto.EmployeeDTO;
import com.demo.springboot.mapper.EmployeeRowMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private static final String EMPLOYEE_ADDRESS = "employee_address";
    private static final String EMPLOYEE_EMAIL = "employee_email";
    private static final String EMPLOYEE_ID = "employee_id";
    private static final String EMPLOYEE_NAME = "employee_name";

    NamedParameterJdbcTemplate template;

    public EmployeeDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void deleteEmployerById(long id) {
        final String sql = "delete from employee where cast(employee_id as bigint) = :employee_id";

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put(EMPLOYEE_ID, id);

        template.execute(sql, paramMap, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }

    @Override
    public void executeUpdateEmployee(EmployeeDTO emp) {
        final String sql =
                "update employee set employee_name = :employee_name, employee_address = :employee_address, employee_email = :employee_email where cast(employee_id as bigint) = :employee_id";

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put(EMPLOYEE_ID, emp.getEmployeeId());
        paramMap.put(EMPLOYEE_NAME, emp.getEmployeeName());
        paramMap.put(EMPLOYEE_EMAIL, emp.getEmployeeEmail());
        paramMap.put(EMPLOYEE_ADDRESS, emp.getEmployeeAddress());

        template.execute(sql, paramMap, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }

    @Override
    public List<EmployeeDTO> findAll() {
        return template.query("select * from employee", new EmployeeRowMapper());
    }

    @Override
    public Optional<EmployeeDTO> findById(long id) {
        final String sql =
                "select * from employee where cast(employee_id as bigint) = :employee_id";

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put(EMPLOYEE_ID, id);

        List<EmployeeDTO> l = template.query(sql, paramMap, new EmployeeRowMapper());

        return l.isEmpty() ? Optional.empty() : Optional.of(l.get(0));
    }

    @Override
    public void insertEmployee(EmployeeDTO emp) {
        final String sql =
                "insert into employee(employee_id, employee_name, employee_address, employee_email) values(:employee_id, :employee_name, :employee_address, :employee_email)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param =
                new MapSqlParameterSource().addValue(EMPLOYEE_ID, emp.getEmployeeId())
                        .addValue(EMPLOYEE_NAME, emp.getEmployeeName())
                        .addValue(EMPLOYEE_EMAIL, emp.getEmployeeEmail())
                        .addValue(EMPLOYEE_ADDRESS, emp.getEmployeeAddress());
        template.update(sql, param, holder);
    }

    @Override
    public void updateEmployee(EmployeeDTO emp) {
        final String sql =
                "update employee set employee_name = :employee_name, employee_address = :employee_address, employee_email = :employee_email where cast(employee_id as bigint) = :employee_id";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param =
                new MapSqlParameterSource().addValue(EMPLOYEE_ID, emp.getEmployeeId())
                        .addValue(EMPLOYEE_NAME, emp.getEmployeeName())
                        .addValue(EMPLOYEE_EMAIL, emp.getEmployeeEmail())
                        .addValue(EMPLOYEE_ADDRESS, emp.getEmployeeAddress());
        template.update(sql, param, holder);
    }
}
