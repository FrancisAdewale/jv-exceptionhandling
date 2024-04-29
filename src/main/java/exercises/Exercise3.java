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
            } catch(ArithmeticException ae) {
                System.out.println("Cannot divide by zero");

            }

        }
    }
}
