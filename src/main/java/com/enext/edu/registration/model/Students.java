package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "students", schema="ec2")
public class Students {

    @Id
    @Column(name = "stdid")
    private Long stdid;

    @Column(name = "stdbchid")
    private Short stdbchid;

    @Column(name = "stdinstid")
    private String stdinstid;

    @Column(name = "stdfirstname")
    private String stdfirstname;

    @Column(name = "stdmiddlename")
    private String stdmiddlename;

    @Column(name = "stdlastname")
    private String stdlastname;

    @Column(name = "stdid_2")
    private Long stdid2;

    @Column(name = "stdstatus")
    private String stdstatus;

    @Column(name = "stdcreatedby")
    private Long stdcreatedby;

    @Column(name = "stdcreatedat")
    private LocalDateTime stdcreatedat;

    @Column(name = "stdlastupdatedby")
    private Long stdlastupdatedby;

    @Column(name = "stdlastupdatedat")
    private LocalDateTime stdlastupdatedat;

    @Column(name = "stdrowstate")
    private Short stdrowstate;

    @Column(name = "stdfield1")
    private String stdfield1;

    @Column(name = "stdfield2")
    private String stdfield2;

    @Column(name = "stdfield3")
    private String stdfield3;


    public Long getStdid() { return stdid; }
    public void setStdid(Long stdid) { this.stdid = stdid; }

    public Short getStdbchid() { return stdbchid; }
    public void setStdbchid(Short stdbchid) { this.stdbchid = stdbchid; }

    public String getStdinstid() { return stdinstid; }
    public void setStdinstid(String stdinstid) { this.stdinstid = stdinstid; }

    public String getStdfirstname() { return stdfirstname; }
    public void setStdfirstname(String stdfirstname) { this.stdfirstname = stdfirstname; }

    public String getStdmiddlename() { return stdmiddlename; }
    public void setStdmiddlename(String stdmiddlename) { this.stdmiddlename = stdmiddlename; }

    public String getStdlastname() { return stdlastname; }
    public void setStdlastname(String stdlastname) { this.stdlastname = stdlastname; }

    public Long getStdid2() { return stdid2; }
    public void setStdid2(Long stdid2) { this.stdid2 = stdid2; }

    public String getStdstatus() { return stdstatus; }
    public void setStdstatus(String stdstatus) { this.stdstatus = stdstatus; }

    public Long getStdcreatedby() { return stdcreatedby; }
    public void setStdcreatedby(Long stdcreatedby) { this.stdcreatedby = stdcreatedby; }

    public LocalDateTime getStdcreatedat() { return stdcreatedat; }
    public void setStdcreatedat(LocalDateTime stdcreatedat) { this.stdcreatedat = stdcreatedat; }

    public Long getStdlastupdatedby() { return stdlastupdatedby; }
    public void setStdlastupdatedby(Long stdlastupdatedby) { this.stdlastupdatedby = stdlastupdatedby; }

    public LocalDateTime getStdlastupdatedat() { return stdlastupdatedat; }
    public void setStdlastupdatedat(LocalDateTime stdlastupdatedat) { this.stdlastupdatedat = stdlastupdatedat; }

    public Short getStdrowstate() { return stdrowstate; }
    public void setStdrowstate(Short stdrowstate) { this.stdrowstate = stdrowstate; }

    public String getStdfield1() { return stdfield1; }
    public void setStdfield1(String stdfield1) { this.stdfield1 = stdfield1; }

    public String getStdfield2() { return stdfield2; }
    public void setStdfield2(String stdfield2) { this.stdfield2 = stdfield2; }

    public String getStdfield3() { return stdfield3; }
    public void setStdfield3(String stdfield3) { this.stdfield3 = stdfield3; }

}
