package ca.ciccc.wmad202.assignment6.problem2.problem21;

public class TestClass2 {
    public void test(){
        System.out.println("\nProblem 2.1. ");
        Product p1 = new Product("Rice", 2.45);
        Product p2 = new Product("eggs",5.15);
        Invoice invoice = new Invoice();
        invoice.addProduct(p1);
        invoice.addProduct(p2);
        invoice.printProducts();

    }
}
