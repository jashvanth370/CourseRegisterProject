package com.example.Course.Registration.Project.controller;

import com.example.Course.Registration.Project.model.Course;
import com.example.Course.Registration.Project.model.CourseRegistry;
import com.example.Course.Registration.Project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;


    @GetMapping("/courses")
    public List<Course> avalaibleCorses(){
        return courseService.avalaibleCourses();
    }

    @GetMapping("courses/endrolled")
    public List<CourseRegistry> getEndrolledStudents(){
        return courseService.getEndrolledStudents();
    }

    @PostMapping("/courses/register")
    public String courseEndroll(@RequestParam("name") String name,
                                @RequestParam("emailId") String emailId,
                                @RequestParam("courseName") String courseName){
        courseService.courseEndroll(name,emailId,courseName);
        return "Congtratulations "+ name +"for endroll our "+courseName;
    }
}
