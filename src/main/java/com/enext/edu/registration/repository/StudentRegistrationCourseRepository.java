package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.StudentRegistrationCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRegistrationCourseRepository extends JpaRepository<StudentRegistrationCourse, Integer> {

    List<StudentRegistrationCourse> findByRegistrationId(Integer registrationId);
}
