package ca.ciccc.wmad202.assignment9.problem5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerExample {

    //ProblemDescription: Using Consumer, write a method which takes one array the integers
    //and print the array multiplication of each element by 9;
    public static void test(){
        Consumer<ArrayList<Integer>> bi = (list1)->{
          list1.forEach(element-> System.out.print(element*9 + " "));
        };
        System.out.println("\nInterface Consumer...");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        bi.accept(list);
        System.out.println();

    }
}
