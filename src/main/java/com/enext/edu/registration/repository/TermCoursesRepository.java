package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.TermCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TermCoursesRepository extends JpaRepository<TermCourses, Integer> {
    
    @Query(value = "SELECT * FROM ec2.TERMCOURSES trmsrc WHERE trmsrc.TCRID = :trmcrsid AND trmsrc.TCRROWSTATE > 0", nativeQuery = true)
    TermCourses getbytrmcrsid(@Param("trmcrsid") Integer trmcrsid);

}
