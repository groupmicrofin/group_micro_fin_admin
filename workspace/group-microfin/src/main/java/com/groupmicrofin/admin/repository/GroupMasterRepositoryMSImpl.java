package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.util.ConnectionManager;

import java.sql.*;

public class GroupMasterRepositoryMSImpl implements GroupMasterRepository {


    @Override
    public int addGroupMaster(GroupMaster groupMaster) {
        //To connect with database
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        int result = 0;
        try {
            conn = ConnectionManager.getConnection();
            String INSERT_GROUP_M_SQL = "INSERT INTO groupmicrofin.group_masters (name,country,town,pincode,login_id,email,             password,audit_created_dttm,audit_updated_dttm)" + "VALUES (?,?,?,?,?,?,?,Now(),Now())";

            preparedStatement = conn.prepareStatement(INSERT_GROUP_M_SQL, Statement.RETURN_GENERATED_KEYS);


            preparedStatement.setString(1, groupMaster.getName());
            preparedStatement.setString(2, groupMaster.getCountry());
            preparedStatement.setString(3, groupMaster.getTown());
            preparedStatement.setString(4, groupMaster.getPincode());
            preparedStatement.setString(5, groupMaster.getLoginId());
            preparedStatement.setString(6, groupMaster.getEmail());
            preparedStatement.setString(7, groupMaster.getPassword());


            result = preparedStatement.executeUpdate();
            ResultSet resultset = preparedStatement.getGeneratedKeys();
            if (null != resultset && resultset.next()) {
                int id = resultset.getInt(1);
                groupMaster.setId(id);
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
    public void modifyGroupMaster(GroupMaster groupMaster) {
    }

    @Override
    public GroupMaster findById(int id) {
        GroupMaster groupMaster = new GroupMaster();
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = ConnectionManager.getConnection();
            String SELECT_GROUP_M_SQL = "SELECT id,NAME,country,town,pincode,login_id,email,PASSWORD,audit_created_dttm,audit_updated_dttm " + "FROM  groupmicrofin.group_masters WHERE id = ?";
            preparedStatement = conn.prepareStatement(SELECT_GROUP_M_SQL);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet != null && resultSet.next()) {
                groupMaster.setId(resultSet.getInt(1));
                groupMaster.setName(resultSet.getString(2));
                groupMaster.setCountry(resultSet.getString(3));
                groupMaster.setTown(resultSet.getString(4));
                groupMaster.setPincode(resultSet.getString(5));
                groupMaster.setLoginId(resultSet.getString(6));
                groupMaster.setEmail(resultSet.getString(7));
                groupMaster.setPassword(resultSet.getString(8));
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
        return groupMaster;
    }

}
