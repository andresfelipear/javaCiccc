package ca.ciccc.wmad202.problem5;

import java.util.ArrayList;

public class Integers implements UnaryPredicate<Integer> {

    @Override
    public Integer relativePrime(ArrayList<Integer> list, int begin, int end) {
        for(int i=begin;i<end;i++){
            int counter=0;
            for(int j:list){
                if(!(j%i==0)){
                    counter++;
                }
            }
            if(counter==list.size()){
                return i;
            }
        }
        return 0;
    }
}
