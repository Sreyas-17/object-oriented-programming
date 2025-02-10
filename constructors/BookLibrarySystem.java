package com.bridgelabz.constructors;

import java.util.Scanner;

class Book {
    public long ISBN;
    protected String title;
    private String author;
    Book(long ISBN, String title) {
        this.ISBN =ISBN;
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

}
class EBook extends Book {
    EBook(long ISBN,String title){
         super(ISBN,title);
    }
    public void displayDetails() {
        System.out.println("\nISBN is accessed using super : " + super.ISBN);
        System.out.println("Title is accessed using super from parent class : " + super.title);
        System.out.println("Author is accessed using setters and getters: "+getAuthor());
    }
}
public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ISBN number: ");
        long ISBN=scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter the title: ");
        String title=scanner.nextLine();
        System.out.println("Enter the author: ");
        String author =scanner.nextLine();

        EBook eBook = new EBook(ISBN,title);
        eBook.setAuthor(author);
        eBook.displayDetails();
        scanner.close();
    }
}
