package com.bridgelabz.objectModelling;

import java.util.ArrayList;
//Customer class, to store customer details
class Customer {
    private String name;
    private int balance;
    private Bank bank;  // Link to the Bank (Association)

    Customer(String name, int balance, Bank bank) {
        this.name = name;
        this.balance = balance;
        this.bank = bank;
        bank.openAccount(this); // Automatically associate with the bank
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void viewBalance() {
        System.out.println(name + "'s balance: " + balance);
    }

    public String getBank() {
        return bank.getBankName();
    }
}

//Bank class, to store multiple customers
class Bank {
    private String bankName;
    private ArrayList<Customer> customerList;

    Bank(String bankName) {
        this.bankName = bankName;
        this.customerList = new ArrayList<>();
    }
    public void openAccount(Customer customer) {
        customerList.add(customer);
    }
    public void displayCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer customer : customerList) {
            System.out.println(customer.getName() + "  Balance: " + customer.getBalance());
        }
    }
    public String getBankName() {
        return bankName;
    }
}

public class BankAndAccountHolders {
    public static void main(String[] args) {

        //Creating bank object
        Bank bankOne = new Bank("ICICI");
        Bank bankTwo = new Bank("SBI");

        // Creating customers and associating them with banks
        Customer customerOne = new Customer("Ravi", 10000, bankOne);
        Customer customerTwo = new Customer("Suresh", 20000, bankOne);
        Customer customerThree = new Customer("Harry", 30000, bankTwo);

        // Displaying bank customers
        bankOne.displayCustomers();
        bankTwo.displayCustomers();

        // Checking balance
        System.out.println("\nChecking individual balances:");
        customerOne.viewBalance();
        customerTwo.viewBalance();
        customerThree.viewBalance();

        //To get bank details of customers
        System.out.println("\nCustomer one has an account in bank : "+customerOne.getBank());
        System.out.println("Customer two has an account in bank : "+customerTwo.getBank());
        System.out.println("Customer three has an account in bank : "+customerThree.getBank());
    }
}
