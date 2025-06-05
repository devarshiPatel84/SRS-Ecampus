package com.enext.edu.registration.model;

public class Program {
    private Integer id;
    private String name;

    public Program(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }    
}