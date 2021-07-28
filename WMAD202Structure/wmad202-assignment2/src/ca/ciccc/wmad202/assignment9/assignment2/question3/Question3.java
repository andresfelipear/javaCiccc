package ca.ciccc.wmad202.assignment9.assignment2.question3;

public class Question3 {

    /*
    Problem1
    - Write a python program which prints all the numbers between 1 and 100 that are divisible
    by 3.
     */

    public static void printNumbers(){

        System.out.println("Assignment2 - Question3 Done");
        for(int i=1;i<100;i++){
            if(i%3==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
