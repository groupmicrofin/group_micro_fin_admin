package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupParam;
import com.groupmicrofin.util.ConnectionManager;

import java.sql.*;


public class GroupParamRepositoryMSImpl implements GroupParamRepository {


    @Override
    public int addGroupParam(GroupParam groupParam) {
        //To connect with database
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        int result = 0;
        try {
            conn = ConnectionManager.getConnection();


            String INSERT_GROUP_M_SQL;
            INSERT_GROUP_M_SQL = "INSERT INTO groupmicrofin.group_Params (group_Master_id,group_start_dt,meeting_frequency,meeting_Schedule,year_end_month,share_face_value,ln_int_rate,ln_int_base,ln_disb_amt_max_lim_per,ln_max_active_loan_count,ln_gauranters_count,ln_max_installment_count,fee_amt_no_share_payout,fee_waiver_no_cycles,assessment_year,amt_rounding_dec_digits,audit_created_dttm,audit_updated_dttm)" +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,Now(),Now())";
            preparedStatement = conn.prepareStatement(INSERT_GROUP_M_SQL, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, groupParam.getGroupMasterId());
            preparedStatement.setDate(2, Date.valueOf(groupParam.getGroupStartDt()));
            preparedStatement.setInt(3, groupParam.getMeetingFrequency());
            preparedStatement.setString(4, groupParam.getMeetingSchedule());
            preparedStatement.setInt(5, groupParam.getYearEndMonth());
            preparedStatement.setFloat(6, groupParam.getShareFaceValue());
            preparedStatement.setFloat(7, groupParam.getLnIntRate());
            preparedStatement.setInt(8, groupParam.getLnIntBase());
            preparedStatement.setFloat(9, groupParam.getLnDisbAmtMaxLimPercent());
            preparedStatement.setInt(10, groupParam.getLnMaxActiveLoanCount());
            preparedStatement.setInt(11, groupParam.getLnGaurantersCount());
            preparedStatement.setInt(12, groupParam.getLnMaxInstallmentCount());
            preparedStatement.setDouble(13, groupParam.getFeeAmtNoSharePayout());
            preparedStatement.setInt(14, groupParam.getFeeWaiverNoCycles());
            preparedStatement.setString(15, (groupParam.getAssessmentYear()));
            preparedStatement.setInt(16, groupParam.getAmtRoundingDecDigits());


            result = preparedStatement.executeUpdate();
            ResultSet resultset = preparedStatement.getGeneratedKeys();
            if (null != resultset && resultset.next()) {
                int id = resultset.getInt(1);
                groupParam.setId(id);
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
        return result;
    }

    @Override
    public void updateGroupParam(GroupParam groupParam) {

        //TODO In future provide implementation of GroupParam based on user story
        int result = 0;
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = ConnectionManager.getConnection();

            String UPDATE_GROUP_M_SQL = " UPDATE  groupmicrofin.group_params " +
                    "SET group_master_id=?,group_start_dt=?,meeting_frequency=?,meeting_schedule=?,year_end_month=?,share_face_value=?,ln_int_rate=?,ln_int_base=?,ln_disb_amt_max_lim_per=?,ln_max_active_loan_count=?,ln_gauranters_count=?,ln_max_installment_count=?,fee_amt_no_share_payout=?,fee_waiver_no_cycles=?,assessment_year=?,amt_rounding_dec_digits=?,audit_created_dttm=NOW(),audit_updated_dttm=NOW()" +
                    " WHERE group_master_id = ?";

            preparedStatement = conn.prepareStatement(UPDATE_GROUP_M_SQL, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, groupParam.getGroupMasterId());
            preparedStatement.setDate(2, Date.valueOf(groupParam.getGroupStartDt()));
            preparedStatement.setInt(3, groupParam.getMeetingFrequency());
            preparedStatement.setString(4, groupParam.getMeetingSchedule());
            preparedStatement.setInt(5, groupParam.getYearEndMonth());
            preparedStatement.setFloat(6, groupParam.getShareFaceValue());
            preparedStatement.setFloat(7, groupParam.getLnIntRate());
            preparedStatement.setInt(8, groupParam.getLnIntBase());
            preparedStatement.setFloat(9, groupParam.getLnDisbAmtMaxLimPercent());
            preparedStatement.setInt(10, groupParam.getLnMaxActiveLoanCount());
            preparedStatement.setInt(11, groupParam.getLnGaurantersCount());
            preparedStatement.setInt(12, groupParam.getLnMaxInstallmentCount());
            preparedStatement.setDouble(13, groupParam.getFeeAmtNoSharePayout());
            preparedStatement.setInt(14, groupParam.getFeeWaiverNoCycles());
            preparedStatement.setString(15, (groupParam.getAssessmentYear()));
            preparedStatement.setInt(16, groupParam.getAmtRoundingDecDigits());

            preparedStatement.setInt(17, groupParam.getGroupMasterId());


            preparedStatement.executeUpdate();
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
    }


    @Override
    public GroupParam findByGroupMasterId(int groupMasterId) {
        GroupParam groupParam = new GroupParam();
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = ConnectionManager.getConnection();
            String SELECT_GROUP_M_SQL = "SELECT id,group_Master_id,group_start_dt,meeting_frequency,meeting_Schedule,year_end_month,share_face_value,ln_int_rate,ln_int_base,ln_disb_amt_max_lim_per,ln_max_active_loan_count,ln_gauranters_count,ln_max_installment_count,fee_amt_no_share_payout,fee_waiver_no_cycles,assessment_year,amt_rounding_dec_digits,audit_created_dttm,audit_updated_dttm " +
                    "FROM  groupmicrofin.group_params WHERE group_master_id = ?";
            preparedStatement = conn.prepareStatement(SELECT_GROUP_M_SQL);
            preparedStatement.setInt(1, groupMasterId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet != null && resultSet.next()) {
                groupParam.setId(resultSet.getInt(1));
                groupParam.setGroupMasterId(resultSet.getInt(2));
                groupParam.setGroupStartDt(resultSet.getDate(3).toLocalDate());
                groupParam.setMeetingFrequency(resultSet.getInt(4));
                groupParam.setMeetingSchedule(resultSet.getString(5));
                groupParam.setYearEndMonth(resultSet.getInt(6));
                groupParam.setShareFaceValue(resultSet.getInt(7));
                groupParam.setLnIntRate(resultSet.getInt(8));
                groupParam.setLnIntBase(resultSet.getInt(9));
                groupParam.setLnDisbAmtMaxLimPercent(resultSet.getFloat(10));
                groupParam.setLnMaxActiveLoanCount(resultSet.getInt(11));
                groupParam.setLnGaurantersCount(resultSet.getInt(12));
                groupParam.setLnMaxInstallmentCount(resultSet.getInt(13));
                groupParam.setFeeAmtNoSharePayout(resultSet.getInt(14));
                groupParam.setFeeWaiverNoCycles(resultSet.getInt(15));
                groupParam.setAssessmentYear(resultSet.getString(16));
                groupParam.setAmtRoundingDecDigits(resultSet.getInt(17));
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
        return groupParam;
    }

}
