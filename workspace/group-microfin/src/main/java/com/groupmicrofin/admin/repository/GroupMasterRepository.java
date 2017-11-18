package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupMaster;

public interface GroupMasterRepository {

    public int addGroupMaster(GroupMaster groupMaster);

    public void modifyGroupMaster(GroupMaster groupMaster);

    public GroupMaster findById(int id);
}