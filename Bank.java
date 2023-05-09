/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
/**
 *
 * @author Student
 */
public class Bank {

    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Account account) {
        Connection connection = BankConnection.connect();
String sql = "INSERT INTO account(accID,accName,accBalance) values(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,String.valueOf(account.getNumber()));
            preparedStatement.setString(2, String.valueOf(account.getName()));
            preparedStatement.setString(3, String.valueOf(account.getBalance()));
            Statement statement = connection.createStatement();
//            ResultSet results = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Statement statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listAccounts() {
        try {
            Connection connection = BankConnection.connect();
            String sql = "select * from account";
            Statement statement = connection.createStatement();
            try {
                statement = connection.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
            }
            ResultSet results = statement.executeQuery(sql);
            while (results.next()) {
                System.out.println(results.getString(1) + " " + results.getString(2) + " " + results.getString(3)
                );

            }

        } catch (SQLException ex) {
            Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void closeAccount(int number) {

    }

//    public void openAccount(String name, double balance) {
//        
//        Connection connection = BankConnection.connect();
//        
//    }

    public void depositMoney(Account account, double amount) {
        account.deposit(amount);

    }

    public void withdrawMoney(Account account, double amount) {
        account.deposit(amount);

    }

    public Account getAccount(int number) {
        String accname = "John";
        double balance = 500;
        Account account = new Account(number, name, balance);
        return account;
    }

}
