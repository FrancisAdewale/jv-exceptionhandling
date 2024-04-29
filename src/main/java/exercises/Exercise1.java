package exercises;

public class Exercise1 {
    public static Integer divide(int a , int b) throws NegativeIntegerException {
        if (b < 0) {
            throw new NegativeIntegerException(""+b);
        }
        try {
            return a / b;
        }
        catch(ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
