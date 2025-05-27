package com.enext.edu.registration.service;

import com.enext.edu.registration.model.StudentRegistration;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentRegistrationService {

    // your “database”
    private final List<StudentRegistration> all = List.of(
        new StudentRegistration(1L, 101, 2023, LocalDate.of(2023, 8, 15)),
        new StudentRegistration(2L, 102, 2023, LocalDate.of(2023, 8, 16)),
        new StudentRegistration(3L, 101, 2024,LocalDate.of(2024, 12, 1)),
        new StudentRegistration(4L, 103, 2023, LocalDate.of(2023, 8, 17)),
        new StudentRegistration(5L,101, 2025,LocalDate.of(2025, 8, 15)),
        new StudentRegistration(6L,101, 2022, LocalDate.of(2022, 8, 15)),
        new StudentRegistration(7L,102,2021, LocalDate.of(2021, 12, 2)),
        new StudentRegistration(8L, 102,2025,LocalDate.of(2025, 1, 10))

    );

    /** Returns *all* registrations (unchanged) */
    public List<StudentRegistration> getAllRegistrations() {
        return all;
    }

    /** Returns only registrations for the given studentId */
    public List<StudentRegistration> getRegistrationsByStudentId(int studentId) {
        List<StudentRegistration> result = new ArrayList<>();

        for (StudentRegistration reg : all) {
            if (reg.getStudentId() == studentId) {
                result.add(reg);
            }
        }

        return result;
    }   
}
