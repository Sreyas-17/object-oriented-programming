package com.bridgelabz.encapsulation;

import java.util.ArrayList;

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle{
    private String vehicleNumber;
    protected String type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    abstract double calculateRentalCost(int days);
}
class Car extends Vehicle implements Insurable{
    private int insuranceAmount = 200;
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days) {
        return days*rentalRate;
    }

    public double calculateInsurance() {
        return rentalRate+insuranceAmount;
    }

    public String getInsuranceDetails() {
        return "Insurance company: ICICI\nInsurance Amount per day: "+insuranceAmount;
    }
}
class Bike extends Vehicle implements Insurable{
    private int insuranceAmount = 100;
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days) {
        return days*rentalRate;
    }

    public double calculateInsurance() {
        return rentalRate+insuranceAmount;
    }

    public String getInsuranceDetails() {
        return "Insurance company: ICICI\nInsurance Amount per day: "+insuranceAmount;
    }
}
class Truck extends Vehicle implements Insurable{
    private int insuranceAmount = 300;
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days) {
        return days*rentalRate;
    }

    public double calculateInsurance() {
        return rentalRate+insuranceAmount;
    }

    public String getInsuranceDetails() {
        return "Insurance company: ICICI\nInsurance Amount per day: "+insuranceAmount;
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("TN JK 3456", "Car", 1000));
        vehicles.add(new Bike("TN JK 3457", "Bike", 500));
        vehicles.add(new Truck("TN JK 3458", "Truck", 10000));

        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(3);
            double insurance = ((Insurable) vehicle).calculateInsurance();
            double totalCost = rentalCost + insurance;
            System.out.println("\nVehicle: " + vehicle.type);
            System.out.println("Rental cost: "+rentalCost);
            System.out.println("Insurance amount: "+insurance);
            System.out.println("Total cost: "+totalCost);
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
        }
    }
}
