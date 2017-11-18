package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.model.GroupParam;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GroupParamRepositoryTest {
    GroupMasterRepository groupMasterRepository;
    GroupParamRepository groupParamRepository;

    @Before
    public void before() {
        this.groupMasterRepository = new GroupMasterRepositoryMSImpl();
        this.groupParamRepository = new GroupParamRepositoryMSImpl();
    }

    @Test
    public void addGroupParamTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        this.groupMasterRepository.addGroupMaster(groupMaster);
        GroupParam groupParam = GroupAdminFactory.getGroupParamDummy(groupMaster.getId());
        int result = this.groupParamRepository.addGroupParam(groupParam);
        assertTrue(result > 0);

        groupParam = this.groupParamRepository.findByGroupMasterId(groupParam.getGroupMasterId());
        assertTrue(groupParam.getGroupMasterId() > 0);
        System.out.println(groupParam);

    }

    @Test
    public void updateGroupParamTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        this.groupMasterRepository.addGroupMaster(groupMaster);
        GroupParam groupParam = GroupAdminFactory.updateGroupParamDummy(79);
        this.groupParamRepository.updateGroupParam(groupParam);

    }


}



