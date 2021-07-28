package ca.ciccc.wmad202.assignment9.assignment7.problem2;

import ca.ciccc.wmad202.assignment9.assignment7.problem0.Product;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> container;
    public void addProduct(Product product){
        container.add(product);
    }

    public ShoppingCart(){
        this.container = new ArrayList<>();
    }
    public Float getTotal(){
        Float totalPrice =0f;

        for(Product p:container){
            totalPrice += p.getProductPrice();
        }
        return totalPrice;
    }

    public void getNames(){
        for(Product p:container){
            System.out.println(p.getProductName());
        }
    }
}
