package com.ec2.srs.repository;

import com.ec2.srs.model.StudentSemesterResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentSemesterResultRepository extends JpaRepository<StudentSemesterResult, Long> {
    
    @Query(value = "SELECT ssr.SSRCPI FROM ec2.STUDENTSEMESTERRESULT ssr WHERE ssr.SSRSRGID in (SELECT srg.SRGID FROM ec2.STUDENTREGISTRATIONS srg WHERE srg.SRGSTDID=:studentId) ORDER BY ssr.SSRSRGID DESC LIMIT 1", nativeQuery = true)
    String getcpi(@Param("studentId") Long studentId);

    @Query(value = "SELECT ssr.SSRCPI FROM ec2.STUDENTSEMESTERRESULT ssr WHERE ssr.SSRSRGID in (SELECT srg.SRGID FROM ec2.STUDENTREGISTRATIONS srg WHERE srg.SRGSTDID=:studentId) ORDER BY ssr.SSRSRGID DESC LIMIT 1 OFFSET 1", nativeQuery = true)
    String getlcpi(@Param("studentId") Long studentId);

    @Query(value = "SELECT * FROM ec2.STUDENTSEMESTERRESULT ssr WHERE ssr.SSRSRGID = :srgid", nativeQuery = true)
    StudentSemesterResult getBySrgid(@Param("srgid") Long srgid);

}
