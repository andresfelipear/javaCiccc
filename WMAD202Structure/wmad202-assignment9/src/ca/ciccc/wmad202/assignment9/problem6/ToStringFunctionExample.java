package ca.ciccc.wmad202.assignment9.problem6;

import java.util.ArrayList;
import java.util.Arrays;

public class ToStringFunctionExample {
    public static void test(){
        //ProblemDescription: Using ToStringFunction, write a method which that takes and ArrayList of Integers and return ArrayList<Strings>
        ToStringFunction<ArrayList<Integer>> array = arr ->{
            ArrayList<String> strings = new ArrayList<>();
            arr.forEach(num->strings.add(num.toString()));
            return String.valueOf(strings);
        };
        System.out.println("ToStringFunction");
        System.out.println(array.applyAsString(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,11))));
    }
}
