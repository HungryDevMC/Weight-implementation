package be.jflanders.weight_impl._2Business.frameworks.exceptions;

public class InvalidDataException extends Exception {

    public InvalidDataException(String message) {
        super("There was an error loading the following data type: " + message);
    }

}
