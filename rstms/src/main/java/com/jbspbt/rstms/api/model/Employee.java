package com.jbspbt.rstms.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;
    private String fName;
    private String lName;
    private String nName;
    private String email;
    private String empRole;
    private String pass;

    public Employee(){

    }
    public Employee(int id, String fName, String lName, String nName, String email, String empRole, String pass) {
        this._id = id;
        this.fName = fName;
        this.lName = lName;
        this.nName = nName;
        this.email = email;
        this.empRole = empRole;
        this.pass = pass;
    }

    // Getters and setters

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
