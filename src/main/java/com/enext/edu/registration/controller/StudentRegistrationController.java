package com.enext.edu.registration.controller;

import com.enext.edu.registration.RegistrationConstants;
import com.enext.edu.registration.model.StudentRegistration;
import com.enext.edu.registration.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentRegistrationController {

    @Autowired
    private StudentRegistrationService registrationService;

    @GetMapping("/studentRegistrations")
    public String listStudentRegistrations(
            @RequestParam(name = RegistrationConstants.PARAM_STUDENT_ID, required = true) int studentId,
            Model model) {

        List<StudentRegistration> regs =
            registrationService.getRegistrationsByStudentId(studentId);

        model.addAttribute(
            RegistrationConstants.ATTRIBUTESTUDENTREGISTRATIONS,
            regs
        );
        return RegistrationConstants.JSPSTUDENTREGISTRATIONLIST;
    }
}
