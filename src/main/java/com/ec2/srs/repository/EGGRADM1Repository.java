package com.ec2.srs.repository;

import com.ec2.srs.model.EGGRADM1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EGGRADM1Repository extends JpaRepository<EGGRADM1, Short> {
    
    @Query(value = "SELECT eg.GRAD_LT FROM ec2.EGGRADM1 eg WHERE eg.GRAD_ID = :obtgr AND eg.ROW_ST > 0", nativeQuery = true)
    String getGrade(@Param("obtgr") Integer obtgr);

}
