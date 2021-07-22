package ca.ciccc.wmad202.assignment7.tests;

import ca.ciccc.wmad202.assignment7.generic1.Condition;

public class ProductEvaluator implements Condition<Product> {
    @Override
    public boolean evaluate(Product item) {
        if(item.getPrice()<3){
            return true;
        }
        return false;
    }
}
