package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.*;
import com.groupmicrofin.admin.model.GroupMember;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GroupMemberRepositoryTest {
    GroupMasterRepository groupMasterRepository;
    GroupMemberRepository groupMemberRepository;

    @Before
    public void before() {
        this.groupMasterRepository = new GroupMasterRepositoryMSImpl();
        this.groupMemberRepository = new GroupMemberRepositoryMSImpl();
    }

    @Test

    public void addGroupMemberTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        this.groupMasterRepository.addGroupMaster(groupMaster);
        GroupMember groupMember = GroupAdminFactory.getGroupMemberDummy(groupMaster.getId());
        int result = this.groupMemberRepository.addGroupMember(groupMember);
        assertTrue(result > 0);

    }

}