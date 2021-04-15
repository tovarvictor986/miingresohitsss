package com.miingresohitss.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public Connection Conectar() throws SQLException{
        String dbURL = "jdbc:derby://localhost:1527/sample;create=true";
        String user = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(dbURL, user, password);
        if (conn != null) {
            System.out.println("Connected to database");
        }
        return conn;
    } 
}
