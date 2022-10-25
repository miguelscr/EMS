package com.tcs.demo.controller;

import com.tcs.demo.domain.Employee;
import com.tcs.demo.repository.EmployeeRepositoryJDBCTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class EmployeeController {
    private final EmployeeRepositoryJDBCTemplate employeeRepo;

    @GetMapping("/")
    public List<Employee> getAll(){
        Double height = 1.82d, weight=82d, height2 = 1.80d, weight2=78d;
        //List<Employee> employees = new ArrayList<>();
        List<Employee> list = List.of(new Employee(1L,"Sergio",height,weight,"Guadalajara"),
                new Employee(2L,"José",height2,weight2,"CDMX"));
        //employeeRepo.findAllJDBC().forEach(e -> employees.add(e));
        return list;
    }

}