package com.bridgelabz.constructors;

import java.util.Scanner;
class Books{
    String title;
    String author;
    int price;
    Books(){
        title="Sherlock Holmes";
        author="Walter White";
        price=100;
    }
    Books(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void display(){
        System.out.println("The title of the book is "+title);
        System.out.println("The author of the book is "+author);
        System.out.println("The price of the book is "+price);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the title,author and price of the book: ");
        String title=scanner.nextLine();
        String author=scanner.nextLine();
        int price=scanner.nextInt();
        Books bookOne=new Books();
        Books bookTwo=new Books(title, author, price);
        System.out.println("\nThe details using default constructor: ");
        bookOne.display();
        System.out.println("\nThe details using parameterized constructor: ");
        bookTwo.display();
        scanner.close();
    }
}