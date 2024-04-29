package exercises;

public class Exercise1 {
    public static Integer divide(int a , int b) throws NegativeIntegerException {
        if (a < 0 || b < 0) {
            throw new NegativeIntegerException();
        }
        try {
            return a / b;
        } catch(ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
