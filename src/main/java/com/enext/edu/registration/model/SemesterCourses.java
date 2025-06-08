package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "semestercourses", schema="ec2")
public class SemesterCourses {

    @Id
    @Column(name = "scrid")
    private Integer scrid;

    @Column(name = "scrstrid")
    private Short scrstrid;

    @Column(name = "screlective")
    private String screlective;

    @Column(name = "scrcrsid")
    private Short scrcrsid;

    @Column(name = "scrcgpid")
    private Short scrcgpid;

    @Column(name = "scrcreatedby")
    private Long scrcreatedby;

    @Column(name = "scrcreatedat")
    private LocalDateTime scrcreatedat;

    @Column(name = "scrlastupdatedby")
    private Long scrlastupdatedby;

    @Column(name = "scrlastupdatedat")
    private LocalDateTime scrlastupdatedat;

    @Column(name = "scrrowstate")
    private Short scrrowstate;

    @Column(name = "scrtcrid")
    private Integer scrtcrid;


    public Integer getScrid() { return scrid; }
    public void setScrid(Integer scrid) { this.scrid = scrid; }

    public Short getScrstrid() { return scrstrid; }
    public void setScrstrid(Short scrstrid) { this.scrstrid = scrstrid; }

    public String getScrelective() { return screlective; }
    public void setScrelective(String screlective) { this.screlective = screlective; }

    public Short getScrcrsid() { return scrcrsid; }
    public void setScrcrsid(Short scrcrsid) { this.scrcrsid = scrcrsid; }

    public Short getScrcgpid() { return scrcgpid; }
    public void setScrcgpid(Short scrcgpid) { this.scrcgpid = scrcgpid; }

    public Long getScrcreatedby() { return scrcreatedby; }
    public void setScrcreatedby(Long scrcreatedby) { this.scrcreatedby = scrcreatedby; }

    public LocalDateTime getScrcreatedat() { return scrcreatedat; }
    public void setScrcreatedat(LocalDateTime scrcreatedat) { this.scrcreatedat = scrcreatedat; }

    public Long getScrlastupdatedby() { return scrlastupdatedby; }
    public void setScrlastupdatedby(Long scrlastupdatedby) { this.scrlastupdatedby = scrlastupdatedby; }

    public LocalDateTime getScrlastupdatedat() { return scrlastupdatedat; }
    public void setScrlastupdatedat(LocalDateTime scrlastupdatedat) { this.scrlastupdatedat = scrlastupdatedat; }

    public Short getScrrowstate() { return scrrowstate; }
    public void setScrrowstate(Short scrrowstate) { this.scrrowstate = scrrowstate; }

    public Integer getScrtcrid() { return scrtcrid; }
    public void setScrtcrid(Integer scrtcrid) { this.scrtcrid = scrtcrid; }

}
