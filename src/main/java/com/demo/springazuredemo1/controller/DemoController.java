package com.demo.springazuredemo1.controller;

import com.demo.springazuredemo1.entity.Employee;
import com.demo.springazuredemo1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/api")
    public String getMessage() {
        return  "First app deployed !! and  it is working !!";
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }
}
