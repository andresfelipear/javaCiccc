package ca.ciccc.wmad202.assignment9.assignment2.question2;

import java.util.Scanner;

public class Question2 {

    /*
    Problem2
    - Write a Python program which prompts (asks) the user to enter a number between 0 and
    10. If the user entered a number that is less than 0 or greater than 10, the number is
    invalid. If the number is valid, then the program prints as many “Hello” word as the
    number the user had entered. For instance if the user entered 3 then the program should
    print Hello 3 times: Hello Hello Hello.
    */

    public static void printHello(){
        System.out.println("Assignment2 - Question2 Done");
        int number;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 10");
        number = console.nextInt();
        if(number>10 || number<0){
            System.out.println("Enter a valid input!!");
        }
        else{
            for(int i=0;i<number;i++){
                System.out.print("Hello ");
            }
            System.out.println();
        }

    }
}
