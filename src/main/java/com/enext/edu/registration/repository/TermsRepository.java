package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.Terms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermsRepository extends JpaRepository<Terms, Short> {
    // Custom queries can be added here
}
