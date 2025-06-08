package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.TermCourseGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermCourseGroupsRepository extends JpaRepository<TermCourseGroups, Short> {
    // Custom queries can be added here
}
