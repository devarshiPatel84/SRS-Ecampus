package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "studentregistrations", schema="ec2")
public class StudentRegistrations {

    @Id
    @Column(name = "srgid")
    private Long srgid;

    @Column(name = "srgstdid")
    private Long srgstdid;

    @Column(name = "srgstrid")
    private Short srgstrid;

    @Column(name = "srgregdate")
    private LocalDate srgregdate;

    @Column(name = "srgfield1")
    private String srgfield1;

    @Column(name = "srgfield2")
    private String srgfield2;

    @Column(name = "srgcreatedby")
    private Long srgcreatedby;

    @Column(name = "srgcreatedat")
    private LocalDateTime srgcreatedat;

    @Column(name = "srglastupdatedby")
    private Long srglastupdatedby;

    @Column(name = "srglastupdatedat")
    private LocalDateTime srglastupdatedat;

    @Column(name = "srgrowstate")
    private Short srgrowstate;


    public Long getSrgid() { return srgid; }
    public void setSrgid(Long srgid) { this.srgid = srgid; }

    public Long getSrgstdid() { return srgstdid; }
    public void setSrgstdid(Long srgstdid) { this.srgstdid = srgstdid; }

    public Short getSrgstrid() { return srgstrid; }
    public void setSrgstrid(Short srgstrid) { this.srgstrid = srgstrid; }

    public LocalDate getSrgregdate() { return srgregdate; }
    public void setSrgregdate(LocalDate srgregdate) { this.srgregdate = srgregdate; }

    public String getSrgfield1() { return srgfield1; }
    public void setSrgfield1(String srgfield1) { this.srgfield1 = srgfield1; }

    public String getSrgfield2() { return srgfield2; }
    public void setSrgfield2(String srgfield2) { this.srgfield2 = srgfield2; }

    public Long getSrgcreatedby() { return srgcreatedby; }
    public void setSrgcreatedby(Long srgcreatedby) { this.srgcreatedby = srgcreatedby; }

    public LocalDateTime getSrgcreatedat() { return srgcreatedat; }
    public void setSrgcreatedat(LocalDateTime srgcreatedat) { this.srgcreatedat = srgcreatedat; }

    public Long getSrglastupdatedby() { return srglastupdatedby; }
    public void setSrglastupdatedby(Long srglastupdatedby) { this.srglastupdatedby = srglastupdatedby; }

    public LocalDateTime getSrglastupdatedat() { return srglastupdatedat; }
    public void setSrglastupdatedat(LocalDateTime srglastupdatedat) { this.srglastupdatedat = srglastupdatedat; }

    public Short getSrgrowstate() { return srgrowstate; }
    public void setSrgrowstate(Short srgrowstate) { this.srgrowstate = srgrowstate; }

}
