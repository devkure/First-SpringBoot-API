package com.jbspbt.rstms.service;


import com.jbspbt.rstms.api.model.Employee;
import com.jbspbt.rstms.api.model.Task;
import com.jbspbt.rstms.api.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {
    private TaskRepository taskRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Task> test() {
        String query = "SELECT * FROM Task";
        return jdbcTemplate.query(query, (resultSet, rowNum) -> {
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


