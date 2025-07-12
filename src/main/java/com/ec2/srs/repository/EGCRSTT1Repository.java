package com.ec2.srs.repository;

import com.ec2.srs.model.EGCRSTT1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EGCRSTT1Repository extends JpaRepository<EGCRSTT1, Long> {
    
    @Query(value = "SELECT * FROM ec2.EGCRSTT1 eg WHERE eg.TCRID = :tcrid AND eg.STUD_ID = :studentId AND eg.ROW_ST > '0'", nativeQuery = true)
    EGCRSTT1 getObtgrId(@Param("studentId") Long studentId, @Param("tcrid") Long tcrid);

}
