package ca.ciccc.wmad202.assignment9.assignment6.problem2.problem21;

import java.util.ArrayList;

public class Invoice {
    private ArrayList<Product> products;
    public  Invoice(){
        this.products = new ArrayList<>();
    }
    public Double CalcTotalPrice(){
        Double total=0.0;
        for(int i=0;i<products.size();i++){
            total = total + products.get(i).getPrice();
        }
        return total;
    }

    public void addProduct(Product product){
       products.add(product);
    }
    public void printProducts(){
        for(int i=0;i<products.size();i++){
            System.out.println("Product(" + i + ")");
            products.get(i).printInfo();
        }
        System.out.println("Total Price: $"+ CalcTotalPrice());
    }

}
