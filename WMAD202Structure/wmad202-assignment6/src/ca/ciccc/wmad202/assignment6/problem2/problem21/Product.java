package ca.ciccc.wmad202.assignment6.problem2.problem21;

public class Product {
    private String name;
    private Double price;
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Price: $" + price);
    }
}
