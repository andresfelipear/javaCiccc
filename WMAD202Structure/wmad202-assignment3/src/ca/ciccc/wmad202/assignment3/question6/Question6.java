package ca.ciccc.wmad202.assignment3.question6;

import java.util.Scanner;

public class Question6 {
    /*
        Problem6
        - Write a Python program which prompts(asks) the user to enter three numbers A and B
        and X and calculates and prints the result of the following math function:
        o A^X+X^B
        o ^ means power (i.e. 2^3 = 2*2*2 = 8). Instead of ^ use the proper power operator
        in Python.
     */
    public static void operNumbers(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int numA= console.nextInt();
        System.out.println("Enter number B: ");
        int numB = console.nextInt();
        System.out.println("Enter number X: ");
        int numX = console.nextInt();
        double oper1 = Math.pow(numA, numX) + Math.pow(numX, numB);
        System.out.println("The result of A^X + X^B is: " + oper1);
    }


}
