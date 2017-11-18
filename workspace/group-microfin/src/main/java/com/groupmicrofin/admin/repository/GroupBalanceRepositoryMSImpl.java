package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupBalance;
import com.groupmicrofin.util.ConnectionManager;

import java.sql.*;

public class GroupBalanceRepositoryMSImpl implements GroupBalanceRepository {


    @Override
    public int addGroupBalance(GroupBalance groupBalance) {
        //To connect with database
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        int result = 0;
        try {
            conn = ConnectionManager.getConnection();
            String INSERT_GROUP_M_SQL;
            INSERT_GROUP_M_SQL = "INSERT INTO groupmicrofin.group_Balances (group_master_id,assessment_year,amt_share_fac_bal,amt_share_fac_bal_others,cycle_no,amount_misc_dr,dat_last_meeting,dat_next_meeting,last_activity_status,audit_created_dttm,audit_updated_dttm)" +
                    "VALUES (?,?,?,?,?,?,?,?,?,Now(),Now())";

            preparedStatement = conn.prepareStatement(INSERT_GROUP_M_SQL, Statement.RETURN_GENERATED_KEYS);


            preparedStatement.setInt(1, groupBalance.getGroupMasterId());
            preparedStatement.setString(2, groupBalance.getAssessmentYear());
            preparedStatement.setInt(3, groupBalance.getAmtShareFacBal());
            preparedStatement.setInt(4, groupBalance.getAmtShareFacBalOthers());
            preparedStatement.setInt(5, groupBalance.getCycleNo());
            preparedStatement.setInt(6, groupBalance.getAmtMiscDr());
            preparedStatement.setDate(7, Date.valueOf(groupBalance.getDatLastMeeting()));
            preparedStatement.setDate(8, Date.valueOf(groupBalance.getDatNextMeeting()));
            preparedStatement.setString(9, groupBalance.getLastActivityStatus(""));

            result = preparedStatement.executeUpdate();
            ResultSet resultset = preparedStatement.getGeneratedKeys();
            if (null != resultset && resultset.next()) {
                int id = resultset.getInt(1);
                groupBalance.setId(id);
            }

            conn.commit();

        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e.printStackTrace();
            }
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
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        //Fire Insert SQL
        //Perform commit
        return result;
    }

    @Override
    public void updateGroupBalance(GroupBalance groupBalance) {
        //TODO In future provide implementation of GroupBalance based on user story
        int result = 0;
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = ConnectionManager.getConnection();

            String UPDATE_GROUP_M_SQL = " UPDATE  groupmicrofin.group_balances " +
                    "SET group_master_id=?,assessment_year=?,amt_share_fac_bal=?,amt_share_fac_bal_others=?,cycle_no=?,amount_misc_dr=?,dat_last_meeting=?,dat_next_meeting=?,last_activity_status=?,audit_created_dttm=NOW(),audit_updated_dttm=NOW()" + "WHERE(group_master_id = ?)";

            preparedStatement = conn.prepareStatement(UPDATE_GROUP_M_SQL, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, groupBalance.getGroupMasterId());
            preparedStatement.setString(2, groupBalance.getAssessmentYear());
            preparedStatement.setInt(3, groupBalance.getAmtShareFacBal());
            preparedStatement.setInt(4, groupBalance.getAmtShareFacBalOthers());
            preparedStatement.setInt(5, groupBalance.getCycleNo());
            preparedStatement.setInt(6, groupBalance.getAmtMiscDr());
            preparedStatement.setDate(7, Date.valueOf(groupBalance.getDatLastMeeting()));
            preparedStatement.setDate(8, Date.valueOf(groupBalance.getDatNextMeeting()));
            preparedStatement.setString(9, groupBalance.getLastActivityStatus(""));
            preparedStatement.setInt(10, groupBalance.getGroupMasterId());


            preparedStatement.executeUpdate();
            ResultSet resultset = preparedStatement.getGeneratedKeys();
            if (null != resultset && resultset.next()) {
                int id = resultset.getInt(1);
                groupBalance.setId(id);

            }

            conn.commit();

        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e.printStackTrace();
            }
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
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        //Fire Insert SQL
        //Perform commit;
    }


    @Override
    public GroupBalance findByGroupMasterId(int groupMasterId) {
        GroupBalance groupBalance = new GroupBalance();
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = ConnectionManager.getConnection();
            String SELECT_GROUP_M_SQL;
            SELECT_GROUP_M_SQL = "SELECT id,group_Master_id,assessment_year,amt_share_fac_bal,amt_share_fac_bal_others,cycle_no,amount_misc_dr,dat_last_meeting,dat_next_meeting,last_activity_status,audit_created_dttm,audit_updated_dttm " +
                    "FROM  groupmicrofin.group_balances WHERE group_master_id = ?";
            preparedStatement = conn.prepareStatement(SELECT_GROUP_M_SQL);
            preparedStatement.setInt(1, groupMasterId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet != null && resultSet.next()) {

                groupBalance.setId(resultSet.getInt(1));
                groupBalance.setGroupMasterId(resultSet.getInt(2));
                groupBalance.setAssessmentYear(resultSet.getString(3));
                groupBalance.setAmtShareFacBal(resultSet.getInt(4));
                groupBalance.setAmtShareFacBalOthers(resultSet.getInt(5));
                groupBalance.setCycleNo(resultSet.getInt(6));
                groupBalance.setAmtMiscDr(resultSet.getInt(7));
                groupBalance.setDatLastMeeting(resultSet.getDate(8).toLocalDate());
                groupBalance.setDatNextMeeting(resultSet.getDate(9).toLocalDate());
                groupBalance.setLastActivityStatus(resultSet.getString(10));

            }

            if (resultSet != null) {
                resultSet.close();
            }

            conn.commit();

        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e.printStackTrace();
            }
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
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        //Fire Insert SQL
        //Perform commit
        return groupBalance;
    }

}


