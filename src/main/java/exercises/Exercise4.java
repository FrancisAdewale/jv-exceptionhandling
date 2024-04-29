package exercises;

public class Exercise4 {

    public static void recursiveMethod() {
        try {
            recursiveMethod();
        } catch (Error e) {
            System.out.println("Oops, we're out of space on the stack. Goodnight.");
        }
    }
}
