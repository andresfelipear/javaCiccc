package ca.ciccc.wmad202.assignment6.main.example;

public class Cuboid extends Item{

    private int width;
    private int length;

    Cuboid(Color color, int height, int width, int length) {
        super(color, height);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getVolume() {
        return this.length*this.width*this.height;
    }
}
