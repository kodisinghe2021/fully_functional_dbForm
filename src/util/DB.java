/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Kasun
 */
public class DB {

    private static Connection c;

    public static Connection getConnection() throws Exception {
        if (c == null || c.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/masterinedu?autoReconnect=true","root", "");
        }
        return c;
    }

    public static synchronized void update(String sql) throws Exception {
        getConnection().createStatement().executeUpdate(sql);

    }

    public static synchronized ResultSet query(String sql) throws Exception {
        return getConnection().createStatement().executeQuery(sql);
    }
}

