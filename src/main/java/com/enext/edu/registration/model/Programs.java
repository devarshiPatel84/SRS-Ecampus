package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "programs", schema="ec2")
public class Programs {

    @Id
    @Column(name = "prgid")
    private Short prgid;

    @Column(name = "prgname")
    private String prgname;

    @Column(name = "prgdesc")
    private String prgdesc;

    @Column(name = "prgduration")
    private Short prgduration;

    @Column(name = "prgdurationunits")
    private String prgdurationunits;

    @Column(name = "prgintrodate")
    private LocalDate prgintrodate;

    @Column(name = "prgfield1")
    private Short prgfield1;

    @Column(name = "prgfield2")
    private Short prgfield2;

    @Column(name = "prgfield3")
    private String prgfield3;

    @Column(name = "prgcreatedby")
    private Long prgcreatedby;

    @Column(name = "prgcreatedat")
    private LocalDateTime prgcreatedat;

    @Column(name = "prglastupdatedby")
    private Long prglastupdatedby;

    @Column(name = "prglastupdatedat")
    private LocalDateTime prglastupdatedat;

    @Column(name = "prgrowstate")
    private Short prgrowstate;

    @Column(name = "prginstcode")
    private String prginstcode;


    public Short getPrgid() { return prgid; }
    public void setPrgid(Short prgid) { this.prgid = prgid; }

    public String getPrgname() { return prgname; }
    public void setPrgname(String prgname) { this.prgname = prgname; }

    public String getPrgdesc() { return prgdesc; }
    public void setPrgdesc(String prgdesc) { this.prgdesc = prgdesc; }

    public Short getPrgduration() { return prgduration; }
    public void setPrgduration(Short prgduration) { this.prgduration = prgduration; }

    public String getPrgdurationunits() { return prgdurationunits; }
    public void setPrgdurationunits(String prgdurationunits) { this.prgdurationunits = prgdurationunits; }

    public LocalDate getPrgintrodate() { return prgintrodate; }
    public void setPrgintrodate(LocalDate prgintrodate) { this.prgintrodate = prgintrodate; }

    public Short getPrgfield1() { return prgfield1; }
    public void setPrgfield1(Short prgfield1) { this.prgfield1 = prgfield1; }

    public Short getPrgfield2() { return prgfield2; }
    public void setPrgfield2(Short prgfield2) { this.prgfield2 = prgfield2; }

    public String getPrgfield3() { return prgfield3; }
    public void setPrgfield3(String prgfield3) { this.prgfield3 = prgfield3; }

    public Long getPrgcreatedby() { return prgcreatedby; }
    public void setPrgcreatedby(Long prgcreatedby) { this.prgcreatedby = prgcreatedby; }

    public LocalDateTime getPrgcreatedat() { return prgcreatedat; }
    public void setPrgcreatedat(LocalDateTime prgcreatedat) { this.prgcreatedat = prgcreatedat; }

    public Long getPrglastupdatedby() { return prglastupdatedby; }
    public void setPrglastupdatedby(Long prglastupdatedby) { this.prglastupdatedby = prglastupdatedby; }

    public LocalDateTime getPrglastupdatedat() { return prglastupdatedat; }
    public void setPrglastupdatedat(LocalDateTime prglastupdatedat) { this.prglastupdatedat = prglastupdatedat; }

    public Short getPrgrowstate() { return prgrowstate; }
    public void setPrgrowstate(Short prgrowstate) { this.prgrowstate = prgrowstate; }

    public String getPrginstcode() { return prginstcode; }
    public void setPrginstcode(String prginstcode) { this.prginstcode = prginstcode; }

}
