package com.groupmicrofin.util;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {

    @Test
    public void testDBConnection(){
        Connection conn = ConnectionManager.getConnection();
        Assert.assertNotNull(conn);
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
