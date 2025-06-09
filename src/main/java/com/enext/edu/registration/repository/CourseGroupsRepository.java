package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.CourseGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface CourseGroupsRepository extends JpaRepository<CourseGroups, Short> {
    // Custom queries can be added here
    @Query(value = "SELECT * FROM ec2.SEMESTERCOURSES sc, ec2.COURSEGROUPS cg, ec2.SEMESTERS s WHERE sc.SCRROWSTATE>0 AND s.STRROWSTATE > 0 AND cg.CGPROWSTATE>0 AND cg.CGPID=sc.SCRCGPID AND s.STRID=sc.SCRSTRID AND sc.SCRELECTIVE = 'Y' AND s.STRID = :semesterId", nativeQuery = true)
    List<CourseGroups> getecbysemid(@Param("semesterId") Short semesterId);
}
