package AgeException;

public class AgeException extends Exception {
    public AgeException() {
        super("Tuoi nhap vao khong hop le");
    }

    public AgeException(String message) {
        super(message);
    }
}
