package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupMember;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;
public class GroupMemberRepositoryTest {

    GroupMemberRepository groupMemberRepository;

    @Before
    public void before(){
        groupMemberRepository = new GroupMemberRepositoryMSImpl();
    }

    @Test
    public void addGroupMemberTest(){
        GroupMember groupMember = getGroupMemberDummy();
        int result = groupMemberRepository.addGroupMember(groupMember);
        assertTrue(result>0);
    }

    public GroupMember getGroupMemberDummy(){
        GroupMember groupMember = new GroupMember();

        groupMember.setName("omar");
        groupMember.setLoginId("102004");
        groupMember.setEmail("ok@live.com");
        groupMember.setPassword("passw0rd");
        groupMember.setMobileNo(1000);
        groupMember.setBirthDate(LocalDate.of(1993,8,18));
        groupMember.setKycId("12");
        return groupMember;
    }

}
