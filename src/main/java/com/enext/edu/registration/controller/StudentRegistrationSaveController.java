package com.enext.edu.registration.controller;

import java.time.LocalDate;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.enext.edu.registration.RegistrationConstants;
import com.enext.edu.registration.service.StudentRegistrationSaveService;

import org.springframework.ui.Model;

@Controller
public class StudentRegistrationSaveController {
    
    @Autowired
    private StudentRegistrationSaveService saveService;

    @PostMapping("/submitRegistration")
    public String submitRegistration(
            @RequestParam Integer studentId,
            @RequestParam Integer semesterId,
            @RequestParam(required = false) String remarks,
            @RequestParam(required = false) String authority,
            @RequestParam Map<String, String> allParams,
            Model model) {

        // Extract selected courses from course0 to course5
        List<Integer> selectedCourseIds = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            String courseKey = "course" + i;
            if (allParams.containsKey(courseKey)) {
                String value = allParams.get(courseKey);
                if (value != null && !value.isBlank()) {
                    try {
                        selectedCourseIds.add(Integer.parseInt(value));
                    } catch (NumberFormatException e) {
                        // skip invalid value
                    }
                }
            }
        }

        saveService.saveRegistration(studentId, semesterId, selectedCourseIds, remarks);

        // Add attributes for confirmation page
        model.addAttribute("semesterName", "Semester " + semesterId); // or fetch from DB
        model.addAttribute("today", LocalDate.now());
        model.addAttribute("remarks", remarks);
        model.addAttribute("studentId", studentId);
        
        return RegistrationConstants.JSPSTUDENTREGISTRATIONSAVE;
    }
}
