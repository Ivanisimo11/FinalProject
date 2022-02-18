package com.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
    @Column(name = "study_hours")
    private int study_hours;
//    @Column(name = "students")
//    @Size(min = 2, message = "name must be min 2 symbols")
//    private Student[] students;

    public Course(String name, int studyHours) {
        this.name = name;
        this.study_hours = studyHours;
//        this.students = students;
    }

    public Course() {
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

    public Integer getStudy_hours() {
        return study_hours;
    }

    public void setStudy_hours(Integer study_hours) {
        this.study_hours = study_hours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", study_hours=" + study_hours +
                '}';
    }
}
