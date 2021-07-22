package ca.ciccc.wmad202.assignment7.tests;

public class Student {

    private String code;
    private int[] grades;

    public Student(String code, int[] grades){
        this.code = code;
        this.grades = grades;
    }

    public double getGPA(){
        if(this.grades.length>0){
            int total = 0;
            for(int i: grades){
                total = total + i;
            }

            return (double)total / this.grades.length;
        } else {
            return -1;
        }
    }

    public String toString(){
        String text = "["+this.code+" , "+this.getGPA()+"]";
        return text;
    }
}
