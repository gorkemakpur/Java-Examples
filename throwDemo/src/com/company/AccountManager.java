package com.company;

public class AccountManager
{
    private double balance;
    public void deposite(double amount)
    {
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws BalanceInsufficentException {
        if(balance>=amount)
        {
        balance = getBalance() - amount;
        }
        else
        {
            throw new BalanceInsufficentException("Yetersiz bakiye");
        }
    }


    public double getBalance() {
        return balance;
    }
}
