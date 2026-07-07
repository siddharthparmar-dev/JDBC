package com.JdbcLearning;

import java.sql.*;
public class JdbcDbConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Class.forName() load a class in JVM memory

        //Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Establish the connection
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String user = "root";
        String password = "S!dd#@rt#";
        Connection connection = DriverManager.getConnection(url,user,password);
        System.out.println("Connected to database successfully");

        //creating statement
        Statement statement = connection.createStatement();

        //execute query
        String sql = "INSERT INTO studentinfo(id,sname,sage,scity) VALUES(2,'Rohit',24,'Pune'),(3,'Piyush',25,'Jaipur')";
        int rowsAffected = statement.executeUpdate(sql);
        //process the result
        if (rowsAffected == 0) {
            System.out.println("Failed to insert record into database successfully");
        }
        else {
            System.out.println("Successfully inserted record into database successfully");
        }
        //close the resources
        statement.close();
        connection.close();
    }
}
