package ca.ciccc.wmad202.assignment9.problem5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    //ProblemDescription: Using BiConsumer, write a method which takes two array lists of Strings
    //and print each array one after other.
    public static void test(){
        BiConsumer<ArrayList<String>, ArrayList<String>> b1 =
                (list1, list2) ->{
                    System.out.println("List1!!");
                    list1.forEach(s-> System.out.print(s+" "));
                    System.out.println();
                    System.out.println("List2!!");
                    list2.forEach(s-> System.out.print(s+" "));
                } ;
        ArrayList<String> s1 = new ArrayList<>(Arrays.asList("Hello", "Mom", "How are You?"));
        ArrayList<String> s2 = new ArrayList<>(Arrays.asList("Hello", "Dad", "How is it going?"));
        b1.accept(s1,s2);
    }



}
