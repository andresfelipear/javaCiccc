package ca.ciccc.wmad202.assignment5.problem1;

public class Problem1 {
    public static boolean primeNumber(int num){
        int counter=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                counter++;
            }
            if(counter>1){
                return false;
            }
        }
        return true;
    }

}
