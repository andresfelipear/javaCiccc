package ca.ciccc.wmad202.assignment7.problem1;

import ca.ciccc.wmad202.assignment7.problem0.Product;

import java.util.ArrayList;

public class Cloth extends Product {
    private Integer clothID;
    private String clothName;
    private Float clothPrice;
    private String clothMadeInCountry;
    private ArrayList<Material> clothMaterial;

    public Cloth(Integer clothID, String clothName, Float clothPrice, String clothMadeInCountry, ArrayList<Material> clothMaterial) {
        super(clothID, clothName,clothPrice,clothMadeInCountry);
        this.clothID = clothID;
        this.clothName = clothName;
        this.clothPrice = clothPrice;
        this.clothMadeInCountry = clothMadeInCountry;
        this.clothMaterial = clothMaterial;
    }
}
