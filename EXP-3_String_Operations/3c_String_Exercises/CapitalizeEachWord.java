/*
Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()
*/


package string;
import java.util.Scanner;

public class CapitalizeEachWord {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) return input;

        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Display result
        String capitalized = capitalizeWords(input);
        System.out.println("Capitalized sentence: " + capitalized);

        scanner.close();
    }
}
