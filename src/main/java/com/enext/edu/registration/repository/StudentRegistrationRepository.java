package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration, Long> {

    List<StudentRegistration> findByStudentId(Long studentId);

    StudentRegistration findByStudentIdAndSemesterId(Long studentId, Long semesterId);
}
