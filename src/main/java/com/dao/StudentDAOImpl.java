package com.dao;

import com.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDAOImpl implements StudentDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(student);
    }

    @Override
    public List<Student> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();
        Query<Student> query = session.createQuery("FROM Student", Student.class);
        return query.getResultList();
    }

    @Override
    public Student getStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }

    @Override
    public void deleteStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Student> query = session.createQuery("delete from Student where id = :studentId");
        query.setParameter("studentId", id);
        query.executeUpdate();
    }
}
