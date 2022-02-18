package com.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students")
public class Student extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Size(min = 4, message = "name must be min 4 symbols")
    @Column(name = "name")
    private String name;
    @Size(min = 6, message = "login must be min 6 symbols")
    @Column(name = "login")
    private String login;
    @Size(min = 8, message = "password must be min 2 symbols")
    @Column(name = "password")
    private String password;

    public Student(@Size(min = 4, message = "name must be min 4 symbols") String name, @Size(min = 6, message = "login must be min 6 symbols") String login, @Size(min = 8, message = "password must be min 2 symbols") String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public Student() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
