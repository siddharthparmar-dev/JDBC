package com.JdbcLearning;

import java.sql.*;
import java.util.Scanner;

public class JDBCPreparedStatement2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection con = null;
        PreparedStatement pst = null;

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc_db";
            String user = "root";
            String password = "S!dd#@rt#";

            con = DriverManager.getConnection(url,user,password);

            String SQLQuery = "UPDATE studentinfo SET city = ? WHERE id = ?";

            pst = con.prepareStatement(SQLQuery);

            System.out.println("please enter new city below:");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your City");
            String city = sc.nextLine();
            System.out.println("Enter your ID");
            int id = sc.nextInt();

            pst.setString(1,city);
            pst.setInt(2,id);

            int rowsChanged = pst.executeUpdate();

            if (rowsChanged == 0){
                System.out.println(rowsChanged + " rows affected. ");
            }
            else  {
                System.out.println(rowsChanged + " rows affected.");
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
