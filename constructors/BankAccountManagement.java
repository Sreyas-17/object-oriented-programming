package com.bridgelabz.constructors;

import java.util.Scanner;

class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setOrModifyBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(long accountNumber, String accountHolder) {
        super(accountNumber, accountHolder);
    }

    public void displayDetails() {
        System.out.println("\nAccount Number accessed using super: " + super.accountNumber);
        System.out.println("Account Holder accessed using super from parent class: " + super.accountHolder);
        System.out.println("Balance is accessed using setters and getters: " + getBalance());
    }
}
public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter account number: ");
        long accountNumber=scanner.nextLong();
        System.out.println("Enter account holder: ");
        String accountHolder=scanner.next();
        System.out.println("Enter balance: ");
        double balance=scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(accountNumber, accountHolder);
        account.setOrModifyBalance(balance);;

        account.displayDetails();

        System.out.println("\nEnter new balance to modify: ");
        account.setOrModifyBalance(scanner.nextDouble());

        System.out.println("Account details after modifying balance: ");
        account.displayDetails();

    }
}