package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.TermCourses;

import lombok.Lombok;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface TermCoursesRepository extends JpaRepository<TermCourses, Integer> {
    
    @Query(value = "SELECT * FROM ec2.TERMCOURSES trmsrc WHERE trmsrc.TCRID = :trmcrsid AND trmsrc.TCRROWSTATE > 0", nativeQuery = true)
    TermCourses getbytrmcrsid(@Param("trmcrsid") Long termcourseId);

    @Query(value = "SELECT * FROM ec2.TERMCOURSEAVAILABLEFOR tca, ec2.TERMCOURSES tc, ec2.COURSES c WHERE tca.TCAPRGID = :prgId AND tca.TCATCRID = tc.TCRID AND tc.TCRCRSID = c.CRSID AND tca.TCASTATUS = 'T' AND tca.TCAROWSTATE > 0 AND tc.TCRROWSTATE > 0 AND c.CRSROWSTATE > 0 AND tc.TCRTRMID = :trmId ORDER BY c.CRSNAME", nativeQuery = true)
    List<TermCourses> getTCourses(@Param("prgId") Short prgId, @Param("trmId") Short trmId);

    @Query(value = "SELECT * FROM ec2.TERMCOURSEAVAILABLEFOR tca, ec2.TERMCOURSES tc, ec2.COURSES c WHERE tca.TCAPRGID = :prgId AND tca.TCATCRID = tc.TCRID AND tc.TCRCRSID = c.CRSID AND tca.TCASTATUS = 'T' AND tca.TCAROWSTATE > 0 AND tc.TCRROWSTATE > 0 AND c.CRSROWSTATE > 0 AND tc.TCRTRMID = :trmId AND tc.TCRID NOT IN (SELECT DISTINCT scr.SCRTCRID FROM ec2.SEMESTERCOURSES scr WHERE scr.SCRSTRID = :semesterId AND scr.SCRROWSTATE > 0 AND scr.SCRTCRID IS NOT NULL) ORDER BY c.CRSNAME", nativeQuery = true)
    List<TermCourses> getOCourses(@Param("semesterId") Short semesterId, @Param("prgId") Short prgId, @Param("trmId") Short trmId);

    @Query(value = "SELECT * FROM ec2.TERMCOURSES tc, ec2.COURSES c, ec2.TERMCOURSEAVAILABLEFOR tca WHERE tc.TCRID = tca.TCATCRID AND c.CRSID = tc.TCRCRSID AND c.CRSROWSTATE > 0 AND tca.TCAROWSTATE > 0 AND tc.TCRROWSTATE > 0 AND tc.TCRTRMID = :trmId AND tca.TCAPRGID = :prgId AND tca.TCASTATUS = 'T' AND tc.TCRSTATUS = 'AVAILABLE' AND c.CRSID IN (SELECT DISTINCT scr.SCRCRSID FROM ec2.SEMESTERCOURSES scr WHERE scr.SCRSTRID <> :semesterId AND scr.SCRCRSID IS NOT NULL AND scr.SCRROWSTATE > 0 AND scr.SCRSTRID IN (SELECT str.STRID FROM ec2.SEMESTERS str WHERE str.STRROWSTATE > 0 AND str.STRFIELD3 = 'T' AND str.STRBCHID = :batchId) AND scr.SCRCRSID NOT IN (SELECT DISTINCT tcr.TCRCRSID FROM ec2.TERMCOURSES tcr WHERE tcr.TCRID IN (SELECT egc1.TCRID FROM ec2.EGCRSTT1 egc1 WHERE egc1.STUD_ID = :studentId AND egc1.ROW_ST > '0' AND egc1.OBTGR_ID IN (1,2,3,4,10,11,15,16,17,18,19,20,21,22) AND tcr.TCRROWSTATE > 0)) UNION SELECT DISTINCT tcr.TCRCRSID AS CRSID FROM ec2.TERMCOURSES tcr WHERE tcr.TCRID IN (SELECT src.SRCTCRID FROM ec2.STUDENTREGISTRATIONS srg, ec2.STUDENTREGISTRATIONCOURSES src, ec2.EGCRSTT1 egc1 WHERE srg.SRGSTDID = :studentId AND src.SRCTCRID = egc1.TCRID AND srg.SRGSTDID = egc1.STUD_ID AND srg.SRGID = src.SRCSRGID AND srg.SRGSTRID <> :semesterId AND src.SRCSTATUS = 'ACTIVE' AND src.SRCTYPE <> 'AUDIT' AND srg.SRGROWSTATE > 0 AND src.SRCROWSTATE > 0 AND egc1.ROW_ST > '0' AND egc1.OBTGR_ID IN (5,7,14)) AND tcr.TCRROWSTATE > 0)", nativeQuery = true)
    List<TermCourses> getOBCourses(@Param("studentId") Long studentId, @Param("semesterId") Short semesterId, @Param("prgId") Short prgId, @Param("trmId") Short trmId, @Param("batchId") Short batchId);

    @Query(value = "SELECT * FROM ec2.TERMCOURSES tc,ec2.TERMCOURSEAVAILABLEFOR tca, ec2.COURSES c WHERE tca.TCAPRGID = :prgId AND tca.TCATCRID = tc.TCRID AND tc.TCRCRSID = c.CRSID AND tca.TCASTATUS = 'T' AND tca.TCAROWSTATE > 0 AND tc.TCRROWSTATE > 0 AND c.CRSROWSTATE > 0 AND tc.TCRTRMID = :trmId AND tc.TCRCRSID NOT IN (SELECT DISTINCT tc2.TCRCRSID FROM ec2.STUDENTREGISTRATIONS sr, ec2.STUDENTREGISTRATIONCOURSES src, ec2.TERMCOURSES tc2 WHERE sr.SRGID = src.SRCSRGID AND src.SRCTCRID = tc2.TCRID AND src.SRCSTATUS = 'ACTIVE' AND src.SRCROWSTATE > 0 AND sr.SRGROWSTATE > 0 AND tc2.TCRROWSTATE > 0 AND sr.SRGSTDID = :studentId AND sr.SRGSTRID <> :semesterId) AND tc.TCRCRSID NOT IN (SELECT cgc.CGCCRSID FROM ec2.SEMESTERCOURSES sc, ec2.COURSEGROUPCOURSES cgc WHERE sc.SCRSTRID = :semesterId AND sc.SCRCGPID = cgc.CGCCGPID AND sc.SCRROWSTATE > 0 AND cgc.CGCROWSTATE > 0) AND tc.TCRCRSID NOT IN (SELECT sc2.SCRCRSID FROM ec2.SEMESTERCOURSES sc2 WHERE sc2.SCRSTRID = :semesterId AND sc2.SCRROWSTATE > 0 AND sc2.SCRELECTIVE = 'N' AND sc2.SCRCRSID IS NOT NULL) ORDER BY c.CRSNAME", nativeQuery = true)
    List<TermCourses> getOTermCourses(@Param("studentId") Long studentId, @Param("semesterId") Short semesterId, @Param("prgId") Short prgId, @Param("trmId") Short trmId);

    @Query(value = "SELECT * FROM ec2.TERMCOURSEAVAILABLEFOR tca, ec2.TERMCOURSES tc, ec2.COURSES c WHERE tca.TCAPRGID = :prgId AND tc.TCRTRMID = :trmId AND tca.TCATCRID = tc.TCRID AND tc.TCRCRSID = c.CRSID AND tc.TCRCRSID IN (SELECT tc2.TCRCRSID FROM ec2.EGCRSTT1 e, ec2.TERMCOURSES tc2 WHERE tc2.TCRID = e.TCRID AND (e.OBTGR_ID = 4 OR e.OBTGR_ID = 21 OR e.OBTGR_ID = 22) AND e.ROW_ST > '0' AND e.STUD_ID = :studentId AND tc2.TCRROWSTATE > 0 AND tc2.TCRCRSID = c.CRSID AND c.CRSROWSTATE > 0) AND tc.TCRROWSTATE > 0 AND c.CRSROWSTATE > 0 ORDER BY c.CRSNAME", nativeQuery = true)
    List<TermCourses> getGICourses(@Param("studentId") Long studentId, @Param("prgId") Short prgId, @Param("trmId") Short trmId);

    @Query(value = "SELECT tc.TCRID FROM ec2.TERMCOURSES tc WHERE tc.TCRCRSID = :crsId AND tc.TCRTRMID = :trmId AND tc.TCRROWSTATE > 0", nativeQuery = true)
    Long findTcrid(@Param("crsId") Long crsId, @Param("trmId") Long trmId);

}
