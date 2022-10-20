package com.tcs.demo.repository.mapper;

import com.tcs.demo.domain.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Employee.builder().empId(rs.getLong("emp_id")).empName(rs.getString("emp_name"))
                .height(rs.getDouble("height")).weight(rs.getDouble("weight")).address(rs.getString("address")).build();
    }
}
