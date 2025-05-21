/*
Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index.
*/


package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class ColorRemoveByIndex {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Take user input for the index to delete
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index (starting from 0) of the element to delete: ");
        int index = scanner.nextInt();

        // Remove element at the specified index if valid
        if (index >= 0 && index < colors.size()) {
            String removedColor = colors.remove(index);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid index. Please enter an index between 0 and " + (colors.size() - 1));
        }

        // Display the updated list
        System.out.println("Updated color list: " + colors);

        scanner.close();
    }
}
