package ca.ciccc.wmad202.assignment9.assignment7.main;

import ca.ciccc.wmad202.assignment9.assignment7.problem1.Cloth;
import ca.ciccc.wmad202.assignment9.assignment7.problem1.Drink;
import ca.ciccc.wmad202.assignment9.assignment7.problem1.Food;
import ca.ciccc.wmad202.assignment9.assignment7.problem1.Material;
import ca.ciccc.wmad202.assignment9.assignment7.problem0.Product;
import ca.ciccc.wmad202.assignment9.assignment7.problem2.ShoppingCart;

import java.util.ArrayList;


public class Assignment7Driver {

    public static void run() {
        //Problem0
        System.out.println("Problem0");
        Product p1 = new Product(110,"Diet Pepsi", 2f, "USA");
        //Problem1
        System.out.println("Problem1");
        Material cotton = new Material(10, "Cotton");
        Material polyester = new Material(124, "Polyester");
        ArrayList<Material> mat = new ArrayList<>();
        mat.add(cotton);
        mat.add(polyester);
        Cloth c1 = new Cloth(12, "Shirt", 123.2f, "Colombia", mat);
        ArrayList<String> ingredients = new ArrayList<>(){{add("beans");add("rice");}};
        Food food = new Food(12,"Rice", 5.45f,"Colombia",10,10, ingredients);
        Drink drinks = new Drink(15,"coke",1f,"usa",false,100);

        //Problem2
        System.out.println("Problem2");
        Product d1 = new Drink(412,"Pepsi", 2f, "USA", false,150);
        Product  d2 = new Drink(1883,"Ginger Zero", 3f, "Canada", true, 200);
        Product f1 = new Food(100, "Chicken", 8f,"Canada",350,4,new ArrayList<String>(){{add("chicken");add("oil");add("chees");}});
        Product f2 = new Food(101, "Pasta", 18f,"Canada",250,3,new ArrayList<String>(){{add("pasta");add("meet");add("spinach");}});
        ArrayList<Material> materialCloth = new ArrayList<>();
        Material nylon = new Material(11,"nylon");
        materialCloth.add(cotton);
        materialCloth.add(nylon);
        Product cloth = new Cloth(701,"T-shrit",15f,"China",materialCloth);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(d1);
        cart.addProduct(d2);
        cart.addProduct(f1);
        cart.addProduct(f2);
        cart.addProduct(cloth);
        System.out.println("Total price is: "+ cart.getTotal());
        cart.getNames();
    }


}
