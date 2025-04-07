package End_Of_Module_2.Exception;

public class IllegalArgumentException extends RuntimeException {
    private String message;

    public IllegalArgumentException(String message, String message1) {
        super(message);
        this.message = message1;
    }
}
