package com.groupmicrofin.admin.repository;


import com.groupmicrofin.admin.model.GroupMember;

import java.sql.*;
import java.time.LocalDate;


public class GroupMemberRepositoryMSImpl implements GroupMemberRepository {
    public int addGroupMember(GroupMember groupMember  ) {

        //To connect with database
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        int result = 0;
        try {
            String driverClass = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql://localhost/groupmicrofin";
            String dbUserName = "root";
            String dbPassword = "passw0rd";
            Class.forName(driverClass);
            conn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
            conn.setAutoCommit(false);
            //TODO get connection from ConnectionManager
            String INSERT_GROUP_M_SQL = "Insert into groupmicrofin.group_members(name,login_id,email,password,mobile_no,birth_date,kyc_id)" + "VALUES (?,?,?,?,?,?,?)";
            preparedStatement = conn.prepareStatement(INSERT_GROUP_M_SQL);

            preparedStatement.setString(1, groupMember.getName());
            preparedStatement.setString(2, groupMember.getLoginId());
            preparedStatement.setString(3, groupMember.getEmail());
            preparedStatement.setString(4, groupMember.getPassword());
            preparedStatement.setInt(5, groupMember.getMobileNo());
            preparedStatement.setDate(6, Date.valueOf(groupMember.getBirthDate()));
            preparedStatement.setString(7, groupMember.getKycId());

            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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


    public void modifyGroupMember(GroupMember groupMember) {
    //for future//
    }
}
