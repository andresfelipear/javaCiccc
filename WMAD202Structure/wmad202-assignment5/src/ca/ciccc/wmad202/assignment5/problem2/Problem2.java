package ca.ciccc.wmad202.assignment5.problem2;

import ca.ciccc.wmad202.assignment5.problem1.Problem1;

public class Problem2 {
    public static int nextPrimeNumber(int number){
        boolean exit=true;
        int nextInt = number+1;
        while(exit){
            if(Problem1.primeNumber(nextInt)){
                return nextInt;
            }
            else{
                nextInt++;
            }
        }
        return nextInt;
    }

}
