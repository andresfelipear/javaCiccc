package ca.ciccc.wmad202.assignment9.assignment3.question3;

import java.util.Locale;

public class Question3 {
    /*
        Problem3
        - Write a Python program for the following problems:
        o prints * for 500 times with no space between the *
        o Converts the number 152 to string “152”
        o Converts the floating point 145.34 to string “145.34”
        o Converts the string “456” to number 456
        o Converts your name to lower case and prints it. For instance if your name is “Ali”
        the program should convert to lowercase and print “ali”.
     */
    public static void printOperations(){
        //exercise1
        for(int i=0;i<500;i++){
            System.out.print("*");
        }
        //exercise2
        System.out.println("Number 152 converter to string: " + String.valueOf(152));
        System.out.println("Number 145.34 converter to string: " + String.valueOf(145.34));
        System.out.println("Convert the string 456 to number: " + Integer.parseInt("456"));
        System.out.println("Converting my name Andres to lowercase: "+ "Andres".toLowerCase(Locale.ROOT));



    }
}
