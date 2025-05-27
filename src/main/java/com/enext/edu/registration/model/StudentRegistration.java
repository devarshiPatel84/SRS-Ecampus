// package com.enext.edu.registration.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;

// @Entity
// @Table(name = "STUDENTREGISTRATIONS")
// public class StudentRegistration {

//     @Id
//     @Column(name = "SRGID")
//     private Long id;

//     @Column(name = "SRGSTDID")
//     private Integer studentId;

//     @Column(name = "SRGSTRID")
//     private Integer semesterId;

//     @Column(name = "SRGREGDATE")
//     private LocalDate registrationDate;

//     @Column(name = "SRGROWSTATE")
//     private Integer rowState;

//     // Additional fields (SRGFIELD1/2/3, timestamps, etc.) can be added as needed

//     // Getters and setters
// }

package com.enext.edu.registration.model;

import java.time.LocalDate;

public class StudentRegistration {
    private Long id;
    private Integer studentId;
    private Integer semesterId;
    private LocalDate registrationDate;

    // Constructors
    public StudentRegistration(Long id, Integer studentId, Integer semesterId, LocalDate registrationDate) {
        this.id = id;
        this.studentId = studentId;
        this.semesterId = semesterId;
        this.registrationDate = registrationDate;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getStudentId() { return studentId; }
    public void setStudentId(Integer studentId) { this.studentId = studentId; }

    public Integer getSemesterId() { return semesterId; }
    public void setSemesterId(Integer semesterId) { this.semesterId = semesterId; }

    public LocalDate getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(LocalDate registrationDate) { this.registrationDate = registrationDate; }
}

