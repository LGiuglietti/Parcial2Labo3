package Excepciones;

public class UserNameRepetido extends Exception{
    public UserNameRepetido() {
    }

    public UserNameRepetido(String message) {
        super(message);
    }
}
