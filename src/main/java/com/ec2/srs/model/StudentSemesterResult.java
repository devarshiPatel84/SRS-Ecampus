package com.ec2.srs.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "studentsemesterresult", schema="ec2")
public class StudentSemesterResult {

    @Id
    @Column(name = "ssrid")
    private Long ssrid;

    @Column(name = "ssrsrgid")
    private Long ssrsrgid;

    @Column(name = "ssrcreditsregistered")
    private BigDecimal ssrcreditsregistered;

    @Column(name = "ssrcreditsearned")
    private BigDecimal ssrcreditsearned;

    @Column(name = "ssrgradepointsearned")
    private BigDecimal ssrgradepointsearned;

    @Column(name = "ssrcumcreditsregistered")
    private BigDecimal ssrcumcreditsregistered;

    @Column(name = "ssrcumcreditsearned")
    private BigDecimal ssrcumcreditsearned;

    @Column(name = "ssrcumgradepointsearned")
    private BigDecimal ssrcumgradepointsearned;

    @Column(name = "ssrspigradepoint")
    private BigDecimal ssrspigradepoint;

    @Column(name = "ssrregisteredcredits")
    private BigDecimal ssrregisteredcredits;

    @Column(name = "ssrcpigradepoints")
    private BigDecimal ssrcpigradepoints;

    @Column(name = "ssrcpiregisteredcredits")
    private BigDecimal ssrcpiregisteredcredits;

    @Column(name = "ssrspi")
    private String ssrspi;

    @Column(name = "ssrcpi")
    private String ssrcpi;

    @Column(name = "ssrfield1")
    private BigDecimal ssrfield1;

    @Column(name = "ssrfield2")
    private BigDecimal ssrfield2;

    @Column(name = "ssrfield3")
    private BigDecimal ssrfield3;

    @Column(name = "ssrcreatedby")
    private Long ssrcreatedby;

    @Column(name = "ssrcreatedat")
    private LocalDateTime ssrcreatedat;

    @Column(name = "ssrlastupdatedby")
    private Long ssrlastupdatedby;

    @Column(name = "ssrlastupdatedat")
    private LocalDateTime ssrlastupdatedat;

    @Column(name = "ssrrowstate")
    private Short ssrrowstate;


    public Long getSsrid() { return ssrid; }
    public void setSsrid(Long ssrid) { this.ssrid = ssrid; }

    public Long getSsrsrgid() { return ssrsrgid; }
    public void setSsrsrgid(Long ssrsrgid) { this.ssrsrgid = ssrsrgid; }

    public BigDecimal getSsrcreditsregistered() { return ssrcreditsregistered; }
    public void setSsrcreditsregistered(BigDecimal ssrcreditsregistered) { this.ssrcreditsregistered = ssrcreditsregistered; }

    public BigDecimal getSsrcreditsearned() { return ssrcreditsearned; }
    public void setSsrcreditsearned(BigDecimal ssrcreditsearned) { this.ssrcreditsearned = ssrcreditsearned; }

    public BigDecimal getSsrgradepointsearned() { return ssrgradepointsearned; }
    public void setSsrgradepointsearned(BigDecimal ssrgradepointsearned) { this.ssrgradepointsearned = ssrgradepointsearned; }

    public BigDecimal getSsrcumcreditsregistered() { return ssrcumcreditsregistered; }
    public void setSsrcumcreditsregistered(BigDecimal ssrcumcreditsregistered) { this.ssrcumcreditsregistered = ssrcumcreditsregistered; }

    public BigDecimal getSsrcumcreditsearned() { return ssrcumcreditsearned; }
    public void setSsrcumcreditsearned(BigDecimal ssrcumcreditsearned) { this.ssrcumcreditsearned = ssrcumcreditsearned; }

    public BigDecimal getSsrcumgradepointsearned() { return ssrcumgradepointsearned; }
    public void setSsrcumgradepointsearned(BigDecimal ssrcumgradepointsearned) { this.ssrcumgradepointsearned = ssrcumgradepointsearned; }

    public BigDecimal getSsrspigradepoint() { return ssrspigradepoint; }
    public void setSsrspigradepoint(BigDecimal ssrspigradepoint) { this.ssrspigradepoint = ssrspigradepoint; }

    public BigDecimal getSsrregisteredcredits() { return ssrregisteredcredits; }
    public void setSsrregisteredcredits(BigDecimal ssrregisteredcredits) { this.ssrregisteredcredits = ssrregisteredcredits; }

    public BigDecimal getSsrcpigradepoints() { return ssrcpigradepoints; }
    public void setSsrcpigradepoints(BigDecimal ssrcpigradepoints) { this.ssrcpigradepoints = ssrcpigradepoints; }

    public BigDecimal getSsrcpiregisteredcredits() { return ssrcpiregisteredcredits; }
    public void setSsrcpiregisteredcredits(BigDecimal ssrcpiregisteredcredits) { this.ssrcpiregisteredcredits = ssrcpiregisteredcredits; }

    public String getSsrspi() { return ssrspi; }
    public void setSsrspi(String ssrspi) { this.ssrspi = ssrspi; }

    public String getSsrcpi() { return ssrcpi; }
    public void setSsrcpi(String ssrcpi) { this.ssrcpi = ssrcpi; }

    public BigDecimal getSsrfield1() { return ssrfield1; }
    public void setSsrfield1(BigDecimal ssrfield1) { this.ssrfield1 = ssrfield1; }

    public BigDecimal getSsrfield2() { return ssrfield2; }
    public void setSsrfield2(BigDecimal ssrfield2) { this.ssrfield2 = ssrfield2; }

    public BigDecimal getSsrfield3() { return ssrfield3; }
    public void setSsrfield3(BigDecimal ssrfield3) { this.ssrfield3 = ssrfield3; }

    public Long getSsrcreatedby() { return ssrcreatedby; }
    public void setSsrcreatedby(Long ssrcreatedby) { this.ssrcreatedby = ssrcreatedby; }

    public LocalDateTime getSsrcreatedat() { return ssrcreatedat; }
    public void setSsrcreatedat(LocalDateTime ssrcreatedat) { this.ssrcreatedat = ssrcreatedat; }

    public Long getSsrlastupdatedby() { return ssrlastupdatedby; }
    public void setSsrlastupdatedby(Long ssrlastupdatedby) { this.ssrlastupdatedby = ssrlastupdatedby; }

    public LocalDateTime getSsrlastupdatedat() { return ssrlastupdatedat; }
    public void setSsrlastupdatedat(LocalDateTime ssrlastupdatedat) { this.ssrlastupdatedat = ssrlastupdatedat; }

    public Short getSsrrowstate() { return ssrrowstate; }
    public void setSsrrowstate(Short ssrrowstate) { this.ssrrowstate = ssrrowstate; }

}
