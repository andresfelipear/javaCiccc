package ca.ciccc.wmad202.assignment7.tests;

import ca.ciccc.wmad202.assignment7.generic1.Condition;

//-- search a list of string and returns strings whose length are bigger than 4
public class StringEvaluator implements Condition<String> {

    @Override
    public boolean evaluate(String item) {
        if(item.length()>4){
            return true;
        }
        return false;
    }
}
