package com.example.bank;

public class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
        this.accountNumber = String.format("CA%d", random)
        int random = (int) (Math.random() * 1000000);

    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}

    

