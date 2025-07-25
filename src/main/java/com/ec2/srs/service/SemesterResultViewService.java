package com.ec2.srs.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec2.srs.repository.*;
import com.ec2.srs.model.*;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class SemesterResultViewService {
    @Autowired
    private EGCRSTT1Repository egcrstt1Repo;

    @Autowired
    private EGGRADM1Repository eggradm1Repo;

    @Autowired
    private StudentSemesterResultRepository ssrRepo;

    public EGCRSTT1 getObtgrByTcridAndStdid(Long studentId, Long tcrid) {
        return egcrstt1Repo.getObtgrId(studentId, tcrid);
    }

    public String getGradeByObtgr(Integer obtgr) {
        return eggradm1Repo.getGrade(obtgr);
    }

    public StudentSemesterResult getSsrBySrg(Long srgid) {
        return ssrRepo.getBySrgid(srgid);
    }
    
}
