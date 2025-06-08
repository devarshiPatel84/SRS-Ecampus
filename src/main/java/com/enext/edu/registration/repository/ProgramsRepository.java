package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.Programs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramsRepository extends JpaRepository<Programs, Short> {
    // Custom queries can be added here
}
