package exercises;

import java.util.List;
import java.util.Scanner;

public class Exercise5 {

    public static void healthInsuranceDataInput() {

        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(scanner);
        HealthUser hu = ui.createUser();


        System.out.println("\nThank you, " + hu.getName() + ", for providing your information!");
        System.out.println("Your Blummin monthly subscription is: £"
                + calculateSubscriptionCharge(hu.getAge(), hu.getHeightInMetres(), hu.getWeightInKG(), hu.getOccupation(), hu.getEmploymentStatus() == Employment.STUDENT));

        scanner.close();
    }

    private static double calculateSubscriptionCharge(int age, double height, double weight, String occupation, boolean isStudent) {

        List<Double> factors = List.of(
                0.5D, // Base rate
                calculateAgeFactor(age),
                calculateHeightFactor(height),
                calculateWeightFactor(weight),
                occupation.equalsIgnoreCase("doctor") ? 0.9D : 1.0D,
                isStudent ? 0.8D : 1.0D
        );

        return factors.stream().reduce(1.0, (a, b) -> a * b);
    }

    private static double calculateAgeFactor(int age) {
        return Math.max(100 + (age - 18) * 5, 1);
    }

    private static double calculateHeightFactor(double height) {
        return Math.abs(Math.pow(height, 2) - 2);
    }

    private static double calculateWeightFactor(double weight) {
        return 2 * weight;
    }

}