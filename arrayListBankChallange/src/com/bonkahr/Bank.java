package com.bonkahr;

import java.util.ArrayList;

public class Bank {
    private  Branch branch;
    private final String bankName;
    private final ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName)== null){
            this.branches.add(new Branch(branchName));
            System.out.println("Branch " + branchName + " added");
            return true;
        }
        System.out.println("Branch already exists");
        return false;
    }

    public boolean addCustomer(String branchName,
                               String customerName,
                               double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName,initialAmount);
        }
        System.out.println("Branch, "  + branchName +" doesn't exist");
        System.out.println("Add the branch," + branchName);
        return false;
    }

    public boolean addCustomerTransaction(String branchName,
                                          String customerName,
                                          double amount){
        Branch branch = findBranch(branchName);
        boolean found = branch.findCustomers(customerName);
        if (found) {
            System.out.println("Added " + amount + " to account " + customerName);
            return branch.addCustomerTransaction(customerName, amount);
        }else {
            System.out.println("Customer doesn't exist");
            return false;
        }
    }

    public boolean listCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if (branch != null){
            System.out.println("Customer for branch " +branch.getBranchName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++){
               Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName()
                        + "[" + (i+1) + "]");
                if (showTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println("[" +(j +1) + "] Amount"
                                + transactions.get(j));
                    }
                }

            }
            return true;
        }else {
            System.out.println("No branch named " + branchName);
            return false;
        }
    }

    private Branch findBranch(String branchName){
        for (Branch checkedBranch : branches) {
            if (checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }
}
