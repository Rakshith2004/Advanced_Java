/*
Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList.
*/


package arraylist;
import java.util.ArrayList;

public class ColorRemoval {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display original list
        System.out.println("Original color list: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedElement = colors.remove(1);
            System.out.println("Removed element at index 1: " + removedElement);
        }

        // Remove the color "Blue" if it still exists
        boolean removed = colors.remove("Blue");
        if (removed) {
            System.out.println("Removed color: Blue");
        } else {
            System.out.println("Color 'Blue' was not found in the list.");
        }

        // Display updated list
        System.out.println("Updated color list: " + colors);
    }
}
