package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.StudentSemesterResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentSemesterResultRepository extends JpaRepository<StudentSemesterResult, Long> {
    // Custom queries can be added here
}
