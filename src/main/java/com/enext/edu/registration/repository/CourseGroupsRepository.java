package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.CourseGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseGroupsRepository extends JpaRepository<CourseGroups, Short> {
    // Custom queries can be added here
}
