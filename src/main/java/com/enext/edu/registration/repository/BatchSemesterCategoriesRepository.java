package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.BatchSemesterCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchSemesterCategoriesRepository extends JpaRepository<BatchSemesterCategories, Short> {
    // Custom queries can be added here
}
