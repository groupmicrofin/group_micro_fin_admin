package com.groupmicrofin.admin.repository;

import com.groupmicrofin.admin.model.GroupMaster;
import com.groupmicrofin.util.ConnectionManager;

import java.sql.*;

    public class GroupMasterRepositoryMSImpl implements GroupMasterRepository {


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

        public void modifyGroupMaster(GroupMaster groupMaster) {

    }
        public int findGroupMaster(int id){
            Connection conn = null;
            PreparedStatement preparedStatement = null;
            int result = 0;
            try {
                conn = ConnectionManager.getConnection();
                String SELECT_GROUP_M_SQL = "SELECT  * FROM  groupmicrofin.group_masters (WHERE id=='1')";
                preparedStatement = conn.prepareStatement( SELECT_GROUP_M_SQL);

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

    }
