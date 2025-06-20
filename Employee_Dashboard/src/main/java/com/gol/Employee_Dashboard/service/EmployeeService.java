package com.gol.Employee_Dashboard.service;

import com.gol.Employee_Dashboard.model.Employee;
import com.gol.Employee_Dashboard.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepo employeeRepo;


    public void addUser(Employee employee) {
        employeeRepo.save(employee);
    }
}
