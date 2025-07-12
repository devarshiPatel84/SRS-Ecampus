package com.ec2.srs.repository;

import com.ec2.srs.model.EGEXAMM1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EGEXAMM1Repository extends JpaRepository<EGEXAMM1, Short> {
    // Custom queries can be added here
}
