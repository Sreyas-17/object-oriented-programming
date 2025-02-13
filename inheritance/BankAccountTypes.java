package com.bridgelabz.inheritance;

class BankAccount{
    private int accountNumber;
    private float balance;

    public BankAccount(int accountNumber, float balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void displayDetails(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}
class SavingsAccount extends BankAccount{
    private float interestRate;

    public SavingsAccount(int accountNumber, float balance, float interestRate){
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }

    public void displayAccountType(){
        System.out.println("\nSavings Account Details");
        System.out.println("Interest rate: "+interestRate);
    }
}
class CheckingAccount extends BankAccount{
    private float withdrawalLimit;

    public CheckingAccount(int accountNumber, float balance, float withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit=withdrawalLimit;
    }

    public void displayAccountType(){
        System.out.println("\nChecking Account Details");
        System.out.println("Withdrawal limit: "+withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount{
    private int depositPeriod;

    public FixedDepositAccount(int accountNumber, float balance, int depositPeriod){
        super(accountNumber, balance);
        this.depositPeriod=depositPeriod;
    }

    public void displayAccountType(){
        System.out.println("\nFixed Deposit Account Details");
        System.out.println("Deposit period: "+depositPeriod);
    }
}
public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount(1, 1000, 5);
        savingsAccount.displayAccountType();
        savingsAccount.displayDetails();

        CheckingAccount checkingAccount=new CheckingAccount(1, 1000, 10000);
        checkingAccount.displayAccountType();
        checkingAccount.displayDetails();

        FixedDepositAccount fixedDepositAccount=new FixedDepositAccount(1, 1000, 3);
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayDetails();
    }
}
