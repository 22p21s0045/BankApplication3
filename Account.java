/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication3;

/**
 *
 * @author Student
 */
public class Account {

    private int number;
    private String name;
    private double balance;

    public Account(int number, String name, double balance) {
        this.balance = balance;
        this.name = name;
        this.number = number;

    }

    public void deposit(double amount) {
        this.balance += amount;

    }
    public void withdraw(double amount){
        this.balance -= amount;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

}
