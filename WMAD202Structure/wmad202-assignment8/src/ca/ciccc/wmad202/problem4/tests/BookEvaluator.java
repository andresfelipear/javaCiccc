package ca.ciccc.wmad202.problem4.tests;


import ca.ciccc.wmad202.problem4.Condition;

public class BookEvaluator implements Condition<Book> {
    @Override
    public boolean evaluate(Book book) {
        if(book.getGenre().equalsIgnoreCase("Horror")){
            return true;
        }
        return false;
    }
}
