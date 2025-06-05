package com.enext.edu.registration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @Column(name = "STDID")
    private Integer id;

    @Column(name = "STDBCHID")
    private Integer batchId;

    @Column(name = "STDNAME")
    private String name;

    @Column(name = "STDPROGRAMNAME")
    private String programName;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getBatchId() {
        return batchId;
    }
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getProgramName() {
        return programName;
    }
    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
