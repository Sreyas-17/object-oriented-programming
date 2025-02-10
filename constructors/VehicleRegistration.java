package com.bridgelabz.constructors;

import java.util.Scanner;

class Vehicle{
    String ownerName;
    String vehicleType;
    static int registrationFee=5000;
    Vehicle(String OwnerName, String VehicleType){
        this.ownerName=OwnerName;
        this.vehicleType=VehicleType;
    }
    void displayVehicleDetails(){
        System.out.println("Owner name is: "+ownerName);
        System.out.println("Vehicle type is: "+vehicleType);
        System.out.println("Registration fee is: "+registrationFee);
    }
    static void updateRegistrationFee(int registrationFee){
        Vehicle.registrationFee=registrationFee;
    }
}
public class VehicleRegistration {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the owner name: ");
        String OwnerName=scanner.nextLine();
        System.out.println("Enter the vehicle type: ");
        String VehicleType=scanner.nextLine();

        Vehicle vehicle=new Vehicle(OwnerName, VehicleType);
        vehicle.displayVehicleDetails();

        System.out.println("Enter the new registration fee to update : ");
        int registrationFee=scanner.nextInt();
        Vehicle.updateRegistrationFee(registrationFee);
        System.out.println("The details after updating registration fee: ");
        vehicle.displayVehicleDetails();
        scanner.close();
    }
}