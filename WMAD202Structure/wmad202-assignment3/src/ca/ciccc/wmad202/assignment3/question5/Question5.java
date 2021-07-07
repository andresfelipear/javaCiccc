package ca.ciccc.wmad202.assignment3.question5;

import java.util.Scanner;

public class Question5 {
    /*
        Problem5
        - Write a Python program which asks the user to enter two numbers called number1 and
        number2 and then prints the number that is bigger. For instance if the user has entered 10
        and 15, the program prints the bigger number that 15. (you can use the max function
        here)
     */
    public static void biggerNumber(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1= console.nextInt();
        System.out.println("Enter number2: ");
        int num2 = console.nextInt();
        int max = num1;
        if(max<num2){
            max =num2;
        }
        System.out.println("The bigger number between " + num1 +" and " + num2 + " is: " + max);
    }

}
