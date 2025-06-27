package com.enext.edu.registration.controller;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

import com.enext.edu.registration.RegistrationConstants;
import com.enext.edu.registration.config.RegistrationDeadlineConfig;
import com.enext.edu.registration.model.*;
import com.enext.edu.registration.service.CourseDropEditService;
import com.enext.edu.registration.service.StudentRegistrationEditService;
import com.enext.edu.registration.service.StudentRegistrationService;

@Controller
public class CourseDropEditController {
    
    @Autowired
    private StudentRegistrationService service;

    @Autowired
    private StudentRegistrationEditService editService;

    @Autowired
    private StudentRegistrationService registrationService;

    @Autowired
    private CourseDropEditService courseDropEditService;

    @Autowired
    private RegistrationDeadlineConfig deadlineConfig;

    @PostMapping("/CourseDropEdit")
    public String editCourses(
            @RequestParam("stdid") Long studentId,
            @RequestParam("strid") Short semesterId,
            Model model) {

        Students st = service.getStudentById(studentId);
        Semesters str = editService.getSemesterBystrId(semesterId);

        // System.out.println("Semester ID: " + semesterId);

        StudentRegistrations srg = editService.getRegistrationsByStudentIdandSemesterId(studentId, semesterId);

        String cpi;
        if(srg!=null){
            cpi = editService.getlastcpi(studentId);
        }
        else{
            cpi = editService.getlatestcpi(studentId);
        }


        Batches btc = editService.getbatch(str.getStrbchid());
        Programs pr = editService.getprogram(btc.getBchprgid());

        Terms trm = editService.getTerm(str.getStrtrmid());

        if(srg!=null) {
           courseDropEditService.findStudentAdjustmentCourses(srg.getSrgid(), studentId);
        }

        model.addAttribute("studentbean", st);
        model.addAttribute("semesterbean", str);
        model.addAttribute("studentRegistrationbean", srg);

        model.addAttribute("batchbean", btc);
        model.addAttribute("programbean", pr);
        model.addAttribute("termbean", trm);

        boolean isWithinDeadline = deadlineConfig.dropisWithinDeadline();

        Short maxStrid = registrationService.getMaxSemesterId(st.getStdbchid());

        System.out.println("Semester ID: " + semesterId);
        System.out.println("Max Semester ID: " + maxStrid);
        System.out.println("Is Within Deadline: " + isWithinDeadline);

        if(semesterId.shortValue() != maxStrid.shortValue() || !isWithinDeadline) {
            System.out.println("DEBUG: Going to VIEW mode");
            List<StudentRegistrationCourses> strgcrs = new ArrayList<>();
            List<Courses> courses = new ArrayList<>();

            if (srg != null) {
                strgcrs = editService.getStudentRegistrationCourses(srg.getSrgid());

                for (StudentRegistrationCourses src : strgcrs) {
                    Long termcourseId = src.getSrctcrid();
                    
                    TermCourses tc = editService.getTermCourse(termcourseId);
                    Courses course = editService.getCourseById(tc.getTcrcrsid());
                    if (course != null) {
                        courses.add(course);
                    }
                }
                courses.sort(Comparator.comparing(Courses::getCrsname));
            }
            
            model.addAttribute("studentRegistrationCoursesbean", strgcrs);
            model.addAttribute("courses", courses);       
            return RegistrationConstants.JSPCOURSEDROPVIEW;
        }
        else{
            System.out.println("DEBUG: Going to EDIT mode");
            List<StudentRegistrationCourses> strgcrs = new ArrayList<>();
            List<Courses> courses = new ArrayList<>();

            if (srg != null) {
                strgcrs = editService.getStudentRegistrationCourses(srg.getSrgid());

                for (StudentRegistrationCourses src : strgcrs) {
                    Long termcourseId = src.getSrctcrid();
                    
                    TermCourses tc = editService.getTermCourse(termcourseId);
                    Courses course = editService.getCourseById(tc.getTcrcrsid());
                    if (course != null) {
                        courses.add(course);
                    }
                }
                courses.sort(Comparator.comparing(Courses::getCrsname));
            }
            
            model.addAttribute("studentRegistrationCoursesbean", strgcrs);
            model.addAttribute("courses", courses);

            List<Courses> compCourses = new ArrayList<>();
            List<SemesterCourses> compulsoryCourses = editService.getCompulsoryCoursesBySemesterId(semesterId);
            for (SemesterCourses sc : compulsoryCourses) {
                Courses course = editService.getCourseById(sc.getScrcrsid());
                if (course!= null) {
                    compCourses.add(course);
                }
            }
            compCourses.sort(Comparator.comparing(Courses::getCrsname));

            List<Courses> backlogCCourses = new ArrayList<>();
            List<SemesterCourses> backlogCourses = editService.getBacklogCompulsoryCourses(studentId,semesterId, btc.getBchid());
            for (SemesterCourses sc : backlogCourses) {
                Courses course = editService.getCourseById(sc.getScrcrsid());
                if (course != null) {
                    backlogCCourses.add(course);
                }
            }
            backlogCCourses.sort(Comparator.comparing(Courses::getCrsname));

            Set<Short> compCourseIds = compCourses.stream()
            .map(Courses::getCrsid)
            .collect(Collectors.toSet());

            Set<Short> backlogCourseIds = backlogCCourses.stream()
            .map(Courses::getCrsid)
            .collect(Collectors.toSet());

            List<Courses> otherCourses = courses.stream().filter(course -> 
                !compCourseIds.contains(course.getCrsid()) && 
                !backlogCourseIds.contains(course.getCrsid()))
                .collect(Collectors.toList());

            otherCourses.sort(Comparator.comparing(Courses::getCrsname));

            model.addAttribute("cSemesterCoursesbean", compCourses);
            model.addAttribute("bcSemesterCoursesbean", backlogCCourses);
            model.addAttribute("otherSemesterCoursesbean", otherCourses);

            return RegistrationConstants.JSPCOURSEDROPEDIT;
        }
    }
}
