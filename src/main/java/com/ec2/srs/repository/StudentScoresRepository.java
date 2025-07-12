package com.ec2.srs.repository;

import com.ec2.srs.model.StudentScores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentScoresRepository extends JpaRepository<StudentScores, Long> {
    // Custom queries can be added here
}
