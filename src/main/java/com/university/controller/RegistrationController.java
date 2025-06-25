package com.university.controller;

import com.university.model.Student;
import com.university.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/register")
    public String registerStudent(@ModelAttribute Student student, Model model) {
        // Here you would validate input and send confirmation email
        studentService.registerStudent(student);
        model.addAttribute("message", "Registration successful! Please check your email to activate your account.");
        return "login";
    }
}
