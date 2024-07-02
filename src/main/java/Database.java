/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

import java.sql.*;
public class Database {
    
    public static void main(String[] args) {
        String host = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "root";
        try {
            Connection conn = DriverManager.getConnection(host, username, password);
            System.out.println("Connected to MySQL database");
        } catch (SQLException e) {
            System.out.println("Failed to connect to MySQL database");
            e.printStackTrace();
        }
    }
    
}
