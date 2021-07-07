package ca.ciccc.wmad202.assignment3.main;

import ca.ciccc.wmad202.assignment3.question1.Question1;
import ca.ciccc.wmad202.assignment3.question2.Question2;
import ca.ciccc.wmad202.assignment3.question3.Question3;
import ca.ciccc.wmad202.assignment3.question4.Question4;
import ca.ciccc.wmad202.assignment3.question5.Question5;
import ca.ciccc.wmad202.assignment3.question6.Question6;

public class Assignment3Driver {
    public static void run() {
        System.out.println("Assignment3");
        Question1 q1 = new Question1();
        q1.printOperations();
        Question2  q2 = new Question2();
        q2.calcPrintOpers();
        Question3 q3 = new Question3();
        q3.printOperations();
        Question4 q4 = new Question4();
        q4.printAge();
        Question5 q5 = new Question5();
        q5.biggerNumber();
        Question6 q6 = new Question6();
        q6.operNumbers();

    }
}
