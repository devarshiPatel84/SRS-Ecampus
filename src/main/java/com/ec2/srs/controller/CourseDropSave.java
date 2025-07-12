package com.ec2.srs.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.*;
import org.springframework.ui.Model;
import com.ec2.srs.RegistrationConstants;
import com.ec2.srs.model.*;
import com.ec2.srs.service.*;

@Controller
public class CourseDropSave {
    @Autowired
    private StudentRegistrationEditService editService;

    @Autowired
    private CourseDropSaveService courseDropSaveService;

    @PostMapping("/srs/CourseDropSave")
    public String saveCourseDrop(
            @RequestParam("studentId") Long studentId,
            @RequestParam("semesterId") Short semesterId,
            @RequestParam("termId") Long termId,
            @RequestParam("semesterName") String semesterName,
            @RequestParam("courseIdsBefore") List<Short> courseIdsBefore,
            @RequestParam(value = "courseIds", required = false) List<Short> courseIds,
            Model model) {

        StudentRegistrations srg = editService.getRegistrationsByStudentIdandSemesterId(studentId, semesterId);
        Long srgid = srg.getSrgid();

        System.out.println("Student ID: " + studentId);
        System.out.println("Semester ID: " + semesterId);
        System.out.println("Term ID: " + termId);
        System.out.println("Semester Name: " + semesterName);
        System.out.println("Selected Course IDs to RETAIN:");
        if (courseIds != null) {
            for (Short id : courseIds) {
                System.out.println(id);
            }
        } else {
            System.out.println("No courses selected. All eligible courses dropped.");
        }

        System.out.println("Course IDs before drop:");
        for (Short id : courseIdsBefore) {
            System.out.println(id);
        }


        if (courseIds == null) {
            courseIds = new ArrayList<>();
        }

        Set<Short> beforeSet = new HashSet<>(courseIdsBefore);
        Set<Short> retainSet = new HashSet<>(courseIds);

        beforeSet.removeAll(retainSet);
        List<Short> dropCourseIds = new ArrayList<>(beforeSet);

        System.out.println("Courses to Drop:");
        for(Short id: dropCourseIds){
            System.out.println(id);
        }

        courseDropSaveService.removeCourseIds(dropCourseIds, srgid, termId, semesterId, studentId);

        model.addAttribute("semesterName", semesterName);
        model.addAttribute("today", LocalDate.now());
        model.addAttribute("studentId", studentId);

        return RegistrationConstants.JSPCOURSEDROPSAVE;  
    }
}
