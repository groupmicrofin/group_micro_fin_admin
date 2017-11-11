package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupMaster;

public interface GroupMasterRepository {

    public int addGroupMaster(GroupMaster groupMaster);
    public void modifyGroupMaster(GroupMaster groupMaster);
    public int findGroupMaster(int id);
}