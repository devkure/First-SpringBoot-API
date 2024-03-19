package com.jbspbt.rstms.api.controller;

import com.jbspbt.rstms.api.model.Employee;
import com.jbspbt.rstms.api.model.Task;
import com.jbspbt.rstms.service.EmployeeService;
import com.jbspbt.rstms.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //DEBUG
    @GetMapping("/tasks")
    public List<Task> test() {
        return taskService.test();
    }

}