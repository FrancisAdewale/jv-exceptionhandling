package RestaurantManager;

import java.util.InputMismatchException;

public class AddingNegativeIntegerException extends InputMismatchException {
    String errorDetail;

    public AddingNegativeIntegerException() {
    }

    public AddingNegativeIntegerException(String s) {
        super(s);
    }

    public AddingNegativeIntegerException(String s, int i) {
        super(s);
        errorDetail = "The following stock addition is not allowed. [" + s + ": " + i + "]";
    }

    public String getErrorDetail() {
        return this.errorDetail;
    }
}
