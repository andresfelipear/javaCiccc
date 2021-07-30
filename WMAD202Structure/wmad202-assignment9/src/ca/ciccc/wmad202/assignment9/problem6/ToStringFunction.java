package ca.ciccc.wmad202.assignment9.problem6;
//Represents a function that produces an String-valued result.
@FunctionalInterface
public interface ToStringFunction<T> {
    //Compute a result in String and return this.
    String applyAsString(T value);
}
