package com.bridgelabz.oops.leveltwo;

import java.util.Scanner;

class PalindromeChecker{
    String text;
    void checkPalindrome(){
        int start=0;
        int end=text.length()-1;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Given text is palindrome");
    }

}
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string=scanner.nextLine();
        PalindromeChecker palindromeChecker=new PalindromeChecker();
        palindromeChecker.text=string;
        palindromeChecker.checkPalindrome();
        scanner.close();
    }
}
