package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.CourseBySemester;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseBySemesterRepository extends JpaRepository<CourseBySemester, Integer> {
    List<CourseBySemester> findBySemesterId(Integer semesterId);
}
