package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "academicyears", schema="ec2")
public class AcademicYears {

    @Id
    @Column(name = "ayrid")
    private Short ayrid;

    @Column(name = "ayrname")
    private String ayrname;

    @Column(name = "ayrcreatedby")
    private Long ayrcreatedby;

    @Column(name = "ayrcreatedat")
    private LocalDateTime ayrcreatedat;

    @Column(name = "ayrlastupdatedby")
    private Long ayrlastupdatedby;

    @Column(name = "ayrlastupdatedat")
    private LocalDateTime ayrlastupdatedat;

    @Column(name = "ayrrowstate")
    private Short ayrrowstate;

    @Column(name = "ayrfield1")
    private Integer ayrfield1;


    public Short getAyrid() { return ayrid; }
    public void setAyrid(Short ayrid) { this.ayrid = ayrid; }

    public String getAyrname() { return ayrname; }
    public void setAyrname(String ayrname) { this.ayrname = ayrname; }

    public Long getAyrcreatedby() { return ayrcreatedby; }
    public void setAyrcreatedby(Long ayrcreatedby) { this.ayrcreatedby = ayrcreatedby; }

    public LocalDateTime getAyrcreatedat() { return ayrcreatedat; }
    public void setAyrcreatedat(LocalDateTime ayrcreatedat) { this.ayrcreatedat = ayrcreatedat; }

    public Long getAyrlastupdatedby() { return ayrlastupdatedby; }
    public void setAyrlastupdatedby(Long ayrlastupdatedby) { this.ayrlastupdatedby = ayrlastupdatedby; }

    public LocalDateTime getAyrlastupdatedat() { return ayrlastupdatedat; }
    public void setAyrlastupdatedat(LocalDateTime ayrlastupdatedat) { this.ayrlastupdatedat = ayrlastupdatedat; }

    public Short getAyrrowstate() { return ayrrowstate; }
    public void setAyrrowstate(Short ayrrowstate) { this.ayrrowstate = ayrrowstate; }

    public Integer getAyrfield1() { return ayrfield1; }
    public void setAyrfield1(Integer ayrfield1) { this.ayrfield1 = ayrfield1; }

}
