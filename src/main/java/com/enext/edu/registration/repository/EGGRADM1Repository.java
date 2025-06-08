package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.EGGRADM1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EGGRADM1Repository extends JpaRepository<EGGRADM1, Short> {
    // Custom queries can be added here
}
