package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupBalance;
import com.groupmicrofin.util.ConnectionManager;

import java.sql.*;

public class GroupBalanceRepositoryMSImpl implements GroupBalanceRepository {


    public int addGroupBalance(GroupBalance groupBalance) {
        //To connect with database
        Connection conn=null;
        PreparedStatement preparedStatement=null;
        int result=0;
        try {
            conn = ConnectionManager.getConnection();
            String INSERT_GROUP_M_SQL;
            INSERT_GROUP_M_SQL = "INSERT INTO groupmicrofin.group_Balances (group_master_id,assessment_year,amt_share_fac_bal,amt_share_fac_bal_others,cycle_no,amount_misc_dr,dat_last_meeting,dat_next_meeting,last_activity_status,                     audit_created_dttm,audit_updated_dttm)" +
                    "VALUES (?,?,?,?,?,?,?,?,?,Now(),Now())";

            preparedStatement = conn.prepareStatement(INSERT_GROUP_M_SQL);

            preparedStatement.setInt(1,groupBalance.getGroupMasterId());
            preparedStatement.setString(2,groupBalance.getAssessmentYear());
            preparedStatement.setInt(3,groupBalance.getAmtShareFacBal());
            preparedStatement.setInt(4,groupBalance.getAmtShareFacBalOthers());
            preparedStatement.setInt(5,groupBalance.getCycleNo());
            preparedStatement.setInt(6,groupBalance.getAmtMiscDr());
            preparedStatement.setDate(7,Date.valueOf(groupBalance.getDatLastMeeting()));
            preparedStatement.setDate(8,Date.valueOf(groupBalance.getDatNextMeeting()));
            preparedStatement.setString(9,groupBalance.getLastActivityStatus("value changed"));



            result = preparedStatement.executeUpdate();

            conn.commit();

        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
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

    public void modifyGroupBalance(GroupBalance groupBalance) {
        //TODO In future provide implementation of GroupBalance based on user story
    }
}