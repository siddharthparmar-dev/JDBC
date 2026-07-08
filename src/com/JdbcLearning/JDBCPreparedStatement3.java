package com.JdbcLearning;

import java.sql.*;
import java.util.Scanner;

public class JDBCPreparedStatement3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection con = null;
        PreparedStatement pst = null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_db";
            String user = "root";
            String password = "S!dd#@rt#";

            con = DriverManager.getConnection(url,user,password);

            String SQLQuery = "SELECT * FROM studentinfo";

            pst = con.prepareStatement(SQLQuery);

            ResultSet resultSet = pst.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String city = resultSet.getString(4);
                System.out.println("ID: "+id+", Name: "+name+", Age: "+age+", City: "+city);
            }

        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            pst.close();
            con.close();
            System.out.println("Goodbye!");
        }
    }
}
