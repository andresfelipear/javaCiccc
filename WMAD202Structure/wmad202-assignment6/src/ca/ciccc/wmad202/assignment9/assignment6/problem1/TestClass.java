package ca.ciccc.wmad202.assignment9.assignment6.problem1;

import java.util.ArrayList;

public class TestClass {
    public static void test(){
        System.out.println("\nProblem1 ");
        ArrayList<Double> grades1 = new ArrayList<Double>(){
            {
                add(80.0);
                add(78.0);
                add(65.0);
                add(34.0);
            }


        };
        Student student1 = new Student("77889911", "Dave", grades1);
        ArrayList<Double> grades2 = new ArrayList<>();
        Student student2 = new Student("66553322","James", grades2);
        student2.addGrade(87.0);
        student2.addGrade(63.0);
        student2.addGrade(45.0);
        student2.addGrade(91.0);
        Double student1_GPA = student1.studentGPA();
        Double student2_GPA = student2.studentGPA();
        Integer compare = student1.compareGPA(student2);
        student1.printStudentInfo();
        student2.printStudentInfo();
        System.out.println("Compare student1 and student2 =" + compare);

    }
}
