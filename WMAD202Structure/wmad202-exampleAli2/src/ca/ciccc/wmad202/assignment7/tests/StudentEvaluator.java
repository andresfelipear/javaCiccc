package ca.ciccc.wmad202.assignment7.tests;

import ca.ciccc.wmad202.assignment7.generic1.Condition;

public class StudentEvaluator implements Condition<Student> {
    @Override
    public boolean evaluate(Student item) {
        if(item.getGPA()>65){
            return true;
        } else {
            return false;
        }
    }
}
