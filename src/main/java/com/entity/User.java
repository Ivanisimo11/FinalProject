package com.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    protected int id;
    protected String name;
    protected String login;
    protected String password;
    protected List<Course> courses = new ArrayList<>();
    protected UserRole userRole;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", courses=" + courses +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public User(String name, String login, String password, List<Course> courses) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.courses = courses;
    }

    public User() {
    }
}