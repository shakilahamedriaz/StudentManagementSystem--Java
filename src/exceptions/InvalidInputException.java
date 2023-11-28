package exceptions;

public class InvalidInputException extends Exception {
    public String message;

    public InvalidInputException(String message) {
        this.message = message;
    } // end constructor

    public String toString() {
        return message;
    }// end toString
}
