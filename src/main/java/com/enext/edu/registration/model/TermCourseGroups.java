package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "termcoursegroups", schema="ec2")
public class TermCourseGroups {

    @Id
    @Column(name = "tcgid")
    private Short tcgid;

    @Column(name = "tcgcgpid")
    private Short tcgcgpid;

    @Column(name = "tcgtrmid")
    private Short tcgtrmid;

    @Column(name = "tcgcreatedby")
    private Long tcgcreatedby;

    @Column(name = "tcgcreatedat")
    private LocalDateTime tcgcreatedat;

    @Column(name = "tcglastupdatedby")
    private Long tcglastupdatedby;

    @Column(name = "tcglastupdatedat")
    private LocalDateTime tcglastupdatedat;

    @Column(name = "tcgrowstate")
    private Short tcgrowstate;


    public Short getTcgid() { return tcgid; }
    public void setTcgid(Short tcgid) { this.tcgid = tcgid; }

    public Short getTcgcgpid() { return tcgcgpid; }
    public void setTcgcgpid(Short tcgcgpid) { this.tcgcgpid = tcgcgpid; }

    public Short getTcgtrmid() { return tcgtrmid; }
    public void setTcgtrmid(Short tcgtrmid) { this.tcgtrmid = tcgtrmid; }

    public Long getTcgcreatedby() { return tcgcreatedby; }
    public void setTcgcreatedby(Long tcgcreatedby) { this.tcgcreatedby = tcgcreatedby; }

    public LocalDateTime getTcgcreatedat() { return tcgcreatedat; }
    public void setTcgcreatedat(LocalDateTime tcgcreatedat) { this.tcgcreatedat = tcgcreatedat; }

    public Long getTcglastupdatedby() { return tcglastupdatedby; }
    public void setTcglastupdatedby(Long tcglastupdatedby) { this.tcglastupdatedby = tcglastupdatedby; }

    public LocalDateTime getTcglastupdatedat() { return tcglastupdatedat; }
    public void setTcglastupdatedat(LocalDateTime tcglastupdatedat) { this.tcglastupdatedat = tcglastupdatedat; }

    public Short getTcgrowstate() { return tcgrowstate; }
    public void setTcgrowstate(Short tcgrowstate) { this.tcgrowstate = tcgrowstate; }

}
