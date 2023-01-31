package com.bonkahr;
//
// You job to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("KCB");

        bank.addBranch("Nairobi");

        bank.addCustomer("Nairobi", "James", 450.50);
        bank.addCustomer("Nairobi", "Daniel", 230.45);
        bank.addCustomer("Nairobi", "Mercy", 345.9);

        bank.addBranch("Kisumu");
        bank.addCustomer("Kisumu","Dankun", 348.90 );

        bank.addCustomerTransaction("Nairobi", "James", 234.8);
        bank.addCustomerTransaction("Nairobi", "Daniel", 567.54);

    }
}
