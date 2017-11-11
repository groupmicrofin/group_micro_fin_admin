package com.groupmicrofin.admin.service;

import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.repository.GroupMasterRepository;
import com.groupmicrofin.admin.repository.GroupMasterRepositoryMSImpl;

public class GroupRegistrationServiceImpl implements GroupRegistrationService {
    private final GroupMasterRepository groupMasterRepository;

    public GroupRegistrationServiceImpl() {
        this.groupMasterRepository = new GroupMasterRepositoryMSImpl();
    }

    @Override
    public void addGroupMaster(GroupMaster groupMaster) {
        this.groupMasterRepository.addGroupMaster(groupMaster);
    }
}
