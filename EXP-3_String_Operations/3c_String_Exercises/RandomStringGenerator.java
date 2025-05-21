/*
Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()
*/


package string;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    // User-defined function to generate a random alphanumeric string
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            result.append(chars.charAt(rand.nextInt(chars.length())));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();

        // Display result
        String randomStr = generateRandomString(length);
        System.out.println("Generated random string: " + randomStr);

        scanner.close();
    }
}
