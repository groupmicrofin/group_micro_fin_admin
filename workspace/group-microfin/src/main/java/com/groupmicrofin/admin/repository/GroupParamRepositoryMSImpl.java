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


//TODO to have ID handled as part of model object
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
    public void modifyGroupParam(GroupParam groupParam) {
        //TODO In future provide implementation of GroupParam based on user story
    }
}