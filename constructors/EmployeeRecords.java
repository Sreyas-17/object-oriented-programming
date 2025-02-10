package com.bridgelabz.constructors;

import java.util.Scanner;

class Employee{
    public int employeeID;
    public String department;
    private int salary;
    Employee(int employeeID, String department) {
        this.employeeID = employeeID;
        this.department = department;
    }
    public int getSalary(){
        return salary;
    }
    public void setOrModifySalary(int salary){
        this.salary = salary;
    }
}
class Manager extends Employee{
    public Manager(int employeeID, String department) {
        super(employeeID, department);
    }
    public void displayDetails(){
        System.out.println("\nEmployee ID accessed using super: " + employeeID);
        System.out.println("Department accessed using super from parent class: " + department);
        System.out.println("Salary accessed using setter and getter: "+getSalary());
    }
}
public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int employeeID = scanner.nextInt();
        System.out.println("Enter Department Name: ");
        String department = scanner.next();
        System.out.println("Enter Salary: ");
        int salary = scanner.nextInt();
        Manager manager = new Manager(employeeID, department);
        manager.setOrModifySalary(salary);
        manager.displayDetails();

        System.out.println("\nEnter new salary to modify: ");
        int newSalary = scanner.nextInt();
        manager.setOrModifySalary(newSalary);
        System.out.println("\nDetails after modifying salary: ");
        manager.displayDetails();
    }
}
