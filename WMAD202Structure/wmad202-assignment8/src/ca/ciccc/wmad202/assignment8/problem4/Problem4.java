package ca.ciccc.wmad202.assignment8.problem4;

import ca.ciccc.wmad202.assignment8.problem4.tests.Book;
import ca.ciccc.wmad202.assignment8.problem4.tests.BookEvaluator;

import java.util.ArrayList;

public class Problem4 {
    public static void test(){
        //Filter books genre horror
        Book b1 = new Book("h1", 23, "horror");
        Book b2 = new Book("h2", 25, "horror");
        Book b3 = new Book("h3", 125, "comedy");
        Book b4 = new Book("h4", 100, "comedy");
        Book b5 = new Book("h5", 33, "horror");
        Book b6 = new Book("h6", 14, "action");
        Book b7 = new Book("h7", 60, "action");
        Generic books = new Generic();
        books.addItemToList(b1);
        books.addItemToList(b2);
        books.addItemToList(b3);
        books.addItemToList(b4);
        books.addItemToList(b5);
        books.addItemToList(b6);
        books.addItemToList(b7);
        books.printItems();
        ArrayList<Book> booksFilter = books.perfomOperation(new BookEvaluator());
        System.out.println(booksFilter);



    }
}
