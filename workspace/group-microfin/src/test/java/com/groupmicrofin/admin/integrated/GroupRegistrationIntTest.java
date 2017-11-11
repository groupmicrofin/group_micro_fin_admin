package com.groupmicrofin.admin.integrated;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.model.GroupParam;
import com.groupmicrofin.admin.repository.GroupMasterRepository;
import com.groupmicrofin.admin.repository.GroupMasterRepositoryMSImpl;
import com.groupmicrofin.admin.repository.GroupParamRepository;
import com.groupmicrofin.admin.repository.GroupParamRepositoryMSImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GroupRegistrationIntTest {
    //Testing change
    GroupMasterRepository groupMasterRepository;
    GroupParamRepository groupParamRepository;

    @Before
    public void setup() {
        this.groupMasterRepository = new GroupMasterRepositoryMSImpl();
        this.groupParamRepository = new GroupParamRepositoryMSImpl();
    }

    @Test
    public void groupRegistrationTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        int result = this.groupMasterRepository.addGroupMaster(groupMaster);
        Assert.assertTrue(result > 0);

        GroupParam groupParam = GroupAdminFactory.getGroupParamDummy(groupMaster.getId());
        result = this.groupParamRepository.addGroupParam(groupParam);
        assertTrue(result > 0);
    }
}