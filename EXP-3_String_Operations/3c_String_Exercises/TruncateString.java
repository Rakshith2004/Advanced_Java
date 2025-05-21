/*
Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()
*/


package string;
import java.util.Scanner;

public class TruncateString {

    // User-defined function to truncate a string and add ellipsis
    public static String truncate(String input, int maxLength) {
        if (input == null || maxLength < 0) return "";

        if (input.length() <= maxLength) {
            return input;
        } else if (maxLength <= 3) {
            // Not enough space even for "..."
            return input.substring(0, maxLength);
        } else {
            return input.substring(0, maxLength - 3) + "...";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter maximum length to truncate: ");
        int length = scanner.nextInt();

        // Display result
        String result = truncate(input, length);
        System.out.println("Truncated string: " + result);

        scanner.close();
    }
}
