package ca.ciccc.wmad202.problem3;

public class Book {
    private String name;
    private int pages;
    private String genre;
    public Book(String name, int pages, String genre){
        this.name = name;
        this.pages = pages;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                '}';
    }
}
