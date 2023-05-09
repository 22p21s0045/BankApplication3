/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
c
/**
 *
 * @author Student
 */
public class BankConnection {

    public static Connection connect()  {
    try {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "mysql@sit";
//        String sql = "INSERT INTO account(accID,accName,accBalance) VALUES (1, 'John', 1000.00)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(BankConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Database connected");
        Statement statement;
        try {
            statement = connection.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(BankConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection; // add this line
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(BankConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null; // add this line as a fallback
}
}
