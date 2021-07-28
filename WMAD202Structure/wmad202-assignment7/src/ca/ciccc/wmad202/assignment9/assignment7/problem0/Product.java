package ca.ciccc.wmad202.assignment9.assignment7.problem0;

public class Product {
    private Integer productID;
    private String productName;
    private Float productPrice;
    private String productMadeInCountry;

    public Product(Integer productID, String productName, Float productPrice, String productMadeInCountry) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productMadeInCountry = productMadeInCountry;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductMadeInCountry() {
        return productMadeInCountry;
    }

    public void setProductMadeInCountry(String productMadeInCountry) {
        this.productMadeInCountry = productMadeInCountry;
    }
}
