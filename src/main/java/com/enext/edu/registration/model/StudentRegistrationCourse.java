package com.enext.edu.registration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENTREGISTRATIONCOURSES")
public class StudentRegistrationCourse {

    @Id
    @Column(name = "SRCID")
    private Long id;

    @Column(name = "SRCSRGID")
    private Long registrationId;

    @Column(name = "SRCCRSCODE")
    private String courseCode;

    @Column(name = "SRCCRSNAME")
    private String courseName;

    @Column(name = "SRCCRSCREDITS")
    private Double credits;

    @Column(name = "SRCCRSSTATUS")
    private String status;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getRegistrationId() {
        return registrationId;
    }
    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public Double getCredits() {
        return credits;
    }
    public void setCredits(Double credits) {
        this.credits = credits;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
