package com.ec2.srs.repository;

import com.ec2.srs.model.CourseGroupCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseGroupCoursesRepository extends JpaRepository<CourseGroupCourses, Short> {
    // Custom queries can be added here
}
