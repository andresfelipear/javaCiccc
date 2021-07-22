package ca.ciccc.wmad202.problem5;

import java.util.ArrayList;

public interface UnaryPredicate<T> {
    public T relativePrime(ArrayList<T> list, int begin, int end);
}
