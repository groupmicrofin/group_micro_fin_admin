package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupBalanceHist;
import com.groupmicrofin.util.ConnectionManager;

import java.sql.*;

public class GroupBalanceHistRepositoryMSImpl implements GroupBalanceHistRepository {

    public int addGroupBalanceHist(GroupBalanceHist groupBalanceHist) {
        //To connect with database
        Connection conn=null;
        PreparedStatement preparedStatement=null;
        int result=0;
        try {
            conn = ConnectionManager.getConnection();

            String INSERT_GROUP_M_SQL;
            INSERT_GROUP_M_SQL = "INSERT INTO groupmicrofin.group_balance_hists(group_master_id,assessment_year,amt_share_fac_bal,amt_share_fac_bal_others,cycle_no,dat_last_meeting,dat_next_meeting,last_activity_status,audit_created_dttm,audit_updated_dttm )" +
                    "VALUES (?,?,?,?,?,?,?,?,Now(),Now())";

            preparedStatement = conn.prepareStatement(INSERT_GROUP_M_SQL);
            preparedStatement.setInt(1,groupBalanceHist.getGroupMasterId());
            preparedStatement.setString(2,groupBalanceHist.getAssessmentYear());
            preparedStatement.setInt(3,groupBalanceHist.getAmtShareFacBal());
            preparedStatement.setInt(4,groupBalanceHist.getAmtShareFacBalOthers());
            preparedStatement.setInt(5,groupBalanceHist.getCycleNo());
            preparedStatement.setDate(6,Date.valueOf(groupBalanceHist.getDatLastMeeting()));
            preparedStatement.setDate(7,Date.valueOf(groupBalanceHist.getDatNextMeeting()));
            preparedStatement.setString(8,groupBalanceHist.getLastActivityStatus());





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

    public void modifyGroupBalanceHist(GroupBalanceHist groupBalanceHist) {
        //TODO In future provide implementation of GroupBalanceHist based on user story
    }
}