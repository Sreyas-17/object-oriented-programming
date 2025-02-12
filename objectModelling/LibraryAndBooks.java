package com.bridgelabz.objectModelling;

import java.util.ArrayList;

//Book class, to store book details
class Book {
    String title;
    String author;
    Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}

//Library class, to store books in different libraries
class Library{
    private ArrayList<Book> books;
    String libraryName;
    Library(String libraryName ){
        this.libraryName=libraryName;
        books=new ArrayList<>();
    }
    //To add books
    public void addBook(Book book){
        books.add(book);
    }

    //To display books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(libraryName+" library has book \""+book.getTitle() + " by " + book.getAuthor()+"\"");
        }
    }
}
public class LibraryAndBooks {
    public static void main(String[] args) {
        Library libraryOne=new Library("Vidyanikethan");//library one
        Library libraryTwo=new Library("Viswesarathna");//library two

        //Creating a book object
        Book bookOne=new Book("Sherlock Holmes", "Walter White");
        Book bookTwo=new Book("The Hobbit", "JRR Tolkien");
        Book bookThree=new Book("The Hitchhiker's Guide to the Galaxy", "Henry Mitchel");

        //Add books in different library
        libraryOne.addBook(bookOne);
        libraryOne.addBook(bookTwo);
        libraryTwo.addBook(bookThree);
        libraryTwo.addBook(bookOne);
        System.out.println("The list of books in the library 1 is: ");
        libraryOne.displayBooks();
        System.out.println("\nThe list of books in the library 2 is: ");
        libraryTwo.displayBooks();
    }
}