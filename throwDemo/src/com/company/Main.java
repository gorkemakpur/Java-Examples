package com.company;

public class Main {

    public static void main(String[] args)
    {
        AccountManager manager = new AccountManager();
        manager.deposite(100);
        System.out.println("Hesap Bakiyeniz: "+manager.getBalance());
        try {
            manager.withdraw(23);
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap Bakiyeniz: "+manager.getBalance());
        try {
            manager.withdraw(93);
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap Bakiyeniz: "+manager.getBalance());
    }
}
