package com.dao;

import com.entity.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CourseDaoImpl implements CourseDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveCourse(Course course) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(course);
    }

    @Override
    public List<Course> getAllCourses() {
        Session session = sessionFactory.getCurrentSession();
        Query<Course> query = session.createQuery("FROM Course", Course.class);
        return query.getResultList();
    }

    @Override
    public Course getCourse(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Course.class, id);
    }

    @Override
    public void deleteCourse(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Course> query = session.createQuery("delete from Course where id = :courseId");
        query.setParameter("courseId", id);
        query.executeUpdate();
    }
}
