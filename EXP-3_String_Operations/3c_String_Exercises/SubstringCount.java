/*
Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences() 
*/


package string;
import java.util.Scanner;

public class SubstringCount {

    // User-defined function to count occurrences of a substring
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for main string and substring
        System.out.print("Enter the main string: ");
        String mainStr = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String subStr = scanner.nextLine();

        // Display the result
        int result = countOccurrences(mainStr, subStr);
        System.out.println("The substring \"" + subStr + "\" appears " + result + " time(s) in the main string.");

        scanner.close();
    }
}
