package com.ec2.srs.repository;

import com.ec2.srs.model.WorkTrail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkTrailRepository extends JpaRepository<WorkTrail, Long> {
    // Custom queries can be added here
}
