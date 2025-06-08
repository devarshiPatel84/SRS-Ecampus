package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.AcademicYears;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicYearsRepository extends JpaRepository<AcademicYears, Short> {
    // Custom queries can be added here
}
