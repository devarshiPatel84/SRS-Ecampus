package com.enext.edu.registration.model;

public class Program {
    private Long id;
    private String name;

    public Program(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }    
}
