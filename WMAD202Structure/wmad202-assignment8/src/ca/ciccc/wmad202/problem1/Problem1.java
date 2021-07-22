package ca.ciccc.wmad202.problem1;

import ca.ciccc.wmad202.problem1.tests.Book;
import ca.ciccc.wmad202.problem1.tests.BookEvaluator;

import java.util.ArrayList;

public class Problem1 {
    public static void test(){
        //-- Create a list of books and count whose pages are bigger than 25
        Book b1 = new Book("h1", 23, "horror");
        Book b2 = new Book("h2", 25, "horror");
        Book b3 = new Book("h3", 125, "comedy");
        Book b4 = new Book("h4", 100, "comedy");
        Book b5 = new Book("h5", 33, "horror");
        Book b6 = new Book("h6", 14, "action");
        Book b7 = new Book("h7", 60, "action");
        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        int counterBooks = GenericCounter.counterNumberOfElementsWithSpecificProperty(books,new BookEvaluator());
        System.out.println("Total books: "+ books.size());
        System.out.println("Total books whose pages are bigger than 25: " + counterBooks);


    }

}
