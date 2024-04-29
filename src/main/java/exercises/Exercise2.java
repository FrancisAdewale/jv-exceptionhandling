package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static int[] getUserInput() {

        Scanner scanner;

        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();
                System.out.print("Enter dividend: ");
                int dividend = scanner.nextInt();
                return new int[]{divisor, dividend};
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

}