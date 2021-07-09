package ca.ciccc.wmad202.assignment6.problem2.problem22;

import java.util.ArrayList;

public class Pages {
    private ArrayList<Words> pages;
    public void addWord(Words word){
        pages.add(word);
    }
    public Pages(){
        pages = new ArrayList<>();
    }

    public ArrayList<Words> getPages() {
        return pages;
    }
}
