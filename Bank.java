/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication3;

/**
 *
 * @author Student
 */
public class Bank {
    private String name;
    public Bank(String name){
        this.name = name;
    }
    public void openAccount(Account account){
        
    }
    public void listAccounts(){
        
    }
    public void closeAccount(int number){
        
    }
    public void depositMoney(Account account,double amount){
        account.deposit(amount);
        
    }
    public void withdrawMoney(Account account,double amount){
        account.deposit(amount);
        
    }
    public Account getAccount(int number){
        String accname = "John";
        double balance = 500;
        Account account = new Account(number,name,balance);
        return account;
    }
    
    
}
