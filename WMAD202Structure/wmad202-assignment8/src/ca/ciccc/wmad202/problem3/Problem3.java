package ca.ciccc.wmad202.problem3;


import java.util.ArrayList;

public class Problem3 {
    public static void test(){
        ArrayList<String> strings = new ArrayList<>(){{
            add("Hola");
            add("Mama");
            add("Como");
            add("Estas?");
        }};
        System.out.println(strings);
        ArrayList<String> newString = GenericExchange.exchangeElements(strings,1,3);
        System.out.println(newString);

        //Try with Integers
        ArrayList<Integer> integers = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        System.out.println(integers);
        ArrayList<Integer> newInteger = GenericExchange.exchangeElements(integers,1,3);
        System.out.println(newInteger);

        //Try with books
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
        System.out.println(books);
        ArrayList<Book> newBooks = GenericExchange.exchangeElements(books,1,3);
        System.out.println(newBooks);

    }
}
