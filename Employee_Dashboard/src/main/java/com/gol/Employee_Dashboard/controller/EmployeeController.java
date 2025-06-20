package com.gol.Employee_Dashboard.controller;

import com.gol.Employee_Dashboard.model.Employee;
import com.gol.Employee_Dashboard.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("employee", new Employee()); // ensures `th:object="${employee}"` works
        return "index";
    }

    @PostMapping("/")
    public String addUser(@ModelAttribute Employee employee){
        employeeService.addUser(employee);
        return "redirect:/";
    }

}
