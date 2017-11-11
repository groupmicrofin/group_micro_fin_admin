package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.model.GroupMaster;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GroupMasterRepositoryTest {
    GroupMasterRepository groupMasterRepository;
  

    @Before
    public void before() {
        groupMasterRepository = new GroupMasterRepositoryMSImpl();
       
    }

    @Test
    public void addGroupMasterTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        groupMasterRepository.addGroupMaster(groupMaster);
        int result = groupMasterRepository.addGroupMaster(groupMaster);
        assertTrue(result > 0);
    }
   @Test
       public void findaGroupMasterTest() {
       GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
       groupMasterRepository.addGroupMaster(groupMaster);
       int result = groupMasterRepository.findGroupMaster(1);
       assertTrue(result > 0);

   }
}