package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.SemesterCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterCoursesRepository extends JpaRepository<SemesterCourses, Integer> {
    // Custom queries can be added here
}
