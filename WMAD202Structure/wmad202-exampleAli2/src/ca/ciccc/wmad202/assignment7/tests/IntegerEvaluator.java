package ca.ciccc.wmad202.assignment7.tests;

import ca.ciccc.wmad202.assignment7.generic1.Condition;

public class IntegerEvaluator implements Condition<Integer> {
    @Override
    public boolean evaluate(Integer item) {
        if(item%6==0){
            return true;
        }
        return false;
    }
}
