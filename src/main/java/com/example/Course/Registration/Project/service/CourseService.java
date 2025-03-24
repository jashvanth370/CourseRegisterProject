package com.example.Course.Registration.Project.service;

import com.example.Course.Registration.Project.model.Course;
import com.example.Course.Registration.Project.model.CourseRegistry;
import com.example.Course.Registration.Project.repository.CourseRegistryRepository;
import com.example.Course.Registration.Project.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseRegistryRepository courseRegistryRepository;
    public List<Course> avalaibleCourses() {
        return courseRepository.findAll();
    }

    public List<CourseRegistry> getEndrolledStudents() {
        return courseRegistryRepository.findAll();
    }

    public void courseEndroll(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
        courseRegistryRepository.save(courseRegistry);
    }
}
