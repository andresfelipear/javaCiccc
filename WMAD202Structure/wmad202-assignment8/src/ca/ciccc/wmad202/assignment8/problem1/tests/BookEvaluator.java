package ca.ciccc.wmad202.assignment8.problem1.tests;

import ca.ciccc.wmad202.assignment8.problem1.Condition;

public class BookEvaluator implements Condition<Book> {
    @Override
    public boolean evaluate(Book book) {
        if(book.getPages()>25){
            return true;
        }
        return false;
    }
}
