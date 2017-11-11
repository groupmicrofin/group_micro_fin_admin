package com.groupmicrofin.admin.service;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupMaster;
import org.junit.Before;
import org.junit.Test;

public class GroupRegistrationServiceTest {

    private GroupRegistrationService groupRegistrationService;

    @Before
    public void setup(){
        groupRegistrationService = new GroupRegistrationServiceImpl();
    }

    @Test
    public void addGroupMasterTest(){
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        groupRegistrationService.addGroupMaster(groupMaster);
    }

}
