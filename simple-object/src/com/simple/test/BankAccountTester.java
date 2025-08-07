package com.simple.test;
import com.simple.account.BankAccount;
import com.simple.account.InsufficientFundsException;
import com.simple.account.SavingsAccount;

public class BankAccountTester {
    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount account = new BankAccount(1, "Jeff Lebowski", 100f);
        BankAccount account2 = new BankAccount(2, "Bunny Lebowski", 5000f);
        BankAccount account3 = new BankAccount(3, "Walter Sobcheck", 1000000f);
        SavingsAccount sAccount = new SavingsAccount(3, "Donny K", 1f);
        System.out.println(account);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(sAccount);


        try {
            account.withdraw(200f);
        } catch (InsufficientFundsException e) {
            System.out.println("There was an error withdrawing funds");
            System.out.println(e.getMessage());
        }

    }





}
