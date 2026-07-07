package com.JdbcLearning;

import java.sql.*;

public class Jdbc3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","S!dd#@rt#");
        System.out.println("connection established");
        Statement stmt = conn.createStatement();
        String sql = "SELECT id,age,city FROM studentinfo";
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            int id = result.getInt("id");
            int age = result.getInt("age");
            String city = result.getString("city");
            System.out.println("id:"+id+", age:"+age+", city:"+city);
        }
    }
}
