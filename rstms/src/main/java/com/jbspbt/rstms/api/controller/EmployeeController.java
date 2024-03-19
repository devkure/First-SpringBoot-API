package com.jbspbt.rstms.api.controller;

import com.jbspbt.rstms.api.model.Employee;
import com.jbspbt.rstms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

  /*  @GetMapping("/employee")
    public Optional<Employee> getEmployee(@RequestParam Long id) {
        return employeeService.findEmployeeById(id);
    }*/

    //DEBUG
    @GetMapping("/employees")
    public List<Employee> test() {
        return employeeService.test();
    }

}