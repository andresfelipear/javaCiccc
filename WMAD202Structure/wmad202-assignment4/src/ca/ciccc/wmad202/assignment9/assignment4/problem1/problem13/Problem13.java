package ca.ciccc.wmad202.assignment9.assignment4.problem1.problem13;

import java.util.Scanner;

public class Problem13 {
    public static void toBinary(){
        System.out.println("Problem 1.3");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = console.nextInt();
        String binaryNum = Integer.toBinaryString(num);
        System.out.println("The number "+ num + " to binary is: " + binaryNum);
    }
}
