package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.StudentRegistrations;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegistrationsRepository extends JpaRepository<StudentRegistrations, Long> {

    @Query(value = "SELECT * FROM ec2.STUDENTREGISTRATIONS srg WHERE srg.SRGROWSTATE > 0 AND srg.SRGSTDID=:studentId", nativeQuery = true)
    List<StudentRegistrations> findregisteredsemesters(@Param("studentId") Long studentId);

    @Query(value = "SELECT * FROM ec2.STUDENTREGISTRATIONS srg WHERE srg.SRGROWSTATE > 0 AND srg.SRGSTDID=:studentId and srg.SRGSTRID=:semesterId", nativeQuery = true)
    StudentRegistrations getsrgbystdidandstrid(@Param("studentId") Long studentId, @Param("semesterId") Short semesterId);
}
