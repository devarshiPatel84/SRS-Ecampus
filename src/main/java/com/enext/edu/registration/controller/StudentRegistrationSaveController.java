package com.enext.edu.registration.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
public class StudentRegistrationSaveController {
    
    @Autowired
    private StudentRegistrationsRepository registrationRepo;

    @Autowired
    private StudentRegistrationEditService editService;

    @Autowired
    private StudentRegistrationSaveService saveService;

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

        StudentRegistrations srg = editService.getRegistrationsByStudentIdandSemesterId(studentId, semesterId);

        Long srgid;

        if(srg!=null){
            srg.setSrgregdate(LocalDate.now());
            srg.setSrglastupdatedat(LocalDateTime.now());
            srgid=srg.getSrgid();
            registrationRepo.save(srg);
            saveService.deleteSrcBySrg(srg.getSrgid());
        }
        else{
            srgid=saveService.newRegistration(studentId,semesterId);
        }

        saveService.selectedCourseIds(allParams,srgid,termId,semesterId);
        saveService.selectedOtherCourseIds(allParams,srgid,termId,semesterId);
        saveService.selectedGradeImprovementCourseIds(allParams,srgid,termId,semesterId);
        saveService.selectedBacklogCourseIds(allParams, srgid, termId, semesterId);
        saveService.selectedAuditCourseIds(allParams, srgid, termId, semesterId);


        // Add attributes for confirmation page
        model.addAttribute("semesterName", semesterName); // or fetch from DB
        model.addAttribute("today", LocalDate.now());
        model.addAttribute("remarks", remarks);
        model.addAttribute("studentId", studentId);
        
        return RegistrationConstants.JSPSTUDENTREGISTRATIONSAVE;
    }
}
