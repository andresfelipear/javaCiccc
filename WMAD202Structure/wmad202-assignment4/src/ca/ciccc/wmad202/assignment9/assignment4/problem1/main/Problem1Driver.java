package ca.ciccc.wmad202.assignment9.assignment4.problem1.main;

import ca.ciccc.wmad202.assignment9.assignment4.problem1.problem14.Problem14;
import ca.ciccc.wmad202.assignment9.assignment4.problem1.problem15.Problem15;
import ca.ciccc.wmad202.assignment9.assignment4.problem1.problem11.Problem11;
import ca.ciccc.wmad202.assignment9.assignment4.problem1.problem12.Problem12;
import ca.ciccc.wmad202.assignment9.assignment4.problem1.problem13.Problem13;

public class Problem1Driver {
    public static void run(){
        Problem11 p11 = new Problem11();
        p11.reverseNumber();
        Problem12 p12 = new Problem12();
        p12.operTwoNums();
        Problem13 p13 = new Problem13();
        p13.toBinary();
        Problem14 p14 = new Problem14();
        p14.invalidInput();
        Problem15 p15 = new Problem15();
        p15.findNumber();
    }
}
