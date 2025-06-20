package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.TermCourseAvailableFor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermCourseAvailableForRepository extends JpaRepository<TermCourseAvailableFor, Integer> {
    // Custom queries can be added here
}
