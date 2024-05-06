package exceptions;

public class RationalException extends IllegalArgumentException{

    public RationalException() {
        this("Denominator cannot be null");
    }

    public RationalException(String message) {
        super(message);
    }

}
