package ca.ciccc.wmad202.assignment6.main.example;

public class Cube extends Item{

    Cube(Color color, int height){
        super(color, height);
    }

    @Override
    public double getVolume() {
        return Math.pow(this.height, 3);
    }

}
