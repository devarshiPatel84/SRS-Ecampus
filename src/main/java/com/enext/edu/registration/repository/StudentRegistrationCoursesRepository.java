package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.StudentRegistrationCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegistrationCoursesRepository extends JpaRepository<StudentRegistrationCourses, Long> {
    // Custom queries can be added here
}
