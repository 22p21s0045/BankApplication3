/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapplication3;

import bankingapplication3.BankConnection;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Student
 */
public class Bankingapplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = 0;
        String name;
        double balance;
        Account account;
        int number;
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank("SCB");

        // TODO code application logic here
        while (option != 6) {
            System.out.println("Main menu");
            System.out.println("1.Disaplay all account");
            System.out.println("2.Open new Accounts");
            System.out.println("3.Close Existing Account");
            System.out.println("4.Deposit money");
            System.out.println("5.withdraw money");
            System.out.println("6.Exit");

            System.out.println("");

            System.out.println("Enter your choice: ");
            option = scan.nextInt();
//            scan.nextInt();
            switch (option) {
                case 1:
                    bank.listAccounts();
                    break;

                case 2:
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(1000) + 1;

                    System.out.println("Enter Account name: ");
                    name = scan.nextLine();
                    scan.nextLine();
                    System.out.println(name);
                    System.out.println("Enter Initial Balance: ");
                    balance = scan.nextDouble();
                    System.out.println(balance);

                    account = new Account(randomNumber, name, balance);
                    bank.openAccount(account);
                    break;
                case 3:
                    System.out.println("Enter account number: ");
                    number = scan.nextInt();

                    bank.closeAccount(number);
                    break;
                case 4:
                    System.out.println("Enter Amount: ");
                    double amount = scan.nextDouble();
                    number = 111;
                    System.out.println("Enter Account Number:");
                    account = bank.getAccount(number);
                    bank.depositMoney(account, amount);
                    break;
                case 5:
                    System.out.println("Enter Amount: ");
                    double amounts = scan.nextDouble();
                    number = 1111;
                    System.out.println("Enter Account Number:");
                    account = bank.getAccount(number);
                    bank.withdrawMoney(account, amounts);

            }

        }
    }

}
