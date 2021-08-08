package ca.ciccc.wmad202.assignment10.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class TestExceptions2<T> {

    static class PredicateException1 extends RuntimeException{
        PredicateException1(String message){
            super(message);
        }

    }
    static class PredicateException2 extends Exception{
        PredicateException2(String message){
            super(message);
        }

    }
    public static class Container<T> {
        List<T> list;

        Container(List<T> list) {
            this.list = list;
        }

        List<T> getList() {
            return list;
        }
    }

    public static <T> int evaluateList(Container<T> container, Predicate<T> predicate1, Predicate<T> predicate2) throws PredicateException2 {
        int count = 0;
        for (T t : container.getList()) {
            if (predicate1.test(t)) {
                if (predicate2.test(t)) {
                    count++;
                } else {
                    throw new PredicateException2("PredicateException2");
                }
            } else {
                throw new PredicateException1("PredicateException1");
            }
        }
        return count;
    }

    public void test() throws RuntimeException,  Exception {
        ArrayList<String> list = (ArrayList<String>) (Arrays.asList("Exceptions", "are", "not", "fun", "kidding", "they", "are", "fun"));
        Container<String> container = new Container<>(list);
        TestExceptions2.evaluateList(container, s -> s.length() > 4, s -> s.contains("a"));
    }
}
