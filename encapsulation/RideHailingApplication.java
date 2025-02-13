package com.bridgelabz.encapsulation;
import java.util.ArrayList;
import java.util.List;

interface GPS {
    String getCurrentLocation();
    void updateLocation();
}

abstract class VehicleDetails {
    protected String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public VehicleDetails(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("\nVehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public String getDriverName() {
        return driverName;
    }

    abstract double calculateFare(double distance);
}

class CarDetails extends VehicleDetails implements GPS {
    private String currentLocation;

    public CarDetails(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = location;
    }

    public double calculateFare(double distance) {
        double fare = distance * ratePerKm;
        System.out.println("Car Fare: " + fare);
        return fare;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation() {
        currentLocation = "T Nagar";
        System.out.println("Updated Location: " + currentLocation);
    }
}

class BikeDetails extends VehicleDetails implements GPS {
    private String currentLocation;

    public BikeDetails(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = location;
    }

    public double calculateFare(double distance) {
        double fare = distance * ratePerKm;
        System.out.println("Bike Fare: " + fare);
        return fare;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation() {
        currentLocation = "Madhavaram";
        System.out.println("Updated Location: " + currentLocation);
    }
}

class Auto extends VehicleDetails implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = location;
    }

    public double calculateFare(double distance) {
        double fare = distance * ratePerKm;
        System.out.println("Auto Fare: " + fare);
        return fare;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation() {
        currentLocation = "Guindy";
        System.out.println("Updated Location: " + currentLocation);
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<VehicleDetails> vehicles = new ArrayList<>();
        vehicles.add(new CarDetails("C123", "Ravi", 10, "Koyambedu"));
        vehicles.add(new BikeDetails("B456", "Kiran", 5, "ECR"));
        vehicles.add(new Auto("A789", "Suresh", 7, "Poonamalle"));

        double distance = 12;

        for (VehicleDetails vehicle : vehicles) {
            vehicle.getVehicleDetails();
            vehicle.calculateFare(distance);
            GPS gpsVehicle = (GPS) vehicle;
            System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
            gpsVehicle.updateLocation();
        }
    }
}

