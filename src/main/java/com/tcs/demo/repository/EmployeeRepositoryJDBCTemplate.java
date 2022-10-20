package com.tcs.demo.repository;

import com.tcs.demo.domain.Employee;
import com.tcs.demo.repository.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Repository
public class EmployeeRepositoryJDBCTemplate {
    private final NamedParameterJdbcTemplate jdbcTemplate;
    public static final String SELECT_EMPLOYEES = "SELECT * FROM employees";

    private final EmployeeMapper employeeMapperMap;

    public List<Employee> findAllJDBC(){
        return jdbcTemplate.query(SELECT_EMPLOYEES, employeeMapperMap);
    }
}
