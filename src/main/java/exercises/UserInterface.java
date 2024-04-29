package exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;


public class UserInterface {
    Scanner scanner;
    String name;
    int age;
    double height;
    int weight;
    Employment status;
    String occupation;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public HealthUser createUser() {
        welcomeMessage();
        promptUserForName();
        promptUserForAge();
        promptUserForHeight();
        promptUserForWeight();
        promptUserForEmployment();


        return new HealthUser(this.name, this.age, this.height, this.weight, this.status, this.occupation);
    }

    private void welcomeMessage() {
        System.out.println("\n--- Thank you for choosing Blummin Health insurance! ---\n");
        System.out.println("Please input your data:");
    }

    private void promptUserForName() {
        while(true) {
            System.out.print("Enter your full name: ");
            String nameInput = scanner.nextLine();
            if (nameInput.isBlank()) {
                System.out.println("Name can not be blank");
                continue;
            } else if (!nameIsValid(nameInput)) {
                System.out.println("Not a valid name");
                continue;
            }
            this.name = nameInput;
            break;
        }
    }

    private boolean nameIsValid(String s) {
        Pattern pattern = compile("^[a-z]+ [a-z]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    private void promptUserForAge() {
        while(true) {
            System.out.print("Enter your age: ");
            try {
                int age = scanner.nextInt();
                if (!ageIsValid(age)) {
                    System.out.println("That is not a valid age.");
                    continue;
                }
                this.age = age;
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Please input a valid age.");
            }

        }
    }

    private boolean ageIsValid(int age) {
        return (age >= 0 && age <= 110);
    }

    private void promptUserForHeight() {
        while(true) {
            System.out.print("Enter your height (in metres): ");
            try {
                double height = scanner.nextDouble();
                if (!heightIsValid(height)) {
                    System.out.println("That is not a valid height");
                    continue;
                }
                this.height = height;
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Please input a valid height");
            }
        }
    }

    private boolean heightIsValid(double height) {
        return (height >= 0.5 && height <= 2.5);
    }

    private void promptUserForWeight() {
        while (true) {
            System.out.print("Enter your weight (in kilograms): ");
            try {
                int weight = scanner.nextInt();
                if (!weightIsValid(weight)) {
                    System.out.println("That is not a valid weight.");
                    continue;
                    }
                this.weight = weight;
                break;
                } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Please input a valid weight");
            }
        }
    }

    private boolean weightIsValid(double weight) {
        return (weight >= 20.0 && weight <=1000.0);
    }

    private void promptUserForEmployment() {
        boolean employed;
        while (true) {
            System.out.print("Are you employed?: (enter true or false)");
            try {
                employed = scanner.nextBoolean();
                if (employed && this.age < 16) {
                    System.out.println("You can't be employed at " + this.age);
                    revalidateAge();
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Invalid input");

            }
        }
        if (employed) {
            this.status = Employment.EMPLOYED;
            promptUserForOccupation();
        } else {
            promptUserForStudentStatus();
        }

    }

    private void revalidateAge() {
        scanner.nextLine();
        System.out.println("Do you want to re-enter your age? (Y to continue, anything else to pass)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            promptUserForAge();
        }
    }

    private void promptUserForOccupation() {
        scanner.nextLine();
        System.out.println("What is your occupation?: ");
        String occupation = scanner.nextLine();
        this.occupation = occupation;
    }

    private void promptUserForStudentStatus() {
        boolean student;
        while (true) {
            System.out.print("Are you a student?: (enter true or false)");
            try {
                student = scanner.nextBoolean();
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Invalid input");
            }
        }

        if (student) {
            this.status = Employment.STUDENT;
        } else {
            this.status = Employment.UNEMPLOYED;
        }
    }
}
