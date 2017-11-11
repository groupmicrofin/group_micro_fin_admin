package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.model.GroupParam;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GroupParamRepositoryTest {
    GroupMasterRepository groupMasterRepository;
    GroupParamRepository groupParamRepository;

    @Before
    public void before() {
        groupMasterRepository = new GroupMasterRepositoryMSImpl();
        groupParamRepository = new GroupParamRepositoryMSImpl();
    }

    @Test
    public void addGroupParamTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        groupMasterRepository.addGroupMaster(groupMaster);
        GroupParam groupParam = GroupAdminFactory.getGroupParamDummy(groupMaster.getId());
        int result = groupParamRepository.addGroupParam(groupParam);
        assertTrue(result > 0);
    }
}
