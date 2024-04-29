package exercises;

public class ExerciseTester {

    public static int testDivide(int a, int b) throws ArithmeticException {
        //Caller is not forced to use this because
        // ArithmeticException is a RUNTIME exception

        return a / b;
    }
}
