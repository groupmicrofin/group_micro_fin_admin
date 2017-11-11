package com.groupmicrofin.admin.repository;
import com.groupmicrofin.admin.model.GroupMember;

public interface GroupMemberRepository {

    public int addGroupMember(GroupMember groupMember);
    public void modifyGroupMember(GroupMember groupMember);
}
