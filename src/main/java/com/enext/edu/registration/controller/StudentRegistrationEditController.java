package com.enext.edu.registration.controller;
import com.enext.edu.registration.RegistrationConstants;
import com.enext.edu.registration.model.*;
import com.enext.edu.registration.service.*;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentRegistrationEditController {

    @Autowired
    private StudentRegistrationService service;

    @Autowired
    private StudentRegistrationEditService editService;

    @GetMapping("/studentRegistrationEdit")
    public String editStudentRegistration(
            @RequestParam("stdid") Long studentId,
            @RequestParam("strid") Short semesterId,
            Model model) {

        Students st = service.getStudentById(studentId);
        Semesters str = editService.getSemesterBystrId(semesterId);

        StudentRegistrations srg = editService.getRegistrationsByStudentIdandSemesterId(studentId, semesterId);

        Batches btc = editService.getbatch(str.getStrbchid());
        Programs pr = editService.getprogram(btc.getBchprgid());

        Terms trm = editService.getTerm(str.getStrtrmid());

        List<StudentRegistrationCourses> strgcrs = editService.getStudentRegistrationCourses(srg.getSrgid());

        List<Courses> courses = new ArrayList<>();
        for (StudentRegistrationCourses src : strgcrs) {
            Integer termcourseId = src.getSrctcrid();
            
            TermCourses tc = editService.getTermCourse(termcourseId);
            Courses course = editService.getCourseById(tc.getTcrcrsid());
            if (course != null) {
                courses.add(course);
            }
        }


        model.addAttribute("studentbean", st);
        model.addAttribute("semesterbean", str);
        model.addAttribute("studentRegistrationbean", srg);
        model.addAttribute("studentRegistrationCoursesbean", strgcrs);
        model.addAttribute("batchbean", btc);
        model.addAttribute("programbean", pr);
        model.addAttribute("termbean", trm);
        model.addAttribute("courses", courses);

        return RegistrationConstants.JSPSTUDENTREGISTRATIONVIEW;

    }
}
