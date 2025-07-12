package com.ec2.srs.model;

import jakarta.persistence.*;

@Entity
@Table(name = "worktypes", schema="ec2")
public class WorkTypes {

    @Id
    @Column(name = "code")
    private Short code;

    @Column(name = "description")
    private String description;

    @Column(name = "display")
    private String display;

    @Column(name = "jspfilepath")
    private String jspfilepath;


    public Short getCode() { return code; }
    public void setCode(Short code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getDisplay() { return display; }
    public void setDisplay(String display) { this.display = display; }

    public String getJspfilepath() { return jspfilepath; }
    public void setJspfilepath(String jspfilepath) { this.jspfilepath = jspfilepath; }

}
