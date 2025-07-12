package com.ec2.srs.repository;

import com.ec2.srs.model.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {
    @Query(value = "select * from ec2.students st where st.stdrowstate > 0 and st.stdid = :studentId", nativeQuery = true)
    Students findstudent(@Param("studentId") Long studentId);

    @Query(value = "SELECT st.STDID FROM ec2.students st WHERE st.STDINSTID = :studentId ORDER BY stdrowstate DESC LIMIT 1", nativeQuery = true)
    Long findstdid(@Param("studentId") String studentId);

    @Query(value = "SELECT st.STDBCHID FROM ec2.students st WHERE st.STDINSTID = :studentId ORDER BY stdrowstate DESC LIMIT 1", nativeQuery = true)
    Long findBatchIdByStudentId(@Param("studentId") String studentId);
}
