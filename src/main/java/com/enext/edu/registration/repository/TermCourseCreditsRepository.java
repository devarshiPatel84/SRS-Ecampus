package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.TermCourseCredits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermCourseCreditsRepository extends JpaRepository<TermCourseCredits, Short> {
    // Custom queries can be added here
}
