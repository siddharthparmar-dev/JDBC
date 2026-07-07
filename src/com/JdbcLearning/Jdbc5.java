package com.JdbcLearning;

import java.sql.*;

public class Jdbc5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String user = "root";
        String pass = "S!dd#@rt#";
        Connection connection = DriverManager.getConnection(url,user,pass);
        String sql = "SELECT * FROM studentinfo WHERE id >= 2";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String age = resultSet.getString(3);
            String city = resultSet.getString(4);
            System.out.println("id:"+id+", name:"+name + ", age:"+age+", city:"+city);
        }
    }
}
