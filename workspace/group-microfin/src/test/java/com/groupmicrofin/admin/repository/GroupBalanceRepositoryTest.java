package com.groupmicrofin.admin.repository;

        import com.groupmicrofin.admin.common.GroupAdminFactory;
        import com.groupmicrofin.admin.model.GroupMaster;
        import com.groupmicrofin.admin.model.GroupBalance;
        import org.junit.Before;
        import org.junit.Test;

        import java.time.LocalDate;

        import static org.junit.Assert.assertTrue;

public class GroupBalanceRepositoryTest {
    GroupMasterRepository groupMasterRepository;
    GroupBalanceRepository groupBalanceRepository;

    @Before
    public void before() {
        groupMasterRepository = new GroupMasterRepositoryMSImpl();
        groupBalanceRepository = new GroupBalanceRepositoryMSImpl();
    }

    @Test
    public void addGroupBalanceTest() {
        GroupMaster groupMaster = GroupAdminFactory.getGroupMasterDummy();
        groupMasterRepository.addGroupMaster(groupMaster);
        GroupBalance groupBalance = GroupAdminFactory.getGroupBalanceDummy(groupMaster.getId());
        int result = groupBalanceRepository.addGroupBalance(groupBalance);
        assertTrue(result > 0);
    }
}