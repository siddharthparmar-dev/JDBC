package com.JdbcLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","S!dd#@rt#");
        System.out.println("connection established");
        Statement stmt = conn.createStatement();
        String sql = "ALTER TABLE studentinfo RENAME COLUMN scity TO age";
        int rowsAffected = stmt.executeUpdate(sql);
        if (rowsAffected > 0) {
            System.out.println("rows affected");
        }else  {
            System.out.println("rows not affected");
        }
    }
}
