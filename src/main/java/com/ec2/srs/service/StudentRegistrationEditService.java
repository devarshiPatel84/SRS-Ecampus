package com.ec2.srs.service;

import com.ec2.srs.model.*;
import com.ec2.srs.repository.*;
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

    @Autowired
    private SemesterCoursesRepository semesterCoursesRepo;

    @Autowired
    private CourseGroupsRepository courseGroupsRepo;

    @Autowired
    private StudentSemesterResultRepository stdstrresultRepo;
    
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

    public TermCourses getTermCourse(Long termcourseId) {
        return trmcrsRepo.getbytrmcrsid(termcourseId);
    }

    public Courses getCourseById(Long id) {
        return crsRepo.getbycrsid(id);
    }

    public List<SemesterCourses> getCompulsoryCoursesBySemesterId(Short semesterId) {
        return semesterCoursesRepo.getccbysemid(semesterId);
    }

    public List<CourseGroups> getElectiveCoursesBySemesterId(Short semesterId) {
        return courseGroupsRepo.getecbysemid(semesterId);
    }

    public List<Courses> getCourseByCgpId(Short cgpId, Short prgId, Short trmId) {
        return crsRepo.getbycgpId(cgpId, prgId, trmId);
    }

    public List<SemesterCourses> getBacklogCompulsoryCourses(Long studentId, Short semesterId, Short batchId) {
        return semesterCoursesRepo.getBCCourses(studentId, semesterId, batchId);
    }

    public List<SemesterCourses> getBacklogElectiveCourses(Long studentId, Short semesterId, Short batchId) {
        return semesterCoursesRepo.getBECourses(studentId, semesterId, batchId);
    }

    public List<TermCourses> getTermCourses(Short prgId, Short trmId) {
        return trmcrsRepo.getTCourses(prgId, trmId);
    }

    public List<TermCourses> getOptionalCourses(Short semesterId, Short prgId, Short trmId) {
        return trmcrsRepo.getOCourses(semesterId, prgId, trmId);
    }

    public List<TermCourses> getOptionalBacklogCourses(Long studentId, Short semesterId, Short prgId, Short trmId, Short batchId) {
        return trmcrsRepo.getOBCourses(studentId,semesterId, prgId, trmId, batchId);
    }

    public List<TermCourses> getOtherTermCourses(Long studentId, Short semesterId, Short prgId, Short trmId) {
        return trmcrsRepo.getOTermCourses(studentId, semesterId, prgId, trmId);
    }   

    public List<TermCourses> getGradeImprovementCourses(Long studentId, Short prgId, Short trmId) {
        return trmcrsRepo.getGICourses(studentId, prgId, trmId);
    }

    public String getlatestcpi(Long studentId) {
        return stdstrresultRepo.getcpi(studentId);
    }

    public String getlastcpi(Long studentId) {
        return stdstrresultRepo.getlcpi(studentId);
    }

}
