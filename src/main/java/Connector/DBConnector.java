package Connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector
{

    private Connection conn = null;

    //Constants
    private static final String IP = "46.101.158.228";
    private static final int PORT = 3306;
    public static final String DATABASE = "CupcakeWebshop";
    private static final String USERNAME = "testuser";
    private static final String PASSWORD = "password123";

    public DBConnector() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
        this.conn = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
    }

    public Connection getConnection()
    {
        return this.conn;
    }
}
