package ca.ciccc.wmad202.assignment4.main;

import ca.ciccc.wmad202.assignment4.problem1.main.Problem1Driver;
import ca.ciccc.wmad202.assignment4.problem2.Problem2;
import ca.ciccc.wmad202.assignment4.problem3.Problem3;

public class Assignment4Driver {
    public static void run(){
        Problem1Driver p1Driver = new Problem1Driver();
        Problem2 p2 = new Problem2();
        Problem3 p3 = new Problem3();
        p3.palindrome();
        p2.multiTable();
        //p1Driver.run();

    }
}
