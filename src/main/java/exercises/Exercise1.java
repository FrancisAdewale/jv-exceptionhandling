package exercises;

public class Exercise1 {
    public static Integer divide(int a , int b) {
        try {
            return a / b;
        } catch(ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
