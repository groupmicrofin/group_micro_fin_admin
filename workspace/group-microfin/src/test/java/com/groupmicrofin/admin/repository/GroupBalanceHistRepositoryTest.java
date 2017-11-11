package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupBalanceHist;
import org.junit.Before;
import org.junit.Test;
import sun.util.resources.LocaleData;


import java.sql.Date;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;
public class GroupBalanceHistRepositoryTest {

    GroupBalanceHistRepository groupBalanceHistRepository;

    @Before
    public void before(){
        groupBalanceHistRepository = new GroupBalanceHistRepositoryMSImpl();
    }

    @Test
    public void addGroupBalanceHistTest(){
        GroupBalanceHist groupBalanceHist = getGroupBalanceHistDummy();
        int result = groupBalanceHistRepository.addGroupBalanceHist(groupBalanceHist);
        assertTrue(result>0);
    }

    public GroupBalanceHist getGroupBalanceHistDummy(){
        GroupBalanceHist groupBalanceHist = new GroupBalanceHist();
        groupBalanceHist.setGroupMasterId(16);
        String assessmentYear = "" + LocalDate.now().getYear() + "-" + (LocalDate.now().getYear()+1);
        groupBalanceHist.setAssessmentYear(assessmentYear);
        groupBalanceHist.setAmtShareFacBal(1000);
        groupBalanceHist.setAmtShareFacBalOthers(1500);
        groupBalanceHist.setCycleNo(2);
        groupBalanceHist.setDatLastMeeting(LocalDate.of(2005,11,15));
        groupBalanceHist.setDatNextMeeting(LocalDate.of(2005,12,15));
        groupBalanceHist.setLastActivityStatus("xyz");

        return groupBalanceHist;
    }

}
