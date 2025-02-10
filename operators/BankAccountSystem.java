package com.bridgelabz.operators;

class BankAccount {
    static String bankName="ICICI";
    String accountHolderName;
    final int accountNumber;
    static int totalAccounts=0;
    BankAccount( String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    public static void getTotalAccounts() {
        System.out.println("\nTotal number of accounts is :"+totalAccounts);
    }
    public void displayDetails() {
    System.out.println("Bank Name is :"+bankName);
    System.out.println("Account Holder Name is :"+accountHolderName);
    System.out.println("Account Number is :"+accountNumber);}
}
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount bankAccountOne = new BankAccount( "Ravi", 1001);
        BankAccount bankAccountTwo = new BankAccount( "Suresh", 1002);
        BankAccount bankAccountThree = new BankAccount( "Harry", 1003);
        System.out.println("\nIs bankAccountOne object is instance of BankAccount class:"+(bankAccountOne instanceof BankAccount));
        System.out.println("Details of first account:");
        bankAccountOne.displayDetails();
        System.out.println("\nIs bankAccountTwo object is instance of BankAccount class:"+(bankAccountTwo instanceof BankAccount));
        System.out.println("Details of second account:");
        bankAccountTwo.displayDetails();
        System.out.println("\nIs bankAccountThree object is instance of BankAccount class:"+(bankAccountThree instanceof BankAccount));
        System.out.println("Details of third account:");
        bankAccountThree.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
