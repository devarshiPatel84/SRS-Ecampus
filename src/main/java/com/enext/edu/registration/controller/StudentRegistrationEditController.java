package com.enext.edu.registration.controller;
import com.enext.edu.registration.RegistrationConstants;
import com.enext.edu.registration.model.*;
import com.enext.edu.registration.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentRegistrationEditController {

    @Autowired
    private StudentRegistrationService service;

    @GetMapping("/studentRegistrationEdit")
    public String editStudentRegistration(
            @RequestParam("stdid") Integer studentId,
            @RequestParam("SemesterID") Integer semesterId,
            Model model) {

        Student student = service.getStudentById(studentId);
        Semester semester = service.getSemesterById(semesterId);
        boolean registered = service.isAlreadyRegistered(studentId, semesterId);

        model.addAttribute("studentbean", student);
        model.addAttribute("semesterbean", semester);
        model.addAttribute("alreadyRegistered", registered);

        if (registered) {
            StudentRegistration reg = service.getRegistration(studentId, semesterId);
            model.addAttribute("stdregbean", reg);
            model.addAttribute("registeredCourses", service.getRegisteredCourses(reg.getId()));
            return RegistrationConstants.JSPSTUDENTREGISTRATIONVIEW;
        } else {
            model.addAttribute("availableCourses", service.getAvailableCourses(semesterId));
            return RegistrationConstants.JSPSTUDENTREGISTRATIONEDIT;
        }

    }
}
