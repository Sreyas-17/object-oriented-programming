package com.bridgelabz.constructors;

import java.util.Scanner;

class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    int pricePerDay;
    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
        pricePerDay=500;
    }
    public void display(){
        System.out.println("Customer name: "+customerName);
        System.out.println("Car model: "+carModel);
        System.out.println("Rental days: "+rentalDays);
        System.out.println("The price for the car for "+rentalDays+" is: "+(rentalDays*pricePerDay));
    }
}
public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the customer name: ");
        String customerName=scanner.nextLine();
        System.out.println("Enter the car model: ");
        String carModel=scanner.nextLine();
        System.out.println("Enter the rental days: ");
        int rentalDays=scanner.nextInt();
        CarRental carRental=new CarRental(customerName, carModel, rentalDays);
        carRental.display();
        scanner.close();
    }
}
