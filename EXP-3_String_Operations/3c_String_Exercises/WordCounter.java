/*
Write a Java Program for Counting the number of words in a string using user defined function
countWords()
*/


package string;
import java.util.Scanner;

public class WordCounter {

    // User-defined function to count words in a string
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        // Split the string using whitespace regex and count the words
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Count and display the number of words
        int wordCount = countWords(sentence);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
