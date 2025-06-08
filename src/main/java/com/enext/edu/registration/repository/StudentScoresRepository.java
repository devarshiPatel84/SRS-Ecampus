package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.StudentScores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentScoresRepository extends JpaRepository<StudentScores, Long> {
    // Custom queries can be added here
}
