package mypack;

import java.util.Random;
import java.util.Scanner;

//Write a program to build a custom array of n elements and after building the array prompt user to search a particular element in the array , if found pritn index at which elemet is store::
public class Array {
    public static void main(String[] args) {
    Random r = new Random();
    Scanner n = new Scanner(System.in);
    System.out.println("Enter element index:");
    int input =  n.nextInt();
    int[] elements = new int [input]; //
    for(int i = 0; i<=elements.length-1; i++){
       elements[i] =  r.nextInt(10);
    }
//    for(int ele: elements){
//        System.out.println( ele);
//    }

    System.out.println("Enter element to search:");
    int search = n.nextInt();
    for(int i = 0; i<=elements.length-1; i++){
        if (elements[i] == search){
            System.out.println(i);
        }
    }









    }
}
