package ca.ciccc.wmad202.problem3;

import java.util.ArrayList;

public class GenericExchange {
    public static <E>ArrayList<E> exchangeElements(ArrayList<E> list, int p1, int p2){
        E valueP1 = list.get(p1);
        E valueP2 = list.get(p2);
        list.set(p1, valueP2);
        list.set(p2, valueP1);
        return list;


    }
}
