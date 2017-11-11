package com.groupmicrofin.admin.service;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupMaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GroupRegistrationServiceTest {

    private GroupRegistrationService groupRegistrationService;

    @Before
    public void setup() {
        this.groupRegistrationService = new GroupRegistrationServiceImpl();
    }

    @Test
    public void addGroupMasterTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        this.groupRegistrationService.addGroupMaster(groupMaster);
        assertTrue(groupMaster.getId() > 0);
    }

}
