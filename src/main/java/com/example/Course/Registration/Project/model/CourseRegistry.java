package com.example.Course.Registration.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String emailId;
    private String courseName;

    public CourseRegistry(String name, String emailId, String courseName) {
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
    }
}
