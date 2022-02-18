package com.dao;

import com.entity.Course;

import java.util.List;

public interface CourseDAO {
    void saveCourse(Course course);
    List<Course> getAllCourses();
    Course getCourse(int id);
    void deleteCourse(int id);
}
