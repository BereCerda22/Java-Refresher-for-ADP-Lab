package com.simple.account;
public class BankAccount implements Account {
    private int accountID;
    private String ownerName;
    private float balance;
    private static float interestRate;

    public BankAccount(int accountID, String ownerName, float balance) {
        super();
        this.accountID = accountID;
        this.ownerName = ownerName;
        setBalance(balance);
    }


    public void deposit(float amount) {
        balance = balance + amount;
    }
    public void setAccountID(int newID) {
        this.accountID = newID;
    }
    public int getAccountID() {
        return this.accountID;
    }
    public void setOwnerName(String newName) {
        this.ownerName = newName;
    }
    public String getOwnerName() {
        return this.ownerName;
    }
    public void setBalance(float balance) {
        if(balance > 0f) {
            this.balance = balance;
        } else {
            System.out.println("Error. Balance cannot be negative.");
        }
    }
    public float getBalance() {
        return this.balance;
    }
    public static float getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(float interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void print() {
        System.out.println("\nAn Account");
        System.out.println("Account ID:" + this.getAccountID());
        System.out.println(" Owner:" + this.getOwnerName());
        System.out.println(" Balance:" + this.getBalance());
    }

    @Override
    public String toString() {
        return "An account with id " + this.getAccountID() +
                " with balance " + this.getBalance() +
                " owned by " + this.getOwnerName();
    }

    public void withdraw(float amount) throws InsufficientFundsException {
        if (amount > this.getBalance() ) {
            throw new InsufficientFundsException("Amount " +
                    amount + " exceeds balance " + this.getBalance());
        }
        this.setBalance(this.getBalance() - amount);
    }





}
