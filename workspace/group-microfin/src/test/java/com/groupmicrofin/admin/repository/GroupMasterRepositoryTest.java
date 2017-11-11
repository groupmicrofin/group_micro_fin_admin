package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupMaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GroupMasterRepositoryTest {
    GroupMasterRepository groupMasterRepository;


    @Before
    public void before() {
        this.groupMasterRepository = new GroupMasterRepositoryMSImpl();

    }

    @Test
    public void addGroupMasterTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        this.groupMasterRepository.addGroupMaster(groupMaster);
        int result = this.groupMasterRepository.addGroupMaster(groupMaster);
        assertTrue(result > 0);
        assertTrue(groupMaster.getId() > 0);

        groupMaster = this.groupMasterRepository.findGroupMaster(groupMaster.getId());
        System.out.println(groupMaster);

    }

}