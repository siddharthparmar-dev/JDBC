package com.JdbcLearning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCPreparedStatement {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = JdbcUtil.getConnection();
            String Query = "INSERT INTO studentinfo(id,sname,age,city) VALUES(?,?,?,?)";
            preparedStatement = connection.prepareStatement(Query);

            System.out.println("Please enter your credentials");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your ID");
            int id = scan.nextInt();
            System.out.println("Enter your name");
            String name = scan.next();
            System.out.println("Enter your age");
            int age = scan.nextInt();
            System.out.println("Enter your city");
            String city = scan.next();
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, city);
            int rowsaffectted = preparedStatement.executeUpdate();
            if(rowsaffectted == 0){
                System.out.println("Unable to insert data");
            }else {
                System.out.println("Successfully inserted data");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            JdbcUtil.endConnection(connection,preparedStatement);
        }
    }
}
