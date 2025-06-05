package com.enext.edu.registration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "COURSESBYSEMESTER")
public class CourseBySemester {

    @Id
    @Column(name = "CRSBSTRCRSID")
    private Integer courseId;

    @Column(name = "CRSBSEMID")
    private Integer semesterId;

    @Column(name = "CRSBSTRCRSCODE")
    private String courseCode;

    @Column(name = "CRSBSTRCRSNAME")
    private String courseName;

    @Column(name = "CRSBSTRCRSCREDIT")
    private Double credits;

    public Integer getSemesterId() { return semesterId; }
    public void setSemesterId(Integer semesterId) { this.semesterId = semesterId; }

    public Integer getCourseId() { return courseId; }
    public void setCourseId(Integer courseId) { this.courseId = courseId; }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public Double getCredits() { return credits; }
    public void setCredits(Double credits) { this.credits = credits; }
}
