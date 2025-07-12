package com.ec2.srs.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "batchsemestercategories", schema="ec2")
public class BatchSemesterCategories {

    @Id
    @Column(name = "bscid")
    private Short bscid;

    @Column(name = "bscbchid")
    private Short bscbchid;

    @Column(name = "bscstcid")
    private Short bscstcid;

    @Column(name = "bscsemesters")
    private Integer bscsemesters;

    @Column(name = "bsccreatedby")
    private Long bsccreatedby;

    @Column(name = "bsccreatedat")
    private LocalDateTime bsccreatedat;

    @Column(name = "bsclastupdatedby")
    private Long bsclastupdatedby;

    @Column(name = "bsclastupdatedat")
    private LocalDateTime bsclastupdatedat;

    @Column(name = "bscrowstate")
    private Short bscrowstate;


    public Short getBscid() { return bscid; }
    public void setBscid(Short bscid) { this.bscid = bscid; }

    public Short getBscbchid() { return bscbchid; }
    public void setBscbchid(Short bscbchid) { this.bscbchid = bscbchid; }

    public Short getBscstcid() { return bscstcid; }
    public void setBscstcid(Short bscstcid) { this.bscstcid = bscstcid; }

    public Integer getBscsemesters() { return bscsemesters; }
    public void setBscsemesters(Integer bscsemesters) { this.bscsemesters = bscsemesters; }

    public Long getBsccreatedby() { return bsccreatedby; }
    public void setBsccreatedby(Long bsccreatedby) { this.bsccreatedby = bsccreatedby; }

    public LocalDateTime getBsccreatedat() { return bsccreatedat; }
    public void setBsccreatedat(LocalDateTime bsccreatedat) { this.bsccreatedat = bsccreatedat; }

    public Long getBsclastupdatedby() { return bsclastupdatedby; }
    public void setBsclastupdatedby(Long bsclastupdatedby) { this.bsclastupdatedby = bsclastupdatedby; }

    public LocalDateTime getBsclastupdatedat() { return bsclastupdatedat; }
    public void setBsclastupdatedat(LocalDateTime bsclastupdatedat) { this.bsclastupdatedat = bsclastupdatedat; }

    public Short getBscrowstate() { return bscrowstate; }
    public void setBscrowstate(Short bscrowstate) { this.bscrowstate = bscrowstate; }

}
