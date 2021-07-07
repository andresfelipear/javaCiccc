package ca.ciccc.wmad202.assignment4.problem1.problem14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Problem14 {
    public static void invalidInput(){
        System.out.println("Problem 1.4");
        int min = 0, max=0, counter=0;
        while(true){
            Scanner console = new Scanner(System.in);
            System.out.print("Enter a number (positive or negative)");
            String input = console.next();
            String regex = "[-]?[0-9]*";
            boolean numValidation = Pattern.matches(regex, input);
            if(numValidation){
                int inputNum = Integer.parseInt(input);
                if(inputNum > 0 && min==0 && counter==0){
                    min = inputNum;
                }
                if(inputNum <min ){
                    min = inputNum;
                }
                if(inputNum > max){
                    max = inputNum;
                }
                counter++;
            }
            else{
                System.out.println("Invalid input, end program!");
                System.out.println("Max number: " + max);
                System.out.println("Min number: " + min);
                System.out.println("Distances between max and min = " + Math.abs(max-min));
                break;
            }
        }
    }
}
