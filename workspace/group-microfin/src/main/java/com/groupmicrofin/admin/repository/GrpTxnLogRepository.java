package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GrpTxnLog;

public interface GrpTxnLogRepository {

    public int addGrpTxnLog(GrpTxnLog grpTxnLog);

    public void modifyGrpTxnLog(GrpTxnLog grpTxnLog);

}
