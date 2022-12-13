package com.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager
{
    private static String url;
    private static String username;
    private static String password;
    private static Connection connection;

    public static Connection getConnection()
    {
        if (connection != null)
        {
            return connection;
        }

        url = System.getenv("db.url");
        username = System.getenv("db.username");
        password = System.getenv("db.password");

        try
        {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return connection;
    }
}
