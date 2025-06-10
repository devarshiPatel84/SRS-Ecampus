package com.enext.edu.registration.controller;

import java.time.LocalDate;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.enext.edu.registration.RegistrationConstants;
//import com.enext.edu.registration.service.StudentRegistrationSaveService;

import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;

@Controller
public class StudentRegistrationSaveController {
    
    // @Autowired
    // private StudentRegistrationSaveService saveService;

    @PostMapping("/submitRegistration")
    public String submitRegistration(
            @RequestParam Long studentId,
            @RequestParam Short semesterId,
            @RequestParam(required = false) String remarks,
            @RequestParam(required = false) String authority,
            @RequestParam MultiValueMap<String, String> allParams,
            Model model) {

        // Extract selected courses from course0 to course5
        System.out.println("Printing all parameters from the map:");

        // Method 1: Using forEach with a lambda expression (Java 8+)
        allParams.forEach((key, values) -> {
            System.out.println("Key: " + key);
            System.out.println("Values: " + values); // Values will be a List<String>
        });

        // saveService.saveRegistration(studentId, semesterId, selectedCourseIds, remarks);

        // // Add attributes for confirmation page
        model.addAttribute("semesterName", "Semester " + semesterId); // or fetch from DB
        model.addAttribute("today", LocalDate.now());
        model.addAttribute("remarks", remarks);
        model.addAttribute("studentId", studentId);
        
        return RegistrationConstants.JSPSTUDENTREGISTRATIONSAVE;
    }
}
