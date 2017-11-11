package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.common.GroupAdminFactory;
import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.model.GrpTxnLog;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class GrpTxnLogRepositoryTest {
    GroupMasterRepository groupMasterRepository;
    GrpTxnLogRepository grpTxnLogRepository;

    @Before
    public void before() {
        groupMasterRepository = new GroupMasterRepositoryMSImpl();
        grpTxnLogRepository = new GrpTxnLogRepositoryMSImpl();
    }

    @Test
    public void addGrpTxnLogTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        groupMasterRepository.addGroupMaster(groupMaster);
        GrpTxnLog grpTxnLog = GroupAdminFactory.getGrpTxnLogDummy(groupMaster.getId());
        int result = grpTxnLogRepository.addGrpTxnLog(grpTxnLog);
        assertTrue(result > 0);
    }
}