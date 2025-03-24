package com.example.Course.Registration.Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String courseName;
    private String trainer;
    private int durationInWeeks;

    public Course(String courseName, String trainer, int durationInWeeks) {
        this.courseName = courseName;
        this.trainer = trainer;
        this.durationInWeeks = durationInWeeks;
    }


}
