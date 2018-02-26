package com.mycompany.cupcakewebshop;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author emilv
 */
public class DataAccessObject {

    private final DBConnector conn;

    public DataAccessObject() throws Exception
    {
        this.conn = new DBConnector();
    }

    public User getUser(String name) throws SQLException 
    {
        Statement stmt = conn.getConnection().createStatement();
        String sql = "select * from login where name = " + "'" + name + "';";
        User user = null;
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next())
        {
            String username = rs.getString("username");
            String password = rs.getString("password");
            int balance = rs.getInt("balance");
            user = new User(username, password, balance);
        }
        return user;
    }
    
}