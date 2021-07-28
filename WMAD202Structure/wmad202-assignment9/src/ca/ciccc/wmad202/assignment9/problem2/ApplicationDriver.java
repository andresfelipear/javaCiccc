package ca.ciccc.wmad202.assignment9.problem2;

public class ApplicationDriver {
    enum ShapeType{
        Rectangle, Triangle, Circle, Square, Custom
    }

    public static void test(){
        int[] s1Sides = {10,20};
        Shape s1= new Shape(ShapeType.Rectangle, s1Sides){
            @Override
            float perimeter(){
                float perimeter = s1Sides[0]*2 + s1Sides[1]*2;
                return perimeter;
            }

            @Override
            float area() {
                return s1Sides[0]*s1Sides[1];
            }
        };
        System.out.println("S1 perimeter is: "+ s1.perimeter());
        System.out.println("S1 area is: "+ s1.area());

        int[] s2Sides = {10};
        Shape s2= new Shape(ShapeType.Square, s2Sides){
            @Override
            float perimeter(){
                float perimeter = s2Sides[0]*4;
                return perimeter;
            }

            @Override
            float area() {
                return s2Sides[0]*s2Sides[0];
            }
        };
        System.out.println("S1 perimeter is: "+ s2.perimeter());
        System.out.println("S1 area is: "+ s2.area());

        int[] s3Sides = {12};
        Shape s3= new Shape(ShapeType.Circle, s3Sides){
            @Override
            float perimeter(){
                float perimeter = (float) (2*Math.PI*s3Sides[0]);
                return perimeter;
            }

            @Override
            float area() {
                return (float)Math.PI*s3Sides[0]*s3Sides[0];
            }
        };
        System.out.println("S3 perimeter is: "+ s2.perimeter());
        System.out.println("S3 area is: "+ s2.area());

        int[] s4Sides = {8,12,12};
        Shape s4= new Shape(ShapeType.Triangle, s4Sides){
            @Override
            float perimeter(){
                float perimeter = s4Sides[0]+s4Sides[1]+s4Sides[2];
                return perimeter;
            }

            @Override
            float area() {
                float base = s4Sides[0]/2;
                float high= (float) Math.sqrt(Math.pow(s4Sides[1],2)-Math.pow(base,2));
                float area = base*high/2*2;
                return area;
            }
        };
        System.out.println("S1 perimeter is: "+ s4.perimeter());
        System.out.println("S1 area is: "+ s4.area());

    }
    
}
