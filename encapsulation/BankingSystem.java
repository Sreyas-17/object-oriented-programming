package com.bridgelabz.encapsulation;

interface Loanable{
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
abstract class BankAccount{
    private long accountNumber;
    private String accountHolder;
    protected double balance;

    public BankAccount(long accountNumber, String accountHolder,double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance=balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<balance) {
            System.out.println("Withdrawing amount: "+amount);
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }
    abstract void calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable{
    private int interestRate=5;
    public SavingsAccount(int accountNumber, String accountHolder,double balance) {
        super(accountNumber, accountHolder,balance);
    }

    public void calculateInterest(){
        balance += balance*interestRate/100;
    }

    public void applyForLoan(double amount){
        if(amount<calculateLoanEligibility()) {
            System.out.println("Taking loan of amount: "+amount);
            System.out.println("Loan is applied through savings account");
        }
    }

    public double calculateLoanEligibility(){
        return 2*balance;
    }
}
class CurrentAccount extends BankAccount implements Loanable{
    private int overdraftLimit=15000;
    public CurrentAccount(int accountNumber, String accountHolder,double balance) {
        super(accountNumber, accountHolder,balance);
    }

    public void calculateInterest(){
        System.out.println("Interest is not applicable for current account");
    }

    public void withdraw(double amount){
        if(amount<balance+overdraftLimit) {
            System.out.println("Withdrawing amount: "+amount);
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance amount can't be withdrawn");
        }
    }

    public void applyForLoan(double amount) {
        if (amount < calculateLoanEligibility()) {
            System.out.println("Taking loan of amount: "+amount);
            System.out.println("Loan is applied through current account");
        }
        else{
            System.out.println("Loan is not applicable");
        }
    }

    public double calculateLoanEligibility(){
        return balance+overdraftLimit;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(3212245, "Ravi", 200000);
        BankAccount currentAccount = new CurrentAccount(2165577, "Ravi", 150000);

        System.out.println("\nSavings account details: ");
        savingsAccount.displayDetails();
        savingsAccount.calculateInterest();

        System.out.println("Balance after adding interest rate: " + savingsAccount.balance);
        System.out.println("Loan Eligibility upto: " + ((Loanable) savingsAccount).calculateLoanEligibility());
        ((Loanable) savingsAccount).applyForLoan(20000);
        savingsAccount.calculateInterest();
        savingsAccount.withdraw(10000);

        System.out.println("Balance after withdrawal: " + savingsAccount.balance);

        System.out.println("\nCurrent account details: ");
        currentAccount.displayDetails();
        currentAccount.calculateInterest();

        System.out.println("Balance after adding interest rate: " + currentAccount.balance);
        System.out.println("Loan Eligibility upto: " + ((Loanable) currentAccount).calculateLoanEligibility());
        ((Loanable) currentAccount).applyForLoan(30000);
        currentAccount.calculateInterest();
        currentAccount.withdraw(25000);

        System.out.println("Balance after withdrawal: " + currentAccount.balance);
    }
}
