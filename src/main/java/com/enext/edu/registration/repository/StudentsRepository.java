package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {
    @Query(value = "select * from ec2.students st where st.stdrowstate > 0 and st.stdid = :studentId", nativeQuery = true)
    Students findstudent(@Param("studentId") Long studentId);
}
