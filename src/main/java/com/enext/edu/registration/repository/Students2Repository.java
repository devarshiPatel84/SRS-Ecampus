package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.Students2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Students2Repository extends JpaRepository<Students2, Long> {
    // Custom queries can be added here
}
