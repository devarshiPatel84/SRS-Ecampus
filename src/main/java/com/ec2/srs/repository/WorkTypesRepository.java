package com.ec2.srs.repository;

import com.ec2.srs.model.WorkTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkTypesRepository extends JpaRepository<WorkTypes, Short> {
    // Custom queries can be added here
}
