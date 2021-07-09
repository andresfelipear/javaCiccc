package ca.ciccc.wmad202.assignment6.problem3;

public class TestClass3 {
    public void test(){
        SinglePolynomialFactor s1 = new SinglePolynomialFactor(5,"x",4);
        SinglePolynomialFactor s2 = new SinglePolynomialFactor(-3,"x",2);
        SinglePolynomialFactor s3 = new SinglePolynomialFactor(6,"x",0);
        SinglePolynomialFactor s4 = new SinglePolynomialFactor(2,"x",2);
        PolynomialEquation p1 = new PolynomialEquation();
        PolynomialEquation p2 = new PolynomialEquation();
        p1.addSinglePolynomial(s1);
        p1.addSinglePolynomial(s2);
        p1.addSinglePolynomial(s3);
        p2.addSinglePolynomial(s4);
        Question2 q2 = new Question2();
        q2.sumPolynomialEquations(p1,p2);
    }
}
