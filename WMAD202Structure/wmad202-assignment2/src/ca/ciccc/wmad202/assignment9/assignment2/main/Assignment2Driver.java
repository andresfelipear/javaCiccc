package ca.ciccc.wmad202.assignment9.assignment2.main;

import ca.ciccc.wmad202.assignment9.assignment2.question1.Question1;
import ca.ciccc.wmad202.assignment9.assignment2.question2.Question2;
import ca.ciccc.wmad202.assignment9.assignment2.question3.Question3;
import ca.ciccc.wmad202.assignment9.assignment2.question4.Question4;

public class Assignment2Driver {
    public static void run() {
        System.out.println("Assignment2");
        Question1 q1 = new Question1();
        q1.printAge();
        Question2 q2 = new Question2();
        q2.printHello();
        Question3 q3 = new Question3();
        q3.printNumbers();
        Question4 q4 = new Question4();
        q4.reverseString();
    }
}
