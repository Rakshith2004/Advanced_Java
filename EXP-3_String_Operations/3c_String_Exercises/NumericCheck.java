/*
Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()
*/


package string;
import java.util.Scanner;

public class NumericCheck {

    // User-defined function to check if a string contains only numeric characters
    public static boolean isNumeric(String input) {
        return input != null && input.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string to check if it's numeric: ");
        String input = scanner.nextLine();

        // Display result
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        scanner.close();
    }
}
