package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "coursegroupcourses", schema="ec2")
public class CourseGroupCourses {

    @Id
    @Column(name = "cgcid")
    private Short cgcid;

    @Column(name = "cgccgpid")
    private Short cgccgpid;

    @Column(name = "cgccrsid")
    private Short cgccrsid;

    @Column(name = "cgcfield1")
    private Short cgcfield1;

    @Column(name = "cgccreatedby")
    private Long cgccreatedby;

    @Column(name = "cgccreatedat")
    private LocalDateTime cgccreatedat;

    @Column(name = "cgclastupdatedby")
    private Long cgclastupdatedby;

    @Column(name = "cgclastupdatedat")
    private LocalDateTime cgclastupdatedat;

    @Column(name = "cgcrowstate")
    private Short cgcrowstate;


    public Short getCgcid() { return cgcid; }
    public void setCgcid(Short cgcid) { this.cgcid = cgcid; }

    public Short getCgccgpid() { return cgccgpid; }
    public void setCgccgpid(Short cgccgpid) { this.cgccgpid = cgccgpid; }

    public Short getCgccrsid() { return cgccrsid; }
    public void setCgccrsid(Short cgccrsid) { this.cgccrsid = cgccrsid; }

    public Short getCgcfield1() { return cgcfield1; }
    public void setCgcfield1(Short cgcfield1) { this.cgcfield1 = cgcfield1; }

    public Long getCgccreatedby() { return cgccreatedby; }
    public void setCgccreatedby(Long cgccreatedby) { this.cgccreatedby = cgccreatedby; }

    public LocalDateTime getCgccreatedat() { return cgccreatedat; }
    public void setCgccreatedat(LocalDateTime cgccreatedat) { this.cgccreatedat = cgccreatedat; }

    public Long getCgclastupdatedby() { return cgclastupdatedby; }
    public void setCgclastupdatedby(Long cgclastupdatedby) { this.cgclastupdatedby = cgclastupdatedby; }

    public LocalDateTime getCgclastupdatedat() { return cgclastupdatedat; }
    public void setCgclastupdatedat(LocalDateTime cgclastupdatedat) { this.cgclastupdatedat = cgclastupdatedat; }

    public Short getCgcrowstate() { return cgcrowstate; }
    public void setCgcrowstate(Short cgcrowstate) { this.cgcrowstate = cgcrowstate; }

}
