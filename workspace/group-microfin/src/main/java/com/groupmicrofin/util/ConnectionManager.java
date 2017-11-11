package com.groupmicrofin.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {

    private static Properties properties;

    static {
        properties = new Properties();

        try {
            InputStream inputStream = ConnectionManager.class
                    .getClassLoader().getResourceAsStream("Application.properties");
            properties.load(inputStream );
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public static Connection getConnection() {
        Connection conn = null;
        try {
            String driverClass = "com.mysql.jdbc.Driver";
            String dbURL = properties.getProperty("DB_URL");
            String dbUserName = properties.getProperty("DB_USER_NAME");
            String dbPassword = properties.getProperty("DB_PASSWORD");
            Class.forName(driverClass);
            conn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Fire Insert SQL
        //Perform commit
        return conn;
    }

}


