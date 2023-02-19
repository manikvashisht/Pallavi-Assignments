package com.pallavi.dao;

import com.pallavi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDao {

    @Autowired
    Employee employee;
    public Employee getEmployee() {
        employee.setName("Pallavi");
        employee.setAge(30);
        employee.setRole("Developer");
        employee.setSalary(100000L);
        return employee;
    }
}
