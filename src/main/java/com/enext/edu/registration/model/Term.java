package com.enext.edu.registration.model;

public class Term {
    private Long id;
    private String name;

    public Term(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
}
