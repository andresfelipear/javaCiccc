package ca.ciccc.wmad202.assignment9.problem2;

public abstract class Shape {
    public Shape(ApplicationDriver.ShapeType shapeType, int[] s1Sides) {
    }

    abstract float perimeter();
    abstract float area();
}
