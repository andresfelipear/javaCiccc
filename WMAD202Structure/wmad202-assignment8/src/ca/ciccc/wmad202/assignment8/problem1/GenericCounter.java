package ca.ciccc.wmad202.assignment8.problem1;

import java.util.ArrayList;

public class GenericCounter {
    public static <E>int counterNumberOfElementsWithSpecificProperty(ArrayList<E> list, Condition<E> condition){
        ArrayList<E> result = new ArrayList<>();
        int count =0;
        for(E item:list){
            if(condition.evaluate(item)){
                result.add(item);
                count++;
            }
        }
        return count;
    }

}
