package com.pallavi.controller;

import com.pallavi.model.Employee;
import com.pallavi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/test")
    public ResponseEntity<Employee> getEmployee() {
        return new ResponseEntity<>(employeeService.getEmployee(), HttpStatus.OK);
    }
}
