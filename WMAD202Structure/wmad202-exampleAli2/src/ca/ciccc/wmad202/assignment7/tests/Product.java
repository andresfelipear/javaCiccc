package ca.ciccc.wmad202.assignment7.tests;

public class Product {
    private int price;
    private int code;

    public Product(int price, int code){
        this.price = price;
        this.code = code;
    }

    public int getPrice(){
        return this.price;
    }

    public String toString(){
        String text = "["+price+" , "+code+"]";
        return text;
    }
}
