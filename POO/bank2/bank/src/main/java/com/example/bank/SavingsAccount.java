package com.example.bank;

public class SavingsAccount extends BankAccount {
    protected float interestRate;

    public SavingsAccount(double balance, float interestRate) {
        super(balance);
        int random = (int) (Math.random()*1000000);
        this.accountNumber = "SA" + random;
        this.interestRate = interestRate;
    }

    
    public void addInterestRate() {
        this.balance += interestRate this.balan<ce;
    }

    public float getInterestRate() {
        return this.interestRate;
    }
    @Override
    public boolean transfer(double amount, BankAccount otherAccount) {
        if(this.balance > amount) {
            return super.transfer(amount, otherAccount);
        }
        return false;
    }
    @Override
    public String getType() {
        return "Saving Account";
    }
}