package com.enext.edu.registration.service;

import com.enext.edu.registration.model.StudentRegistration;
import com.enext.edu.registration.model.Student;
import com.enext.edu.registration.model.Semester;
import com.enext.edu.registration.model.Program;
import com.enext.edu.registration.model.Term;
import java.util.Date;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentRegistrationService {

    // your “database”
    private final List<StudentRegistration> all = List.of(
        new StudentRegistration(1L, 101L, 2023L, LocalDate.of(2023, 8, 15)),
        new StudentRegistration(2L, 102L, 2023L, LocalDate.of(2023, 8, 16)),
        new StudentRegistration(3L, 101L, 2024L,LocalDate.of(2024, 12, 1)),
        new StudentRegistration(4L, 103L, 2023L, LocalDate.of(2023, 8, 17)),
        new StudentRegistration(5L,101L, 2025L,LocalDate.of(2025, 8, 15)),
        new StudentRegistration(6L,101L, 2022L, LocalDate.of(2022, 8, 15)),
        new StudentRegistration(7L,102L,2021L, LocalDate.of(2021, 12, 2)),
        new StudentRegistration(8L, 102L,2025L,LocalDate.of(2025, 1, 10))

    );

    /** Returns *all* registrations (unchanged) */
    public List<StudentRegistration> getAllRegistrations() {
        return all;
    }

    /** Returns only registrations for the given studentId */
    public List<StudentRegistration> getRegistrationsByStudentId(Long studentId) {
        List<StudentRegistration> result = new ArrayList<>();

        for (StudentRegistration reg : all) {
            if (reg.getStudentId().equals(studentId)) {
                result.add(reg);
            }
        }

        return result;
    } 
    
    public boolean isAlreadyRegistered(Long studentId, Long semesterId) {
    return all.stream()
              .anyMatch(reg -> reg.getStudentId().equals(studentId)
                            && reg.getSemesterId().equals(semesterId));
    }

    public Student getStudentById(Long id) {
        return new Student(id, "John Doe");
    }

    public Semester getSemesterById(Long id) {
        return new Semester(id, "Spring 2025");
    }

    public StudentRegistration getRegistrationForStudentAndSemester(Long studentId, Long semesterId) {
        return new StudentRegistration(999L, studentId, semesterId, LocalDate.now());
    }

    public Program getProgramForStudent(Long studentId) {
        return new Program(101L, "B.Tech CSE");
    }

    public Term getTermForSemester(Long semesterId) {
        return new Term(202L, "Term 1");
    }
}
