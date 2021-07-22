package ca.ciccc.wmad202.assignment7.generic1;

import ca.ciccc.wmad202.assignment7.tests.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Example1 {


    public static void test(){

        //-- search a list of string and returns strings whose length are bigger than 4
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Vancouver");
        strings.add("CICCC");
        strings.add("Ali");
        strings.add("Java");

        ArrayList<String> result1 = GenericSearch.search(strings, new StringEvaluator());

        for(String s: result1) {
            System.out.println(s);
        }

        //-- search a list of integers and returns the integers that are divisible by 6
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(101);
        integers.add(14);
        integers.add(122);
        integers.add(72);
        integers.add(172);
        ArrayList<Integer> result2 = GenericSearch.search(integers, new IntegerEvaluator());

        for(Integer i: result2) {
            System.out.println(i);
        }

        //-- search a list of product and retunrs the producs whose prices are less than 3 dollar

        Product p1 = new Product(2, 11);
        Product p2 = new Product(4, 12);
        Product p3 = new Product(3, 14);
        Product p4 = new Product(1, 16);
        Product p5 = new Product(5, 19);
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        ArrayList<Product> result3 = GenericSearch.search(products, new ProductEvaluator());
        for(Product p: result3) {
            System.out.println(p);
        }

        //-- search a list of students whose GPA is above 75%

        Student s1 = new Student("12", new int[] {56, 87, 90});
        Student s2 = new Student("13", new int[] {89, 90, 45, 78});
        Student s3 = new Student("14", new int[] {56, 34, 99, 80, 10});
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        ArrayList<Student> result4 = GenericSearch.search(students, new StudentEvaluator());

        for(Student s: result4) {
            System.out.println(s);
        }
    }
}
