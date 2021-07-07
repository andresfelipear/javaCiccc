package ca.ciccc.wmad202.assignment4.problem3;

import java.util.Scanner;

public class Problem3 {
    public static void palindrome(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = console.next();
        char[] stringChar = input.toCharArray();
        char[] reverseString = new char[stringChar.length];
        for(int i=stringChar.length-1, j=0; j<stringChar.length;i--,j++){
            reverseString[j] = stringChar[i];
        }
        String reverse = new String(reverseString);
        if(input.equals(reverse)){
            System.out.println("The input " + input + " is equals to its reverse " + reverse);
        }
        else{
            System.out.println("The input " + input + " is not equal to its reverse " + reverse);
        }
    }
}
