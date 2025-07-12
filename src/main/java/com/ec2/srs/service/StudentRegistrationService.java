package com.ec2.srs.service;

import com.ec2.srs.model.*;
import com.ec2.srs.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentRegistrationService {
    @Autowired 
    private StudentsRepository studentRepo;
    
    @Autowired
    private SemestersRepository semesterRepo;
    
    @Autowired 
    private StudentRegistrationsRepository registrationRepo;
    

    public Students getStudentById(Long id) {
        return studentRepo.findstudent(id);
    }

    public List<Semesters> getSemesterById(Short id) {
        return semesterRepo.findActiveSemestersByBranchId(id);
    }

    public Short getMaxSemesterId(Short batchId) {
        return semesterRepo.findMaxSemesterId(batchId);
    }
    public List<StudentRegistrations> getRegistrationsByStudentId(Long studentId) {
         return registrationRepo.findregisteredsemesters(studentId);
    }

}
