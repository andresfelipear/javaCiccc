package ca.ciccc.wmad202.assignment6.problem2.problem22;

public class TestClass22 {
    public void test(){
        System.out.println("\nProblem2.2. ");
        Words word1 = new Words("hola");
        Words word2 = new Words("oso");
        Words word3 = new Words("andres");
        Words word4 = new Words("libro");
        Words word5 = new Words("oso");
        Words word6 = new Words("comfortable");
        Words word7 = new Words("desserted");
        Words word8 = new Words("eggs");
        Pages page1 = new Pages();
        Pages page2 = new Pages();
        page1.addWord(word1);
        page1.addWord(word2);
        page1.addWord(word3);
        page1.addWord(word4);
        page1.addWord(word5);
        page2.addWord(word1);
        page2.addWord(word2);
        page2.addWord(word3);
        page2.addWord(word4);
        page2.addWord(word5);
        page2.addWord(word6);
        page2.addWord(word7);
        page2.addWord(word8);
        Book book1 = new Book();
        book1.addPages(page1);
        book1.addPages(page2);
        Integer times = book1.bookReader("hola");
        System.out.println("The number of occurrences the word is: "+times);


    }
}
