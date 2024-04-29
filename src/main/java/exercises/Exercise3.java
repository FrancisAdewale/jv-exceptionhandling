package exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void divide() {

        int[] inputs;

        while (true) {
            try{
                inputs = Exercise2.getUserInput();
                System.out.println(Exercise1.divide(inputs[0],inputs[1]));
                break;
            } catch (NegativeIntegerException e) {
                System.out.println("This operation does not accept negative values. Please try again.");
            }catch(ArithmeticException ae) {
                System.out.println("Cannot divide by zero");

            }

        }
    }
}
