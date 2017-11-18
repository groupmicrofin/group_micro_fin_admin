package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.model.GroupBalance;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GroupBalanceRepositoryTest {
    GroupMasterRepository groupMasterRepository;
    GroupBalanceRepository groupBalanceRepository;

    @Before
    public void before() {
        this.groupMasterRepository = new GroupMasterRepositoryMSImpl();
        this.groupBalanceRepository = new GroupBalanceRepositoryMSImpl();
    }

    @Test
    public void addGroupBalanceTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        this.groupMasterRepository.addGroupMaster(groupMaster);
        GroupBalance groupBalance = GroupAdminFactory.getGroupBalanceDummy(groupMaster.getId());
        int result = this.groupBalanceRepository.addGroupBalance(groupBalance);
        assertTrue(result > 0);


        groupBalance = this.groupBalanceRepository.findByGroupMasterId(groupBalance.getGroupMasterId());
        assertTrue(groupBalance.getGroupMasterId() > 0);
        System.out.println(groupBalance);

    }

    @Test
    public void updateGroupBalanceTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        this.groupMasterRepository.addGroupMaster(groupMaster);
        GroupBalance groupBalance = GroupAdminFactory.updateGroupBalanceDummy(89);
        this.groupBalanceRepository.updateGroupBalance(groupBalance);
    }
}