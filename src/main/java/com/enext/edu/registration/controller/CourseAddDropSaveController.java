package com.enext.edu.registration.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.enext.edu.registration.RegistrationConstants;
import com.enext.edu.registration.model.*;
import com.enext.edu.registration.repository.*;
import com.enext.edu.registration.service.*;

import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;

@Controller
public class CourseAddDropSaveController {

    @Autowired
    private StudentRegistrationEditService editService;

    @Autowired
    private CourseAddDropSaveService saveCADService;

    @PostMapping("/changeCourses")
    public String submitRegistration(
            @RequestParam Long studentId,
            @RequestParam Short semesterId,
            @RequestParam Long termId,
            @RequestParam String semesterName,
            @RequestParam List<Short> courseIds,
            @RequestParam(required = false) String remarks,
            @RequestParam(required = false) String authority,
            @RequestParam MultiValueMap<String, String> allParams,
            Model model) {

        StudentRegistrations srg = editService.getRegistrationsByStudentIdandSemesterId(studentId, semesterId);

        Long srgid=srg.getSrgid();

        Set<String> selectedIds = new HashSet<>();
        selectedIds.addAll(allParams.getOrDefault("selectedCourseIds", Collections.emptyList()));
        selectedIds.addAll(allParams.getOrDefault("selectedOtherCourses", Collections.emptyList()));
        selectedIds.addAll(allParams.getOrDefault("selectedGradeImprovementCourses", Collections.emptyList()));
        selectedIds.addAll(allParams.getOrDefault("selectedBacklogCourses", Collections.emptyList()));

        Set<String> registeredIds = courseIds.stream()
                .map(String::valueOf)
                .collect(Collectors.toSet());

        Set<String> deselectedCourses = new HashSet<>(registeredIds);
        deselectedCourses.removeAll(selectedIds);

        Set<String> newlySelectedCourses = new HashSet<>(selectedIds);
        newlySelectedCourses.removeAll(registeredIds);

        List<String> selectedAuditCourseIds = allParams.getOrDefault("selectedAuditCourses", Collections.emptyList());
        Set<String> auditRegisteredCourseIds = new HashSet<>();
        for (Short courseId : courseIds) {
            String courseIdStr = String.valueOf(courseId);
            if (selectedAuditCourseIds.contains(courseIdStr)) {
                auditRegisteredCourseIds.add(courseIdStr);
            }
        }

        List<String> newAuditCourses = selectedAuditCourseIds.stream()
                .filter(courseId -> !registeredIds.contains(courseId))
                .collect(Collectors.toList());

        List<String> removedAuditCourses = auditRegisteredCourseIds.stream()
                .filter(courseId -> !selectedAuditCourseIds.contains(courseId))
                .collect(Collectors.toList());

        for (Map.Entry<String, List<String>> entry : allParams.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Values: " + entry.getValue());
        }

        System.out.println("courseIds: " + courseIds);
        System.out.println("selectedIds: " + selectedIds);
        System.out.println("deselectedCourses: " + deselectedCourses);
        System.out.println("newlySelectedCourses: " + newlySelectedCourses);
        System.out.println("newAuditCourses: " + newAuditCourses);
        System.out.println("removedAuditCourses: " + removedAuditCourses);

        saveCADService.removeCourseIds(deselectedCourses,srgid,termId,semesterId,studentId);
        saveCADService.addNewCourseIds(newlySelectedCourses,srgid,termId,semesterId,studentId);
        saveCADService.removeAuditCourseIds(removedAuditCourses,srgid,termId,semesterId,studentId);
        saveCADService.addNewAuditCourseIds(newAuditCourses,srgid,termId,semesterId,studentId);


        // Add attributes for confirmation page
        model.addAttribute("semesterName", semesterName); // or fetch from DB
        model.addAttribute("today", LocalDate.now());
        model.addAttribute("studentId", studentId);
        
        return RegistrationConstants.JSPCOURSEADDDROPSAVE;
    }
}
