package com.bridgelabz.inheritance;

class Book{
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public  void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
class Author extends Book{

    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }

    public void displayDetails(){
        System.out.println("Book title: "+getTitle());
        System.out.println("Publication year: "+getPublicationYear());
        System.out.println("Author name: "+name);
        System.out.println("Author bio: "+bio);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Author author=new Author("Java", 2017, "Debasis samantha", "Java is a programming language");
        author.displayDetails();
    }
}
