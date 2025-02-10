package com.bridgelabz.operators;

class EmployeeDetails {
    static String companyName="BridgeLabz";
    String name;
    final int id;
    String designation;
    static int totalEmployees=0;
    EmployeeDetails(String name, int id, String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployees++;
    }
    public void displayDetails() {
        System.out.println("company name: "+companyName);
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee designation: "+designation);
    }
    public static void displayTotalEmployees() {
        System.out.println("\nTotal employees in the company is :"+totalEmployees);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeDetails employeeOne = new EmployeeDetails( "Ravi", 1001, "Manager");
        EmployeeDetails employeeTwo = new EmployeeDetails( "Suresh", 1002, "Developer");
        EmployeeDetails employeeThree = new EmployeeDetails( "Harry", 1003, "Tester");
        System.out.println("\nIs employeeOne object is instance of EmployeeDetails class:"+(employeeOne instanceof EmployeeDetails));
        employeeOne.displayDetails();
        System.out.println("\nIs employeeTwo object is instance of EmployeeDetails class:"+(employeeTwo instanceof EmployeeDetails));
        employeeTwo.displayDetails();
        System.out.println("\nIs employeeThree object is instance of EmployeeDetails class:"+(employeeThree instanceof EmployeeDetails));
        employeeThree.displayDetails();
        EmployeeDetails.displayTotalEmployees();
    }
}
