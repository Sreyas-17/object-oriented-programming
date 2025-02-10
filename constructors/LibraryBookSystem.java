package com.bridgelabz.constructors;
import java.util.Scanner;
class BookAvailability{
    String title;
    String author;
    int price;
    int availability=10;
    BookAvailability(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void borrowBook(int requiredBooks){
        if(availability>requiredBooks){
            availability-=requiredBooks;
            System.out.println("The title of the book is "+title);
            System.out.println("The author of the book is "+author);
            System.out.println("The price of the book is "+price);
            System.out.println("The book is borrowed successfully.");
        }
        else{
            System.out.println("The book is not available.");
        }
    }
}
public class LibraryBookSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the title,author and price of the book: ");
        String title=scanner.nextLine();
        String author=scanner.nextLine();
        int price=scanner.nextInt();
        System.out.println("Enter how many books does the user wants: ");
        int requiredBooks=scanner.nextInt();
        BookAvailability bookAvailability=new BookAvailability(title, author, price);
        bookAvailability.borrowBook(requiredBooks);
        scanner.close();
    }
}
