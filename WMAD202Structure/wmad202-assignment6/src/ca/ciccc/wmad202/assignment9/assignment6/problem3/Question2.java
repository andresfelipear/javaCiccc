package ca.ciccc.wmad202.assignment9.assignment6.problem3;

public class Question2 {
    public boolean checkPolynomialEquationsEquality(PolynomialEquation p1, PolynomialEquation p2){
        if(p1.getPolynomial().size() == p2.getPolynomial().size()){
            for(int i=0; i<p1.getPolynomial().size();i++){
                if(!p1.checkSingleFactorEquality(p1.getPolynomial().get(i),p2.getPolynomial().get(i))){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }

    }
    public void sumPolynomialEquations(PolynomialEquation p1, PolynomialEquation p2){
        PolynomialEquation result = new PolynomialEquation();
        for(int i=0;i<p1.getPolynomial().size();i++){
            Integer degree = p1.getPolynomial().get(i).getExponent();
            SinglePolynomialFactor s2 = searchDegree(degree,p2);
            SinglePolynomialFactor sum = new SinglePolynomialFactor();
            sum.setExponent(p1.getPolynomial().get(i).getExponent());
            sum.setBaseFactor(p1.getPolynomial().get(i).getBaseFactor());
            sum.setCoefficient(p1.getPolynomial().get(i).getCoefficient()+s2.getCoefficient());
            result.addSinglePolynomial(sum);
        }
        result.printPolynomial();

    }

    public SinglePolynomialFactor searchDegree(Integer degree, PolynomialEquation p){
        for(int i=0;i<p.getPolynomial().size();i++){
            if(p.getPolynomial().get(i).getExponent()==degree){
                return p.getPolynomial().get(i);
            }
        }
        return new SinglePolynomialFactor();
    }


}
