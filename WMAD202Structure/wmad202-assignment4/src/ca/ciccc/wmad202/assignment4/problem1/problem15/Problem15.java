package ca.ciccc.wmad202.assignment4.problem1.problem15;

public class Problem15 {
    public static void findNumber(){
        System.out.println("Problem 1.5");
        boolean exit = true;
        double f1=0, f2=0;
        int numFind = 0;
        boolean condition1= false, condition2= false;
        for(int i=3;exit;i++){
            condition1 = false;
            condition2 = false;
            for(int j=2;j<100;j++){
                f1 = Math.pow(2,j);
                f2 = Math.pow(j,5);
                if(j<i && f1<f2){
                    condition1 = true;
                }
                else{
                    break;
                }
                if(j>i &&  f1>f2){
                    condition2 = true;
                }
                else{
                    break;
                }
            }
            if (condition1 && condition2) {
                numFind = i;
                System.out.println(numFind);
                exit = false;
            }
        }
        System.out.println("The number finded is: " + numFind);
    }
}
