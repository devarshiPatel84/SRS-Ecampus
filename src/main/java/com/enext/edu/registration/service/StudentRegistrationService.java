// package com.enext.edu.registration.service;

// import com.enext.edu.registration.model.StudentRegistration;
// import com.enext.edu.registration.repository.StudentRegistrationRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class StudentRegistrationService {

//     @Autowired
//     private StudentRegistrationRepository repository;

//     public List<StudentRegistration> getRegistrationsByStudentId(Long studentId) {
//         return repository.findByStudentId(studentId);
//     }

//     public boolean isAlreadyRegistered(Long studentId, Long semesterId) {
//         return repository.findByStudentId(studentId).stream()
//                 .anyMatch(reg -> reg.getSemesterId().equals(semesterId));
//     }

//     public StudentRegistration getRegistrationForStudentAndSemester(Long studentId, Long semesterId) {
//         return repository.findByStudentId(studentId).stream()
//                 .filter(reg -> reg.getSemesterId().equals(semesterId))
//                 .findFirst()
//                 .orElse(null);
//     }
// }

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

    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    public Semester getSemesterById(Long id) {
        return semesterRepo.findById(id).orElse(null);
    }

    public boolean isAlreadyRegistered(Long studentId, Long semesterId) {
        StudentRegistration reg = registrationRepo.findByStudentIdAndSemesterId(studentId, semesterId);
        return reg != null && reg.getRegistrationDate() != null;
    }

    public List<StudentRegistration> getRegistrationsByStudentId(Long studentId) {
         return registrationRepo.findByStudentId(studentId);
    }

    public StudentRegistration getRegistration(Long studentId, Long semesterId) {
        return registrationRepo.findByStudentIdAndSemesterId(studentId, semesterId);
    }

    public List<StudentRegistrationCourse> getRegisteredCourses(Long registrationId) {
        return courseRepo.findByRegistrationId(registrationId);
    }

    public List<CourseBySemester> getAvailableCourses(Long semesterId) {
    return availableRepo.findBySemesterId(semesterId);
    }

}
