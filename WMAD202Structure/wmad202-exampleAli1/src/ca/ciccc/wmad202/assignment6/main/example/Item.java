package ca.ciccc.wmad202.assignment6.main.example;

public abstract class Item {

    enum Color{
        Gray, Green, Yellow
    };

    private Color color;
    protected int height;

    Item(Color color, int height){
        this.color = color;
        this.height = height;
    }

//    public double getVolume(){
//        return this.volume;
//    }

    public abstract double getVolume();

    public Color getColor(){
        return this.color;
    }

//    public int getHeight(){
//        return this.height;
//    }
}
