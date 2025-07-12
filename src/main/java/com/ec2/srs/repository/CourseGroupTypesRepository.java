package com.ec2.srs.repository;

import com.ec2.srs.model.CourseGroupTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseGroupTypesRepository extends JpaRepository<CourseGroupTypes, Short> {
    // Custom queries can be added here
}
