/*
Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().
*/


package string;
import java.util.Scanner;

public class IsNullOrEmptyCheck {

    // User-defined function to check if string is null or only whitespace
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Checking the condition
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is valid: \"" + input + "\"");
        }

        scanner.close();
    }
}
