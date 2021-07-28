package ca.ciccc.wmad202.assignment9.problem5;

import java.util.function.Function;

public class FunctionExample {
    //ProblemDescription: Using Function, write a method which takes one String and return the string adding the word hello world
    public static void test(){
        Function<String,String> str = st ->{
          return st+"Hello World!";
        };
        String input = "Try on functional interface Function";
        System.out.println(str.apply(input));

    }
}
