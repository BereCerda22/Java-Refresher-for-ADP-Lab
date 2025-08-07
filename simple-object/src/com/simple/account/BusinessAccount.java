package com.simple.account;

public class BusinessAccount implements Account {

    private float balance;
    private int accountID;
    private String companyName;
    private String companyAddress;



    public BusinessAccount(float balance, int accountID, String companyName, String
            companyAddress) {
        this.balance = balance;
        this.accountID = accountID;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public float getBalance() {
        return this.balance;
    }

    public int getAccountID() {
        return this.accountID;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setAccountIDint(int accountID) {
        this.accountID = accountID;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }





    public String toString() {
        return "A BusinessAccount belonging to " + this.getCompanyName()
                + " with balance " + this.getBalance();
    }




    public void deposit(float amount) {
        this.setBalance(this.getBalance() + amount);
    }









    public void withdraw(float amount) throws InsufficientFundsException {
        if (amount > this.getBalance() ) {
            throw new InsufficientFundsException("Amount " + amount +
                    " exceeds balance " + this.getBalance());
        }
        this.setBalance(this.getBalance() - amount);
    }







}
