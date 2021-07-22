package ca.ciccc.wmad202.assignment6.main.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Table {

    private ArrayList<Item> items;

    Table(){
        this.items = new ArrayList();
    }

    Table(ArrayList<Item> items){
        this.items = items;
    }

//    --- getTotalVolume
//--- getTotalVolumeForCuboid
//--- getTotalVolumeInYellowItems

    public double getTotalVolume(){
        double totalVolume = 0;
        for(Item item: this.items){
            totalVolume = totalVolume + item.getVolume(); //Polymorphism
        }

        return totalVolume;
    }

    public double getTotalVolumeForCuboid(){
        double totalVolume = 0;
        for(Item item: this.items){
            if(item instanceof Cuboid){
                totalVolume = totalVolume + item.getVolume(); //Polymorphism
            }
        }
        return totalVolume;
    }

    public double getTotalVolumeInYellowItems(){
        double totalVolume = 0;
        for(Item item: this.items){
            if(item.getColor()== Item.Color.Yellow){
                totalVolume = totalVolume + item.getVolume(); //Polymorphism
            }
        }
        return totalVolume;
    }

    //overloading
    public double getTotalVolume(Class itemType){
        double totalVolume = 0;
        for(Item i: this.items){
            if(i.getClass().equals(itemType)){
                totalVolume = totalVolume + i.getVolume(); //Polymorphism
            }
        }
        return totalVolume;
    }

    //overloading
    public double getTotalVolume(Item.Color color){
        double totalVolume = 0;
        for(Item item: this.items){
            if(item.getColor()== color){
                totalVolume = totalVolume + item.getVolume(); //Polymorphism
            }
        }
        return totalVolume;
    }

    public void addItem(Item item){
        this.items.add(item);
    }
}
