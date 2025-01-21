package com.example.bank;


public class BankAccount {
    protected String accountNumber;
    protected double balance;

    protected BankAccount(double balance) {
        this.balance = balance;

    }
    
    public boolean transfer(double amount, BankAccount otherAccount) {
        balance -= amount;
        otherAccount.balance += amount;
        return true;

    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalanced() {
        return balance;
    }
    public String getType() {
        return "Basic account";
    }

}



