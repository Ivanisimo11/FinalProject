package com.service;

import com.entity.Course;
import com.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    void saveStudent(Student student);
    Student getStudent(int id);
    void deleteStudent(int id);
}
