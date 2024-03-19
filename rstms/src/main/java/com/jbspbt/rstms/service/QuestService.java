package com.jbspbt.rstms.service;


import com.jbspbt.rstms.api.model.Employee;
import com.jbspbt.rstms.api.model.Quest;
import com.jbspbt.rstms.api.model.Task;
import com.jbspbt.rstms.api.repository.EmployeeRepository;
import com.jbspbt.rstms.api.repository.QuestRepository;
import com.jbspbt.rstms.api.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class QuestService {
    private QuestRepository questRepository;
    private EmployeeRepository employeeRepository;
    private TaskRepository taskRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public QuestService(QuestRepository questRepository, EmployeeRepository employeeRepository, TaskRepository taskRepository) {
        this.questRepository = questRepository;
        this.employeeRepository = employeeRepository;
        this.taskRepository = taskRepository;
    }

    public List<Quest> test() {
        String query = "SELECT * FROM Quest";
        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
            Quest quest = new Quest();
            quest.setId(resultSet.getInt("_id"));
            Employee employee = getEmployeeById(resultSet.getInt("emp_id"));
            Task task = getTaskById(resultSet.getInt("task_id"));
            quest.setEmployee(employee);
            quest.setTask(task);
            return quest;
        });
    }

    //return employee of given id
    private Employee getEmployeeById(int empId) {
        String query = "SELECT * FROM Employee WHERE _id = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{empId}, (resultSet, rowNum) -> {
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

    //return task of given id
    private Task getTaskById(int taskId) {
        String query = "SELECT * FROM Task WHERE _id = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{taskId}, (resultSet, rowNum) -> {
            Task task = new Task();
            task.setId(resultSet.getInt("_id"));
            task.setTaskName(resultSet.getString("taskName"));
            task.setTaskType(resultSet.getString("taskType"));
            task.setTaskDescription(resultSet.getString("taskDescription"));
            task.setPriority(resultSet.getString("priority"));
            task.setDeadline(resultSet.getDate("deadline"));
            task.setTaskStatus(resultSet.getString("taskStatus"));
            return task;
        });
    }
}


