package com.entity;

import java.util.Arrays;

public class Teacher extends User{
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private Course[] taughtCourses;
    private UserRole userRole = UserRole.TEACHER;

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", taughtCourses=" + Arrays.toString(taughtCourses) +
                ", userRole=" + userRole +
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

    public Course[] getTaughtCourses() {
        return taughtCourses;
    }

    public void setTaughtCourses(Course[] taughtCourses) {
        this.taughtCourses = taughtCourses;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Teacher(String name, String surname, String patronymic, Course[] taughtCourses, UserRole userRole) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.taughtCourses = taughtCourses;
        this.userRole = userRole;
    }
}
