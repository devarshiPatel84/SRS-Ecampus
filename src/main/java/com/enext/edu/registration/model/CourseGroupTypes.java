package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "coursegrouptypes", schema="ec2")
public class CourseGroupTypes {

    @Id
    @Column(name = "cgtid")
    private Short cgtid;

    @Column(name = "cgtname")
    private String cgtname;

    @Column(name = "cgtcode")
    private String cgtcode;

    @Column(name = "cgtdesc")
    private String cgtdesc;

    @Column(name = "cgtsequencenumber")
    private Short cgtsequencenumber;

    @Column(name = "cgtactivationflag")
    private String cgtactivationflag;

    @Column(name = "cgtcreatedby")
    private Long cgtcreatedby;

    @Column(name = "cgtcreatedat")
    private LocalDateTime cgtcreatedat;

    @Column(name = "cgtlastupdatedby")
    private Long cgtlastupdatedby;

    @Column(name = "cgtlastupdatedat")
    private LocalDateTime cgtlastupdatedat;

    @Column(name = "cgtrowstate")
    private Short cgtrowstate;


    public Short getCgtid() { return cgtid; }
    public void setCgtid(Short cgtid) { this.cgtid = cgtid; }

    public String getCgtname() { return cgtname; }
    public void setCgtname(String cgtname) { this.cgtname = cgtname; }

    public String getCgtcode() { return cgtcode; }
    public void setCgtcode(String cgtcode) { this.cgtcode = cgtcode; }

    public String getCgtdesc() { return cgtdesc; }
    public void setCgtdesc(String cgtdesc) { this.cgtdesc = cgtdesc; }

    public Short getCgtsequencenumber() { return cgtsequencenumber; }
    public void setCgtsequencenumber(Short cgtsequencenumber) { this.cgtsequencenumber = cgtsequencenumber; }

    public String getCgtactivationflag() { return cgtactivationflag; }
    public void setCgtactivationflag(String cgtactivationflag) { this.cgtactivationflag = cgtactivationflag; }

    public Long getCgtcreatedby() { return cgtcreatedby; }
    public void setCgtcreatedby(Long cgtcreatedby) { this.cgtcreatedby = cgtcreatedby; }

    public LocalDateTime getCgtcreatedat() { return cgtcreatedat; }
    public void setCgtcreatedat(LocalDateTime cgtcreatedat) { this.cgtcreatedat = cgtcreatedat; }

    public Long getCgtlastupdatedby() { return cgtlastupdatedby; }
    public void setCgtlastupdatedby(Long cgtlastupdatedby) { this.cgtlastupdatedby = cgtlastupdatedby; }

    public LocalDateTime getCgtlastupdatedat() { return cgtlastupdatedat; }
    public void setCgtlastupdatedat(LocalDateTime cgtlastupdatedat) { this.cgtlastupdatedat = cgtlastupdatedat; }

    public Short getCgtrowstate() { return cgtrowstate; }
    public void setCgtrowstate(Short cgtrowstate) { this.cgtrowstate = cgtrowstate; }

}
