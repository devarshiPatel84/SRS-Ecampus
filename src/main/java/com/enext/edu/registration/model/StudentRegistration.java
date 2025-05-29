package com.enext.edu.registration.model;

import java.time.LocalDate;

public class StudentRegistration {
    private Long id;
    private Long studentId;
    private Long semesterId;
    private LocalDate registrationDate;

    public StudentRegistration(Long id, Long studentId, Long semesterId, LocalDate registrationDate) {
        this.id = id;
        this.studentId = studentId;
        this.semesterId = semesterId;
        this.registrationDate = registrationDate;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public Long getSemesterId() { return semesterId; }
    public void setSemesterId(Long semesterId) { this.semesterId = semesterId; }

    public LocalDate getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(LocalDate registrationDate) { this.registrationDate = registrationDate; }
}
