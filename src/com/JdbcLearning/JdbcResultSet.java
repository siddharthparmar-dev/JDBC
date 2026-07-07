package com.JdbcLearning;

import java.sql.*;

public class JdbcResultSet {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Statement statement = null;
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc_db";
            String user = "root";
            String pass = "S!dd#@rt#";
            connection = JdbcUtil.getConnection();
            String sql = "SELECT * FROM studentinfo WHERE id >= 2";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String age = resultSet.getString(3);
                String city = resultSet.getString(4);
                System.out.println("id:" + id + ", name:" + name + ", age:" + age + ", city:" + city);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
               JdbcUtil.endConnection(connection,statement);
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
