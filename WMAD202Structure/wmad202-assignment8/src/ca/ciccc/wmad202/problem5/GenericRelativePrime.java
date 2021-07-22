package ca.ciccc.wmad202.problem5;

import java.util.ArrayList;

public class GenericRelativePrime {

    public static <T>int findFirst(ArrayList<T> list, int begin, int end, UnaryPredicate<T> p){
        return (int) p.relativePrime(list,begin,end);
    }
}
