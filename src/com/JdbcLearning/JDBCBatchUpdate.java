package com.JdbcLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCBatchUpdate {
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

//            System.out.println("please enter new city below:");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter your City");
//            String city = sc.nextLine();
//            System.out.println("Enter your ID");
//            int id = sc.nextInt();

            pst.setString(1,"Raipur");
            pst.setInt(2,1);
            pst.addBatch();
            pst.setString(1,"ShriNagar");
            pst.setInt(2,2);
            pst.addBatch();

            pst.executeBatch();

            System.out.println("check Database to see results");
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
