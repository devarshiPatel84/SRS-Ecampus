package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
