package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupParam;

public interface GroupParamRepository {

    public int addGroupParam(GroupParam groupParam);

    public void modifyGroupParam(GroupParam groupParam);

}