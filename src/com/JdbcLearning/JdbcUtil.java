package com.JdbcLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String user = "root";
        String password = "S!dd#@rt#";
        return DriverManager.getConnection(url,user,password);
    }

    public static void endConnection(Connection connection, Statement statement) throws SQLException {
        connection.close();
        statement.close();
    }
}
