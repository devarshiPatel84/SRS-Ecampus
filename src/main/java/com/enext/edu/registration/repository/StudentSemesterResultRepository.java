package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.SemesterCourses;
import com.enext.edu.registration.model.StudentSemesterResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentSemesterResultRepository extends JpaRepository<StudentSemesterResult, Long> {
    
    @Query(value = "SELECT ssr.SSRCPI FROM ec2.STUDENTSEMESTERRESULT ssr WHERE ssr.SSRSRGID = (SELECT srg.SRGID FROM ec2.STUDENTREGISTRATIONS srg WHERE srg.SRGSTDID=:studentId ORDER BY srg.SRGID DESC LIMIT 1)", nativeQuery = true)
    String getcpi(@Param("studentId") Long studentId);

    @Query(value = "SELECT ssr.SSRCPI FROM ec2.STUDENTSEMESTERRESULT ssr WHERE ssr.SSRSRGID = (SELECT srg.SRGID FROM ec2.STUDENTREGISTRATIONS srg WHERE srg.SRGSTDID=:studentId ORDER BY srg.SRGID DESC LIMIT 1 OFFSET 1)", nativeQuery = true)
    String getlcpi(@Param("studentId") Long studentId);

}
