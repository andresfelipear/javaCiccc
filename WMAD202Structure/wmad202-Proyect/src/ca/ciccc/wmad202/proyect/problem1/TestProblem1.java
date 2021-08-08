package ca.ciccc.wmad202.proyect.problem1;

import java.util.ArrayList;
import java.util.Arrays;

public class TestProblem1 {
    public static void test(){
        ArrayList<Integer> lands = new ArrayList(Arrays.asList(1,1,2,2,2,3,4));
        ArrayList<Integer> lands2 = new ArrayList(Arrays.asList(2,6,6,6,3,5));
        ArrayList<Integer> lands3 = new ArrayList(Arrays.asList(6,1,4));

        MyCompany company = new MyCompany();
        System.out.println(company.calcNumberOfCastles(lands));
        System.out.println(company.calcNumberOfCastles(lands2));
        System.out.println(company.calcNumberOfCastles(lands3));
    }
}
