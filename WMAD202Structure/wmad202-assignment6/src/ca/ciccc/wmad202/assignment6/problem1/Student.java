package ca.ciccc.wmad202.assignment6.problem1;

import java.util.ArrayList;

public class Student {
    private String student_id;
    private String name;
    private ArrayList<Double> grades;
    public Student(String student_id, String name, ArrayList<Double> grades){
        this.student_id = student_id;
        this.name = name;
        this.grades = grades;
    }

    public Student(String student_id, String name){
        this.student_id = student_id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(Double grade){
        grades.add(grade);
    }

    public Double studentGPA(){
        double average = 0;
        for(int i=0; i<grades.size();i++){
            average +=grades.get(i);
        }
        average = average/grades.size();
        return average;
    }

    public void printStudentInfo(){
        System.out.println("Name: "+name);
        System.out.println("Student_ID: "+ student_id);
        System.out.println("List of Grades: "+grades);
        System.out.println("GPA: "+studentGPA());
    }

    public Integer compareGPA(Student otherStudent){
        if(this.studentGPA() > otherStudent.studentGPA()){
            return 1;
        }
        else if(this.studentGPA() < otherStudent.studentGPA()){
            return -1;
        }
        else{
            return 0;
        }
    }

}
