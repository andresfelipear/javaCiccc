package ca.ciccc.wmad202.assignment5.problem3;

public class Problem3 {
    public static void printShape(int num, int option){
        if(option==1){
            shape1(num);
        }
        else if(option==2){
            shape2(num);
        }
        else if(option==3){
            shape3(num);
        }
    }
    private static void shape1(int num1){
        for(int i=num1, space=0;i>0;i=i-2,space++){
            System.out.println(spaces(space) + printAbs(i) + spaces(space));
        }

    }
    private static void shape2(int num1){
        for(int i=num1;i>0;i--){
            System.out.println(printAbs(i));
        }
    }
    private static void shape3(int num1){
        for(int i=0;i<num1;i++){
            System.out.println(printAbs(i));
        }

    }

    private static String printAbs(int num){
        String str = "";
        for(int i=0;i<num;i++){
            str+="*";
        }
        return str;
    }

    private static String spaces(int spc){
        String str = "";
        for(int i=0;i<spc;i++){
            str+=" ";
        }
        return str;
    }
}
