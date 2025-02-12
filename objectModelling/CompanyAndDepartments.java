package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Company class, stores company,department and employee details
class Company {
    String companyName;
    ArrayList<Department> departments;
    Company(String companyName){
        this.companyName=companyName;
        departments=new ArrayList<>();
    }

    //To add department details
    void addDepartment(Department department){
        departments.add(department);
    }

    //It deletes all details departments,employee details and company name
    void deleteCompany(){
        companyName=" ";
        departments=null;
        System.out.println("All details of company is deleted");
    }

    //To display company details
    void displayCompanyDetails(){
        System.out.println("\nDepartments in company : ");
        System.out.println("Company Name: "+companyName);
        try {
            for (Department department : departments) {
                System.out.println(department.departmentName);
            }
        }
        catch(NullPointerException e){
            System.out.println("No departments are there in company.");
        }
    }
}

//Department class, stores Department and employee details
class Department{
    String departmentName;
    ArrayList<Employee> employees;

    //initialize attributes
    Department(String departmentName){
        this.departmentName=departmentName;
        employees=new ArrayList<>();
    }

    //add employee details to department
    void addEmployee(Employee employee){
        employees.add(employee);
    }

    //deleted all department details and employees in that department
    void deleteDepartment(){
        departmentName=" ";
        employees=null;
        System.out.println("All details of this department is deleted");
    }

    //Display the details of department
    void displayDepartmentDetails(){
        try {
            System.out.println("\nDepartment Name: " + departmentName);
            for (Employee employee : employees) {
                System.out.println("Employee ID: " + employee.employeeID + " Employee Name: " + employee.employeeName);
            }
        }
        catch(NullPointerException e){
            System.out.println("No employees are there in this department.");
        }
    }
}

//Employee class, stores employee details
class Employee{
    int employeeID;
    String employeeName;

    //Initialize employee details
    Employee(int employeeID, String employeeName){
        this.employeeID=employeeID;
        this.employeeName=employeeName;
    }
}
public class CompanyAndDepartments {
    public static void main(String[] args) {
        //Create employee objects
        Employee employeeOne=new Employee(101, "Ravi");
        Employee employeeTwo=new Employee(102, "Suresh");
        Employee employeeThree=new Employee(103, "Harry");
        Employee employeeFour=new Employee(104, "John");
        //Create department objects
        Department departmentOne=new Department("IT");
        Department departmentTwo=new Department("HR");
        //Add employee objects to department
        departmentOne.addEmployee(employeeOne);
        departmentOne.addEmployee(employeeTwo);
        departmentTwo.addEmployee(employeeThree);
        departmentTwo.addEmployee(employeeFour);
        //Add departments to company
        Company company=new Company("BridgeLabz");
        company.addDepartment(departmentOne);
        company.addDepartment(departmentTwo);

        company.displayCompanyDetails();
        departmentOne.displayDepartmentDetails();
        departmentTwo.displayDepartmentDetails();

        System.out.println("\nDeleting department one details");
        departmentOne.deleteDepartment();
        departmentOne.displayDepartmentDetails();

        System.out.println("\nDeleting company details");
        company.deleteCompany();
        company.displayCompanyDetails();
    }
}