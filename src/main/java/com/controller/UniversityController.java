package com.controller;


import com.entity.Course;

import com.entity.Student;
import com.service.CourseService;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UniversityController {
    @Autowired
    private CourseService courseService;
//    @Autowired
//    private TeacherService teacherService;
    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public String registration(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "first-page";
    }
    @RequestMapping("/saveStudent")
    public String saveStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "first-page";
        }
        studentService.saveStudent(student);
        return "redirect:/myAccount";
    }

    @RequestMapping("/allCourses")
    public String showAllCourses(Model model) {
        List<Course> allCourses = courseService.getAllCourses();
        model.addAttribute("allCourses", allCourses);
        return "all-courses";
    }

    @RequestMapping("/addNewCourse")
    public String addNewCourse(Model model) {
        Course course = new Course();
        model.addAttribute("course", course);
        return "course-info";
    }
    @RequestMapping("/saveCourse")
    public String saveCourse(@Valid @ModelAttribute("course") Course course, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "course-info";
        }
        courseService.saveCourse(course);
        return "redirect:/allCourses";
    }

    @RequestMapping("/myAccount")
    public String myAccount(Model model) {


        //сделать так чтобы были только те курсы на которые записан студент
        List<Course> coursesThisStudent = courseService.getAllCourses();
        model.addAttribute("coursesThisStudent", coursesThisStudent);
        return "my-account";
    }
}
