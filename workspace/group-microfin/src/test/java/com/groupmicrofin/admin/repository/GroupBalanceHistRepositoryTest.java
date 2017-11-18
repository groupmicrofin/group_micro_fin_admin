package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupBalanceHist;
import com.groupmicrofin.admin.model.GroupMaster;
import org.junit.Before;
import org.junit.Test;
import sun.util.resources.LocaleData;


import java.sql.Date;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GroupBalanceHistRepositoryTest {

    GroupMasterRepository groupMasterRepository;

    GroupBalanceHistRepository groupBalanceHistRepository;

    @Before
    public void before() {

        this.groupMasterRepository = new GroupMasterRepositoryMSImpl();
        this.groupBalanceHistRepository = new GroupBalanceHistRepositoryMSImpl();
    }

    @Test
    public void addGroupBalanceHistTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        this.groupMasterRepository.addGroupMaster(groupMaster);
        GroupBalanceHist groupBalanceHist = GroupAdminFactory.getGroupBalanceHistDummy(groupMaster.getId());
        int result = this.groupBalanceHistRepository.addGroupBalanceHist(groupBalanceHist);
        assertTrue(result > 0);
    }


}
