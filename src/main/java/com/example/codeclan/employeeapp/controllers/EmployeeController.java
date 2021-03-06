package com.example.codeclan.employeeapp.controllers;

import com.example.codeclan.employeeapp.models.Employee;
import com.example.codeclan.employeeapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/employees/{employeeNumber}")
    public Optional<Employee> getEmployee(@PathVariable Long employeeNumber) {

        return employeeRepository.findById(employeeNumber);
    }
}
