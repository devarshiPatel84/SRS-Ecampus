package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.Programs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramsRepository extends JpaRepository<Programs, Short> {
    
    @Query(value = "SELECT * FROM ec2.PROGRAMS prg WHERE prg.PRGROWSTATE > 0 AND prg.PRGID = :programId", nativeQuery = true)
    Programs getprgId(@Param("programId") Short programId);

}
