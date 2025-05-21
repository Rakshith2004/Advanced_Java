/*
Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():
*/


package string;
import java.util.Scanner;

public class PalindromeCheck {

    // User-defined function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();

        return cleanStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        // Display result
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
