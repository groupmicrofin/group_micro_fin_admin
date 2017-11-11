package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupBalanceHist;

public interface GroupBalanceHistRepository {

    public int addGroupBalanceHist(GroupBalanceHist groupBalanceHist);

    public void modifyGroupBalanceHist(GroupBalanceHist groupBalanceHist);

}
