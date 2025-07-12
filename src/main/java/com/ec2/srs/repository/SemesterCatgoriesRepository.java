package com.ec2.srs.repository;

import com.ec2.srs.model.SemesterCatgories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterCatgoriesRepository extends JpaRepository<SemesterCatgories, Short> {
    // Custom queries can be added here
}
