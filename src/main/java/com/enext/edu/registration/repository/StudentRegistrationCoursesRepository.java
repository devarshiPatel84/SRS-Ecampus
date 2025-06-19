package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.StudentRegistrationCourses;

import jakarta.transaction.Transactional;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegistrationCoursesRepository extends JpaRepository<StudentRegistrationCourses, Long> {
    
    @Query(value = "SELECT * FROM ec2.STUDENTREGISTRATIONCOURSES src WHERE src.SRCSRGID = :srgid AND src.SRCSTATUS='ACTIVE' AND src.SRCROWSTATE > 0", nativeQuery = true)
    List<StudentRegistrationCourses> getbysrgid(@Param("srgid") Long srgid);

    @Query("SELECT MAX(s.srcid) FROM StudentRegistrationCourses s")
    Optional<Long> findMaxSrcid();

    @Query(value = "SELECT * FROM ec2.STUDENTREGISTRATIONCOURSES src WHERE src.SRCSRGID = :srgid AND src.SRCTCRID = :tcrid AND src.SRCROWSTATE > 0", nativeQuery = true)
    StudentRegistrationCourses getSrg(@Param("tcrid") Long tcrid, @Param("srgid") Long srgid);

    @Modifying
    @Transactional
    @Query("DELETE FROM StudentRegistrationCourses s WHERE s.srcsrgid = :srgid")
    void deleteBySrcsrgid(@Param("srgid") Long srgid);

    @Modifying
    @Transactional
    @Query("DELETE FROM StudentRegistrationCourses s WHERE s.srcid = :srcid")
    void deleteSrcid(@Param("srcid") Long srcid);

}
