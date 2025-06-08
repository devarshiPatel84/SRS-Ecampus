package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.Courses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Short> {
    
    @Query(value = "SELECT * FROM ec2.COURSES crs WHERE crs.CRSID = :crsid AND crs.CRSROWSTATE > 0", nativeQuery = true)
    Courses getbycrsid(@Param("crsid") Long crsid);

}
