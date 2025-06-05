package com.enext.edu.registration.service;
import com.enext.edu.registration.model.*;
import com.enext.edu.registration.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentRegistrationService {
    @Autowired private StudentRepository studentRepo;
    @Autowired private SemesterRepository semesterRepo;
    @Autowired private StudentRegistrationRepository registrationRepo;
    @Autowired private StudentRegistrationCourseRepository courseRepo;
    @Autowired private CourseBySemesterRepository availableRepo;

    public Student getStudentById(Integer id) {
        return studentRepo.findById(id).orElse(null);
    }

    public Semester getSemesterById(Integer id) {
        return semesterRepo.findById(id).orElse(null);
    }

    public boolean isAlreadyRegistered(Integer studentId, Integer semesterId) {
        StudentRegistration reg = registrationRepo.findByStudentIdAndSemesterId(studentId, semesterId);
        return reg != null && reg.getRegistrationDate() != null;
    }

    public List<StudentRegistration> getRegistrationsByStudentId(Integer studentId) {
         return registrationRepo.findByStudentId(studentId);
    }

    public StudentRegistration getRegistration(Integer studentId, Integer semesterId) {
        return registrationRepo.findByStudentIdAndSemesterId(studentId, semesterId);
    }

    public List<StudentRegistrationCourse> getRegisteredCourses(Integer registrationId) {
        return courseRepo.findByRegistrationId(registrationId);
    }

    public List<CourseBySemester> getAvailableCourses(Integer semesterId) {
    return availableRepo.findBySemesterId(semesterId);
    }

}
