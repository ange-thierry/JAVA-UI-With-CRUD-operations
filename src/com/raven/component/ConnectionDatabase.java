package com.raven.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    String name = "root";
    String url = "jdbc:mysql://localhost:3306/comment";
    String password = System.getenv("DB_PASSWORD");
    String Driver = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        ConnectionDatabase conn = new ConnectionDatabase();
        conn.getConnection();
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            if (password == null || password.isEmpty()) {
                throw new SQLException("DB_PASSWORD environment variable is not set.");
            }
            Class.forName(Driver);
            con = DriverManager.getConnection(url, name, password);
            System.out.println("Connected successfully");
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
