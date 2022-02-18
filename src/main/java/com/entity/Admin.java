package com.entity;

public class Admin extends User{
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private UserRole userRole = UserRole.ADMIN;

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", userRole=" + userRole +
                '}';
    }

    public Admin(String name, String surname, String patronymic, UserRole userRole) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.userRole = userRole;
    }

    public Admin() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}

