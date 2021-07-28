package ca.ciccc.wmad202.assignment9.assignment3.question4;

import java.util.Scanner;

public class Question4 {
    /*
        Problem4
        - Write a Python program that prompts (ask) the user to enter his/her name and age. The
        Python code receives the age from the input (user) and prints the following message: (for
        example, if the user has entered James and 21)
        o Hi James, your age is 21 years.
     */
    public static void printAge(){
        int age;
        String name;
        System.out.println("Assignment1 - Question1 Done");
        Scanner console = new Scanner(System.in);
        System.out.println("User, Enter your Name: ");
        name = console.next();
        System.out.println("User, Enter your Age: ");
        age = console.nextInt();
        System.out.println("Hi " + name + ", your age is " + age);

    }
}
