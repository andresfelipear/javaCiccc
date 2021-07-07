package ca.ciccc.wmad202.assignment3.question1;

public class Question1 {
    /*
        Problem1
        - Write a Python code to calculate the following statements and print the results:
        o 5+10-15
        o 5 to the power of 5
        o abs(-5)*6+4*3
        o 15/4//5
    */
    public static void printOperations(){
        System.out.println("Assignment3 - Question1 Done");
        int oper1,oper2,oper3;
        double oper4;
        oper1 = 5+10-15;
        oper2 = (int) Math.pow(5,5);
        oper3 = Math.abs(-5)*4+4*3;
        oper4 = 15*1.0/4/5;
        System.out.println("Result oper1: " + oper1);
        System.out.println("Result oper2: " + oper2);
        System.out.println("Result oper3: " + oper3);
        System.out.println("Result oper4: " + oper4);

    }
}
