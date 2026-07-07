package com.JdbcLearning;

import java.sql.*;

public class Jdbc4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String user = "root";
        String password = "S!dd#@rt#";
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM studentinfo";
        boolean status = stmt.execute(sql);
        if (status) {
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String city = rs.getString("city");
                System.out.println("id:"+id+", age:"+age+", city:"+city);
            }
        }else {
            int rows = stmt.getUpdateCount();
            if (rows==0) {
                System.out.println("operation failed");
            }else  {
                System.out.println("operation success");
            }
        }
    }
}
