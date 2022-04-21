package day23_lamda_expresion;

public class Validation_Exp extends Exception {
    public String message;

    public Validation_Exp(String message) {
        this.message = message;
    }
}