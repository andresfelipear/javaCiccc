package ca.ciccc.wmad202.assignment2.question4;

import java.util.Scanner;

public class Question4 {
    /*
    Problem 10
    Write a function with one input parameter which is a string and does the following:
    • Checks whether the input string and the its reverse is the same (like BaBa), if yes
    it return 1 and if false, it returns 0. It considers case-sensitivity which means
    (Baba and BaBa are not the same)
     */
    public static void reverseString(){
        String input, reverseInput="";
        Scanner console = new Scanner(System.in);
        System.out.println("Assignment2 - Question4 Done");
        System.out.println("Enter a String: ");
        input = console.next();
        char[] inputArray = input.toCharArray();
        for(int i= inputArray.length-1; i>=0;i--){
            reverseInput += inputArray[i];
        }
        if(input.equals(reverseInput)){
            System.out.println("The input string " + input + " is equals to its revers "+ reverseInput);
        }
        else{
            System.out.println("The input string " + input + " is not equals to its revers "+ reverseInput);
        }
    }
}
