package com.groupmicrofin.admin.repository;


import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.admin.model.GroupMember;
import com.groupmicrofin.util.ConnectionManager;

import java.sql.*;
import java.time.LocalDate;


public class GroupMemberRepositoryMSImpl implements GroupMemberRepository {
    @Override
    public int addGroupMember(GroupMember groupMember) {
        // To connect with database
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        int result = 0;
        try {
            conn = ConnectionManager.getConnection();

            String INSERT_GROUP_M_SQL = "Insert into groupmicrofin.group_members(group_master_id,assessment_year,name,login_id,email,password,mobile_no,birth_date,kyc_id,cycle_no,amt_pend_Share,amt_paid_fee,amt_ln_disb,amt_ln_balance,no_active_ln,amt_accr_int,amt_paid_int,amt_paid_princ,amt_def_installment,dat_last_ln_disb)" + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            preparedStatement = conn.prepareStatement(INSERT_GROUP_M_SQL, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, groupMember.getGroupMasterId());
            preparedStatement.setString(2, groupMember.getAssessmentYear());
            preparedStatement.setString(3, groupMember.getName());
            preparedStatement.setString(4, groupMember.getLoginId());
            preparedStatement.setString(5, groupMember.getEmail());
            preparedStatement.setString(6, groupMember.getPassword());
            preparedStatement.setInt(7, groupMember.getMobileNo());
            preparedStatement.setDate(8, Date.valueOf(groupMember.getBirthDate()));
            preparedStatement.setString(9, groupMember.getKycId());
            preparedStatement.setInt(10, groupMember.getCycleNo());
            preparedStatement.setInt(11, groupMember.getAmtPendShare());
            preparedStatement.setInt(12, groupMember.getAmtPaidFee());
            preparedStatement.setInt(13, groupMember.getAmtLnDisb());
            preparedStatement.setInt(14, groupMember.getNoActiveLn());
            preparedStatement.setInt(15, groupMember.getAmtLnBalance());
            preparedStatement.setInt(16, groupMember.getAmtAccrInt());
            preparedStatement.setInt(17, groupMember.getAmtPaidInt());
            preparedStatement.setInt(18, groupMember.getAmtPaidPrinc());
            preparedStatement.setInt(19, groupMember.getAmtDefInstallment());
            preparedStatement.setDate(20, Date.valueOf(groupMember.getDatLastLnDisb()));


            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.commit();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        //Fire Insert SQL
        //Perform commit
        return result;
    }


    @Override
    public void modifyGroupMember(GroupMember groupMember) {
        //for future//
    }
}
