package com.pallavi.service;

import com.pallavi.dao.EmployeeDao;
import com.pallavi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeDao employeeDao;
    public Employee getEmployee() {
        return employeeDao.getEmployee();
    }
}
