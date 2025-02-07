package com.bridgelabz.oops.leveltwo;

import java.util.Scanner;
class MovieTicket{
    String movieName;
    String seatNumber;
    float price;

    void bookTicket(String seatNumber,float price){
        this.seatNumber=seatNumber;
        this.price=price;
    }
    void display(){
        System.out.println("The movie name is : "+movieName);
        System.out.println("The seat number is : "+seatNumber);
        System.out.println("The price is : "+price);
    }
}
public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the movie name: ");
        String movieName=scanner.nextLine();
        System.out.println("Enter the seat number:  ");
        String seatNumber=scanner.nextLine();
        System.out.println("Enter the price:  ");
        float price=scanner.nextInt();

        MovieTicket movieTicket=new MovieTicket();
        movieTicket.movieName=movieName;
        movieTicket.bookTicket(seatNumber, price);
        movieTicket.display();
        scanner.close();
    }
}
