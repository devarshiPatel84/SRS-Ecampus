// package com.enext.edu.registration.service;

// import java.time.LocalDate;
// import java.util.*;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.enext.edu.registration.model.CourseBySemester;
// import com.enext.edu.registration.model.StudentRegistration;
// import com.enext.edu.registration.model.StudentRegistrationCourse;
// import com.enext.edu.registration.repository.CourseBySemesterRepository;
// import com.enext.edu.registration.repository.StudentRegistrationCourseRepository;
// import com.enext.edu.registration.repository.StudentRegistrationRepository;

// import jakarta.transaction.Transactional;

// @Service
// @Transactional
// public class StudentRegistrationSaveService {
//     @Autowired
//     private StudentRegistrationRepository registrationRepo;

//     @Autowired
//     private StudentRegistrationCourseRepository registrationCourseRepo;

//     // @Autowired
//     private CourseBySemesterRepository courseRepo;

//     public void saveRegistration(Integer studentId, Integer semesterId, List<Integer> courseIds, String remarks) {
//         StudentRegistration registration = registrationRepo
//                 .findByStudentIdAndSemesterId(studentId, semesterId);

//         registration.setRegistrationDate(LocalDate.now());
//         registrationRepo.save(registration);

//         // Save courses
//         for (Integer courseId : courseIds) {
//             CourseBySemester course = courseRepo.findById(courseId).orElse(null);
//             if (course != null) {
//                 StudentRegistrationCourse src = new StudentRegistrationCourse();
//                 src.setRegistrationId(registration.getId());
//                 src.setCourseCode(course.getCourseCode());
//                 src.setCourseName(course.getCourseName());
//                 src.setCredits(course.getCredits());
//                 src.setStatus("ACTIVE");

//                 registrationCourseRepo.save(src);
//             }
//         }
//     }
// }
