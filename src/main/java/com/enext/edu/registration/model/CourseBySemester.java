package com.enext.edu.registration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "COURSESBYSEMESTER")
public class CourseBySemester {

    @Id
    @Column(name = "CRSBSTRID")
    private Long id;

    @Column(name = "CRSBSEMID")
    private Long semesterId;

    @Column(name = "CRSBSTRCRSID")
    private Long courseId;

    @Column(name = "CRSBSTRCRSCODE")
    private String courseCode;

    @Column(name = "CRSBSTRCRSNAME")
    private String courseName;

    @Column(name = "CRSBSTRCRSCREDIT")
    private Double credits;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getSemesterId() { return semesterId; }
    public void setSemesterId(Long semesterId) { this.semesterId = semesterId; }

    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public Double getCredits() { return credits; }
    public void setCredits(Double credits) { this.credits = credits; }
}
