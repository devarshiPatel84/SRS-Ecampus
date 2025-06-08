package com.enext.edu.registration.service;

import com.enext.edu.registration.model.*;
import com.enext.edu.registration.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentRegistrationEditService {
    
    @Autowired
    private SemestersRepository semesterRepo;
    
    @Autowired 
    private StudentRegistrationsRepository registrationRepo;

    @Autowired
    private BatchesRepository batchesRepo;

    @Autowired
    private ProgramsRepository programsRepo;

    @Autowired
    private TermsRepository termsRepo;

    @Autowired
    private StudentRegistrationCoursesRepository strcRepo;

    @Autowired
    private TermCoursesRepository trmcrsRepo;

    @Autowired
    private CoursesRepository crsRepo;
    
    public Semesters getSemesterBystrId(Short id) {
        return semesterRepo.findById(id).orElse(null);
    }

    public StudentRegistrations getRegistrationsByStudentIdandSemesterId(Long studentId, Short semesterId) {
        return registrationRepo.getsrgbystdidandstrid(studentId, semesterId);
    }

    public Batches getbatch(Short id) {
        return batchesRepo.getbtchId(id);
    }

    public Programs getprogram(Short id) {
        return programsRepo.getprgId(id);
    }

    public Terms getTerm(Short id) {
        return termsRepo.gettrmId(id);
    }

    public List<StudentRegistrationCourses> getStudentRegistrationCourses(Long id) {
        return strcRepo.getbysrgid(id);
    }

    public TermCourses getTermCourse(Integer id) {
        return trmcrsRepo.getbytrmcrsid(id);
    }

    public Courses getCourseById(Long id) {
        return crsRepo.getbycrsid(id);
    }

}
