package com.bonkahr;

import java.util.ArrayList;

public class Branch {

    private final String branchName;
    private final ArrayList<Customer> customers;  /*= new ArrayList<>();*/

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (findCustomer(customerName) != null){
            assert existingCustomer != null;
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for (Customer checkedCustomer : customers) {
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    public boolean findCustomers(String customerName){
        for (Customer checkedCustomer : customers) {
            if (checkedCustomer.getName().equals(customerName)) {
                return true;
            }
        }
        return false;
    }


    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
