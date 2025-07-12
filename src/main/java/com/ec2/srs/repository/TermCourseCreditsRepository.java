package com.ec2.srs.repository;

import com.ec2.srs.model.TermCourseCredits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermCourseCreditsRepository extends JpaRepository<TermCourseCredits, Short> {
    // Custom queries can be added here
}
