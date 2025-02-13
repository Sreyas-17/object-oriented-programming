package com.bridgelabz.encapsulation;

import java.util.ArrayList;
interface Department{
    void assignDepartment(String department);
    String getDepartmentDetails();
}
abstract class Employee{
    protected int employeeId;
    protected String employeeName;
    private float baseSalary;
    public Employee(int employeeId, String employeeName, float baseSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.baseSalary=baseSalary;
    }
    public float getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(float baseSalary){
        this.baseSalary=baseSalary;
    }
    public void displayDetails(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Salary: "+baseSalary);
    }
    abstract float calculateSalary();
}
class FullTimeEmployee extends Employee implements Department{
    private float totalSalary;
    private String department;
    protected float bonus;
    public FullTimeEmployee(int employeeId, String employeeName, float baseSalary,float bonus){
        super(employeeId, employeeName, baseSalary);
        this.bonus=bonus;
    }
    public float calculateSalary() {
        totalSalary=getBaseSalary()+bonus;
        return totalSalary;
    }
    public void assignDepartment(String department){
        this.department=department;
    }
    public String getDepartmentDetails(){
        return department;
    }
}
class PartTimeEmployee extends Employee implements Department{
    protected int overTimeWorkingHours;
    protected float salaryPerHour;
    private float totalSalary;
    private String department;
    public PartTimeEmployee(int employeeId, String employeeName, float baseSalary,int workingHours,float salaryPerHour){
        super(employeeId, employeeName, baseSalary);
        this.overTimeWorkingHours=workingHours;
        this.salaryPerHour=salaryPerHour;
    }
    public float calculateSalary() {
        totalSalary=getBaseSalary()+(overTimeWorkingHours*salaryPerHour);
        return totalSalary;
    }
    public void assignDepartment(String department){
        this.department=department;
    }
    public String getDepartmentDetails(){
        return department;
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee(1001, "Suresh", 100000, 10000));
        employees.add(new PartTimeEmployee(1002, "Ravi", 15000, 2, 500));

        for (Employee employee : employees) {
            employee.calculateSalary();
            ((Department) employee).assignDepartment(employee instanceof FullTimeEmployee ? "IT" : "Marketing");
            employee.displayDetails();
            System.out.println("Department: " + ((Department) employee).getDepartmentDetails());
            System.out.println("Salary: " + employee.calculateSalary() + "\n");
        }
    }
}
