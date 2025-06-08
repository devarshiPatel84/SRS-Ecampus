package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.EGCRSTT1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EGCRSTT1Repository extends JpaRepository<EGCRSTT1, Long> {
    // Custom queries can be added here
}
