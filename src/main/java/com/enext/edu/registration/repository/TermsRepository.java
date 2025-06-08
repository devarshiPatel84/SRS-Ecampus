package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.Terms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TermsRepository extends JpaRepository<Terms, Short> {
    
    @Query(value = "SELECT * FROM ec2.TERMS trm,ec2.ACADEMICYEARS acdy WHERE trm.TRMROWSTATE > 0 AND acdy.AYRROWSTATE>0 AND trm.TRMAYRID = acdy.AYRID AND trm.TRMID = :termId", nativeQuery = true)
    Terms gettrmId(@Param("termId") Short termId);

}
