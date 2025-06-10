package com.enext.edu.registration.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.enext.edu.registration.RegistrationConstants;
import com.enext.edu.registration.model.*;
import com.enext.edu.registration.repository.*;

import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;

@Controller
public class StudentRegistrationSaveController {
    
    // @Autowired
    // private StudentRegistrationSaveService saveService;
    @Autowired
    private StudentRegistrationsRepository registrationRepo;

    @Autowired
    private StudentRegistrationCoursesRepository registrationCoursesRepo;

    @Autowired
    private TermCoursesRepository termCoursesRepo;

    @Autowired
    private SemesterCoursesRepository semesterCoursesRepo;

    @PostMapping("/submitRegistration")
    public String submitRegistration(
            @RequestParam Long studentId,
            @RequestParam Short semesterId,
            @RequestParam Long termId,
            @RequestParam String semesterName,
            @RequestParam(required = false) String remarks,
            @RequestParam(required = false) String authority,
            @RequestParam MultiValueMap<String, String> allParams,
            Model model) {

            StudentRegistrations registration = new StudentRegistrations();
            Optional<Long> maxSrgid = registrationRepo.findMaxSrgid();
            registration.setSrgid(maxSrgid.orElse(0L) + 1);
            registration.setSrgstdid(studentId);
            registration.setSrgstrid(semesterId);
            registration.setSrgregdate(LocalDate.now());
            registration.setSrgcreatedat(LocalDateTime.now());
            registration.setSrglastupdatedat(LocalDateTime.now());
            registration.setSrgrowstate((short) 1);

            registrationRepo.save(registration);


            List<String> selectedCourseIds = allParams.get("selectedCourseIds");
            if(selectedCourseIds != null) {
                for (String courseId : selectedCourseIds) {
                    StudentRegistrationCourses src = new StudentRegistrationCourses();
                    src.setSrcsrgid(maxSrgid.orElse(0L) + 1); // Use the same srgid as registration
                    src.setSrctype("REGULAR");
                    src.setSrcstatus("ACTIVE");
                    src.setSrccreatedby(7L);
                    src.setSrccreatedat(LocalDateTime.now());
                    src.setSrcrowstate((short) 1);

                    Long tcrid = termCoursesRepo.findTcrid(Long.parseLong(courseId), termId);
                    Integer scrid = semesterCoursesRepo.findScrid(semesterId, Long.parseLong(courseId));
                    Optional<Long> srcid = registrationCoursesRepo.findMaxSrcid();
                    src.setSrctcrid(tcrid);
                    src.setSrcscrid(scrid);
                    src.setSrcid(srcid.orElse(0L) + 1);

                    registrationCoursesRepo.save(src);
                }
            }

            List<String> selectedOtherCourseIds = allParams.get("selectedOtherCourses");
            if(selectedOtherCourseIds != null) {
                for (String courseId : selectedOtherCourseIds) {
                    StudentRegistrationCourses src = new StudentRegistrationCourses();
                    src.setSrcsrgid(maxSrgid.orElse(0L) + 1); // Use the same srgid as registration
                    src.setSrctype("REGULAR");
                    src.setSrcstatus("ACTIVE");
                    src.setSrccreatedby(7L);
                    src.setSrccreatedat(LocalDateTime.now());
                    src.setSrcrowstate((short) 1);

                    Long tcrid = termCoursesRepo.findTcrid(Long.parseLong(courseId), termId);
                    Integer scrid = semesterCoursesRepo.findScrid(semesterId, Long.parseLong(courseId));
                    Optional<Long> srcid = registrationCoursesRepo.findMaxSrcid();
                    src.setSrctcrid(tcrid);
                    src.setSrcscrid(scrid);
                    src.setSrcid(srcid.orElse(0L) + 1);

                    registrationCoursesRepo.save(src);
                }
            }

            List<String> selectedGICourseIds = allParams.get("selectedGradeImprovementCourses");
            if(selectedGICourseIds != null) {
                for (String courseId : selectedGICourseIds) {
                    StudentRegistrationCourses src = new StudentRegistrationCourses();
                    src.setSrcsrgid(maxSrgid.orElse(0L) + 1); // Use the same srgid as registration
                    src.setSrctype("REGULAR");
                    src.setSrcstatus("ACTIVE");
                    src.setSrccreatedby(7L);
                    src.setSrccreatedat(LocalDateTime.now());
                    src.setSrcrowstate((short) 1);

                    Long tcrid = termCoursesRepo.findTcrid(Long.parseLong(courseId), termId);
                    Integer scrid = semesterCoursesRepo.findScrid(semesterId, Long.parseLong(courseId));
                    Optional<Long> srcid = registrationCoursesRepo.findMaxSrcid();
                    src.setSrctcrid(tcrid);
                    src.setSrcscrid(scrid);
                    src.setSrcid(srcid.orElse(0L) + 1);

                    registrationCoursesRepo.save(src);
                }
            }

            List<String> selectedBacklogCourseIds = allParams.get("selectedBacklogCourses");
            if(selectedBacklogCourseIds != null) {
                for (String courseId : selectedBacklogCourseIds) {
                    StudentRegistrationCourses src = new StudentRegistrationCourses();
                    src.setSrcsrgid(maxSrgid.orElse(0L) + 1); // Use the same srgid as registration
                    src.setSrctype("REGULAR");
                    src.setSrcstatus("ACTIVE");
                    src.setSrccreatedby(7L);
                    src.setSrccreatedat(LocalDateTime.now());
                    src.setSrcrowstate((short) 1);

                    Long tcrid = termCoursesRepo.findTcrid(Long.parseLong(courseId), termId);
                    Integer scrid = semesterCoursesRepo.findScrid(semesterId, Long.parseLong(courseId));
                    Optional<Long> srcid = registrationCoursesRepo.findMaxSrcid();
                    src.setSrctcrid(tcrid);
                    src.setSrcscrid(scrid);
                    src.setSrcid(srcid.orElse(0L) + 1);

                    registrationCoursesRepo.save(src);
                }
            }

            List<String> selectedAuditCourseIds = allParams.get("selectedAuditCourses");
            if(selectedAuditCourseIds != null) {
                for (String courseId : selectedAuditCourseIds) {
                    StudentRegistrationCourses src = new StudentRegistrationCourses();
                    src.setSrcsrgid(maxSrgid.orElse(0L) + 1); // Use the same srgid as registration
                    src.setSrctype("REGULAR");
                    src.setSrcstatus("ACTIVE");
                    src.setSrccreatedby(7L);
                    src.setSrccreatedat(LocalDateTime.now());
                    src.setSrcrowstate((short) 1);

                    Long tcrid = termCoursesRepo.findTcrid(Long.parseLong(courseId), termId);
                    Integer scrid = semesterCoursesRepo.findScrid(semesterId, Long.parseLong(courseId));
                    Optional<Long> srcid = registrationCoursesRepo.findMaxSrcid();
                    src.setSrctcrid(tcrid);
                    src.setSrcscrid(scrid);
                    src.setSrcid(srcid.orElse(0L) + 1);

                    registrationCoursesRepo.save(src);
                }
            }

        System.out.println("Printing all parameters from the map:");

        allParams.forEach((key, values) -> {
            System.out.println("Key: " + key);
            System.out.println("Values: " + values); // Values will be a List<String>
        });

        // saveService.saveRegistration(studentId, semesterId, selectedCourseIds, remarks);

        // // Add attributes for confirmation page
        model.addAttribute("semesterName", semesterName); // or fetch from DB
        model.addAttribute("today", LocalDate.now());
        model.addAttribute("remarks", remarks);
        model.addAttribute("studentId", studentId);
        
        return RegistrationConstants.JSPSTUDENTREGISTRATIONSAVE;
    }
}
