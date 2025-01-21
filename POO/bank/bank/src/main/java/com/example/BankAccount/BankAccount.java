package com.example;


public class BankAccount {
    protected int accountNumber;
    protected double balance;

    protected BankAccount(double balance) {
        this.balance = balance;

    }
    
    public boolean transfer(double amount, BankAccount otherAccount) {
        balance -= amount;
        otherAccount.balance += amount;
        return true;

    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalanced() {
        return balance;
    }
    public String getType() {
        return "Basic account";
    }

}



