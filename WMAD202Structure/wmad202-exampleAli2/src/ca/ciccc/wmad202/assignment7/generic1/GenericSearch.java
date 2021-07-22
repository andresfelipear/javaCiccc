package ca.ciccc.wmad202.assignment7.generic1;



//Create a search method which searches a list of items and returns items which fulfill a specific condition.
//
//        example:
//
//        -- search a list of string and returns strings whose length are bigger than 4
//        -- search a list of integers and returns the integers that are divisible by 6
//        -- search a list of product and retunrs the producs whose prices are less thn 3 dollar
//        -- search a list of students whose GPA is above 75%

import java.util.ArrayList;

public class GenericSearch {

    public static <E> ArrayList<E> search(ArrayList<E> list, Condition<E> condition){

        ArrayList<E> results = new ArrayList<>();

        for(E item: list){
            if(condition.evaluate(item)){
                results.add(item);
            }
        }

        return results;
    }
}
