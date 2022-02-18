package com.dao;

import com.entity.Course;
import com.entity.Student;

import java.util.List;

public interface StudentDAO {
    void saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudent(int id);
    void deleteStudent(int id);
}
