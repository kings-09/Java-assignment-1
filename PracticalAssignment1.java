/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicalassignment1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user
 */
// Abstract class
abstract class Bank{
    protected String accountName;
    protected double balance;
    
    public Bank(String accountName, double balance){
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
    
    //method to record transactions
    protected void recordTransaction(String transaction){
        try(FileWriter writer = new FileWriter("Bank.txt", true)){
            writer.write(transaction + "\n");
        }
        catch(IOException e){
            System.out.println("Error writing to file: "+ e.getMessage());
        }
    }
}

//Account class
class Account extends Bank{
    public Account(String accountName, double balance){
        super(accountName, balance);
    }
    
    @Override
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: "+ amount);
            recordTransaction("Deposited: "+ amount + ", Balance: "+ balance);
        }
        else{
            System.out.println("Deposited amount must be greater than 0");
        }
    }
    
    @Override
    public void withdraw(double amount){
        if(amount <= balance && amount > 0){
            balance -= amount;
            System.out.println("Withdrawn: "+ amount);
            recordTransaction("Withdrawn: "+ amount +", Balance; "+ balance);
        }
        else{
            System.out.println("Withdrawal amount exceeded account balance");
            recordTransaction("Failed Withdrawal: "+ amount +", Balance: "+ balance);
        }
    }
    
    @Override
    public double getBalance(){
        System.out.println("Current Balance: "+ balance);
        recordTransaction("Checked Balance: "+ balance);
        return balance;
    }
}

// Testing Class
public class PracticalAssignment1 {

    public static void main(String[] args) {
        Account acc = new Account("King Chanda", 1000);
        
        acc.deposit(200);
        acc.withdraw(100);
        acc.withdraw(1500);
        acc.getBalance();
    }
}

