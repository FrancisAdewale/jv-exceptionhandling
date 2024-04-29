package exercises;

//import java.util.Exception;

import java.util.InputMismatchException;

public class NegativeIntegerException extends InputMismatchException {

    public NegativeIntegerException() {
    }

    public NegativeIntegerException(String s) {
        super("The following negative integer(s) are not allowed in this operation: [" + s + "]");
    }
}
