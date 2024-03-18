package com.springboot_jb.jbsbt.api.model;

public class Member {
    private int id;
    private String fName;
    private String lName;
    private String nName;
    private String email;
    private String role;

    public Member(int id, String fName, String lName, String nName, String email, String role) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.nName = nName;
        this.email = email;
        this.role = role;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getnName() {
        return nName;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
