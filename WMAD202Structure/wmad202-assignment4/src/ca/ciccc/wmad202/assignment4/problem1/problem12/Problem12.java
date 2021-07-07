package ca.ciccc.wmad202.assignment4.problem1.problem12;

import java.util.Scanner;

public class Problem12 {
    public static void operTwoNums(){
        System.out.println("Problem 1.2");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number A: ");
        int num1 = console.nextInt();
        System.out.println();
        System.out.print("Enter a number B: ");
        int num2 = console.nextInt();
        System.out.println("Number between A and B divisible to both 3 and 5");
        for(int i=num1+1;i<num2;i++){
            if(i%3==0 && i%5==0){
                System.out.print(i +", ");
            }
        }
        System.out.println();
        System.out.println("Number between A and B divisible to 6 or 7");
        for(int i=num1;i<num2;i++){
            if(i%6==0 || i%7==0){
                System.out.print(i +", ");
            }
        }
        System.out.println();
        System.out.println("Number between A and B which are not divisible for 3");
        for(int i=num1;i<num2+1;i++){
            if(!(i%3==0)){
                System.out.print(i +", ");
            }
        }
        System.out.println();
    }
}
