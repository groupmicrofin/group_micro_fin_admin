package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GrpTxnLog;
import com.groupmicrofin.util.ConnectionManager;

import java.sql.*;
import java.time.LocalDateTime;

 public class GrpTxnLogRepositoryMSImpl implements GrpTxnLogRepository {


    public int addGrpTxnLog(GrpTxnLog grpTxnLog) {
        //To connect with database
        Connection conn=null;
        PreparedStatement preparedStatement=null;
        int result=0;
        try {
            conn = ConnectionManager.getConnection();
            String INSERT_GROUP_M_SQL;
            INSERT_GROUP_M_SQL = "INSERT INTO groupmicrofin.grp_txn_log(group_master_id,cycle_no,event_name,group_member_id, mnt_chng_details,txn_amt,txn_amt_other,dat_txn,fu_colmn_1)"+
                    "VALUES (?,?,?,?,?,?,?,?,?)";

            preparedStatement = conn.prepareStatement(INSERT_GROUP_M_SQL);

            preparedStatement.setInt(1,grpTxnLog.getGroupMasterId());
            preparedStatement.setInt(2,grpTxnLog.getCycleNo());
            preparedStatement.setString(3,grpTxnLog.getEventName());
            preparedStatement.setInt(4,grpTxnLog.getGroupMemberId());
            preparedStatement.setString(5,grpTxnLog.getMntChngDetails());
            preparedStatement.setInt(6,grpTxnLog.getTxnAmt());
            preparedStatement.setInt(7,grpTxnLog.getTxnAmtOther());
            preparedStatement.setTimestamp(8, Timestamp.valueOf(grpTxnLog.getDatTxn()));
            preparedStatement.setString(9,grpTxnLog.getFucolmn1());

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

     public void modifyGrpTxnLog(GrpTxnLog grpTxnLog) {
         //TODO In future provide implementation of GrpTxnLog based on user story//
     }


 }

