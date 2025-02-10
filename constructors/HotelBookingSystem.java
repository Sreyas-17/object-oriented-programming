package com.bridgelabz.constructors;

import java.util.Scanner;

class HotelBooking {
    String guestName;
    String roomType;
    int numberOfNights;

    HotelBooking() {
        guestName = "Jack";
        roomType = "Double";
        numberOfNights = 3;
    }

    HotelBooking(String stringName, String roomType, int numberOfNights) {
        this.guestName = stringName;
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
    }

    HotelBooking(HotelBooking hotelBooking) {
        this.guestName = hotelBooking.guestName;
        this.roomType = hotelBooking.roomType;
        this.numberOfNights = hotelBooking.numberOfNights;
    }

    public void display() {
        System.out.println("The guest name is: "+guestName);
        System.out.println("The room type is: "+roomType);
        System.out.println("The number of nights is: "+numberOfNights);
    }
}
public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the guestname: ");
        String guestName=scanner.nextLine();
        System.out.println("Enter the room type: ");
        String roomType=scanner.nextLine();
        System.out.println("Enter the number of nights: ");
        int numberOfNights=scanner.nextInt();

        HotelBooking hotelBookingDefault=new HotelBooking();
        HotelBooking hotelBookingParametrized=new HotelBooking(guestName, roomType, numberOfNights);
        HotelBooking hotelBookingCopy=new HotelBooking(hotelBookingParametrized);

        System.out.println("\nThe details using default constructor: ");
        hotelBookingDefault.display();
        System.out.println("\nThe details using parameterized constructor: ");
        hotelBookingParametrized.display();
        System.out.println("\nThe details using copy constructor: ");
        hotelBookingCopy.display();
        scanner.close();
    }
}