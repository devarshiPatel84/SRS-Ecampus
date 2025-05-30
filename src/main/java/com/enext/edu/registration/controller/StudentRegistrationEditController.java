package com.enext.edu.registration.controller;

import com.enext.edu.registration.RegistrationConstants;
import com.enext.edu.registration.CourseConstants;
import com.enext.edu.registration.model.*;
import com.enext.edu.registration.service.StudentRegistrationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentRegistrationEditController {

    @Autowired
    private StudentRegistrationService registrationService;

    @GetMapping("/studentRegistrationEdit")
    public String editStudentRegistration(
        @RequestParam(name = "stdid") Long studentId,
        @RequestParam(name = "SemesterID") Long semesterId,
        Model model) {

        // Mocked service methods
        Student student = registrationService.getStudentById(studentId);
        Semester semester = registrationService.getSemesterById(semesterId);
        Program program = registrationService.getProgramForStudent(studentId);
        Term term = registrationService.getTermForSemester(semesterId);

        StudentRegistration registration = registrationService.getRegistrationForStudentAndSemester(studentId, semesterId);
        boolean alreadyRegistered = (registration != null && registration.getRegistrationDate() != null);

        model.addAttribute("studentbean", student);
        model.addAttribute("semesterBean", semester);
        model.addAttribute("programBean", program);
        model.addAttribute("termBean", term);
        model.addAttribute("alreadyRegistered", alreadyRegistered);

        if (alreadyRegistered) {
            model.addAttribute("stdregbean", registration);
        } else {
            List<String> availableCourses = List.of(
                "Computational Finance",
                "Environmental Science",
                "High Performance Computing",
                "Modeling and Simulation"
            );
            model.addAttribute("availableCourses", availableCourses);
        }

        return RegistrationConstants.JSPSTUDENTREGISTRATIONEDIT; // resolves to templates/edu/registration/DefaultRegistrationEdit.html
    }
}
