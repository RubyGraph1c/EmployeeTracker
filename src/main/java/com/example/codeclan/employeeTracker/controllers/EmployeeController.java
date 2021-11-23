package com.example.codeclan.employeeTracker.controllers;
import com.example.codeclan.employeeTracker.models.Employee;
import com.example.codeclan.employeeTracker.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//
//
import java.util.List;
//
@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}