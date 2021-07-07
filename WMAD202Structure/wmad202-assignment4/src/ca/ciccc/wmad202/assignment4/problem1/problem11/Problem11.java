package ca.ciccc.wmad202.assignment4.problem1.problem11;

import java.util.Scanner;

public class Problem11 {
    public static void reverseNumber(){
        System.out.println("Problem 1.1");
        while(true){
            Scanner console = new Scanner(System.in);
            System.out.print("Enter a number not divisible for 10: ");
            int number = console.nextInt();
            if(number %10 == 0){
                System.out.println("Enter a valid input!!");
            }
            else{
                String num = String.valueOf(number);
                char[] numChar = num.toCharArray();
                System.out.println(numChar);
                char[] reverseNum = new char[numChar.length];
                for(int i=num.length()-1, j=0; j<numChar.length;i--,j++){
                    reverseNum[j] = numChar[i];
                }
                System.out.println(reverseNum);
                System.out.println("The reverse number of " + number + " is " + reverseNum);
                break;
            }
        }
    }
}
