package com.jbspbt.rstms.api.model;

import jakarta.persistence.*;

@Entity
public class Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Task task;

    public Quest() {

    }

    public Quest(Employee employee, Task task) {
        this.employee = employee;
        this.task = task;
    }

    // Getters and setters

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
