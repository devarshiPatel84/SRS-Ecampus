package com.ec2.srs.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "coursegroups", schema="ec2")
public class CourseGroups {

    @Id
    @Column(name = "cgpid")
    private Short cgpid;

    @Column(name = "cgpname")
    private String cgpname;

    @Column(name = "cgpcgtid")
    private Short cgpcgtid;

    @Column(name = "cgptrmid")
    private Short cgptrmid;

    @Column(name = "cgpcreatedby")
    private Long cgpcreatedby;

    @Column(name = "cgpcreatedat")
    private LocalDateTime cgpcreatedat;

    @Column(name = "cgplastupdatedby")
    private Long cgplastupdatedby;

    @Column(name = "cgplastupdatedat")
    private LocalDateTime cgplastupdatedat;

    @Column(name = "cgprowstate")
    private Short cgprowstate;


    public Short getCgpid() { return cgpid; }
    public void setCgpid(Short cgpid) { this.cgpid = cgpid; }

    public String getCgpname() { return cgpname; }
    public void setCgpname(String cgpname) { this.cgpname = cgpname; }

    public Short getCgpcgtid() { return cgpcgtid; }
    public void setCgpcgtid(Short cgpcgtid) { this.cgpcgtid = cgpcgtid; }

    public Short getCgptrmid() { return cgptrmid; }
    public void setCgptrmid(Short cgptrmid) { this.cgptrmid = cgptrmid; }

    public Long getCgpcreatedby() { return cgpcreatedby; }
    public void setCgpcreatedby(Long cgpcreatedby) { this.cgpcreatedby = cgpcreatedby; }

    public LocalDateTime getCgpcreatedat() { return cgpcreatedat; }
    public void setCgpcreatedat(LocalDateTime cgpcreatedat) { this.cgpcreatedat = cgpcreatedat; }

    public Long getCgplastupdatedby() { return cgplastupdatedby; }
    public void setCgplastupdatedby(Long cgplastupdatedby) { this.cgplastupdatedby = cgplastupdatedby; }

    public LocalDateTime getCgplastupdatedat() { return cgplastupdatedat; }
    public void setCgplastupdatedat(LocalDateTime cgplastupdatedat) { this.cgplastupdatedat = cgplastupdatedat; }

    public Short getCgprowstate() { return cgprowstate; }
    public void setCgprowstate(Short cgprowstate) { this.cgprowstate = cgprowstate; }

}
