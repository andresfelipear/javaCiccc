package ca.ciccc.wmad202.assignment9.problem1;

public class Foo1 {
    private int bar1;
    public Foo1(int x){
        this.bar1= x;
    }
    public class Foo2{
        public Foo2(int y){
            Foo1.this.bar1 = y*10;
        }
        public void show(){
            //int bar = ((Foo1)this).bar1;
            System.out.println("bar1 = "+ bar1);
            //System.out.println("((Foo1)this).bar1= "+ bar);
            System.out.println("Foo1.this.bar1 = " +Foo1.this.bar1);
        }

    }
    public class Test64 {
        public static void test(){
            Foo1 f1= new Foo1(5);
            Foo1.Foo2 f2 = f1.new Foo2(6);
            f2.show();
        }
    }
}
