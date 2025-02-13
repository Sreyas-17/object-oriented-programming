package com.bridgelabz.inheritance;

class Employee {
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee{

    private int teamSize;

    public Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("Manager Details:");
        super.displayDetails();
        System.out.println("Team Size: "+teamSize);
    }
}
class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        System.out.println("\nDeveloper Details:");
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}
class Intern extends Employee{

    private String department;

    public Intern(String name, int id, int salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("\nIntern Details:");
        super.displayDetails();
        System.out.println("Department: "+department);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Suresh", 1002, 20000, 5);
        manager.displayDetails();

        Developer developer = new Developer("Ravi", 1001, 15000, "Java");
        developer.displayDetails();

        Intern intern = new Intern("Harry", 1003, 10000, "IT");
        intern.displayDetails();
    }
}