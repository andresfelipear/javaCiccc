package ca.ciccc.wmad202.proyect.problem1;

import java.util.ArrayList;

public class MyCompany {
    public MyCompany(){
    }

    public Integer calcNumberOfCastles(ArrayList<Integer> stretchLand){
        int numberCastles = 0;
        int beforeElement = stretchLand.get(0);
        for(int i=1;i<stretchLand.size()-1;i++){
            int currentlyElement = stretchLand.get(i);
            int nextElement = stretchLand.get(i+1);
            if(currentlyElement != stretchLand.get(i-1)){
                beforeElement = stretchLand.get(i-1);
            }
            if(currentlyElement != nextElement){
                if((currentlyElement > nextElement) && (currentlyElement>beforeElement)){
                    numberCastles++;
                }
                else if((currentlyElement < nextElement) &&(currentlyElement <beforeElement)){
                    numberCastles++;
                }


            }

        }
        return numberCastles;
    }
}
