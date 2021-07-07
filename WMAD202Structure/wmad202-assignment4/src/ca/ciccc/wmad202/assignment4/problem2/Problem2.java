package ca.ciccc.wmad202.assignment4.problem2;

public class Problem2 {
    public static void multiTable(){
        for(int i=1; i<11; i++){
            for(int j=1; j<11;j++){
                System.out.print(j*i + " | ");
            }
            System.out.println();
        }
    }

}
