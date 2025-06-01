package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "STUDENTREGISTRATIONS")
public class StudentRegistration {

    @Id
    @Column(name = "SRGID")
    private Long id;

    @Column(name = "SRGSTDID")
    private Long studentId;

    @Column(name = "SRGSTRID")
    private Long semesterId;

    @Column(name = "SRGREGDATE")
    private LocalDate registrationDate;

    // Getters & Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public Long getSemesterId() { return semesterId; }
    public void setSemesterId(Long semesterId) { this.semesterId = semesterId; }

    public LocalDate getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(LocalDate registrationDate) { this.registrationDate = registrationDate; }
}
