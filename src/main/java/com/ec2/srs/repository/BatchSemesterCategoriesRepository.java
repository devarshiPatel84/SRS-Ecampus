package com.ec2.srs.repository;

import com.ec2.srs.model.BatchSemesterCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchSemesterCategoriesRepository extends JpaRepository<BatchSemesterCategories, Short> {
    // Custom queries can be added here
}
