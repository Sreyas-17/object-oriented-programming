package com.bridgelabz.operators;

import java.util.Scanner;

class Vehicle {
    static int registrationFee=500;
    String OwnerName;
    String vehicleType;
    final String registrationNumber;
    Vehicle(String ownerName,String VehicleType,String registrationNumber){
        this.OwnerName=ownerName;
        this.vehicleType=VehicleType;
        this.registrationNumber=registrationNumber;
    }
    public static void updatedRegistrationFee(int registrationFee){
        Vehicle.registrationFee=registrationFee;
    }
    void displayVehicleDetails(){
        System.out.println("Registration fee is: "+registrationFee);
        System.out.println("Owner name is: "+OwnerName);
        System.out.println("Vehicle type is: "+vehicleType);
        System.out.println("Registration number is: "+registrationNumber);
    }
}
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the owner name: ");
        String OwnerName=scanner.nextLine();
        System.out.println("Enter the vehicle type: ");
        String VehicleType=scanner.nextLine();
        System.out.println("Enter the registration number: ");
        String registrationNumber=scanner.nextLine();
        Vehicle vehicle=new Vehicle(OwnerName, VehicleType,registrationNumber);
        System.out.println("\nIs vehicle object belongs to Vehicle class: "+(vehicle instanceof Vehicle));
        vehicle.displayVehicleDetails();
        System.out.println("\nEnter the new registration fee to update : ");
        int registrationFee=scanner.nextInt();
        Vehicle.updatedRegistrationFee(registrationFee);
        System.out.println("The details after updating registration fee: ");
        vehicle.displayVehicleDetails();
        scanner.close();
    }
}
