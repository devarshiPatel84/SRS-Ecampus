package com.ec2.srs.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "termcoursecredits", schema="ec2")
public class TermCourseCredits {

    @Id
    @Column(name = "tccid")
    private Short tccid;

    @Column(name = "tcctcrid")
    private Integer tcctcrid;

    @Column(name = "tcclectures")
    private BigDecimal tcclectures;

    @Column(name = "tcctutorials")
    private BigDecimal tcctutorials;

    @Column(name = "tccpracticals")
    private BigDecimal tccpracticals;

    @Column(name = "tcccreditpoints")
    private BigDecimal tcccreditpoints;

    @Column(name = "tccmarks")
    private Short tccmarks;

    @Column(name = "tcccreatedby")
    private Long tcccreatedby;

    @Column(name = "tcccreatedat")
    private LocalDateTime tcccreatedat;

    @Column(name = "tcclastupdatedby")
    private Long tcclastupdatedby;

    @Column(name = "tcclastupdatedat")
    private LocalDateTime tcclastupdatedat;

    @Column(name = "tccrowstate")
    private Short tccrowstate;


    public Short getTccid() { return tccid; }
    public void setTccid(Short tccid) { this.tccid = tccid; }

    public Integer getTcctcrid() { return tcctcrid; }
    public void setTcctcrid(Integer tcctcrid) { this.tcctcrid = tcctcrid; }

    public BigDecimal getTcclectures() { return tcclectures; }
    public void setTcclectures(BigDecimal tcclectures) { this.tcclectures = tcclectures; }

    public BigDecimal getTcctutorials() { return tcctutorials; }
    public void setTcctutorials(BigDecimal tcctutorials) { this.tcctutorials = tcctutorials; }

    public BigDecimal getTccpracticals() { return tccpracticals; }
    public void setTccpracticals(BigDecimal tccpracticals) { this.tccpracticals = tccpracticals; }

    public BigDecimal getTcccreditpoints() { return tcccreditpoints; }
    public void setTcccreditpoints(BigDecimal tcccreditpoints) { this.tcccreditpoints = tcccreditpoints; }

    public Short getTccmarks() { return tccmarks; }
    public void setTccmarks(Short tccmarks) { this.tccmarks = tccmarks; }

    public Long getTcccreatedby() { return tcccreatedby; }
    public void setTcccreatedby(Long tcccreatedby) { this.tcccreatedby = tcccreatedby; }

    public LocalDateTime getTcccreatedat() { return tcccreatedat; }
    public void setTcccreatedat(LocalDateTime tcccreatedat) { this.tcccreatedat = tcccreatedat; }

    public Long getTcclastupdatedby() { return tcclastupdatedby; }
    public void setTcclastupdatedby(Long tcclastupdatedby) { this.tcclastupdatedby = tcclastupdatedby; }

    public LocalDateTime getTcclastupdatedat() { return tcclastupdatedat; }
    public void setTcclastupdatedat(LocalDateTime tcclastupdatedat) { this.tcclastupdatedat = tcclastupdatedat; }

    public Short getTccrowstate() { return tccrowstate; }
    public void setTccrowstate(Short tccrowstate) { this.tccrowstate = tccrowstate; }

}
