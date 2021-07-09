package ca.ciccc.wmad202.assignment6.problem3;

import java.util.ArrayList;

public class PolynomialEquation {
    private ArrayList<SinglePolynomialFactor> polynomial;
    public PolynomialEquation(){
        polynomial = new ArrayList<>();
    }

    public boolean checkSingleFactorEquality(SinglePolynomialFactor s1, SinglePolynomialFactor s2){
        if( (s1.getBaseFactor().equals(s2.getBaseFactor())) && (s1.getCoefficient() == s2.getCoefficient()) && (s1.getExponent()==s2.getExponent())){
            return true;
        }
        else{
            return false;
        }
    }
    public void addSinglePolynomial(SinglePolynomialFactor single){
        polynomial.add(single);
    }

    public ArrayList<SinglePolynomialFactor> getPolynomial() {
        return polynomial;
    }

    public Integer degreePolynom(){
        Integer bigger=0;
        for(int i=0;i<polynomial.size();i++){
            if(polynomial.get(i).getExponent()>bigger){
                bigger=polynomial.get(i).getExponent();
            }
        }
        return bigger;
    }

    public void printPolynomial(){
        for(int i=0;i<polynomial.size();i++){
            polynomial.get(i).printSinglePolynomial();
            if(i!=polynomial.size()-1){
                if(polynomial.get(i+1).getCoefficient()>0){
                    System.out.print("+");
                }
            }
        }
    }


}
