/*
Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.
*/

package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
public class CountryCapitalList extends JFrame {
    public CountryCapitalList() {
        // Frame setup
        setTitle("Country Capital Viewer");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Country list
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };
        // Country-capital mapping
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList and add selection listener
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(6);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedCountry = countryList.getSelectedValue();
                String capital = capitals.get(selectedCountry);
                if (capital != null) {
                    System.out.println("Capital of " + selectedCountry + " is: " + capital);
                } else {
                    System.out.println("Capital not found.");
                }
            }
        });
        // Add to scroll pane for scrollability
        JScrollPane scrollPane = new JScrollPane(countryList);
        add(scrollPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountryCapitalList().setVisible(true);
        });
    }
}
