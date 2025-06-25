package com.university.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Enrollment {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
    private LocalDateTime enrolledAt;

    // Getters and setters
}
