package com.bridgelabz.operators;

import java.util.Scanner;

class Library {
    static String libraryName="Vidhyanikethan";
    String title;
    String author;
    final long isbn;
    Library(String title, String author, long isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name is :"+libraryName);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ISBN number: ");
        long ISBN=scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter the title: ");
        String title=scanner.nextLine();
        System.out.println("Enter the author: ");
        String author =scanner.nextLine();
        Library library = new Library(title, author, ISBN);
        System.out.println("\nIs library object is instance of Library class:"+(library instanceof Library));
        Library.displayLibraryName();
        scanner.close();
    }
}
