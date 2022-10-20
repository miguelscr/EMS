package com.tcs.demo.controller;

import com.tcs.demo.domain.Employee;
import com.tcs.demo.repository.EmployeeRepositoryJDBCTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class EmployeeController {
    private final EmployeeRepositoryJDBCTemplate employeeRepo;

    public List<Employee> getAll(){
        List<Employee> employees = new ArrayList<>();
        employeeRepo.findAllJDBC().forEach(e -> employees.add(e));
        return employees;
    }

}