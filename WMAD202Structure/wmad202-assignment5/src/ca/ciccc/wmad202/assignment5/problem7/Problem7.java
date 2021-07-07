package ca.ciccc.wmad202.assignment5.problem7;

import java.util.ArrayList;
import java.util.Collections;

public class Problem7 {
    public static int linearSearch(String str, int number){
        String[] listString = str.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< listString.length;i++){
            list.add(Integer.parseInt(listString[i]));
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==number){
                return i;
            }
        }
        return -1;
    }
}
