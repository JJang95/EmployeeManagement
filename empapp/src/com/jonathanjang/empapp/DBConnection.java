package com.jonathanjang.empapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnection() {
            try {
                //load driver
                Class.forName("com.mysql.jdbc.Driver");
                //get connection
                String url = "jdbc:mysql://localhost:3306/employeeDB";
                String username = "root";
                String password = "root_password_1234";
                con = DriverManager.getConnection(url,username,password);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        return con;
    }
}