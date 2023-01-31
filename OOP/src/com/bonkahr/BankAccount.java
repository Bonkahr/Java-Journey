package com.bonkahr;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds) {
        balance += funds;
        System.out.println("you deposited $" + funds +
                " balance $" + balance);
    }

    public void withdrawFunds(double withdrawal) {
        if (withdrawal > balance) {
            System.out.println("insufficient funds balance is $"
                    + balance);
        } else {
            balance -= withdrawal;
            System.out.println("withdrawn $" + withdrawal
                    + " balance is $" + balance);
        }

    }
}
