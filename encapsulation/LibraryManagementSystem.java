package com.bridgelabz.encapsulation;

import java.util.ArrayList;

interface Reservable{
    void  reserveItem(int days);
    boolean checkAvailability();
}
abstract class LibraryItem{
    private final int itemId;
    protected String title;
    protected String author;

    public LibraryItem(int itemId, String title, String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }

    public void getItemDetails(){
        System.out.println("\nItem Id : "+itemId);
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
    }

    abstract int getLoanDuration();
}
class Book extends LibraryItem implements Reservable{
    private static int totalBooks=10;
    private int limit=15;

    public Book(int itemId, String title, String author) {
        super(itemId,title,author);
    }

    public int getLoanDuration() {
        return limit;
    }

    public void reserveItem(int days){
        if(days>limit){
            System.out.println("Loan duration limit is 15 days so can't be reserved.");
        }
        else{
            System.out.println("Reserved for "+days+" days.");
        }
        totalBooks -= 1;
    }

    public boolean checkAvailability(){
        return totalBooks > 0;
    }
}
class Magazine extends LibraryItem implements Reservable{
    static int totalMagazines=10;
    int limit=10;

    Magazine(int itemId, String title, String author) {
        super(itemId,title,author);
    }

    int getLoanDuration() {
        return limit;
    }

    public void reserveItem(int days){
        if(days>limit){
            System.out.println("Loan duration limit is 15 days so can't be reserved.");
        }
        else{
            System.out.println("Reserved for "+days+" days.");
        }
        totalMagazines -= 1;
    }

    public boolean checkAvailability(){
        return totalMagazines > 0;
    }
}
class DVD extends LibraryItem implements Reservable{
    private static int totalDVDs=7;
    private int limit=5;

    public DVD(int itemId, String title, String author) {
       super(itemId,title,author);
   }

    public int getLoanDuration() {
        return limit;
    }

    public void reserveItem(int days){
        if(days>limit){
            System.out.println("Loan duration limit is 5 days so can't be reserved.");
        }
        else{
            System.out.println("Reserved for "+days+" days.");
        }
        totalDVDs -= 1;
    }

    public boolean checkAvailability(){
        return totalDVDs > 0;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args){
        ArrayList<LibraryItem> libraryItems=new ArrayList<>();

        libraryItems.add(new Book(1,"Sherlock Holmes","Walter White"));
        libraryItems.add(new Book(2,"The Hobbit","JRR Tolkien"));
        libraryItems.add(new Magazine(4,"The Hitchhiker's Guide to the Galaxy","Henry Mitchel"));
        libraryItems.add(new Magazine(202, "National Geographic", "National Geographic Society"));
        libraryItems.add(new DVD(303, "Inception", "Christopher Nolan"));

        for(LibraryItem libraryItem:libraryItems){
            libraryItem.getItemDetails();
            System.out.println("Required loan duration is "+libraryItem.getLoanDuration());
            ((Reservable) libraryItem).reserveItem(10);
            System.out.println("Availability: "+((Reservable) libraryItem).checkAvailability());
        }
    }
}
