package com.demo.springazuredemo1.repository;

import com.demo.springazuredemo1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
