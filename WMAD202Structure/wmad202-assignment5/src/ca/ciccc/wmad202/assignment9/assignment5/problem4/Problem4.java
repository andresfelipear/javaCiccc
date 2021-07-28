package ca.ciccc.wmad202.assignment9.assignment5.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Problem4 {
    public static int returnMostRepeated(String str){
        String[] listString = str.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< listString.length;i++){
            list.add(Integer.parseInt(listString[i]));
        }
        Collections.sort(list);
        int counter = 1, repitedNum= list.get(0), counterMax=0, repitedMax=0;
        for(int i=1; i<list.size(); i++){
            if(list.get(i)==repitedNum){
                counter++;
            }
            else{
                repitedNum = list.get(i);
                counter=1;
            }
            if(counter > counterMax){
                counterMax = counter;
                repitedMax = list.get(i);
            }
        }
        return repitedMax;

    }
}
