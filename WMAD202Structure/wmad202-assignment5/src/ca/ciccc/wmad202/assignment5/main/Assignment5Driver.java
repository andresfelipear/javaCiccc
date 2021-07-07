package ca.ciccc.wmad202.assignment5.main;

import ca.ciccc.wmad202.assignment5.problem1.Problem1;
import ca.ciccc.wmad202.assignment5.problem2.Problem2;
import ca.ciccc.wmad202.assignment5.problem3.Problem3;
import ca.ciccc.wmad202.assignment5.problem4.Problem4;
import ca.ciccc.wmad202.assignment5.problem5.Problem5;
import ca.ciccc.wmad202.assignment5.problem6.Problem6;
import ca.ciccc.wmad202.assignment5.problem7.Problem7;

import java.util.Scanner;

public class Assignment5Driver {
    public static void run(){
        //problem1
        Problem1 p1 = new Problem1();
        Scanner console = new Scanner(System.in);
        System.out.println("Problem1 / Prime Number" +
                "!");
        System.out.print("Enter a positiv number: ");
        int num1 = console.nextInt();
        boolean result1 = p1.primeNumber(num1);
        System.out.println("The number is prime: " + result1);

        //problem2
        System.out.print("Enter a positive number: ");
        int num2 = console.nextInt();
        Problem2 p2 = new Problem2();
        int primeNum = p2.nextPrimeNumber(num2);
        System.out.println("For the input " + num2 + " the next prime number is " + primeNum);

        //problem3
        Problem3 p3 = new Problem3();
        System.out.print("Enter a positive number: ");
        int num3 = console.nextInt();
        System.out.print("1.SHAPE1\n2.SHAPE2\n3.SHAPE3\nEnter the option: ");
        int option = console.nextInt();
        p3.printShape(num3,option);

        //problem4
        Problem4 p4 = new Problem4();
        System.out.print("Enter a list (separate with ,): ");
        String listp4 = console.next();
        int mostRepeated = p4.returnMostRepeated(listp4);
        System.out.println("For the list ["+listp4 + "], the most repeated is: " + mostRepeated);

        //problem5
        Problem5 p5 = new Problem5();
        System.out.print("Enter a list (separate with ,): ");
        String listp5 = console.next();
        p5.itemsList(listp5);

        //problem6
        Problem6 p6 = new Problem6();
        System.out.print("Enter a list (separate with ,): ");
        String listp6 = console.next();
        p6.removeDuplicates(listp6);

        //problem7
        Problem7 p7 = new Problem7();
        System.out.print("Enter a list (separate with ,): ");
        String listp7 = console.next();
        System.out.println("Enter the number that you want found: ");
        int num= console.nextInt();
        int numFound = p7.linearSearch(listp7,num);
        if(numFound==-1){
            System.out.println("The number is not found!!");
        }
        else{
            System.out.println("The number " + num + " is in the position " + numFound + " of the array");
        }
    }

}
