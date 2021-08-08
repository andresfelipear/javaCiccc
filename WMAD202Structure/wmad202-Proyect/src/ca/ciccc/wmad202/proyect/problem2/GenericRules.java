package ca.ciccc.wmad202.proyect.problem2;

import java.util.function.BiPredicate;

public class GenericRules {
    public static Transformers evaluateRule(Transformers t1, Transformers t2, BiPredicate<Transformers,Transformers> condition){
        if(condition.test(t1,t2) && condition.test(t2,t1)){
            return null;
        }
        else if(condition.test(t1,t2)){
            return t1;
        }
        else if(condition.test(t2,t1)){
            return t2;
        }
        return null;
    }
}
