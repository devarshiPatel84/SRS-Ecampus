package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.AcademicYears;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface AcademicYearsRepository extends JpaRepository<AcademicYears, Short> {

    @Query(value = "SELECT ay.AYRID FROM ec2.ACADEMICYEARS ay WHERE ay.AYRNAME = :name AND ay.AYRROWSTATE > 0", nativeQuery = true)
    Long findAcademicYearIdByName(@Param("name") String name);
}
