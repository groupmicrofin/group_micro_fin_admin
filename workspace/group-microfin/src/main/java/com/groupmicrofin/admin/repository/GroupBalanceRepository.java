package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupBalance;

public interface GroupBalanceRepository {

    public int addGroupBalance(GroupBalance groupBalance);

    public void modifyGroupBalance(GroupBalance groupBalance);

}
