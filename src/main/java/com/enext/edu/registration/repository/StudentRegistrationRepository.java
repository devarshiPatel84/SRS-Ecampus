package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration, Integer> {

    List<StudentRegistration> findByStudentId(Integer studentId);

    StudentRegistration findByStudentIdAndSemesterId(Integer studentId, Integer semesterId);
}
