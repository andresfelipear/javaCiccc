package ca.ciccc.wmad202.assignment6.problem3;

public class SinglePolynomialFactor {
    private Integer coefficient;
    private String baseFactor;
    private Integer exponent;

    public SinglePolynomialFactor(){
        this.coefficient=0;
        this.exponent=0;
        this.baseFactor="x";

    }
    public SinglePolynomialFactor(Integer coefficient, String baseFactor, Integer exponent){
        this.coefficient = coefficient;
        this.baseFactor = baseFactor;
        this.exponent = exponent;
    }

    public Integer getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Integer coefficient) {
        this.coefficient = coefficient;
    }

    public String getBaseFactor() {
        return baseFactor;
    }

    public void setBaseFactor(String baseFactor) {
        this.baseFactor = baseFactor;
    }

    public Integer getExponent() {
        return exponent;
    }

    public void setExponent(Integer exponent) {
        this.exponent = exponent;
    }

    public void printSinglePolynomial(){
        if(exponent ==0){
            System.out.print(coefficient);
        }
        else {
            if(coefficient==1){
                System.out.print(baseFactor + "^"+exponent);
            }
            else {
                System.out.print(coefficient + baseFactor + "^" + exponent);
            }
        }
    }
}
