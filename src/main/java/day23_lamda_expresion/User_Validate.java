package day23_lamda_expresion;

@FunctionalInterface
public interface User_Validate<T> {
    boolean validate(T param);
}