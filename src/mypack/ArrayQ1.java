package mypack;

//Write a program to accept a strings from user,
// And  split it by spaces
// traverse through individual string and find the count of a character that user has asked to search

import java.util.Scanner;

public class ArrayQ1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter sentence:");
    String input = s.nextLine();
        System.out.println(input);

    String [] space =  input.split(" ");
        System.out.println("enter alphabet to count");
        String  alphabet = s.next();
        char word = alphabet.charAt(0);
        int count = 0;
       for (String i:space ){
           System.out.println(i);
           for (int a = 0 ; a<= i.length()-1; a++){
               if (i.charAt(a)==word){
                   count++;
               }
           }
       }
        System.out.println(count);

}


}
