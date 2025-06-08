package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "egcrstt1", schema="ec2")
public class EGCRSTT1 {

    @Id
    @Column(name = "tcrid")
    private Integer tcrid;

    @Column(name = "examtype_id")
    private Short examtypeId;

    @Column(name = "stud_id")
    private Long studId;

    @Column(name = "obt_mks")
    private Float obtMks;

    @Column(name = "obtgr_id")
    private Integer obtgrId;

    @Column(name = "obt_credits")
    private BigDecimal obtCredits;

    @Column(name = "crst_field1")
    private String crstField1;

    @Column(name = "creat_by")
    private Long creatBy;

    @Column(name = "creat_dt")
    private LocalDateTime creatDt;

    @Column(name = "updat_by")
    private Long updatBy;

    @Column(name = "updat_dt")
    private LocalDateTime updatDt;

    @Column(name = "row_st")
    private Short rowSt;


    public Integer getTcrid() { return tcrid; }
    public void setTcrid(Integer tcrid) { this.tcrid = tcrid; }

    public Short getExamtypeid() { return examtypeId; }
    public void setExamtypeid(Short examtypeId) { this.examtypeId = examtypeId; }

    public Long getStudid() { return studId; }
    public void setStudid(Long studId) { this.studId = studId; }

    public Float getObtmks() { return obtMks; }
    public void setObtmks(Float obtMks) { this.obtMks = obtMks; }

    public Integer getObtgrid() { return obtgrId; }
    public void setObtgrid(Integer obtgrId) { this.obtgrId = obtgrId; }

    public BigDecimal getObtcredits() { return obtCredits; }
    public void setObtcredits(BigDecimal obtCredits) { this.obtCredits = obtCredits; }

    public String getCrstfield1() { return crstField1; }
    public void setCrstfield1(String crstField1) { this.crstField1 = crstField1; }

    public Long getCreatby() { return creatBy; }
    public void setCreatby(Long creatBy) { this.creatBy = creatBy; }

    public LocalDateTime getCreatdt() { return creatDt; }
    public void setCreatdt(LocalDateTime creatDt) { this.creatDt = creatDt; }

    public Long getUpdatby() { return updatBy; }
    public void setUpdatby(Long updatBy) { this.updatBy = updatBy; }

    public LocalDateTime getUpdatdt() { return updatDt; }
    public void setUpdatdt(LocalDateTime updatDt) { this.updatDt = updatDt; }

    public Short getRowst() { return rowSt; }
    public void setRowst(Short rowSt) { this.rowSt = rowSt; }

}
