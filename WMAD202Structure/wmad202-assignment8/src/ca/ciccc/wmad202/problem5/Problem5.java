package ca.ciccc.wmad202.problem5;

import java.util.ArrayList;

public class Problem5 {
    public static void test(){
        ArrayList<Integer> ints = new ArrayList<>(){{
            add(1);
            add(13);
            add(12);
            add(4);
            add(20);
            add(7);
            add(8);
            add(18);
        }};
        int relativePrime = GenericRelativePrime.findFirst(ints,1,100, new Integers());
        System.out.println("Relative Prime to the list: " + relativePrime);

    }
}
