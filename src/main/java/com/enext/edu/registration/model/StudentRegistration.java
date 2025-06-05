package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "STUDENTREGISTRATIONS")
public class StudentRegistration {

    @Id
    @Column(name = "SRGID")
    private Integer id;

    @Column(name = "SRGSTDID")
    private Integer studentId;

    @Column(name = "SRGSTRID")
    private Integer semesterId;

    @Column(name = "SRGREGDATE")
    private LocalDate registrationDate;

    // Getters & Setters

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getStudentId() { return studentId; }
    public void setStudentId(Integer studentId) { this.studentId = studentId; }

    public Integer getSemesterId() { return semesterId; }
    public void setSemesterId(Integer semesterId) { this.semesterId = semesterId; }

    public LocalDate getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(LocalDate registrationDate) { this.registrationDate = registrationDate; }
}
