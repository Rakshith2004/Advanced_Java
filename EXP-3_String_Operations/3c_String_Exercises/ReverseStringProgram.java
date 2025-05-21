/*
Write a Java Program for Reversing the characters in a string using user defined function
reverseString().
*/


package string;
import java.util.Scanner;

public class ReverseStringProgram {

    // User-defined function to reverse a string
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Call function and display result
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
