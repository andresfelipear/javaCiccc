package ca.ciccc.wmad202.assignment8.problem4;

import java.util.ArrayList;

public class Generic<E>{
    private ArrayList<E> list;

    public Generic() {
        this.list = new ArrayList<E>();
    }

    public void addItemToList(E item){
        list.add(item);
    }
    public void removeItemFromTheList(int position){
        list.remove(position);
    }
    public ArrayList<E> perfomOperation(Condition<E> condition){
        ArrayList<E> result = new ArrayList<>();
        for(E e:list){
            if(condition.evaluate(e)){
                result.add(e);
            }
        }
        return result;
    }

    public void printItems(){
        for(E e: list){
            System.out.println(e);
        }
    }
}
