package com.enext.edu.registration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENTREGISTRATIONCOURSES")
public class StudentRegistrationCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SRCID")
    private Integer id;

    @Column(name = "SRCSRGID")
    private Integer registrationId;

    @Column(name = "SRCCRSCODE")
    private String courseCode;

    @Column(name = "SRCCRSNAME")
    private String courseName;

    @Column(name = "SRCCRSCREDITS")
    private Double credits;

    @Column(name = "SRCCRSSTATUS")
    private String status;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getRegistrationId() {
        return registrationId;
    }
    public void setRegistrationId(Integer registrationId) {
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
