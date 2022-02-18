package com.service;

import com.dao.CourseDAO;
import com.dao.CourseDaoImpl;
import com.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDAO courseDAO;

    @Override
    @Transactional
    public List<Course> getAllCourses() {
        return courseDAO.getAllCourses();
    }

    @Override
    @Transactional
    public void saveCourse(Course course) {
        courseDAO.saveCourse(course);
    }

    @Override
    @Transactional
    public Course getCourse(int id) {
        return courseDAO.getCourse(id);
    }

    @Override
    @Transactional
    public void deleteCourse(int id) {
        courseDAO.deleteCourse(id);
    }
}
