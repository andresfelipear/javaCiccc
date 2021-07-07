package ca.ciccc.wmad202.assignment3.question2;

import java.util.regex.MatchResult;

public class Question2 {
    /*
        Problem2
        - Write a Python program for the following questions:
        o Calculates and prints the maximum of the numbers: 12, -1, 0, 34, 18, 24, 9, 99,
        101, -101
        o Calculates and prints the minimum of the numbers: 12, -1, 0, 34, 18, 24, 9, 99,
        101, -101
        o Rounds the number 12.13456 to 2 decimal digits and prints the result
        o Rounds the number 12.683212 to 1 decimal digits and prints the result
        o Calculates the floor division of 40 over 7
        o Converts the floating point 12.455 to an integer and prints it
     */
    public static void calcPrintOpers(){
        System.out.println("Assignment3 - Question2 Done");
        int places=2, places2=1;
        double scale = Math.pow(10,places);
        double scale2 = Math.pow(10,places2);
        int[] list1 = {12,-1,0,34,18,24,9,99,101,-101};
        int min=0, max=0;
        for(int i:list1){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.println("Maximun of the list is: "+max);
        System.out.println("Minimun of the list is: "+ min);
        System.out.println("The number 12.13456 round to 2 decimal is: " + Math.round(12.13456*scale)/scale);
        System.out.println("The number 12.683212 round to 2 decimal is: " + Math.round(12.683212*scale2)/scale2);
        System.out.println("Floor division 40/7 is: "+ 40/7);
        System.out.println("Converts 12.455 to integer is: " + ((int) 12.455));


    }
}
