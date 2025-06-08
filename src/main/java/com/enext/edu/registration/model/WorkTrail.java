package com.enext.edu.registration.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "worktrail", schema="ec2")
public class WorkTrail {

    @Id
    @Column(name = "work_id")
    private Long workId;

    @Column(name = "work_type_code")
    private Short workTypeCode;

    @Column(name = "node_number")
    private Short nodeNumber;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "iteration_number")
    private Short iterationNumber;

    @Column(name = "response_code")
    private Short responseCode;

    @Column(name = "response_date")
    private LocalDateTime responseDate;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "prev_node_number")
    private Short prevNodeNumber;

    @Column(name = "prev_iteration_number")
    private Short prevIterationNumber;

    @Column(name = "prev_employee_id")
    private Long prevEmployeeId;


    public Long getWorkid() { return workId; }
    public void setWorkid(Long workId) { this.workId = workId; }

    public Short getWorktypecode() { return workTypeCode; }
    public void setWorktypecode(Short workTypeCode) { this.workTypeCode = workTypeCode; }

    public Short getNodenumber() { return nodeNumber; }
    public void setNodenumber(Short nodeNumber) { this.nodeNumber = nodeNumber; }

    public Long getEmployeeid() { return employeeId; }
    public void setEmployeeid(Long employeeId) { this.employeeId = employeeId; }

    public Short getIterationnumber() { return iterationNumber; }
    public void setIterationnumber(Short iterationNumber) { this.iterationNumber = iterationNumber; }

    public Short getResponsecode() { return responseCode; }
    public void setResponsecode(Short responseCode) { this.responseCode = responseCode; }

    public LocalDateTime getResponsedate() { return responseDate; }
    public void setResponsedate(LocalDateTime responseDate) { this.responseDate = responseDate; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }

    public Short getPrevnodenumber() { return prevNodeNumber; }
    public void setPrevnodenumber(Short prevNodeNumber) { this.prevNodeNumber = prevNodeNumber; }

    public Short getPreviterationnumber() { return prevIterationNumber; }
    public void setPreviterationnumber(Short prevIterationNumber) { this.prevIterationNumber = prevIterationNumber; }

    public Long getPrevemployeeid() { return prevEmployeeId; }
    public void setPrevemployeeid(Long prevEmployeeId) { this.prevEmployeeId = prevEmployeeId; }

}
