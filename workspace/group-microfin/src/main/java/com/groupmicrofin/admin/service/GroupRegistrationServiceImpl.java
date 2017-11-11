package com.groupmicrofin.admin.service;

import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.repository.GroupMasterRepository;
import com.groupmicrofin.admin.repository.GroupMasterRepositoryMSImpl;

public class GroupRegistrationServiceImpl implements GroupRegistrationService {
    private GroupMasterRepository groupMasterRepository;

    public GroupRegistrationServiceImpl(){
        groupMasterRepository = new GroupMasterRepositoryMSImpl();
    }

    public void addGroupMaster(GroupMaster groupMaster) {
        groupMasterRepository.addGroupMaster(groupMaster);
    }
}
