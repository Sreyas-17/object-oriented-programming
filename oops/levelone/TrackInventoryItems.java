package com.bridgelabz.oops.levelone;

import java.util.*;
class Item{
    String itemName;
    String itemCode;
    int price;
    int quantity;
    public void displayItemDetails(){
        System.out.println("The code of the item is "+itemCode);
        System.out.println("The name of the item is "+itemName);
        System.out.println("The price of the item is "+price);
        System.out.println("The quantity of the item is "+quantity);
        System.out.println("The total cost of item is "+price*quantity);
    }
}
public class TrackInventoryItems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item name, item code, price and quantity: ");
        String itemName = scanner.nextLine();
        String itemCode = scanner.nextLine();
        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        Item item = new Item();
        item.itemName = itemName;
        item.itemCode = itemCode;
        item.price = price;
        item.quantity = quantity;

        item.displayItemDetails();
        scanner.close();
    }
}
