package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.WorkTrail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkTrailRepository extends JpaRepository<WorkTrail, Long> {
    // Custom queries can be added here
}
