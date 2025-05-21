/*
Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()
*/


package string;
import java.util.Scanner;

public class RemoveWhitespace {

    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();

        // Remove whitespace and display result
        String result = removeWhitespace(input);
        System.out.println("String without whitespace: \"" + result + "\"");

        scanner.close();
    }
}
