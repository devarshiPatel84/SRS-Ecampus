package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterRepository extends JpaRepository<Semester, Integer> {
}
