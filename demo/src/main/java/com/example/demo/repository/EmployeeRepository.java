package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Employee;  // <-- Make sure this import is present

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
