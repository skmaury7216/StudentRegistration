package com.university.service;

import com.university.model.Student;
import com.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(Student student) {
        // TODO: Validate, hash password, send email
        return studentRepository.save(student);
    }
}
