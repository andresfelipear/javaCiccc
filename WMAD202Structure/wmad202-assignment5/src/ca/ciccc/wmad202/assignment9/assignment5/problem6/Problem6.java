package ca.ciccc.wmad202.assignment9.assignment5.problem6;

import java.util.ArrayList;
import java.util.Collections;

public class Problem6 {
    public static void removeDuplicates(String str){
        String[] listString = str.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listItems = new ArrayList<>();
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
                repitedNum = list.get(i);
                counter=1;
            }
            if(i==list.size()-1){
                listItems.add(i);
            }
        }
        System.out.println("The items in the list without repeated is:");
        System.out.println(listItems);

    }
}
