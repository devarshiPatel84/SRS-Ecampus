package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "termcourseavailablefor", schema="ec2")
public class TermCourseAvailableFor {

    @Id
    @Column(name = "tcaid")
    private Integer tcaid;

    @Column(name = "tcatcrid")
    private Integer tcatcrid;

    @Column(name = "tcaprgid")
    private Short tcaprgid;

    @Column(name = "tcastatus")
    private String tcastatus;

    @Column(name = "tcacreatedby")
    private Long tcacreatedby;

    @Column(name = "tcacreatedat")
    private LocalDateTime tcacreatedat;

    @Column(name = "tcalastupdatedby")
    private Long tcalastupdatedby;

    @Column(name = "tcalastupdatedat")
    private LocalDateTime tcalastupdatedat;

    @Column(name = "tcarowstate")
    private Short tcarowstate;


    public Integer getTcaid() { return tcaid; }
    public void setTcaid(Integer tcaid) { this.tcaid = tcaid; }

    public Integer getTcatcrid() { return tcatcrid; }
    public void setTcatcrid(Integer tcatcrid) { this.tcatcrid = tcatcrid; }

    public Short getTcaprgid() { return tcaprgid; }
    public void setTcaprgid(Short tcaprgid) { this.tcaprgid = tcaprgid; }

    public String getTcastatus() { return tcastatus; }
    public void setTcastatus(String tcastatus) { this.tcastatus = tcastatus; }

    public Long getTcacreatedby() { return tcacreatedby; }
    public void setTcacreatedby(Long tcacreatedby) { this.tcacreatedby = tcacreatedby; }

    public LocalDateTime getTcacreatedat() { return tcacreatedat; }
    public void setTcacreatedat(LocalDateTime tcacreatedat) { this.tcacreatedat = tcacreatedat; }

    public Long getTcalastupdatedby() { return tcalastupdatedby; }
    public void setTcalastupdatedby(Long tcalastupdatedby) { this.tcalastupdatedby = tcalastupdatedby; }

    public LocalDateTime getTcalastupdatedat() { return tcalastupdatedat; }
    public void setTcalastupdatedat(LocalDateTime tcalastupdatedat) { this.tcalastupdatedat = tcalastupdatedat; }

    public Short getTcarowstate() { return tcarowstate; }
    public void setTcarowstate(Short tcarowstate) { this.tcarowstate = tcarowstate; }

}
