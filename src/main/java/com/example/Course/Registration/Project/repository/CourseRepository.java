package com.example.Course.Registration.Project.repository;

import com.example.Course.Registration.Project.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {


}
