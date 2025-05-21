/*
Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()
*/


package arraylist;
import java.util.ArrayList;
import java.util.List;

public class ColorSubList {
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

        // Extract 1st and 2nd elements using subList (index 0 to 2, exclusive of 2)
        if (colors.size() >= 2) {
            List<String> subColors = colors.subList(0, 2);
            System.out.println("Extracted sublist (1st and 2nd elements): " + subColors);
        } else {
            System.out.println("Not enough elements in the list to extract sublist.");
        }
    }
}
