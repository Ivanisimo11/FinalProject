package com.entity;

public enum UserRole {
    TEACHER, STUDENT, ADMIN;

    public static UserRole getRole(String roleString) {
        return UserRole.valueOf(roleString.toUpperCase());
    }

    public static UserRole getRole(User user) {
        if (user.getClass().equals(Student.class)) {
            return STUDENT;
        } else if (user.getClass().equals(Teacher.class)) {
            return TEACHER;
        }
        return null;
    }


}