package ca.ciccc.wmad202.assignment9.assignment6.problem2.problem22;

import java.util.ArrayList;

public class Book {
    private ArrayList<Pages> book;
    public void addPages(Pages page){
        book.add(page);
    }
    public Book(){
        book = new ArrayList<>();
    }

    public Integer bookReader(String wordSearch){
        Integer counter=0;
        for(int i=0;i<book.size();i++){
            Pages page = book.get(i);
            for(int j=0;j<page.getPages().size();j++){
                Words word = page.getPages().get(j);
                if(word.getWord() == wordSearch){
                    counter++;
                }
            }
        }
        return counter;
    }

}
