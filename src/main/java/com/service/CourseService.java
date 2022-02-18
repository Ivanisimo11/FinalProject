package com.service;

import com.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    void saveCourse(Course course);
    Course getCourse(int id);
    void deleteCourse(int id);
}
