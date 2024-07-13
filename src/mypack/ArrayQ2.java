package mypack;

// Write a program to build a random int array of n elements ,then convert int array to char array.

import java.util.Random;
import java.util.Scanner;

public class ArrayQ2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements count:: ");
        int index = scanner.nextInt();

        int [] input = new int[index];
        Random r = new Random();
        for( int i =0; i<=input.length-1; i++){
            input[i]= r.nextInt(20);
        }
        System.out.println("printing built array");
        for(int a: input){
            System.out.println(a);
        }

        char[] c= new char[input.length];

        for (int a=0;a< input.length; a++){
            c[a] = (char) input[a];
        }

        System.out.println("printing converted array");
        for(int a: c){
            System.out.println(a);
        }





    }
}
