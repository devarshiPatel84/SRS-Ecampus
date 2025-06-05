package com.enext.edu.registration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "SEMESTERS")
public class Semester {

    @Id
    @Column(name = "STRID")
    private Integer id;

    @Column(name = "STRNAME")
    private String name;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
