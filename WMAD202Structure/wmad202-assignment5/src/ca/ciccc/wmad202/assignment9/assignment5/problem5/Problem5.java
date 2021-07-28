package ca.ciccc.wmad202.assignment9.assignment5.problem5;

import java.util.ArrayList;
import java.util.Collections;

public class Problem5 {
    public static void itemsList(String str){
        String[] listString = str.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listItems = new ArrayList<>();
        ArrayList<Integer> listCounter = new ArrayList<>();
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
                listItems.add(repitedNum);
                listCounter.add(counter);
                repitedNum = list.get(i);
                counter=1;
            }
            if(i==list.size()-1){
                listItems.add(i);
                listCounter.add(counter);
            }
        }
        for(int i=0;i<listItems.size();i++){
            System.out.print("Item(" + listItems.get(i) + ") repeat: "+ listCounter.get(i));
            System.out.println();
        }

    }
}
