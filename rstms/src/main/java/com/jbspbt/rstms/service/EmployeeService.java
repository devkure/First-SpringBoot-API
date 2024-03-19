package com.jbspbt.rstms.service;


import com.jbspbt.rstms.api.model.Employee;
import com.jbspbt.rstms.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> test() {
        String query = "SELECT * FROM Employee";
        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
            Employee employee = new Employee();
            employee.setId(resultSet.getInt("_id"));
            employee.setfName(resultSet.getString("fName"));
            employee.setlName(resultSet.getString("lName"));
            employee.setnName(resultSet.getString("nName"));
            employee.setEmail(resultSet.getString("email"));
            employee.setEmpRole(resultSet.getString("empRole"));
            employee.setPass(resultSet.getString("pass"));
            return employee;
        });
    }
}


