package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "eggradm1", schema="ec2")
public class EGGRADM1 {

    @Id
    @Column(name = "grad_id")
    private Short gradId;

    @Column(name = "grad_lt")
    private String gradLt;

    @Column(name = "grad_pt")
    private BigDecimal gradPt;

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


    public Short getGradid() { return gradId; }
    public void setGradid(Short gradId) { this.gradId = gradId; }

    public String getGradlt() { return gradLt; }
    public void setGradlt(String gradLt) { this.gradLt = gradLt; }

    public BigDecimal getGradpt() { return gradPt; }
    public void setGradpt(BigDecimal gradPt) { this.gradPt = gradPt; }

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
