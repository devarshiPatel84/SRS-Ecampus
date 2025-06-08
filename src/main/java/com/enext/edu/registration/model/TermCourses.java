package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "termcourses", schema="ec2")
public class TermCourses {

    @Id
    @Column(name = "tcrid")
    private Integer tcrid;

    @Column(name = "tcrtrmid")
    private Short tcrtrmid;

    @Column(name = "tcrcrsid")
    private Short tcrcrsid;

    @Column(name = "tcrtype")
    private String tcrtype;

    @Column(name = "tcrfacultyid")
    private Long tcrfacultyid;

    @Column(name = "tcrroundlogic")
    private String tcrroundlogic;

    @Column(name = "tcrmarks")
    private Short tcrmarks;

    @Column(name = "tcrstatus")
    private String tcrstatus;

    @Column(name = "tcr_access_status")
    private String tcrAccessStatus;

    @Column(name = "tcrcreatedby")
    private Long tcrcreatedby;

    @Column(name = "tcrcreatedat")
    private LocalDateTime tcrcreatedat;

    @Column(name = "tcrlastupdatedby")
    private Long tcrlastupdatedby;

    @Column(name = "tcrlastupdatedat")
    private LocalDateTime tcrlastupdatedat;

    @Column(name = "tcrrowstate")
    private Short tcrrowstate;


    public Integer getTcrid() { return tcrid; }
    public void setTcrid(Integer tcrid) { this.tcrid = tcrid; }

    public Short getTcrtrmid() { return tcrtrmid; }
    public void setTcrtrmid(Short tcrtrmid) { this.tcrtrmid = tcrtrmid; }

    public Short getTcrcrsid() { return tcrcrsid; }
    public void setTcrcrsid(Short tcrcrsid) { this.tcrcrsid = tcrcrsid; }

    public String getTcrtype() { return tcrtype; }
    public void setTcrtype(String tcrtype) { this.tcrtype = tcrtype; }

    public Long getTcrfacultyid() { return tcrfacultyid; }
    public void setTcrfacultyid(Long tcrfacultyid) { this.tcrfacultyid = tcrfacultyid; }

    public String getTcrroundlogic() { return tcrroundlogic; }
    public void setTcrroundlogic(String tcrroundlogic) { this.tcrroundlogic = tcrroundlogic; }

    public Short getTcrmarks() { return tcrmarks; }
    public void setTcrmarks(Short tcrmarks) { this.tcrmarks = tcrmarks; }

    public String getTcrstatus() { return tcrstatus; }
    public void setTcrstatus(String tcrstatus) { this.tcrstatus = tcrstatus; }

    public String getTcraccessstatus() { return tcrAccessStatus; }
    public void setTcraccessstatus(String tcrAccessStatus) { this.tcrAccessStatus = tcrAccessStatus; }

    public Long getTcrcreatedby() { return tcrcreatedby; }
    public void setTcrcreatedby(Long tcrcreatedby) { this.tcrcreatedby = tcrcreatedby; }

    public LocalDateTime getTcrcreatedat() { return tcrcreatedat; }
    public void setTcrcreatedat(LocalDateTime tcrcreatedat) { this.tcrcreatedat = tcrcreatedat; }

    public Long getTcrlastupdatedby() { return tcrlastupdatedby; }
    public void setTcrlastupdatedby(Long tcrlastupdatedby) { this.tcrlastupdatedby = tcrlastupdatedby; }

    public LocalDateTime getTcrlastupdatedat() { return tcrlastupdatedat; }
    public void setTcrlastupdatedat(LocalDateTime tcrlastupdatedat) { this.tcrlastupdatedat = tcrlastupdatedat; }

    public Short getTcrrowstate() { return tcrrowstate; }
    public void setTcrrowstate(Short tcrrowstate) { this.tcrrowstate = tcrrowstate; }

}
